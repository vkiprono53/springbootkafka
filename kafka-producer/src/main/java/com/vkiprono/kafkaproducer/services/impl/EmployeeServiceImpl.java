package com.vkiprono.kafkaproducer.services.impl;

import com.vkiprono.kafkaproducer.dtos.EmployeeDTO;
import com.vkiprono.kafkaproducer.services.EmployeeServiceI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author vkiprono
 * @created 9/27/23
 */

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {
    @Value("${topic.name}")
    private String kafkaTopic;

    @Autowired
    private KafkaTemplate<String, EmployeeDTO> kafkaTemplate;

    Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);


    @Override
    public void send(EmployeeDTO employeeDTO){
        LOGGER.info(":::::START EmployeeService.send():::::Message is" + employeeDTO);
        kafkaTemplate.send(kafkaTopic, employeeDTO);
    }
}
