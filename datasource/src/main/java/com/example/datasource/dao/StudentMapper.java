package com.example.datasource.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.datasource.entity.Student;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
