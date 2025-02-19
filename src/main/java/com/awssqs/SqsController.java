package com.awssqs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SqsController {

    @Autowired
    private SqsMessageSender sqsMessageSender;

    @Autowired
    private SqsMessageReceiver sqsMessageReceiver;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        sqsMessageSender.sendMessage("my-queue", message);
        return "Message sent to SQS!";
    }

    @GetMapping("/receive")
    public String receiveMessage() {
        return sqsMessageReceiver.receiveMessage("my-queue");
    }
}