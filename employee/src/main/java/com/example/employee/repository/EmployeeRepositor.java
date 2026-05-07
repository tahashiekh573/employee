

package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employee.entity.EmployeeEntity;

public interface EmployeeRepositor extends JpaRepository<EmployeeEntity, Integer> {

    EmployeeEntity findByEmail(String email);
}