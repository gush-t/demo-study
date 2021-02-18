package com.example.datasource.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.datasource.constant.DBConstant;
import com.example.datasource.constant.DBConstantEnum;
import com.example.datasource.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DS(DBConstant.DB_STUDENT)
public interface StudentMapper extends BaseMapper<Student> {

}
