package com.kafka.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicResource {

    private static final String TOPIC = "example-topic-1";

    @Autowired
    public KafkaTemplate kafkaTemplate;

    @GetMapping("/send/message/{messageName}")
    public String sendMsgToKafka(@PathVariable("messageName") final String messageName){

        kafkaTemplate.send(TOPIC,messageName);

        return "message posted to kafka server!!";
    }
}
