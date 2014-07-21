-- MySQL dump 10.13  Distrib 5.6.19, for osx10.7 (x86_64)
--
-- Host: localhost    Database: TrainingBudgetData
-- ------------------------------------------------------
-- Server version	5.6.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `budget`
--

DROP TABLE IF EXISTS `budget`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `budget` (
  `ExpenseID` varchar(10) DEFAULT NULL,
  `EmployeeID` varchar(5) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `ExpenseType` varchar(50) DEFAULT NULL,
  `ExpenseDate` date DEFAULT NULL,
  `Cost` double DEFAULT NULL,
  `Description` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `budget`
--

LOCK TABLES `budget` WRITE;
/*!40000 ALTER TABLE `budget` DISABLE KEYS */;
INSERT INTO `budget` VALUES ('00001 ','00001','guanyuan','Books ','2014-07-01',105.7,'borrow:chendan:5'),('00002 ','00002','lihongjing','Training/Education','2014-07-02',150,'borrow:chendan:400'),('00003 ','00001','guanyuan','others','2014-07-02',120,'borrow:chendan:100'),('00004  ','00002','lihongjing','Books','2014-07-03',230,NULL),('00005  ','00001','guanyuan','   ','2014-07-07',500,'   ');
/*!40000 ALTER TABLE `budget` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `EmployeeID` varchar(5) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Exp` double DEFAULT NULL,
  `Budget` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('00001','guanyuan',1,0),
('00002','lihongjing',0.3,0),
('00003','xiefang',0,0),
('00004','pangmin',0.1,0),
('00005','chendan',0.7,0),
('00006','zhaolan ',0.8,0);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-18 20:41:45
