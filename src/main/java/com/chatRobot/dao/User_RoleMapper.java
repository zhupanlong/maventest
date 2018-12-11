package com.chatRobot.dao;

import com.chatRobot.model.User_Role;
import com.chatRobot.model.User_RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface User_RoleMapper extends DAO {
    long countByExample(User_RoleExample example);

    int deleteByExample(User_RoleExample example);

    @Delete({
        "delete from T_USER_ROLE",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into T_USER_ROLE (ID, USERID, ",
        "ROLEID)",
        "values (#{id,jdbcType=VARCHAR}, #{userid,jdbcType=VARCHAR}, ",
        "#{roleid,jdbcType=VARCHAR})"
    })
    int insert(User_Role record);

    int insertSelective(User_Role record);

    List<User_Role> selectByExample(User_RoleExample example);

    @Select({
        "select",
        "ID, USERID, ROLEID",
        "from T_USER_ROLE",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.User_RoleMapper.BaseResultMap")
    User_Role selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User_Role record, @Param("example") User_RoleExample example);

    int updateByExample(@Param("record") User_Role record, @Param("example") User_RoleExample example);

    int updateByPrimaryKeySelective(User_Role record);

    @Update({
        "update T_USER_ROLE",
        "set USERID = #{userid,jdbcType=VARCHAR},",
          "ROLEID = #{roleid,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User_Role record);
}