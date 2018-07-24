-- ----------------------------
-- Table structure for bom_counter
-- ----------------------------
DROP TABLE IF EXISTS `bom_counter`;
CREATE TABLE `bom_counter` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `counter_status` varchar(64) DEFAULT NULL,
  `counter_code` varchar(64) DEFAULT NULL,
  `counter_name` varchar(255) DEFAULT NULL,
  `creater` varchar(255) DEFAULT NULL,
  `creation_date` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `last_modify_date` datetime DEFAULT NULL,
  `last_modify_name` varchar(255) DEFAULT NULL,
  `whse_code` varchar(64) DEFAULT NULL,
  `whse_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bom_resource
-- ----------------------------
DROP TABLE IF EXISTS `bom_role`;
CREATE TABLE `bom_role` (
  `id` varchar(255) NOT NULL,
  `code` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `subject_group_id` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `resurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resource_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bom_resource
-- ----------------------------
DROP TABLE IF EXISTS `bom_resource`;
CREATE TABLE `bom_resource` (
  `resource_id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `subject_group_id` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `resurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resource_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bom_task
-- ----------------------------
DROP TABLE IF EXISTS `bom_task`;
CREATE TABLE `bom_task` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `creation_date` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `finish_date` datetime DEFAULT NULL,
  `product_code` varchar(255) DEFAULT NULL,
  `product_count` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_unit` varchar(255) DEFAULT NULL,
  `requester_code` varchar(255) DEFAULT NULL,
  `requester_date` datetime DEFAULT NULL,
  `task_code` varchar(255) DEFAULT NULL,
  `task_status` int(11) DEFAULT NULL,
  `create_user_code` varchar(255) DEFAULT NULL,
  `task_order_code` varchar(60) DEFAULT NULL,
  `counter_code` varchar(255) DEFAULT NULL,
  `counter_name` varchar(255) DEFAULT NULL,
  `create_user_name` varchar(255) DEFAULT NULL,
  `last_modify_date` datetime DEFAULT NULL,
  `last_modify_user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKatd9g6eytowms7jdjx1q8bcmh` (`create_user_code`),
  KEY `FK6a3yh0ob5vov7yhjuqt1jps2p` (`task_order_code`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
