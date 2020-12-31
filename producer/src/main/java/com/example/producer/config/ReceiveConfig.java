package com.example.producer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example.producer.receive"})
public class ReceiveConfig {
}
