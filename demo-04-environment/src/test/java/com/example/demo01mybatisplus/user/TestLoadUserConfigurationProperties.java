package com.example.demo01mybatisplus.user;

import com.example.demo01mybatisplus.config.UserConfigurationProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootTest
public class TestLoadUserConfigurationProperties {

    private final Logger logger = LoggerFactory.getLogger(TestLoadUserConfigurationProperties.class);

    @Component
    public  class testLoadValues implements CommandLineRunner {

        @Autowired
        private UserConfigurationProperties userConfigurationProperties;

        @Override
        public void run(String... args) throws Exception {
            logger.info("password:{}",userConfigurationProperties.getPassword());
            logger.info("username:{}",userConfigurationProperties.getUsername());
        }

    }



}
