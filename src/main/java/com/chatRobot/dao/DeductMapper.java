package com.chatRobot.dao;

import com.chatRobot.model.Deduct;
import com.chatRobot.model.DeductExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DeductMapper extends DAO {
    long countByExample(DeductExample example);

    int deleteByExample(DeductExample example);

    @Delete({
        "delete from T_DEDUCT",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into T_DEDUCT (ID, MCHNTCD, ",
        "MCHNTPASS, BANKNO, ",
        "BANKNAME, CUSNM, ",
        "MOBILENO, CREDTNO, ",
        "ACNTNO, ACNTNM, ",
        "ACNTPRO, ACNTCITY, ",
        "LOANAMOUNT, ORDERNUM, ",
        "SERIALNUM, PLATFORM, ",
        "DEDUCTRES, DEDUCTTIME, ",
        "STATE, REMARK)",
        "values (#{id,jdbcType=VARCHAR}, #{mchntcd,jdbcType=VARCHAR}, ",
        "#{mchntpass,jdbcType=VARCHAR}, #{bankno,jdbcType=VARCHAR}, ",
        "#{bankname,jdbcType=VARCHAR}, #{cusnm,jdbcType=VARCHAR}, ",
        "#{mobileno,jdbcType=VARCHAR}, #{credtno,jdbcType=VARCHAR}, ",
        "#{acntno,jdbcType=VARCHAR}, #{acntnm,jdbcType=VARCHAR}, ",
        "#{acntpro,jdbcType=VARCHAR}, #{acntcity,jdbcType=VARCHAR}, ",
        "#{loanamount,jdbcType=VARCHAR}, #{ordernum,jdbcType=VARCHAR}, ",
        "#{serialnum,jdbcType=VARCHAR}, #{platform,jdbcType=VARCHAR}, ",
        "#{deductres,jdbcType=VARCHAR}, #{deducttime,jdbcType=VARCHAR}, ",
        "#{state,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(Deduct record);

    int insertSelective(Deduct record);

    List<Deduct> selectByExample(DeductExample example);

    @Select({
        "select",
        "ID, MCHNTCD, MCHNTPASS, BANKNO, BANKNAME, CUSNM, MOBILENO, CREDTNO, ACNTNO, ",
        "ACNTNM, ACNTPRO, ACNTCITY, LOANAMOUNT, ORDERNUM, SERIALNUM, PLATFORM, DEDUCTRES, ",
        "DEDUCTTIME, STATE, REMARK",
        "from T_DEDUCT",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.DeductMapper.BaseResultMap")
    Deduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Deduct record, @Param("example") DeductExample example);

    int updateByExample(@Param("record") Deduct record, @Param("example") DeductExample example);

    int updateByPrimaryKeySelective(Deduct record);

    @Update({
        "update T_DEDUCT",
        "set MCHNTCD = #{mchntcd,jdbcType=VARCHAR},",
          "MCHNTPASS = #{mchntpass,jdbcType=VARCHAR},",
          "BANKNO = #{bankno,jdbcType=VARCHAR},",
          "BANKNAME = #{bankname,jdbcType=VARCHAR},",
          "CUSNM = #{cusnm,jdbcType=VARCHAR},",
          "MOBILENO = #{mobileno,jdbcType=VARCHAR},",
          "CREDTNO = #{credtno,jdbcType=VARCHAR},",
          "ACNTNO = #{acntno,jdbcType=VARCHAR},",
          "ACNTNM = #{acntnm,jdbcType=VARCHAR},",
          "ACNTPRO = #{acntpro,jdbcType=VARCHAR},",
          "ACNTCITY = #{acntcity,jdbcType=VARCHAR},",
          "LOANAMOUNT = #{loanamount,jdbcType=VARCHAR},",
          "ORDERNUM = #{ordernum,jdbcType=VARCHAR},",
          "SERIALNUM = #{serialnum,jdbcType=VARCHAR},",
          "PLATFORM = #{platform,jdbcType=VARCHAR},",
          "DEDUCTRES = #{deductres,jdbcType=VARCHAR},",
          "DEDUCTTIME = #{deducttime,jdbcType=VARCHAR},",
          "STATE = #{state,jdbcType=VARCHAR},",
          "REMARK = #{remark,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Deduct record);
}