package com.liangsl.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * Created by liangsl on 2018/5/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RedisTemplateTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis() throws InterruptedException {
        redisTemplate.opsForValue().set("testRedis", UUID.randomUUID());

        Thread.sleep(1000);

        boolean hasKey = redisTemplate.hasKey("testRedis");
        if(hasKey){
            Object o = redisTemplate.opsForValue().get("testRedis");
            System.out.println(o);
        }else {
            System.out.println("testRedis not exist");
        }
    }
}
