package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employee.entity.UserEntity;
import com.example.employee.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public UserEntity create(@RequestBody UserEntity user){
        return service.save(user);
    }
    @GetMapping
    public List<UserEntity> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public UserEntity getById(@PathVariable int id){
        return service.getById(id);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "Deleted Successfully";
    }
    @PutMapping("/{id}")
    public UserEntity update(@PathVariable int id, @RequestBody UserEntity user){
        return service.update(id, user);
    }
    @GetMapping("/email/{email}")
    public UserEntity getEmail(@PathVariable String email){
        return service.getEmail(email);
    }
}