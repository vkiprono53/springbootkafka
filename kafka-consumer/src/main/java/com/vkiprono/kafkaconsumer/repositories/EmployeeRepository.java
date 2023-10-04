package com.vkiprono.kafkaconsumer.repositories;

import com.vkiprono.kafkaconsumer.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author vkiprono
 * @created 9/27/23
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
