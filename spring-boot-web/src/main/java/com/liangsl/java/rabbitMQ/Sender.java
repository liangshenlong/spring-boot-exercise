package com.liangsl.java.rabbitMQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by liangsl on 2018/5/23
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello"+ LocalDateTime.now().toString();
        System.out.println("=========== sent: "+context);
        amqpTemplate.convertAndSend("hello",context);
    }
}
