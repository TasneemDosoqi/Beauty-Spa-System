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
-- Table structure for table `TakeCareOf`
--

DROP TABLE IF EXISTS `TakeCareOf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TakeCareOf` (
  `Fam_SSN` int(10) NOT NULL,
  `Date` char(11) NOT NULL,
  `TypeName` char(20) NOT NULL,
  `Location` char(20) NOT NULL,
  PRIMARY KEY (`Fam_SSN`,`Location`,`TypeName`,`Date`),
  KEY `TypeReg_idx` (`TypeName`),
  KEY `DateRegulara_idx` (`Date`),
  KEY `Daterr_idx` (`Date`),
  KEY `r1_idx` (`Location`,`TypeName`,`Date`),
  CONSTRAINT `F_SSN` FOREIGN KEY (`Fam_SSN`) REFERENCES `FAMILY_inNEED` (`FAM_SSN`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `compkey` FOREIGN KEY (`Location`, `TypeName`, `Date`) REFERENCES `REGULAR_ACTIVITY` (`Location`, `TypeName`, `Date`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TakeCareOf`
--

LOCK TABLES `TakeCareOf` WRITE;
/*!40000 ALTER TABLE `TakeCareOf` DISABLE KEYS */;
/*!40000 ALTER TABLE `TakeCareOf` ENABLE KEYS */;
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
