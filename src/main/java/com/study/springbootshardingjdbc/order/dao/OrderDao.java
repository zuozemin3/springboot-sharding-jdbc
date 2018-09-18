package com.study.springbootshardingjdbc.order.dao;

import com.study.springbootshardingjdbc.order.vo.OrderVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author kris
 * @date 2018/9/18
 */
@Mapper
public interface OrderDao {

    @Insert("insert into t_order(user_id,price) values(#{userId},#{price})")
    void save(OrderVo orderVo);
}
