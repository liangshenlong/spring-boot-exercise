package com.liangsl.java.service;

import com.liangsl.java.entity.User;
import com.liangsl.java.repository.UserMapper;
import com.liangsl.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.findAll();
    }

    public List<User> findList(User user){
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name",match -> match.contains());
        Example<User> example = Example.of(user,matcher);
        return userRepository.findAll(example);
    }

    public Page<User> findList(User user, Pageable pageable){
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatcher::contains);
        Example<User> example = Example.of(user,matcher);
        pageable.getSort().and(Sort.by(Sort.Order.desc("createTime")));
        return userRepository.findAll(example,pageable);
    }

    public User save(User user){
        user.setId(UUID.randomUUID().toString());
        user.setCreateTime(new Date());
        return userRepository.save(user);
    }

}
