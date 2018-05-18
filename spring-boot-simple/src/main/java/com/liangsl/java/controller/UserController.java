package com.liangsl.java.controller;

import com.liangsl.java.entity.User;
import com.liangsl.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by liangsl on 2018/5/18
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("save")
    public User save(User user){
        user.setId(UUID.randomUUID().toString());
        user.setCreateTime(new Date());
        return userService.save(user);
    }
}
