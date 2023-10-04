package com.vkipono.kafka.v1.listener;

import org.springframework.stereotype.Service;

@Service
public class KafkaListener {

   // @org.springframework.kafka.annotation.KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumed Message is::::" + message);
    }

   // @org.springframework.kafka.annotation.KafkaListener(topics = "Kafka_Json", groupId = "group_json")
    public void userMsg(String user){
        System.out.println("Consumed Message User is::::" + user);
    }
}
