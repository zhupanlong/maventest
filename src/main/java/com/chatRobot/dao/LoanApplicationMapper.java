package com.chatRobot.dao;

import com.chatRobot.model.LoanApplication;
import com.chatRobot.model.LoanApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface LoanApplicationMapper extends DAO {
    long countByExample(LoanApplicationExample example);

    int deleteByExample(LoanApplicationExample example);

    @Delete({
        "delete from T_LOANAPPLICATION",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into T_LOANAPPLICATION (ID, CID, ",
        "PID, CUSNAME, PRONAME, ",
        "LOANCODE, LOANDATE, ",
        "LOANAMOUNT, COVERAGEDATE, ",
        "PRODUCT, AUDITOR, ",
        "AUDITORDATE, STATUS, ",
        "APPOINTDATE)",
        "values (#{id,jdbcType=VARCHAR}, #{cid,jdbcType=VARCHAR}, ",
        "#{pid,jdbcType=VARCHAR}, #{cusname,jdbcType=VARCHAR}, #{proname,jdbcType=VARCHAR}, ",
        "#{loancode,jdbcType=VARCHAR}, #{loandate,jdbcType=VARCHAR}, ",
        "#{loanamount,jdbcType=VARCHAR}, #{coveragedate,jdbcType=VARCHAR}, ",
        "#{product,jdbcType=VARCHAR}, #{auditor,jdbcType=VARCHAR}, ",
        "#{auditordate,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, ",
        "#{appointdate,jdbcType=VARCHAR})"
    })
    int insert(LoanApplication record);

    int insertSelective(LoanApplication record);

    List<LoanApplication> selectByExample(LoanApplicationExample example);

    @Select({
        "select",
        "ID, CID, PID, CUSNAME, PRONAME, LOANCODE, LOANDATE, LOANAMOUNT, COVERAGEDATE, ",
        "PRODUCT, AUDITOR, AUDITORDATE, STATUS, APPOINTDATE",
        "from T_LOANAPPLICATION",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.LoanApplicationMapper.BaseResultMap")
    LoanApplication selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LoanApplication record, @Param("example") LoanApplicationExample example);

    int updateByExample(@Param("record") LoanApplication record, @Param("example") LoanApplicationExample example);

    int updateByPrimaryKeySelective(LoanApplication record);

    @Update({
        "update T_LOANAPPLICATION",
        "set CID = #{cid,jdbcType=VARCHAR},",
          "PID = #{pid,jdbcType=VARCHAR},",
          "CUSNAME = #{cusname,jdbcType=VARCHAR},",
          "PRONAME = #{proname,jdbcType=VARCHAR},",
          "LOANCODE = #{loancode,jdbcType=VARCHAR},",
          "LOANDATE = #{loandate,jdbcType=VARCHAR},",
          "LOANAMOUNT = #{loanamount,jdbcType=VARCHAR},",
          "COVERAGEDATE = #{coveragedate,jdbcType=VARCHAR},",
          "PRODUCT = #{product,jdbcType=VARCHAR},",
          "AUDITOR = #{auditor,jdbcType=VARCHAR},",
          "AUDITORDATE = #{auditordate,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "APPOINTDATE = #{appointdate,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(LoanApplication record);
}