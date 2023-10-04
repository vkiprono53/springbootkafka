package com.vkiprono.kafkaconsumer.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author vkiprono
 * @created 10/2/23
 */

@Configuration
public class KafkaConsumerConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
