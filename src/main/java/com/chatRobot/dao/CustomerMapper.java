package com.chatRobot.dao;

import com.chatRobot.model.Customer;
import com.chatRobot.model.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CustomerMapper extends DAO {
    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    @Delete({
        "delete from T_CUSTOMER",
        "where CID = #{cid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String cid);

    @Insert({
        "insert into T_CUSTOMER (CID, CUSTOMER_CODE, ",
        "CUSTOMER_NAME, ID_CARD, ",
        "MOBILE, EMAIL, ADDRESS)",
        "values (#{cid,jdbcType=VARCHAR}, #{customerCode,jdbcType=VARCHAR}, ",
        "#{customerName,jdbcType=VARCHAR}, #{idCard,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR})"
    })
    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    @Select({
        "select",
        "CID, CUSTOMER_CODE, CUSTOMER_NAME, ID_CARD, MOBILE, EMAIL, ADDRESS",
        "from T_CUSTOMER",
        "where CID = #{cid,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.CustomerMapper.BaseResultMap")
    Customer selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    @Update({
        "update T_CUSTOMER",
        "set CUSTOMER_CODE = #{customerCode,jdbcType=VARCHAR},",
          "CUSTOMER_NAME = #{customerName,jdbcType=VARCHAR},",
          "ID_CARD = #{idCard,jdbcType=VARCHAR},",
          "MOBILE = #{mobile,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR}",
        "where CID = #{cid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Customer record);
}