/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.3-m13 : Database - demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `demo`;

/*Table structure for table `article_detials` */

DROP TABLE IF EXISTS `article_detials`;

CREATE TABLE `article_detials` (
  `id` varchar(20) NOT NULL COMMENT '唯一标识',
  `title` varchar(50) NOT NULL COMMENT '文章标题',
  `author` varchar(20) NOT NULL COMMENT '作者',
  `article` text NOT NULL COMMENT '文章内容',
  `tips` varchar(20) NOT NULL COMMENT '标签（用以检索搜索）',
  `isTop` int(11) NOT NULL COMMENT '是否置顶',
  `isDel` int(11) NOT NULL COMMENT '是否删除',
  `articleType` int(11) NOT NULL COMMENT '文章类型',
  `launchTime` datetime NOT NULL COMMENT '发布时间',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `dic_articletype` */

DROP TABLE IF EXISTS `dic_articletype`;

CREATE TABLE `dic_articletype` (
  `name` varchar(20) NOT NULL,
  `value` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `dic_isdel` */

DROP TABLE IF EXISTS `dic_isdel`;

CREATE TABLE `dic_isdel` (
  `name` varchar(20) NOT NULL,
  `value` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `dic_istop` */

DROP TABLE IF EXISTS `dic_istop`;

CREATE TABLE `dic_istop` (
  `name` varchar(20) NOT NULL,
  `value` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
