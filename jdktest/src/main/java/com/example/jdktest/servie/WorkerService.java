package com.example.jdktest.servie;

import com.example.jdktest.entity.Worker;


import java.util.List;


public interface WorkerService  {
    int add(Worker t);

    int deleteById(Integer id);

    int update(Worker t);

    Worker findById(Integer id);

    List<Worker> findAll();

}
