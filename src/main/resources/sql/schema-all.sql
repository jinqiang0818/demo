-- person_info
/*
警告: 字段名可能非法 - status
*/
DROP TABLE IF EXISTS `person_info`;

create table  `person_info`
(
       `id`              int(20) auto_increment primary key not null,
       `name`            VARCHAR(32) not null comment '名称',
       `sex`             int(2) not null comment '1-男，2,-女，0-其他',
       `age`             int(4),
       `mobile`          int(32) comment '手机号码',
       `email`           VARCHAR(50) comment '邮箱',
       `address`         VARCHAR(50) comment '地址',
       `type_id`         int(32) comment '关系ID',
       `user_id`         int(32) comment '用户ID',
       `status`          int(2) comment '是否有效，0无效，1有效',
       `created_at`      DATETIME comment '创建时间',
       `created_by`      VARCHAR(32) comment '创建人',
       `updated_at`      DATETIME comment '更新时间',
       `updated_by`      VARCHAR(32) comment '更新人'
);
alter table `person_info` comment= '人员信息表 人员信息表';

-- person_relation
/*
警告: 字段名可能非法 - type
警告: 字段名可能非法 - status
*/
DROP TABLE IF EXISTS `person_relation`;

create table  `person_relation`
(
       `id`              int(20) auto_increment primary key not null,
       `type`            int(4) comment '关系类型 0-自己， 1-同事，2-朋友，3-亲人，4-陌生人，5-游戏好友，6-不知道',
       `status`          int(2) comment '是否有效，0无效，1有效',
       `created_at`      DATETIME comment '创建时间',
       `created_by`      VARCHAR(32) comment '创建人',
       `updated_at`      DATETIME comment '更新时间',
       `updated_by`      VARCHAR(32) comment '更新人'
);
alter table `person_relation` comment= '用户关系表 用户关系表';

-- user
/*
警告: 字段名可能非法 - status
*/
DROP TABLE IF EXISTS `user`;

create table  `user`
(
       `id`              int(20) auto_increment primary key not null,
       `name`            VARCHAR(32) comment '登录名',
				`pwd`             VARCHAR(32) comment '密码',
       `status`          int(2) comment '是否有效，0无效，1有效',
       `created_at`      DATETIME comment '创建时间',
       `created_by`      VARCHAR(32) comment '创建人',
       `updated_at`      DATETIME comment '更新时间',
       `updated_by`      VARCHAR(32) comment '更新人'
       
);
alter table `user` comment= '用户表 用户表';


