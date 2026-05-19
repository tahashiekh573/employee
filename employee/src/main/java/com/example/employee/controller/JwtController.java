package com.example.employee.controller;

import com.example.employee.security.JwtService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class JwtController {

    private final JwtService jwtService;

    public JwtController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username) {

        // Normally yahan password verify hota hai
        // Abhi testing ke liye direct token generate kar rahe hain

        return jwtService.generateToken(username);
    }
}