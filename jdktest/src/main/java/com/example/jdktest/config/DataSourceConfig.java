package com.example.jdktest.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(name = "studentDataSource")
    @ConfigurationProperties( prefix = "spring.datasource.student")
    public DataSource studentDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name ="workerDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.worker")
    public DataSource workerDataSource(){
        return DruidDataSourceBuilder.create().build();
    }
}
