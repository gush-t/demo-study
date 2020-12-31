package com.example.consumer.sender;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

@Component
public class RabbitSender {

    //自动注入RabbitTemplate模板类
    @Autowired
    private RabbitTemplate rabbitTemplate;

    //confirm 确认机制
    final RabbitTemplate.ConfirmCallback confirmCallback = new RabbitTemplate.ConfirmCallback() {
        /**
         *
         * @param correlationData 回调的相关函数，包含消息ID
         * @param  ack ,true代表ack,false代表nack
         * @param cause 如果为nack, 返回原因，否则为Null
         */
        @Override
        public void confirm(CorrelationData correlationData, boolean ack, String cause) {
            System.out.println("correlationData: "+ correlationData);
            System.out.println("ack: "+ack);
            if (!ack){
                System.out.println("异常处理机制。。。");
            }
        }
    };
    // return 返回机制
    final RabbitTemplate.ReturnCallback returnCallback = new RabbitTemplate.ReturnCallback() {
        /**
         *
         * @param message
         * @param replyCode
         * @param replyText
         * @param exchange
         * @param routingKey
         */
        @Override
        public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
            System.out.println("return exchange: " + exchange + ", routingKey: "
                    + routingKey + ", replyCode: " + replyCode + ", replyText: " + replyText);
        }
    };

    //发送消息方法调用：构建message消息
    public void sendMessage(Object message , Map<String,Object> properties){
        MessageHeaders messageHeaders = new MessageHeaders(properties);
        //这里的消息message类和上面不同，需要注意导包
        org.springframework.messaging.Message msg = MessageBuilder.createMessage(message,messageHeaders);
        rabbitTemplate.setConfirmCallback(confirmCallback);
        rabbitTemplate.setReturnCallback(returnCallback);
        LocalDateTime localDate = LocalDateTime.now();
        String id = localDate.toString();
        CorrelationData correlationData = new CorrelationData(id);
        rabbitTemplate.convertAndSend("exchange-1","springboot.hello",msg,correlationData);
    }


}
