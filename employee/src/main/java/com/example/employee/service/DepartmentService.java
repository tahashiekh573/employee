
 package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.DepartmentEntity;
import com.example.employee.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repo;

    // CREATE
    public DepartmentEntity save(DepartmentEntity dept) {
        return repo.save(dept);
    }

    // GET ALL
    public List<DepartmentEntity> getAll() {
        return repo.findAll();
    }

    // GET BY ID
    public DepartmentEntity getById(int id) {
        return repo.findById(id).orElse(null);
    }

    // DELETE
    public void delete(int id) {
        repo.deleteById(id);
    }

    // UPDATE
    public DepartmentEntity update(int id, DepartmentEntity dept) {

        DepartmentEntity existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setDeptName(dept.getDeptName());
            existing.setCodeName(dept.getCodeName());
            existing.setSalary(dept.getSalary());
            return repo.save(existing);
        }

        return null;
    }
} 
    

