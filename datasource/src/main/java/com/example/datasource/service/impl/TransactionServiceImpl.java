package com.example.datasource.service.impl;

import com.example.datasource.dao.StudentMapper;
import com.example.datasource.dao.WorkerMapper;
import com.example.datasource.entity.Student;
import com.example.datasource.entity.Worker;
import com.example.datasource.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private WorkerMapper workerMapper;

    @Override
    public void method01() {
        Student student = studentMapper.selectById(1);
        System.out.println(student.toString());
        Worker worker = workerMapper.selectById(1);
        System.out.println(worker.toString());
    }

    @Transactional
    @Override
    public void method02() {
        Student student = studentMapper.selectById(1);
        System.out.println(student.toString());
        Worker worker = workerMapper.selectById(1);
        System.out.println(worker.toString());
    }
}
