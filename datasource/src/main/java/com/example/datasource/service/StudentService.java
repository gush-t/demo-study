package com.example.datasource.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.datasource.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface StudentService {
    int insert(Student entity);

    int deleteById(Integer id);

    int updateById(Student entity);

    int update(Student student);

    Student selectById(Integer id);

    Student selectOne(String stuName);

    IPage<Student> selectPage(IPage<Student> page,  Wrapper<Student> queryWrapper);

    Page<Student> selectPageBySchool(int pageNum, int pageSize, String stuSchool);
}
