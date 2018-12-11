package com.chatRobot.dao;

import com.chatRobot.model.Example;
import com.chatRobot.model.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DAO<T> {
    public static final String COUNTBYEXAMPLE="countByExample";
    public static final String DELETEBYEXAMPLE="deleteByExample";
    public static final String DELETEBYPRIMARYKEY="deleteByPrimaryKey";
    public static final String INSERT="insert";
    public static final String INSERTSELECTIVE="insertSelective";
    public static final String SELECTBYEXAMPLE="selectByExample";
    public static final String SELECTBYPRIMARYKEY="selectByPrimaryKey";
    public static final String UPDATEBYEXAMPLESELECTIVE="updateByExampleSelective";
    public static final String UPDATEBYEXAMPLE="updateByExample";
    public static final String UPDATEBYPRIMARYKEYSELECTIVE="updateByPrimaryKeySelective";
    public static final String UPDATEBYPRIMARYKEY="updateByPrimaryKey";
    public static final String SELECTRECORDSBYPAGE="selectRecordsByPage";

    long countByExample(Example example);
    int deleteByExample(Example example);
    int deleteByPrimaryKey(String id);
    int insert(T record);
    int insertSelective(T record);
    List<T> selectByExample(Example example);
    T selectByPrimaryKey(String id);
    int updateByExampleSelective(@Param("record") T record, @Param("example") Example example);
    int updateByExample(@Param("record") T record, @Param("example") Example example);
    int updateByPrimaryKeySelective(T record);
    int updateByPrimaryKey(T record);
    List<T> selectRecordsByPage(@Param("pagebean")PageBean pagebean, @Param("example")Example example);


}
