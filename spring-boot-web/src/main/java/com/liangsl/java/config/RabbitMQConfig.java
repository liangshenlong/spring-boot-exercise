package com.liangsl.java.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liangsl on 2018/5/23
 */
@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
