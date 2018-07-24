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
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `subject_group_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `resurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
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


-- bom_role 操作工：
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-01368c45-2917-4424-85f7-a417758c753f','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-07efb03a-c23e-4662-9625-edb155d86266','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-14a8d1a2-bc2d-4ffd-a340-a159e6f5d010','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-5487ba25-72d9-499a-9819-27cf9e4ab14e','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-5e35de86-cf18-4545-9bec-33b95aa096d8','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-6817df36-1124-4ec7-b9b5-498a7938ada1','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-7b246fbd-a2f8-493f-8752-cd207a1c8f95','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-92850aa9-7519-4c87-b2b4-3bbc20c83557','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-9a76f06e-d837-4e48-b246-4b96000d39a8','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-6817df36-1124-4ec7-b9b5-498a7938ada1','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-bc6ec425-c0a7-43f4-ba22-3dd57299d52c','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-ce95f42d-ddeb-48ab-b1dd-f0f69225f60e','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-d6014b4b-8702-4ee4-a5cc-16f337b0ddf1','worker','操作工','1','/order/dtl');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-d8062eb7-4bdd-424c-be87-5ba647c76082','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-e4b6d3ee-fa14-4b62-a874-e2bf0d779f03','worker','操作工','1','/task/person,/task/team');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-e6e71535-0a61-4a13-b582-2661c7af4820','worker','操作工','1','/task/person,/task/team');

-- 库管领导
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-1a80bf19-f086-4cee-bd11-4c55147c233e','manager','领导','1','/counter/*,/order/*,/task,/kpi/*');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-3aa1df5c-2094-498a-ac7b-fd9178a43527','manager','领导','1','/counter/*,/order/*,/task,/kpi/*');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-664b06f7-107e-403e-a662-f64a920376fd','manager','领导','1','/counter/*,/order/*,/task,/kpi/*');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-fc4dd7dc-243a-48ee-bc45-5bd797f617c7','manager','报损','1','/counter/*,/order/*,/task,/kpi/*');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-fe700d84-1757-4ae4-af39-401750cd7f09','manager','领导','1','/counter/*,/order/*,/task,/kpi/*');
-- admin
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-17b3c695-0e7b-43ef-ac8f-ee67e5071923','sys','管理员','1','/*');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-7c1958e2-415b-461f-a05e-01a7ff1b4454','sys','管理员','1','/*');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-cf31bae6-6b34-421c-ab6d-e81ba66f89e2','sys','管理员','1','/*');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-b43e6618-ebf1-41af-99ba-ce30c58b582d','sys','IT支持','1','/*');
insert into bom_role(`subject_group_id`,`code`,`name`,`status`,`resurl`)  values('subgroup-3aa1df5c-2094-498a-ac7b-fd9178a43527','sys','test','1','/*');
