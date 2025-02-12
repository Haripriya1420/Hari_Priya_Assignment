package com.janitri.assignment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "Spring Boot API is working!";
    }
}
