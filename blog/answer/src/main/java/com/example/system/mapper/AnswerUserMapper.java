package com.example.system.mapper;

import com.example.system.entity.po.AnswerUser;
import com.example.system.entity.po.AnswerUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AnswerUserMapper extends Mapper<AnswerUser> {
    long countByExample(AnswerUserExample example);

    int deleteByExample(AnswerUserExample example);

    List<AnswerUser> selectByExample(AnswerUserExample example);

    int updateByExampleSelective(@Param("record") AnswerUser record, @Param("example") AnswerUserExample example);

    int updateByExample(@Param("record") AnswerUser record, @Param("example") AnswerUserExample example);
}