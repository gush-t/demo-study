package com.example.jdktest.mapper;

import com.example.jdktest.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    int add(Student t);

    int deleteById(Integer id);

    int update(Student t);

    Student findById(Integer id);

    List<Student> findAll();
}
