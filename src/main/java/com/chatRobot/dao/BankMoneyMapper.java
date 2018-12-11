package com.chatRobot.dao;

import com.chatRobot.model.BankMoney;
import com.chatRobot.model.BankMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BankMoneyMapper extends DAO {
    long countByExample(BankMoneyExample example);

    int deleteByExample(BankMoneyExample example);

    @Delete({
        "delete from T_BANKMONEY",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into T_BANKMONEY (ID, LOANAPPLICATION, ",
        "LOANCODE, PERIOD, ",
        "ACCRUAL, CAPITAL)",
        "values (#{id,jdbcType=VARCHAR}, #{loanapplication,jdbcType=VARCHAR}, ",
        "#{loancode,jdbcType=VARCHAR}, #{period,jdbcType=VARCHAR}, ",
        "#{accrual,jdbcType=VARCHAR}, #{capital,jdbcType=VARCHAR})"
    })
    int insert(BankMoney record);

    int insertSelective(BankMoney record);

    List<BankMoney> selectByExample(BankMoneyExample example);

    @Select({
        "select",
        "ID, LOANAPPLICATION, LOANCODE, PERIOD, ACCRUAL, CAPITAL",
        "from T_BANKMONEY",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.BankMoneyMapper.BaseResultMap")
    BankMoney selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BankMoney record, @Param("example") BankMoneyExample example);

    int updateByExample(@Param("record") BankMoney record, @Param("example") BankMoneyExample example);

    int updateByPrimaryKeySelective(BankMoney record);

    @Update({
        "update T_BANKMONEY",
        "set LOANAPPLICATION = #{loanapplication,jdbcType=VARCHAR},",
          "LOANCODE = #{loancode,jdbcType=VARCHAR},",
          "PERIOD = #{period,jdbcType=VARCHAR},",
          "ACCRUAL = #{accrual,jdbcType=VARCHAR},",
          "CAPITAL = #{capital,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(BankMoney record);
}