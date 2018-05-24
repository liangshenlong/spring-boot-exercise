/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : exercise

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-05-24 11:52:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0d7fff93-b99e-4ffc-b384-3a7e3208388e', '李四', '2018-05-18 15:02:42');
INSERT INTO `user` VALUES ('21ae8fa2-d086-4762-a71b-3b495163590b', '李四', '2018-05-18 11:17:07');
INSERT INTO `user` VALUES ('75d5a862-7619-4bd5-9ea4-f9019c06fe4e', '王麻子', '2018-05-22 10:21:25');
INSERT INTO `user` VALUES ('8bd2285d-5431-406a-9468-3d9923335523', '张三', '2018-05-18 10:50:37');
INSERT INTO `user` VALUES ('b1a40212-37c7-4fbb-be50-7699b2fd76e8', '宋命', '2018-05-22 11:12:06');
