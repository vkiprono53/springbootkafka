package com.vkiprono.kafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author vkiprono
 * @created 9/27/23
 */

@SpringBootApplication
public class KafkaProducer {
    public static void main(String[] args) {
        System.out.println(":::::Kafka Producer:::::");
        SpringApplication.run(KafkaProducer.class, args);
    }
}
