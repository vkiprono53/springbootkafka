package com.vkiprono.kafkaconsumer.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vkiprono.kafkaconsumer.dtos.EmployeeDTO;
import com.vkiprono.kafkaconsumer.models.Employee;
import com.vkiprono.kafkaconsumer.repositories.EmployeeRepository;
import com.vkiprono.kafkaconsumer.services.EmployeeServiceI;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author vkiprono
 * @created 9/27/23
 */

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {
    private  final EmployeeRepository employeeRepository;

    private final ModelMapper modelMapper;
    private final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ModelMapper modelMapper) {

        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    //Consume Messages and save in the DB
    @Override
    @KafkaListener(topics = "myKafkaTopic", groupId = "myGroupId")
    public void consume(String input) throws JsonProcessingException {
        LOGGER.info(":::::START EmployeeService.consume():::::");

        ObjectMapper objectMapper = new ObjectMapper();
        EmployeeDTO employeeDTO = new EmployeeDTO();
        Employee employee = new Employee();
        employeeDTO = objectMapper.readValue(input, EmployeeDTO.class);

        modelMapper.getConfiguration()
                        .setMatchingStrategy(MatchingStrategies.LOOSE);
        employee = modelMapper.map(employeeDTO, Employee.class);

        employeeRepository.save(employee);
        LOGGER.info(":::::END EmployeeService.consume()::::: ");

    }

}
