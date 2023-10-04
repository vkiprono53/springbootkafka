package com.vkiprono.kafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author vkiprono
 * @created 9/27/23
 */
@SpringBootApplication
public class KafkaConsumer {
    public static void main(String[] args) {
        System.out.println(":::::KafkaConsumer:::::");
        SpringApplication.run(KafkaConsumer.class, args);
    }
}
