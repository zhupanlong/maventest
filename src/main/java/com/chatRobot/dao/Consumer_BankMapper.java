package com.chatRobot.dao;

import com.chatRobot.model.Consumer_Bank;
import com.chatRobot.model.Consumer_BankExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface Consumer_BankMapper extends DAO {
    long countByExample(Consumer_BankExample example);

    int deleteByExample(Consumer_BankExample example);

    @Delete({
        "delete from T_CONSUMER_BANK",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into T_CONSUMER_BANK (ID, CID, ",
        "BANK, CARDNO, CARDNAME, ",
        "PROVINCE, CITY, ",
        "COUNTY, ACTIVE, ",
        "BANKNAME, BANKNO, ",
        "CUSTOMER_CODE, CUSTOMER_NAME, ",
        "ID_CARD, MOBILE, ",
        "EMAIL, ADDRESS)",
        "values (#{id,jdbcType=VARCHAR}, #{cid,jdbcType=VARCHAR}, ",
        "#{bank,jdbcType=VARCHAR}, #{cardno,jdbcType=VARCHAR}, #{cardname,jdbcType=VARCHAR}, ",
        "#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{county,jdbcType=VARCHAR}, #{active,jdbcType=VARCHAR}, ",
        "#{bankname,jdbcType=VARCHAR}, #{bankno,jdbcType=VARCHAR}, ",
        "#{customerCode,jdbcType=VARCHAR}, #{customerName,jdbcType=VARCHAR}, ",
        "#{idCard,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR})"
    })
    int insert(Consumer_Bank record);

    int insertSelective(Consumer_Bank record);

    List<Consumer_Bank> selectByExample(Consumer_BankExample example);

    @Select({
        "select",
        "ID, CID, BANK, CARDNO, CARDNAME, PROVINCE, CITY, COUNTY, ACTIVE, BANKNAME, BANKNO, ",
        "CUSTOMER_CODE, CUSTOMER_NAME, ID_CARD, MOBILE, EMAIL, ADDRESS",
        "from T_CONSUMER_BANK",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.Consumer_BankMapper.BaseResultMap")
    Consumer_Bank selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Consumer_Bank record, @Param("example") Consumer_BankExample example);

    int updateByExample(@Param("record") Consumer_Bank record, @Param("example") Consumer_BankExample example);

    int updateByPrimaryKeySelective(Consumer_Bank record);

    @Update({
        "update T_CONSUMER_BANK",
        "set CID = #{cid,jdbcType=VARCHAR},",
          "BANK = #{bank,jdbcType=VARCHAR},",
          "CARDNO = #{cardno,jdbcType=VARCHAR},",
          "CARDNAME = #{cardname,jdbcType=VARCHAR},",
          "PROVINCE = #{province,jdbcType=VARCHAR},",
          "CITY = #{city,jdbcType=VARCHAR},",
          "COUNTY = #{county,jdbcType=VARCHAR},",
          "ACTIVE = #{active,jdbcType=VARCHAR},",
          "BANKNAME = #{bankname,jdbcType=VARCHAR},",
          "BANKNO = #{bankno,jdbcType=VARCHAR},",
          "CUSTOMER_CODE = #{customerCode,jdbcType=VARCHAR},",
          "CUSTOMER_NAME = #{customerName,jdbcType=VARCHAR},",
          "ID_CARD = #{idCard,jdbcType=VARCHAR},",
          "MOBILE = #{mobile,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Consumer_Bank record);
}