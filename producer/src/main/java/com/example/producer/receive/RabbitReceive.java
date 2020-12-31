package com.example.producer.receive;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RabbitReceive {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "queue-1",durable ="true"),
            exchange = @Exchange(value = "exchange-1", durable="true", type = "topic",
                    ignoreDeclarationExceptions = "true"),
            key = "springboot.*"))
    @RabbitHandler
    public void onMessage(Message message, Channel channel) throws IOException {
        System.out.println("------------------");
        System.out.println("Consumer:" + message.getPayload());
        long deviceTag = (long) message.getHeaders().get(AmqpHeaders.DELIVERY_TAG);
        channel.basicAck(deviceTag,false);
    }

}
