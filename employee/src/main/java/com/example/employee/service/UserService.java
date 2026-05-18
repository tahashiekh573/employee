package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.UserEntity;
import com.example.employee.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // CREATE
    public UserEntity save(UserEntity user) {
        return repo.save(user);
    }

    // GET ALL
    public List<UserEntity> getAll() {
        return repo.findAll();
    }

    // GET BY ID
    public UserEntity getById(int id) {
        return repo.findById(id).orElse(null);
    }

    // DELETE
    public void delete(int id) {
        repo.deleteById(id);
    }

    // UPDATE
    public UserEntity update(int id, UserEntity user) {

        UserEntity existing = repo.findById(id).orElse(null);

        if (existing != null) {

            existing.setName(user.getName());
            existing.setEmail(user.getEmail());
            existing.setPassword(user.getPassword());
            existing.setRole(user.getRole());

            return repo.save(existing);
        }

        return null;
    }

    // GET BY EMAIL
    public UserEntity getEmail(String email) {
        return repo.findByEmail(email);
    }
}