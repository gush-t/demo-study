package com.example.datasource.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.datasource.entity.Student;
import com.example.datasource.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student/")
public class StudentController {
    @Autowired
    public StudentService studentService;

    @GetMapping
    public Student selectById(@RequestParam(name = "id") Integer id){
       return studentService.selectById(id);
    }

    @GetMapping("page/")
    public Page<Student> selectPage(@RequestParam(name = "pageNum") int pageNum,
                                    @RequestParam(name ="pageSize" )int pageSize,
                                    @RequestParam(name = "stuSchool") String stuSchool ){
    return studentService.selectPageBySchool(pageNum,pageSize,stuSchool);
    }


}
