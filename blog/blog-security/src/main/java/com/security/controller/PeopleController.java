package com.security.controller;

import com.security.dao.PeopleDao;
import com.security.entity.po.People;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "用户信息管理", tags = "用户信息管理相关接口 - 向柯")
public class PeopleController {

    @Autowired
    private PeopleDao peopleDao;

    @GetMapping("/list")
    @ApiOperation(value = "获取用户列表", response = People.class)
    public List<People> list(){
        return peopleDao.findAll();
    }


}
