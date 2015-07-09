-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.86-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema closeworld
--

CREATE DATABASE IF NOT EXISTS closeworld;
USE closeworld;

--
-- Definition of table `chat`
--

DROP TABLE IF EXISTS `chat`;
CREATE TABLE `chat` (
  `chatid` int(10) unsigned NOT NULL auto_increment,
  `user1` varchar(40) NOT NULL,
  `user2` varchar(40) NOT NULL,
  `content` varchar(45) NOT NULL,
  `sendby` varchar(45) NOT NULL,
  PRIMARY KEY  (`chatid`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chat`
--

/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` (`chatid`,`user1`,`user2`,`content`,`sendby`) VALUES 
 (37,'pinki','jay','hi..','pinki'),
 (38,'jay','pinki','hi','jay'),
 (39,'pinki','jay','hello','pinki'),
 (40,'jay','pinki','hii','jay'),
 (41,'pinki','jay','wwwwwwwwwwwwwwwwwwwwww','pinki');
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;


--
-- Definition of table `coment`
--

DROP TABLE IF EXISTS `coment`;
CREATE TABLE `coment` (
  `commentid` int(10) unsigned NOT NULL auto_increment,
  `commenton` varchar(45) default NULL,
  `profilepic` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `timeanddate` varchar(45) NOT NULL,
  `replyon` varchar(45) default NULL,
  `userid` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`commentid`)
) ENGINE=InnoDB AUTO_INCREMENT=171 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coment`
--

/*!40000 ALTER TABLE `coment` DISABLE KEYS */;
INSERT INTO `coment` (`commentid`,`commenton`,`profilepic`,`name`,`status`,`timeanddate`,`replyon`,`userid`) VALUES 
 (167,'8','image/mmm.jpg','vinay','hsaid','2015-04-22 16:06:05','','12'),
 (168,'','image/mmm.jpg','vinay','hmm','2015-04-22 16:06:10','167','12'),
 (169,'','image/mmm.jpg','vinay','asdjsa','2015-04-22 16:06:15','167','12'),
 (170,'9','image/mmm.jpg','vinay','hmm bro.....','2015-04-22 16:06:51','','12');
/*!40000 ALTER TABLE `coment` ENABLE KEYS */;


--
-- Definition of table `likecomment`
--

DROP TABLE IF EXISTS `likecomment`;
CREATE TABLE `likecomment` (
  `user_id` int(10) unsigned NOT NULL,
  `coment_id` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `likecomment`
--

/*!40000 ALTER TABLE `likecomment` DISABLE KEYS */;
INSERT INTO `likecomment` (`user_id`,`coment_id`) VALUES 
 (12,101),
 (12,102),
 (12,113),
 (12,119),
 (12,117),
 (13,153);
/*!40000 ALTER TABLE `likecomment` ENABLE KEYS */;


--
-- Definition of table `likepost`
--

DROP TABLE IF EXISTS `likepost`;
CREATE TABLE `likepost` (
  `user_id` int(10) unsigned NOT NULL,
  `post_id` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `likepost`
--

/*!40000 ALTER TABLE `likepost` DISABLE KEYS */;
INSERT INTO `likepost` (`user_id`,`post_id`) VALUES 
 (12,14),
 (12,15),
 (12,16),
 (12,18),
 (15,1),
 (12,8);
/*!40000 ALTER TABLE `likepost` ENABLE KEYS */;


--
-- Definition of table `post`
--

DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `profile_pic` varchar(45) default NULL,
  `name` varchar(45) NOT NULL,
  `timeanddate` varchar(45) NOT NULL,
  `status` varchar(500) NOT NULL,
  `postid` int(10) unsigned NOT NULL auto_increment,
  `userid` varchar(45) NOT NULL,
  `statuspic` varchar(45) default NULL,
  PRIMARY KEY  USING BTREE (`postid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `post`
--

/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` (`profile_pic`,`name`,`timeanddate`,`status`,`postid`,`userid`,`statuspic`) VALUES 
 ('image/mmm.jpg','vinay','2015-04-22 16:05:34','hi every one we made closeworld...........',8,'12',''),
 ('image/mmm.jpg','vinay','2015-04-22 16:06:39','this is second post ',9,'12','');
/*!40000 ALTER TABLE `post` ENABLE KEYS */;


--
-- Definition of table `profile`
--

DROP TABLE IF EXISTS `profile`;
CREATE TABLE `profile` (
  `pic_url` varchar(45) default NULL,
  `name1` varchar(45) default NULL,
  `location` varchar(45) default NULL,
  `education` varchar(45) default NULL,
  `language` varchar(45) default NULL,
  `contact_no` varchar(45) default NULL,
  `home_town` varchar(45) default NULL,
  `dob` varchar(45) character set latin1 collate latin1_bin default NULL,
  `userId` int(10) unsigned NOT NULL auto_increment,
  PRIMARY KEY  (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profile`
--

/*!40000 ALTER TABLE `profile` DISABLE KEYS */;
INSERT INTO `profile` (`pic_url`,`name1`,`location`,`education`,`language`,`contact_no`,`home_town`,`dob`,`userId`) VALUES 
 ('image/gilmoregirlsjess__span.jpg','vinay','chennai','b tech','english',NULL,'not specified',0x3232206D61792031393933,11),
 ('image/mmm.jpg','vinay','null','null','null',NULL,'not specified',0x6E756C6C,12),
 ('image/def.jpg','sdfmgfd dfgf m','not specified','not specified','not specified','1234556789','not specified',0x6E6F7420737065636966696564,13),
 ('image/def.jpg','sachin katiyar','not specified','not specified','not specified','789456123','not specified',0x6E6F7420737065636966696564,14),
 ('image/IMG_17411.jpg','sachin katiyar','not specified','not specified','not specified',NULL,'not specified',0x6E6F7420737065636966696564,15),
 ('image/prince-of-persia-facebook-cover-t2.jpg','jay  shaktawat','not specified','not specified','not specified',NULL,'not specified',0x6E6F7420737065636966696564,16),
 ('image/def.jpg','sachin katiyar','not specified','not specified','not specified','56567888','not specified',0x6E6F7420737065636966696564,17);
/*!40000 ALTER TABLE `profile` ENABLE KEYS */;


--
-- Definition of table `register`
--

DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `first` varchar(45) NOT NULL,
  `last` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `password1` varchar(45) NOT NULL,
  `contact` varchar(45) NOT NULL,
  `userid` int(10) unsigned NOT NULL auto_increment,
  PRIMARY KEY  USING BTREE (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

/*!40000 ALTER TABLE `register` DISABLE KEYS */;
INSERT INTO `register` (`first`,`last`,`email`,`password`,`password1`,`contact`,`userid`) VALUES 
 ('snfd','safn','vk@don.com','123456789','123456789','123456789',12),
 ('sdfmgfd','dfgf m','fsdkmkls@g.com','qwertyuiop','qwertyuiop','1234556789',13),
 ('sachin','katiyar','katiyarsachin3@gmail.com','789456123','789456123','789456123',15),
 ('jay ','shaktawat','kshatriyajay95@gmail.com','123456','123456','987654321',16),
 ('sachin','katiyar','katiyarsachin4@gmail.com','123456','123456','56567888',17);
/*!40000 ALTER TABLE `register` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
