package com.study.springbootshardingjdbc.order.controller;

import com.study.springbootshardingjdbc.order.service.OrderService;
import com.study.springbootshardingjdbc.order.vo.OrderVo;
import com.study.springbootshardingjdbc.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kris
 * @date 2018/9/18
 */
@RestController
@RequestMapping("orders")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResultVo save(OrderVo orderVo) {
        orderService.save(orderVo);
        return new ResultVo();
    }
}
