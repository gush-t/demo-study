package com.example.jdktest.mapper;

import com.example.jdktest.entity.Worker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkerMapper {
    /**
     * 数据库资源访问，增，删，改，查
     */
    int add(Worker t);

    int deleteById(Integer id);

    int update(Worker t);

    Worker findById(Integer id);

    List<Worker> findAll();




}
