/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.gsi.ssh.impl;

import junit.framework.Assert;
import org.apache.airavata.gsi.ssh.api.*;
import org.apache.airavata.gsi.ssh.api.authentication.GSIAuthenticationInfo;
import org.apache.airavata.gsi.ssh.api.job.JobDescriptor;
import org.apache.airavata.gsi.ssh.config.ConfigReader;
import org.apache.airavata.gsi.ssh.impl.authentication.DefaultPasswordAuthenticationInfo;
import org.apache.airavata.gsi.ssh.impl.authentication.MyProxyAuthenticationInfo;
import org.apache.airavata.gsi.ssh.util.CommonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DefaultSSHApiTestWithMyProxyAuth {
    private static final Logger log = LoggerFactory.getLogger(PBSCluster.class);



    public void tearDown() throws Exception {
    }


    public static void main(String[]ars){
         String myProxyUserName = "lg11w";

        DefaultPasswordAuthenticationInfo authenticationInfo
                = new DefaultPasswordAuthenticationInfo("");

        // Create command
        CommandInfo commandInfo = new RawCommandInfo("source /etc/bashrc; bsub </home/lg11w/mywork/sshEchoExperiment_9d267072-ca65-4ca8-847a-cd3d130f6050/366787899.lsf");

        // Server info
        //Stampede
//        ServerInfo serverInfo = new ServerInfo(myProxyUserName, "stampede.tacc.utexas.edu", 2222);
        //Trestles
//        ServerInfo serverInfo = new ServerInfo(myProxyUserName, "trestles.sdsc.xsede.org", 22);
        
        //Lonestar
         ServerInfo serverInfo = new ServerInfo(myProxyUserName, "ghpcc06.umassrc.org", 22);
        // Output
        CommandOutput commandOutput = new SystemCommandOutput();

        // Execute command
        try {
            CommandExecutor.executeCommand(commandInfo, serverInfo, authenticationInfo, commandOutput, new ConfigReader());
        } catch (SSHApiException e) {
            log.error(e.getMessage(), e);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }



}
