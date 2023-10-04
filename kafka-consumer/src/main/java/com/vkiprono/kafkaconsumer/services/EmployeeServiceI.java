package com.vkiprono.kafkaconsumer.services;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author vkiprono
 * @created 9/27/23
 */

public interface EmployeeServiceI {

    void consume(String input) throws JsonProcessingException;

}
