package com.chatRobot.dao;

import com.chatRobot.model.Role;
import com.chatRobot.model.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface RoleMapper extends DAO {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    @Delete({
        "delete from T_ROLE",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into T_ROLE (ID, NAME)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR})"
    })
    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    @Select({
        "select",
        "ID, NAME",
        "from T_ROLE",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.RoleMapper.BaseResultMap")
    Role selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    @Update({
        "update T_ROLE",
        "set NAME = #{name,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Role record);
}