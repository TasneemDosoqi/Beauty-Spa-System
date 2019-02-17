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
-- Table structure for table `Volunteer_Of`
--

DROP TABLE IF EXISTS `Volunteer_Of`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Volunteer_Of` (
  `RA_Location` char(20) NOT NULL,
  `RA_TypeName` char(20) NOT NULL,
  `RA_Date` char(20) NOT NULL,
  `Volun_ID` int(11) NOT NULL,
  PRIMARY KEY (`RA_Location`,`RA_TypeName`,`RA_Date`,`Volun_ID`),
  KEY `RegType_idx` (`RA_TypeName`),
  KEY `VolnId_idx` (`Volun_ID`),
  KEY `Volunt_idx` (`Volun_ID`),
  KEY `Datttt_idx` (`RA_Date`),
  CONSTRAINT `DateRegular` FOREIGN KEY (`RA_Date`) REFERENCES `REGULAR_ACTIVITY` (`Location`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `LocationReg` FOREIGN KEY (`RA_Location`) REFERENCES `REGULAR_ACTIVITY` (`Location`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `TypeNamereg` FOREIGN KEY (`RA_TypeName`) REFERENCES `REGULAR_ACTIVITY` (`Location`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `volunt` FOREIGN KEY (`Volun_ID`) REFERENCES `VOLUNTEER` (`Membership_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Volunteer_Of`
--

LOCK TABLES `Volunteer_Of` WRITE;
/*!40000 ALTER TABLE `Volunteer_Of` DISABLE KEYS */;
/*!40000 ALTER TABLE `Volunteer_Of` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-01  5:26:54
