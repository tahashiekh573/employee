package com.example.employee.dto;

public class UserDto {

    private int id;
    private String name;
    private String email;
    private String role;

    // GET ID
    public int getId() {
        return id;
    }

    // SET ID
    public void setId(int id) {
        this.id = id;
    }

    // GET NAME
    public String getName() {
        return name;
    }

    // SET NAME
    public void setName(String name) {
        this.name = name;
    }

    // GET EMAIL
    public String getEmail() {
        return email;
    }

    // SET EMAIL
    public void setEmail(String email) {
        this.email = email;
    }

    // GET ROLE
    public String getRole() {
        return role;
    }

    // SET ROLE
    public void setRole(String role) {
        this.role = role;
    }
}