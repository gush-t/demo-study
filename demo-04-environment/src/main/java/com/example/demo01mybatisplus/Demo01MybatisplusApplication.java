package com.example.demo01mybatisplus;

import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.jdbc.JdbcTransaction;
import org.mybatis.spring.transaction.SpringManagedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo01MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01MybatisplusApplication.class, args);
    }

}
