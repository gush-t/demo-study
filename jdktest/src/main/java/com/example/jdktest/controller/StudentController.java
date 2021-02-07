package com.example.jdktest.controller;

import com.example.jdktest.entity.Student;
import com.example.jdktest.servie.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public Student getStudent(@RequestParam Integer id){
    return studentService.findById(id);
    }

    @GetMapping("/all")
    public List<Student> getAll(){
        return studentService.findAll();
    }





}
