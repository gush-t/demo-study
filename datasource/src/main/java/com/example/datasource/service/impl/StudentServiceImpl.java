package com.example.datasource.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.datasource.dao.StudentMapper;
import com.example.datasource.entity.Student;
import com.example.datasource.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentMapper studentMapper;


    @Override
    public int insert(Student entity) {
        return studentMapper.insert(entity);
    }

    @Override
    public int deleteById(Integer id) {
        return studentMapper.deleteById(id);
    }

    @Override
    public int updateById(Student entity) {
        return studentMapper.updateById(entity);
    }

    @Override
    public int update(Student student) {
        return studentMapper.updateById(student);
    }

    @Override
    public Student selectById(Integer id) {
        return studentMapper.selectById(id);
    }

    @Override
    public Student selectOne(String stuName) {
        return studentMapper.selectOne(new QueryWrapper<Student>().eq("stuName",stuName));
    }

    @Override
    public IPage<Student> selectPage(IPage<Student> page, Wrapper<Student> queryWrapper) {
        return studentMapper.selectPage(page,queryWrapper);
    }

    @Override
    public Page<Student> selectPageBySchool(int pageNum, int pageSize, String stuSchool) {
        Page<Student> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Student> queryWrapper = new QueryWrapper<Student>().eq("stuSchool",stuSchool);
        return (Page<Student>) studentMapper.selectPage(page,queryWrapper);
    }
}
