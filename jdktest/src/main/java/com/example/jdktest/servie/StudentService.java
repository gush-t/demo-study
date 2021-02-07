package com.example.jdktest.servie;

import com.example.jdktest.entity.Student;


import java.util.List;


public interface StudentService {

    int add(Student t);

    int deleteById(Integer id);

    int update(Student t);

    Student findById(Integer id);

    List<Student> findAll();

}
