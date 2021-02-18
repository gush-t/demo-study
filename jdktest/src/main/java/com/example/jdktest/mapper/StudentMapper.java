package com.example.jdktest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jdktest.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {


    List<Student> findAll();
}
