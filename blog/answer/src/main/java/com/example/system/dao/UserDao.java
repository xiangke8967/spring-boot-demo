package com.example.system.dao;

import com.example.system.entity.po.User;
import com.example.system.entity.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    public Integer insert(){
        User user1 = new User();
        user1.setAccount("123");
        user1.setPassword("123");
        userMapper.insertSelective(user1);
        return user1.getId();
    }
}
