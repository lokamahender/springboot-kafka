package com.kafka.example.resource;

import com.kafka.example.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class UserResource {

    private static final String TOPIC = "example-topic-1";

    @Autowired
    private KafkaTemplate<String,Customer> template;

    @GetMapping("/test")
    public String testConnection(){
        return "I am working";
    }

    @PostMapping("/send/customer/message")
    public String sendMsgToKafka(@RequestBody Customer customer){

                customer.setFirstName(customer.getFirstName());
                customer.setLastName(customer.getLastName());
                customer.setLocation(customer.getLocation());
                customer.setCustomerId(customer.getCustomerId());
                customer.setSalary(customer.getSalary());

        System.out.println("--- input request from postman ---\n"+customer);

        template.send(TOPIC,customer);

        return "JSON message posted to kafka server!!";
    }
}
