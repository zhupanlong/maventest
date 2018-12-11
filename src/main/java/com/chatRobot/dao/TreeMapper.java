package com.chatRobot.dao;

import com.chatRobot.model.Tree;
import com.chatRobot.model.TreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TreeMapper extends DAO {
    long countByExample(TreeExample example);

    int deleteByExample(TreeExample example);

    @Delete({
        "delete from T_TREE",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into T_TREE (ID, TEXT, ",
        "STATE, CHECKED, ",
        "ICONCLS, PID)",
        "values (#{id,jdbcType=VARCHAR}, #{text,jdbcType=VARCHAR}, ",
        "#{state,jdbcType=VARCHAR}, #{checked,jdbcType=VARCHAR}, ",
        "#{iconcls,jdbcType=VARCHAR}, #{pid,jdbcType=VARCHAR})"
    })
    int insert(Tree record);

    int insertSelective(Tree record);

    List<Tree> selectByExample(TreeExample example);

    @Select({
        "select",
        "ID, TEXT, STATE, CHECKED, ICONCLS, PID",
        "from T_TREE",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.TreeMapper.BaseResultMap")
    Tree selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Tree record, @Param("example") TreeExample example);

    int updateByExample(@Param("record") Tree record, @Param("example") TreeExample example);

    int updateByPrimaryKeySelective(Tree record);

    @Update({
        "update T_TREE",
        "set TEXT = #{text,jdbcType=VARCHAR},",
          "STATE = #{state,jdbcType=VARCHAR},",
          "CHECKED = #{checked,jdbcType=VARCHAR},",
          "ICONCLS = #{iconcls,jdbcType=VARCHAR},",
          "PID = #{pid,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Tree record);
}