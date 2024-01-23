package com.azure.Azure.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/books")
public class BookController {

 
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}