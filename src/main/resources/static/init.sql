


create database ds0;
create database ds1;

use ds0;
 CREATE TABLE `t_order_0` (
  `order_id` varchar(200) NOT NULL,
  `user_id` int(11) NOT NULL,
  `price` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 CREATE TABLE `t_order_1` (
  `order_id` varchar(200) NOT NULL,
  `user_id` int(11) NOT NULL,
  `price` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


use ds1;
 CREATE TABLE `t_order_0` (
  `order_id` varchar(200) NOT NULL,
  `user_id` int(11) NOT NULL,
  `price` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 CREATE TABLE `t_order_1` (
  `order_id` varchar(200) NOT NULL,
  `user_id` int(11) NOT NULL,
  `price` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;