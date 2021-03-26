package com.example.demo03nacosprovider.controller;

import com.example.demo03nacosprovider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public String providerTest(){
        return "hello word";
    }

    @PostMapping("/user")
    public String providerTestTwo(){
        return "two";
    }
}
