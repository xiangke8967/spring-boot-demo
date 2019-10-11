package com.example.system.service.impl;

import com.example.system.dao.UserDao;
import com.example.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer add() {
        return userDao.insert();
    }
}
