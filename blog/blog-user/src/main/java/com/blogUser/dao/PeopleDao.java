package com.blogUser.dao;

import com.blogUser.entity.po.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.blogUser.entity.mapper.PeopleMapper;

import java.util.List;

@Repository
public class PeopleDao {

    @Autowired
    private PeopleMapper peopleMapper;

    public List<People> findAll(){
        return peopleMapper.selectAll();
    }

}
