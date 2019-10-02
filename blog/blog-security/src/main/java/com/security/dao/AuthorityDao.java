package com.security.dao;

import com.security.entity.mapper.AuthorityMapper;
import com.security.entity.po.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class AuthorityDao {

    @Autowired
    private AuthorityMapper authorityMapper;

    public Integer insert(Authority authority) {
        authorityMapper.insertSelective(authority);
        return authority.getId();
    }

    public Integer deleteById(Integer id) {
        return authorityMapper.deleteByPrimaryKey(id);
    }


    public Integer delete(Authority authority){
        return authorityMapper.delete(authority);
    }

}
