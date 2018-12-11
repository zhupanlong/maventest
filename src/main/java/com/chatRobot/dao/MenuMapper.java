package com.chatRobot.dao;

import com.chatRobot.model.Menu;
import com.chatRobot.model.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MenuMapper extends DAO {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    @Delete({
        "delete from T_MENU",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into T_MENU (ID, NAME, ",
        "PARENTID, ICONCLS, ",
        "URL, ENABLE, LEVELID)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{parentid,jdbcType=VARCHAR}, #{iconcls,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{enable,jdbcType=VARCHAR}, #{levelid,jdbcType=VARCHAR})"
    })
    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    @Select({
        "select",
        "ID, NAME, PARENTID, ICONCLS, URL, ENABLE, LEVELID",
        "from T_MENU",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.MenuMapper.BaseResultMap")
    Menu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    @Update({
        "update T_MENU",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "PARENTID = #{parentid,jdbcType=VARCHAR},",
          "ICONCLS = #{iconcls,jdbcType=VARCHAR},",
          "URL = #{url,jdbcType=VARCHAR},",
          "ENABLE = #{enable,jdbcType=VARCHAR},",
          "LEVELID = #{levelid,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Menu record);
}