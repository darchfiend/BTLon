-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: qlthuvien
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `docgia`
--

DROP TABLE IF EXISTS `docgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docgia` (
  `MaDocGia` int NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(200) NOT NULL,
  `GioiTinh` varchar(45) NOT NULL,
  `NgaySinh` date DEFAULT NULL,
  `DoiTuong` varchar(80) NOT NULL,
  `BoPhan` varchar(100) NOT NULL,
  `HanThe` date NOT NULL,
  `Email` varchar(100) NOT NULL,
  `DiaChi` varchar(100) DEFAULT NULL,
  `DienThoai` varchar(12) NOT NULL,
  `HanThe2` date NOT NULL,
  PRIMARY KEY (`MaDocGia`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docgia`
--

LOCK TABLES `docgia` WRITE;
/*!40000 ALTER TABLE `docgia` DISABLE KEYS */;
INSERT INTO `docgia` VALUES (1,'abc','nam',NULL,'Sinh vien','Cong nghe thong tin','2021-01-02','abc@gmail.com','abc 12/213','098765432617','0000-00-00');
/*!40000 ALTER TABLE `docgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `muonsach`
--

DROP TABLE IF EXISTS `muonsach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `muonsach` (
  `IdDocGia` int NOT NULL,
  `TenSach` varchar(100) NOT NULL,
  `SoNgayMuon` int NOT NULL,
  PRIMARY KEY (`IdDocGia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `muonsach`
--

LOCK TABLES `muonsach` WRITE;
/*!40000 ALTER TABLE `muonsach` DISABLE KEYS */;
/*!40000 ALTER TABLE `muonsach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sach`
--

DROP TABLE IF EXISTS `sach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sach` (
  `MaSach` int NOT NULL AUTO_INCREMENT,
  `TenSach` varchar(100) NOT NULL,
  `TacGia` varchar(100) NOT NULL,
  `MoTa` varchar(255) DEFAULT NULL,
  `NamXuatBan` int NOT NULL,
  `NoiXuatBan` varchar(100) NOT NULL,
  `DanhMuc` varchar(100) DEFAULT NULL,
  `NgayNhapSach` date NOT NULL,
  `ViTriSach` varchar(150) NOT NULL,
  PRIMARY KEY (`MaSach`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sach`
--

LOCK TABLES `sach` WRITE;
/*!40000 ALTER TABLE `sach` DISABLE KEYS */;
INSERT INTO `sach` VALUES (1,'toi thay hoa vang tren co xanh','Nguyen nhat anh','tieu thuyet',2009,'TP.HCM','Tieu thuyet','2020-01-01','top right');
/*!40000 ALTER TABLE `sach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tacgia`
--

DROP TABLE IF EXISTS `tacgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tacgia` (
  `MaTacGia` int NOT NULL,
  `TenTacGia` varchar(45) NOT NULL,
  PRIMARY KEY (`MaTacGia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tacgia`
--

LOCK TABLES `tacgia` WRITE;
/*!40000 ALTER TABLE `tacgia` DISABLE KEYS */;
INSERT INTO `tacgia` VALUES (1,'Nguyen Nhat Anh');
/*!40000 ALTER TABLE `tacgia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-17 23:40:45
