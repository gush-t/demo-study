package com.example.consumer.product;


import com.example.consumer.sender.RabbitSender;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SenderTest {

    @Autowired
    private RabbitSender rabbitSender;

    @Test
    private void contextLoad(){

    }

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Test
    public  void send(){
        Map<String ,Object> properties = new HashMap<>();
        properties.put("number","123");
        properties.put("send_time", LocalDateTime.now().toString());
        rabbitSender.sendMessage("RabbitMQ from springboot",properties);
    }
}
