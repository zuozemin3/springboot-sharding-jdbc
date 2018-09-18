package com.study.springbootshardingjdbc.order.service;

import com.study.springbootshardingjdbc.order.vo.OrderVo;

/**
 * @author kris
 * @date 2018/9/18
 */
public interface OrderService {

    void save(OrderVo orderVo);
}
