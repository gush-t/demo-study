package com.example.datasource.dao;

import com.example.datasource.DatasourceApplication;
import com.example.datasource.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DatasourceApplication.class)
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testSelectId(){
        Student student =  studentMapper.selectById(1);
        System.out.println(student.toString());
    }
}
