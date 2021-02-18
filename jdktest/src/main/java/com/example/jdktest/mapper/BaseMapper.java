package com.example.jdktest.mapper;

import com.example.jdktest.entity.Worker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BaseMapper<T>  {

    /**
     * 数据库资源访问，增，删，改，查
     */

    int add(T t);

    int deleteById(Integer id);

    int update(T t);

    T findById(Integer id);

    List<T> findAll();



}
