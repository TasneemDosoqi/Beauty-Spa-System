-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: E-volunteer
-- ------------------------------------------------------
-- Server version	5.7.17

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
-- Table structure for table `Participate_In`
--

DROP TABLE IF EXISTS `Participate_In`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Participate_In` (
  `Act_Name` char(20) NOT NULL,
  `Ev_Name` char(20) NOT NULL,
  `V_MemID` int(11) NOT NULL,
  `EveDate` char(11) NOT NULL,
  `Points` int(11) DEFAULT NULL,
  `Performance` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Ev_Name`,`V_MemID`,`EveDate`,`Act_Name`),
  KEY `f1_idx` (`EveDate`),
  KEY `f3_idx` (`V_MemID`),
  CONSTRAINT `f1` FOREIGN KEY (`EveDate`) REFERENCES `ACTIVITY` (`EVDATE`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `f2` FOREIGN KEY (`Ev_Name`) REFERENCES `ACTIVITY` (`EVName`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `f3` FOREIGN KEY (`V_MemID`) REFERENCES `VOLUNTEER` (`Membership_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `f4` FOREIGN KEY (`EveDate`) REFERENCES `ACTIVITY` (`EVDATE`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Participate_In`
--

LOCK TABLES `Participate_In` WRITE;
/*!40000 ALTER TABLE `Participate_In` DISABLE KEYS */;
/*!40000 ALTER TABLE `Participate_In` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-01  5:26:56
