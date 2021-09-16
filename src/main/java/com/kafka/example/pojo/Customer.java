package com.kafka.example.pojo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private String firstName;
    private String lastName;
    private Integer customerId;
    private String location;
    private Double salary;
}
