package com.example.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String role;

    // ===== GET ID =====
    public int getId() {
        return id;
    }

    // ===== SET ID =====
    public void setId(int id) {
        this.id = id;
    }

    // ===== GET NAME =====
    public String getName() {
        return name;
    }

    // ===== SET NAME =====
    public void setName(String name) {
        this.name = name;
    }

    // ===== GET EMAIL =====
    public String getEmail() {
        return email;
    }

    // ===== SET EMAIL =====
    public void setEmail(String email) {
        this.email = email;
    }

    // ===== GET PASSWORD =====
    public String getPassword() {
        return password;
    }

    // ===== SET PASSWORD =====
    public void  setPassword(String password) {
        this.password = password;
    }

    // ===== GET ROLE =====
    public String getRole() {
        return role;
    }

    // ===== SET ROLE =====
    public void setRole(String role) {
        this.role = role;
    }
}