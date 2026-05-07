package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.EmployeeEntity;
import com.example.employee.entity.DepartmentEntity;
import com.example.employee.repository.EmployeeRepositor;
import com.example.employee.repository.DepartmentRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepositor repo;

    @Autowired
    private DepartmentRepository deptRepo; 

    // CREATE
    public EmployeeEntity save(EmployeeEntity emp) {

        if (emp.getDepartment() != null) {

            int deptId = emp.getDepartment().getId();

            //  DB se full department fetch
            DepartmentEntity dept = deptRepo.findById(deptId).orElse(null);

            emp.setDepartment(dept);
        }

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

            if (emp.getDepartment() != null) {

                int deptId = emp.getDepartment().getId();

                //  again DB se fetch
                DepartmentEntity dept = deptRepo.findById(deptId).orElse(null);

                existing.setDepartment(dept);
            }

            return repo.save(existing);
        }

        return null;
    }

    // FIND BY EMAIL
    public EmployeeEntity getByEmail(String email) {
        return repo.findByEmail(email);
    }
}