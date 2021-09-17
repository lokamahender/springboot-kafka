package com.kafka.example.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaCustomerListener {

    static Logger logger = Logger.getLogger(KafkaCustomerListener.class.getName());

    @KafkaListener(topics = {"example-topic-1","confluent-test-topic"}, groupId = "group-id")
    public void consumer(String message){

        logger.info("--- msg consumed from kafka --- "+message);

    }

}
