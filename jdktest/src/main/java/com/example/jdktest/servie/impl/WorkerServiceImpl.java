package com.example.jdktest.servie.impl;

import com.example.jdktest.entity.Worker;
import com.example.jdktest.mapper.WorkerMapper;
import com.example.jdktest.servie.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    /**
     * 增，删，该，查 是每个类都应该具备的公共接口方法<T></> 泛型T代表任意类型
     */
    @Autowired
    private WorkerMapper workerMapper;

    @Override
    public int add(Worker worker) {
        return workerMapper.add(worker);
    }

    @Override
    public int deleteById(Integer id) {
        return workerMapper.deleteById(id);
    }

    @Override
    public int update(Worker worker) {
        return workerMapper.update(worker);
    }

    @Override
    public Worker findById(Integer id) {
        return workerMapper.findById(id);
    }

    @Override
    public List<Worker> findAll() {
        return workerMapper.findAll();
    }
}
