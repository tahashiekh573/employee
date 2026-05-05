package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employee.entity.EmployeeEntity;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public EmployeeEntity create(@RequestBody EmployeeEntity emp) {
        return service.save(emp);
    }

    @GetMapping
    public List<EmployeeEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public EmployeeEntity getById(@PathVariable int id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted Successfully";
    }

    @PutMapping("/{id}")
    public EmployeeEntity update(@PathVariable int id, @RequestBody EmployeeEntity emp) {
        return service.update(id, emp);
    }

    @GetMapping("/email/{email}")
    public EmployeeEntity getByEmail(@PathVariable String email) {
        return service.getByEmail(email);
    }
}