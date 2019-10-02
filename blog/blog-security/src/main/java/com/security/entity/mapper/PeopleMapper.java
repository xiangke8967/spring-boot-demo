package com.security.entity.mapper;

import com.security.entity.po.People;
import com.security.entity.po.PeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PeopleMapper extends Mapper<People> {
    long countByExample(PeopleExample example);

    int deleteByExample(PeopleExample example);

    List<People> selectByExample(PeopleExample example);

    int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);
}