package com.example.demo01mybatisplus.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.example.demo01mybatisplus.mapper")
public class MapperConfig {
}
