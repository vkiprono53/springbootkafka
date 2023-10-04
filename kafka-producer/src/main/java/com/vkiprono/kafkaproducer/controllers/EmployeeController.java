package com.vkiprono.kafkaproducer.controllers;

import com.vkiprono.kafkaproducer.dtos.EmployeeDTO;
import com.vkiprono.kafkaproducer.services.EmployeeServiceI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vkiprono
 * @created 9/27/23
 */

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private final EmployeeServiceI employeeService;

    Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    public EmployeeController(EmployeeServiceI employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public void send(@RequestBody EmployeeDTO employeeDTO){
        LOGGER.info(":::::START EmployeeController.send():::::");

        employeeService.send(employeeDTO);
    }
}
