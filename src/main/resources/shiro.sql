/*
Navicat MySQL Data Transfer

Source Server         : Users
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : shiro

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2019-05-26 18:31:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `user_name` varchar(255) default NULL,
  `pass_word` varchar(255) default NULL,
  `create_time` date default NULL,
  `mark` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '假设开发', '234', '2019-05-24', '电饭锅');
INSERT INTO `user` VALUES ('2', '拉萨附近', '324234', '2019-05-24', '阿斯蒂芬加括号萨达');
INSERT INTO `user` VALUES ('3', 'userName', 'passWord', '2019-05-25', 'mark');
INSERT INTO `user` VALUES ('4', 'userName2', 'passWord2', '2019-05-25', 'mark2');
INSERT INTO `user` VALUES ('5', 'userName2', 'passWord2', '2019-05-25', 'mark2');
INSERT INTO `user` VALUES ('6', 'userName2', 'passWord2', '2019-05-25', 'mark2');
INSERT INTO `user` VALUES ('7', '我的', '2341', '2019-05-25', '拉萨的房间里卡是大姐夫');
INSERT INTO `user` VALUES ('8', '拉克丝打飞机卡拉水电费', '2345657', '2019-05-24', '；的飞机萨达');
INSERT INTO `user` VALUES ('9', '；拉萨的附近卡尔', '21345425', '2019-05-25', '看了的撒飞机是否点了');
INSERT INTO `user` VALUES ('10', '我强迫锐欧', '2314132432', '2019-05-25', '拉的说法');
INSERT INTO `user` VALUES ('12', '偶尔外语', '341324324', '2019-05-25', '阿贾克斯的房间啊');
INSERT INTO `user` VALUES ('13', '卡士大夫贺卡和我', '6738e896', '2019-05-26', '好的看了是放假');
INSERT INTO `user` VALUES ('14', '卡士大夫贺卡和我', '6738e896', '2019-05-26', '好的看了是放假');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` bigint(20) NOT NULL auto_increment,
  `user_id` bigint(20) default NULL,
  `role_id` bigint(20) default NULL,
  `status` int(2) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '13', '13', '1');
INSERT INTO `user_role` VALUES ('2', '14', '14', '1');
