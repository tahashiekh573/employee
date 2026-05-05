package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.EmployeeEntity;
import com.example.employee.repository.EmployeeRepositor;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepositor repo;

    // CREATE
    public EmployeeEntity save(EmployeeEntity emp) {
        return repo.save(emp);
    }

    // GET ALL
    public List<EmployeeEntity> getAll() {
        return repo.findAll();
    }

    // GET BY ID
    public EmployeeEntity getById(int id) {
        return repo.findById(id).orElse(null);
    }

    // DELETE
    public void delete(int id) {
        repo.deleteById(id);
    }

    // UPDATE
    public EmployeeEntity update(int id, EmployeeEntity emp) {
        EmployeeEntity existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(emp.getName());
            existing.setEmail(emp.getEmail());
            existing.setUserType(emp.getUserType());
            existing.setDepartment(emp.getDepartment()); 
            return repo.save(existing);
        }
        return null;
    }

    // FIND BY EMAIL
    public EmployeeEntity getByEmail(String email) {
        return repo.findByEmail(email);
    }
}


