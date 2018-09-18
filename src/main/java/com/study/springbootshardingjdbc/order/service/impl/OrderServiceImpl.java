package com.study.springbootshardingjdbc.order.service.impl;

import com.study.springbootshardingjdbc.order.dao.OrderDao;
import com.study.springbootshardingjdbc.order.service.OrderService;
import com.study.springbootshardingjdbc.order.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kris
 * @date 2018/9/18
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void save(OrderVo orderVo) {
        orderDao.save(orderVo);
    }
}
