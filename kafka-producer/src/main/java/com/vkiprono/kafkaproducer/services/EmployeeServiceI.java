package com.vkiprono.kafkaproducer.services;

import com.vkiprono.kafkaproducer.dtos.EmployeeDTO;


/**
 * @author vkiprono
 * @created 9/27/23
 */


public interface EmployeeServiceI {

     void send(EmployeeDTO employeeDTO);
}
