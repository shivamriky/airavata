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

package org.apache.airavata.wsmg.client.amqp;

import java.util.Properties;

import org.apache.airavata.common.utils.ServerSettings;
import org.apache.airavata.wsmg.client.amqp.rabbitmq.AMQPTopicReceiverImpl;

public class TopicSubscriber {
    public static void main(String args[]) throws AMQPException {
        String host = ServerSettings.getSetting(AMQPUtil.CONFIG_AMQP_PROVIDER_HOST, "localhost");
        String port = ServerSettings.getSetting(AMQPUtil.CONFIG_AMQP_PROVIDER_PORT, "5672");
        String username = ServerSettings.getSetting(AMQPUtil.CONFIG_AMQP_PROVIDER_USERNAME, "guest");
        String password = ServerSettings.getSetting(AMQPUtil.CONFIG_AMQP_PROVIDER_PASSWORD, "guest");

        Properties properties = new Properties();
        properties.setProperty(AMQPUtil.CONFIG_AMQP_PROVIDER_HOST, host);
        properties.setProperty(AMQPUtil.CONFIG_AMQP_PROVIDER_PORT, port);
        properties.setProperty(AMQPUtil.CONFIG_AMQP_PROVIDER_USERNAME, username);
        properties.setProperty(AMQPUtil.CONFIG_AMQP_PROVIDER_PASSWORD, password);

        MessageConsumer consumer = new MessageConsumer();
        AMQPTopicReceiver receiver = new AMQPTopicReceiverImpl(properties, consumer);
        System.out.println("Waiting for topic messages : \n");

        AMQPRoutingKey key = new AMQPRoutingKey("workflowTerminated", "");
        receiver.Subscribe(key);
    }

    public static class MessageConsumer implements AMQPCallback {
        public void onMessage(String message) {
            System.out.println("Received : " + message);
        }
    }
}
