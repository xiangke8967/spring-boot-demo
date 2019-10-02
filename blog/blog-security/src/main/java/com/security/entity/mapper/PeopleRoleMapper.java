package com.security.entity.mapper;

import com.security.entity.po.PeopleRole;
import com.security.entity.po.PeopleRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PeopleRoleMapper extends Mapper<PeopleRole> {
    long countByExample(PeopleRoleExample example);

    int deleteByExample(PeopleRoleExample example);

    List<PeopleRole> selectByExample(PeopleRoleExample example);

    int updateByExampleSelective(@Param("record") PeopleRole record, @Param("example") PeopleRoleExample example);

    int updateByExample(@Param("record") PeopleRole record, @Param("example") PeopleRoleExample example);
}