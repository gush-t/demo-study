package com.example.jdktest.servie;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<T> {
    /**
     * 数据库资源访问，增，删，改，查
     */

    int add(T t);

    int deleteById(Integer id);

    int update(T t);

    T findById(Integer id);

    List<T> findAll();
}
