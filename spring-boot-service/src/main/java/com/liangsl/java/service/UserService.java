package com.liangsl.java.service;

import com.liangsl.java.entity.User;
import com.liangsl.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by liangsl on 2018/5/17
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User save(User user){
        user.setId(UUID.randomUUID().toString());
        user.setCreateTime(new Date());
        return userRepository.save(user);
    }

}
