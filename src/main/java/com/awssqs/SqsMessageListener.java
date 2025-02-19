package com.awssqs;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
public class SqsMessageListener {

    @SqsListener("my-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}