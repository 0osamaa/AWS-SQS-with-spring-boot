package com.awssqs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class SqsMessageSender {

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    public void sendMessage(String queueName, String message) {
        queueMessagingTemplate.send(queueName, MessageBuilder.withPayload(message).build());
        System.out.println("Message sent: " + message);
    }
}
