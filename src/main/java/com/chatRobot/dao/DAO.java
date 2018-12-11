package com.chatRobot.dao;

import com.chatRobot.model.Example;
import com.chatRobot.model.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DAO<T> {
    List<T> selectRecordsByPage(@Param("pagebean")PageBean pagebean, @Param("example")Example example);
}
