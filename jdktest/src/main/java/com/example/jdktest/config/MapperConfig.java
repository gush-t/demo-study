package com.example.jdktest.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan("com.example.jdktest.mapper")
public class MapperConfig {
    /**
     * MapperConfig IOC容器，数据访问bean对象实例创建
     * Mapper scan basePackage
     *
     */
}
