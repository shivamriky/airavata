package org.apache.airavata.tools.load;

import org.apache.airavata.api.Airavata;
import org.apache.airavata.api.client.AiravataClientFactory;
import org.apache.airavata.model.appcatalog.gatewayprofile.StoragePreference;
import org.apache.airavata.model.appcatalog.storageresource.StorageResourceDescription;
import org.apache.airavata.model.security.AuthzToken;
import org.apache.commons.cli.*;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletionService;

public class LoadClient {

    private String privateKeyFile = System.getProperty("user.home") + "/.ssh/id_rsa";
    private String publicKeyFile = System.getProperty("user.home") + "/.ssh/id_rsa.pub";
    private String passPhrase = null;
    private String configFile;

    private SecurityManager securityManager = new SecurityManager();
    private Map<String, StorageResourceManager> storageResourceManagerStore = new HashMap<>();
    private Configurations configurations;

    public void init() throws Exception {

        if (configFile == null) {
            try (InputStream in = LoadClient.class.getResourceAsStream("/conf/load-config.yml")) {
                Yaml yaml = new Yaml();
                configurations = yaml.loadAs(in, Configurations.class);
                createStorageResourceManagers(configurations);
            }
        } else {
            try (InputStream in = new FileInputStream(configFile)) {
                Yaml yaml = new Yaml();
                configurations = yaml.loadAs(in, Configurations.class);
                createStorageResourceManagers(configurations);
            }
        }

        securityManager.loadCertificate(configurations.getApiHost(), configurations.getApiPort());
    }

    public void start() throws Exception {
        for (Configuration configuration : configurations.getConfigurations()) {
            UnitLoad unitLoad = new UnitLoad(configurations.getApiHost(), configurations.getApiPort(),
                    securityManager.getTrustStorePath(), securityManager.getTrustStorePassword(),
                    storageResourceManagerStore.get(configuration.getStorageResourceId()));
            CompletionService<Boolean> completion = unitLoad.execute(configuration);

            for (int i = 0; i < configuration.getConcurrentUsers(); i++) {
                completion.take();
            }
        }
        destroyStorageResourceManagers();
        System.out.println("Finished load");
        System.exit(0);
    }

    private void createStorageResourceManagers(Configurations configurations) throws Exception {

        Airavata.Client airavataClient = AiravataClientFactory.createAiravataSecureClient(configurations.getApiHost(), configurations.getApiPort(),
                securityManager.getTrustStorePath(), securityManager.getTrustStorePassword(), 100000);

        for (Configuration configuration : configurations.getConfigurations()) {
            String storageResourceId = configuration.getStorageResourceId();

            if (!storageResourceManagerStore.containsKey(storageResourceId)) {
                StorageResourceDescription storageResource = airavataClient.getStorageResource(new AuthzToken(""), storageResourceId);
                StoragePreference gatewayStoragePreference = airavataClient.getGatewayStoragePreference(new AuthzToken(""), configuration.getGatewayId(), storageResourceId);
                StorageResourceManager storageResourceManager = new StorageResourceManager(gatewayStoragePreference, storageResource, privateKeyFile, publicKeyFile, passPhrase);
                storageResourceManager.init();
                storageResourceManagerStore.put(storageResourceId, storageResourceManager);
            }
        }
    }

    private void destroyStorageResourceManagers() {
        storageResourceManagerStore.values().forEach(StorageResourceManager::destroy);
    }

    public static void main(String args[]) throws Exception {

        Options options = new Options();
        options.addOption("config", true, "Load configuration file in yaml format");
        options.addOption("apiHost", true, "API Server host name");
        options.addOption("apiPort", true, "API Server port");
        options.addOption("privateKeyPath", true, "SSH private key path to communicate with storage resources (Defaults to user private key in ~/.ssh/id_rsa)");
        options.addOption("publicKeyPath", true, "SSH public key path to communicate with storage resources (Defaults to user public key in ~/.ssh/id_rsa.pub)");
        options.addOption("passPhrase", true, "SSH private key pass phrase (if any)");

        CommandLineParser parser = new GnuParser();
        CommandLine cmd = parser.parse( options, args);

        LoadClient loadClient = new LoadClient();

        if (cmd.hasOption("config")) {
            loadClient.configFile = cmd.getOptionValue("config");
        } else {
            System.out.println("Error : Load config file should be specified");
            System.exit(0);
        }

        if (cmd.hasOption("privateKeyPath")) {
            loadClient.privateKeyFile = cmd.getOptionValue("privateKeyPath");
        } else {
            System.out.println("Using default private key file " + loadClient.privateKeyFile);
        }

        if (cmd.hasOption("publicKeyPath")) {
            loadClient.publicKeyFile = cmd.getOptionValue("publicKeyPath");
        } else {
            System.out.println("Using default public key file " + loadClient.publicKeyFile);
        }

        if (cmd.hasOption("passPhrase")) {
            loadClient.passPhrase = cmd.getOptionValue("passPhrase");
        }

        loadClient.init();
        loadClient.start();
    }
}