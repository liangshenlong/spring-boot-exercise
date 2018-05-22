package com.liangsl.java.repository;

import com.liangsl.java.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by liangsl on 2018/5/22
 */
@Mapper
public interface UserMapper {
    @Select("select id,name,create_time as 'createTime' from user")
//    @Results({@Result(property = "createTime",column = "create_time")})
    List<User> findAll();
}
