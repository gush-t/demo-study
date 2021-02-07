package com.example.jdktest.controller;

import com.example.jdktest.entity.Worker;
import com.example.jdktest.servie.WorkerService;
import com.example.jdktest.servie.impl.WorkerServiceImpl;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Worker/")
public class WorkerController {
    /**
     * restController 注解包含controller responseBody 两个注解的组合注解
     */
    @Autowired
    private WorkerService workerService;

    @GetMapping
    public Worker getWorker(@RequestParam Integer id){
         return workerService.findById(id);
    }
    @DeleteMapping
    public String deleteWorker(@RequestParam Integer id){
        //删除逻辑
        //先查询是否存在，再进行删除
        Worker worker =  workerService.findById(id);
        if (worker != null){
            workerService.deleteById(id);
            return "success";
        }
        return "fail";
    }

    @GetMapping("all/")
    public List<Worker> getAllWorker(){
        return workerService.findAll();
    }

    @PostMapping
    public String insertWorker(@RequestBody Worker worker){

        workerService.add(worker);
        return "success";
    }

    @PutMapping
    public String updateWorker(@RequestBody Worker worker){
        workerService.update(worker);
        return "success";
    }






}
