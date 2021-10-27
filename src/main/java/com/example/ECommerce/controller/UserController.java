package com.example.ECommerce.controller;
import com.example.ECommerce.model.User;
import com.example.ECommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World RESTful with Spring Boot";
    }



}
