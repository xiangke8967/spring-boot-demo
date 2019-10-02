package com.security.entity.mapper;

import com.security.entity.po.Authority;
import com.security.entity.po.AuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AuthorityMapper extends Mapper<Authority> {
    long countByExample(AuthorityExample example);

    int deleteByExample(AuthorityExample example);

    List<Authority> selectByExample(AuthorityExample example);

    int updateByExampleSelective(@Param("record") Authority record, @Param("example") AuthorityExample example);

    int updateByExample(@Param("record") Authority record, @Param("example") AuthorityExample example);
}