package com.security.dao;

import com.security.entity.mapper.PeopleMapper;
import com.security.entity.po.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PeopleDao {

    @Autowired
    private PeopleMapper peopleMapper;

    public List<People> findAll(){
        return peopleMapper.selectAll();
    }

}
