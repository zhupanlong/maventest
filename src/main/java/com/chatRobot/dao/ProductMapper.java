package com.chatRobot.dao;

import com.chatRobot.model.Product;
import com.chatRobot.model.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ProductMapper extends DAO {
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    @Delete({
        "delete from T_PRODUCT",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into T_PRODUCT (ID, NAME, ",
        "PROCEEDS, ISSHELF, ",
        "PERIOD)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{proceeds,jdbcType=VARCHAR}, #{isshelf,jdbcType=VARCHAR}, ",
        "#{period,jdbcType=VARCHAR})"
    })
    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    @Select({
        "select",
        "ID, NAME, PROCEEDS, ISSHELF, PERIOD",
        "from T_PRODUCT",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.chatRobot.dao.ProductMapper.BaseResultMap")
    Product selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    @Update({
        "update T_PRODUCT",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "PROCEEDS = #{proceeds,jdbcType=VARCHAR},",
          "ISSHELF = #{isshelf,jdbcType=VARCHAR},",
          "PERIOD = #{period,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Product record);
}