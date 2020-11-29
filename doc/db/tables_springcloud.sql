#
# springcloud 1.0-SNAPSHOT
# Copyright (c) 2020, wangyg.

CREATE database if NOT EXISTS `springcloud` default character set utf8mb4 collate utf8mb4_unicode_ci;
use `springcloud`;

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `serial` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
