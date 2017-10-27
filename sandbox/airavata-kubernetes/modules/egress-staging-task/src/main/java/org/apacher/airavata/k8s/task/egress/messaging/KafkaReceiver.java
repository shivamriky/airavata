package org.apacher.airavata.k8s.task.egress.messaging;

import org.apacher.airavata.k8s.task.egress.service.TaskExecutionService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;

import javax.annotation.Resource;

/**
 * TODO: Class level comments please
 *
 * @author dimuthu
 * @since 1.0.0-SNAPSHOT
 */
public class KafkaReceiver {

    @Resource
    private TaskExecutionService taskExecutionService;

    @KafkaListener(topics = "${task.read.topic.name}")
    public void receiveTasks(String payload, Acknowledgment ack) {
        System.out.println("received task=" + payload);
        taskExecutionService.executeTaskAsync(Long.parseLong(payload));
        ack.acknowledge();
    }
}
