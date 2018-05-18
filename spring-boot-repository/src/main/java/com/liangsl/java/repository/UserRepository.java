package com.liangsl.java.repository;

import com.liangsl.java.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liangsl on 2018/5/18
 */
public interface UserRepository extends JpaRepository<User,String>{
}
