package com.chatRobot.dao;

import com.chatRobot.model.User;
import com.chatRobot.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper extends DAO {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    @Delete({
        "delete from T_USER",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into T_USER (ID, USERNAME, ",
        "PASSWORD, NAME, ",
        "SEX, EMAIL, QQ, ",
        "WEIXIN, REGTIME, ",
        "ENABLE)",
        "values (#{id,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{qq,jdbcType=VARCHAR}, ",
        "#{weixin,jdbcType=VARCHAR}, #{regtime,jdbcType=VARCHAR}, ",
        "#{enable,jdbcType=VARCHAR})"
    })
    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "ID, USERNAME, PASSWORD, NAME, SEX, EMAIL, QQ, WEIXIN, REGTIME, ENABLE",
        "from T_USER",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.UserMapper.BaseResultMap")
    User selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    @Update({
        "update T_USER",
        "set USERNAME = #{username,jdbcType=VARCHAR},",
          "PASSWORD = #{password,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "SEX = #{sex,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "QQ = #{qq,jdbcType=VARCHAR},",
          "WEIXIN = #{weixin,jdbcType=VARCHAR},",
          "REGTIME = #{regtime,jdbcType=VARCHAR},",
          "ENABLE = #{enable,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User record);
}