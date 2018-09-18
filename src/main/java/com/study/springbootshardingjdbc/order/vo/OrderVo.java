package com.study.springbootshardingjdbc.order.vo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author kris
 * @date 2018/9/18
 */
@Data
public class OrderVo implements Serializable {

    public String orderId;

    public int userId;

    public int price;

    public Date createTime;

    public Date updateTime;
}
