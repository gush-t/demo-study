package com.example.jdktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdktestApplication {

    /**
     * 整合Springboot mybatis rabbitMQ
     * 分3层
     * mapper  数据访问层
     * service 业务逻辑层
     * controller 控制展示
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(JdktestApplication.class, args);
    }

}
