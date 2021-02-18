package com.example.jdktest.servie.impl;

import com.example.jdktest.entity.Student;
import com.example.jdktest.mapper.StudentMapper;
import com.example.jdktest.servie.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student t) {
        return studentMapper.insert(t);
    }

    @Override
    public int deleteById(Integer id) {
        return studentMapper.deleteById(id);
    }

    @Override
    public int update(Student t) {
        return studentMapper.updateById(t);
    }

    @Override
    public Student findById(Integer id) {
        return studentMapper.selectById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
