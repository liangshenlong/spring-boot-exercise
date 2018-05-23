package com.liangsl.java.controller;

import com.liangsl.java.entity.User;
import com.liangsl.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("findPageList")
    public Page<User> findList(User user, @PageableDefault(sort = {"createTime"},direction = Sort.Direction.DESC) Pageable pageable){
        return userService.findList(user,pageable);
    }

    @RequestMapping("findList")
    public List<User> findList(User user){
        return userService.findList(user);
    }

    @RequestMapping("save")
    public User save(User user){
        return userService.save(user);
    }
}
