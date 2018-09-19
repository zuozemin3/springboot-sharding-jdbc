package com.study.springbootshardingjdbc.order.dao;

import com.study.springbootshardingjdbc.order.vo.OrderVo;
import com.study.springbootshardingjdbc.utils.MybatisExtendedLanguageDriver;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author kris
 * @date 2018/9/18
 */
@Mapper
public interface OrderDao {

    @Insert("insert into t_order(user_id,price) values(#{userId},#{price})")
    void save(OrderVo orderVo);

    @Lang(MybatisExtendedLanguageDriver.class)
    @Select("select * from t_order where user_id in(#{userIds})")
    List<OrderVo> listByUserId(@Param("userIds") List<Integer> userIds);
}
