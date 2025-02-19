package com.awssqs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;


@Service
public class SqsMessageReceiver {

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    public String receiveMessage(String queueName) {
        Message<?> message = queueMessagingTemplate.receive(queueName);
        if (message != null) {
            System.out.println("Received message: " + message.getPayload());
            return message.getPayload().toString();
        }
        return "No message available";
    }
}