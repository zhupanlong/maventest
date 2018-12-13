package com.chatRobot.dao;

import com.chatRobot.model.ResearchItem;
import com.chatRobot.model.ResearchItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface ResearchItemMapper extends DAO {
    long countByExample(ResearchItemExample example);

    int deleteByExample(ResearchItemExample example);

    @Insert({
        "insert into T_RESEARCHITEM (TABLENAME, COLUMNNAME, ",
        "DESCRIPTION, COMMENTS, ",
        "RESEARCHFLAG)",
        "values (#{tablename,jdbcType=VARCHAR}, #{columnname,jdbcType=VARCHAR}, ",
        "#{description,jdbcType=VARCHAR}, #{comments,jdbcType=VARCHAR}, ",
        "#{researchflag,jdbcType=CHAR})"
    })
    int insert(ResearchItem record);

    int insertSelective(ResearchItem record);

    List<ResearchItem> selectByExample(ResearchItemExample example);

    int updateByExampleSelective(@Param("record") ResearchItem record, @Param("example") ResearchItemExample example);

    int updateByExample(@Param("record") ResearchItem record, @Param("example") ResearchItemExample example);
}