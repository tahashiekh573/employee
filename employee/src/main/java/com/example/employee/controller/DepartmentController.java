package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employee.entity.DepartmentEntity;
import com.example.employee.repository.DepartmentRepository;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repo;

    @PostMapping
    public DepartmentEntity create(@RequestBody DepartmentEntity dept) {
        return repo.save(dept);
    }

    @GetMapping("/fetchemployeeDep")
    public List<DepartmentEntity> getAll() {
        List<DepartmentEntity> list = repo.findAll();
        System.out.println(list);
        return list;
    }

    @GetMapping("/fetchemployeeDep/{id}")
    public DepartmentEntity getById(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}