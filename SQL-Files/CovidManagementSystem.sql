-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: asdproject
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
-- Table structure for table `admin_list`
--

DROP TABLE IF EXISTS `admin_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_list` (
  `admin_id` int NOT NULL,
  `admin_fullname` varchar(45) NOT NULL,
  `admin_phone` bigint NOT NULL,
  `admin_email` varchar(45) NOT NULL,
  `admin_address` varchar(45) NOT NULL,
  `admin_username` varchar(45) NOT NULL,
  `admin_password` varchar(45) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cfltc`
--

DROP TABLE IF EXISTS `cfltc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cfltc` (
  `cfltc_id` int NOT NULL AUTO_INCREMENT,
  `cfltc_name` varchar(50) CHARACTER SET latin1 NOT NULL,
  `cfltc_district_id` int DEFAULT NULL,
  `cfltc_address` varchar(100) CHARACTER SET latin1 NOT NULL,
  `cfltc_contactnum` bigint NOT NULL,
  `cfltc_capacity` int NOT NULL,
  `cfltc_category` varchar(45) CHARACTER SET latin1 NOT NULL,
  `cfltc_officer` varchar(45) CHARACTER SET latin1 NOT NULL,
  `cfltc_occupied` int DEFAULT '0',
  PRIMARY KEY (`cfltc_id`),
  KEY `distr_id_idx` (`cfltc_district_id`),
  CONSTRAINT `distr_id` FOREIGN KEY (`cfltc_district_id`) REFERENCES `districts` (`dist_id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cfltc_register`
--

DROP TABLE IF EXISTS `cfltc_register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cfltc_register` (
  `patient_id` int NOT NULL AUTO_INCREMENT,
  `citizen_id` int NOT NULL,
  `cfltcr_id` int NOT NULL,
  `entered_date` varchar(45) NOT NULL,
  PRIMARY KEY (`patient_id`),
  KEY `ci_idx` (`citizen_id`),
  KEY `cfltcid_idx` (`cfltcr_id`),
  CONSTRAINT `citizen_name_id` FOREIGN KEY (`citizen_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `citizen_list`
--

DROP TABLE IF EXISTS `citizen_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `citizen_list` (
  `c_id` int NOT NULL AUTO_INCREMENT,
  `c_fullname` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `c_email` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `c_user_name` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `c_pass` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `c_phno` bigint NOT NULL,
  `c_gender` varchar(7) COLLATE utf8mb4_general_ci NOT NULL,
  `c_blood_grp` varchar(5) COLLATE utf8mb4_general_ci NOT NULL,
  `c_dob` varchar(13) COLLATE utf8mb4_general_ci NOT NULL,
  `c_district_id` int NOT NULL,
  `c_local_body_type_id` int NOT NULL,
  `c_local_body_name_id` int NOT NULL,
  `c_ward_num` int NOT NULL,
  `c_address` text COLLATE utf8mb4_general_ci NOT NULL,
  `c_covid_status` varchar(45) COLLATE utf8mb4_general_ci DEFAULT 'Not Affected',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `districts`
--

DROP TABLE IF EXISTS `districts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `districts` (
  `dist_id` int NOT NULL AUTO_INCREMENT,
  `dist_name` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`dist_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `govt_orders`
--

DROP TABLE IF EXISTS `govt_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `govt_orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `order_number` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `order_title` text COLLATE utf8mb4_general_ci,
  `order_details` text COLLATE utf8mb4_general_ci,
  `order_release_date` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `health_worker_requests`
--

DROP TABLE IF EXISTS `health_worker_requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `health_worker_requests` (
  `req_id` int NOT NULL AUTO_INCREMENT,
  `cit_id` int NOT NULL,
  `date_time` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `request_status` varchar(45) COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'Under Process',
  `pan_number` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  `alt_number` bigint DEFAULT NULL,
  `highest_qualification` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `institution_name` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `designation` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `aadhar_number` bigint NOT NULL,
  PRIMARY KEY (`req_id`),
  KEY `ci_id_idx` (`cit_id`),
  CONSTRAINT `ci_id` FOREIGN KEY (`cit_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `healthworker_list`
--

DROP TABLE IF EXISTS `healthworker_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `healthworker_list` (
  `hw_id` int NOT NULL AUTO_INCREMENT,
  `citizen_id` int NOT NULL,
  `pan_number` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  `alternate_phone` bigint DEFAULT NULL,
  `highest_qualification` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `institution_name` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `designation` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `aadhar_number` bigint NOT NULL,
  `alloted_work_area_type` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `alloted_work_area_name_id` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`hw_id`),
  UNIQUE KEY `citizen_id_UNIQUE` (`citizen_id`),
  KEY `cit_id_idx` (`citizen_id`),
  CONSTRAINT `cit_id` FOREIGN KEY (`citizen_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hotspots`
--

DROP TABLE IF EXISTS `hotspots`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hotspots` (
  `hotspot_id` int NOT NULL AUTO_INCREMENT,
  `hotspot_localbodytype_id` int NOT NULL,
  `hotspot_localbody_id` int NOT NULL,
  `hotspot_wardnumber` int NOT NULL,
  `hotspot_added_date` varchar(45) NOT NULL,
  PRIMARY KEY (`hotspot_id`),
  UNIQUE KEY `unique_constraint` (`hotspot_localbodytype_id`,`hotspot_localbody_id`,`hotspot_wardnumber`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `localbodytype`
--

DROP TABLE IF EXISTS `localbodytype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `localbodytype` (
  `sl_no` int NOT NULL,
  `type` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`sl_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `messages` (
  `message_id` int NOT NULL AUTO_INCREMENT,
  `mess_key` int NOT NULL,
  `mess_from_id` int NOT NULL,
  `mess_to_id` int NOT NULL,
  `date` varchar(45) NOT NULL,
  `title` tinytext NOT NULL,
  `message` text NOT NULL,
  PRIMARY KEY (`message_id`),
  KEY `admin_id_idx` (`mess_from_id`),
  CONSTRAINT `admin_id` FOREIGN KEY (`mess_from_id`) REFERENCES `admin_list` (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `panchayaths`
--

DROP TABLE IF EXISTS `panchayaths`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `panchayaths` (
  `p_id` int NOT NULL AUTO_INCREMENT,
  `d_id` int NOT NULL,
  `p_name` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`p_id`),
  KEY `district_id_idx` (`d_id`),
  CONSTRAINT `district_id` FOREIGN KEY (`d_id`) REFERENCES `districts` (`dist_id`)
) ENGINE=InnoDB AUTO_INCREMENT=316 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `patient_need_requests`
--

DROP TABLE IF EXISTS `patient_need_requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_need_requests` (
  `nr_id` int NOT NULL AUTO_INCREMENT,
  `c_id` int NOT NULL,
  `nr_subject` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nr_details` tinytext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nr_application_date` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nr_status` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'Request Placed',
  `nr_fulfilled_date` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT 'Not Fulfilled',
  `nr_fulfilled_by_volunteer_id` int DEFAULT NULL,
  PRIMARY KEY (`nr_id`),
  KEY `ccit_id_idx` (`c_id`),
  KEY `vol_id_idx` (`c_id`,`nr_fulfilled_by_volunteer_id`),
  CONSTRAINT `ccit_id` FOREIGN KEY (`c_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `psychosocial_helpline_numbers`
--

DROP TABLE IF EXISTS `psychosocial_helpline_numbers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `psychosocial_helpline_numbers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dist_id` int DEFAULT NULL,
  `contact_num` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `diss_id_idx` (`dist_id`),
  CONSTRAINT `diss_id` FOREIGN KEY (`dist_id`) REFERENCES `districts` (`dist_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `surveillance`
--

DROP TABLE IF EXISTS `surveillance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `surveillance` (
  `s_id` int NOT NULL AUTO_INCREMENT,
  `scitizen_id` int NOT NULL,
  `s_date` varchar(20) NOT NULL,
  `fever` varchar(20) NOT NULL,
  `headache` varchar(20) NOT NULL,
  `nausea` varchar(20) NOT NULL,
  `vomiting` varchar(20) NOT NULL,
  `fatigue` varchar(20) NOT NULL,
  `cough` varchar(20) NOT NULL,
  `sorethroat` varchar(20) NOT NULL,
  `breathingissue` varchar(20) NOT NULL,
  `alteredsmell` varchar(20) NOT NULL,
  `alteredtaste` varchar(20) NOT NULL,
  `svolunteer_id` int NOT NULL,
  PRIMARY KEY (`s_id`),
  KEY `s_citizen_id_idx` (`scitizen_id`),
  KEY `s_volunteer_id_idx` (`svolunteer_id`),
  CONSTRAINT `s_citizen_id` FOREIGN KEY (`scitizen_id`) REFERENCES `citizen_list` (`c_id`),
  CONSTRAINT `s_volunteer_id` FOREIGN KEY (`svolunteer_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `test_requests`
--

DROP TABLE IF EXISTS `test_requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_requests` (
  `t_request_id` int NOT NULL AUTO_INCREMENT,
  `t_citizen_id` int NOT NULL,
  `t_center_id` int NOT NULL,
  `t_test_date` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `t_request_date` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `t_status` varchar(45) COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'Not tested',
  PRIMARY KEY (`t_request_id`),
  KEY `citizz_id_idx` (`t_citizen_id`),
  KEY `tc_id_idx` (`t_center_id`),
  CONSTRAINT `citizz_id` FOREIGN KEY (`t_citizen_id`) REFERENCES `citizen_list` (`c_id`),
  CONSTRAINT `tc_id` FOREIGN KEY (`t_center_id`) REFERENCES `testing_centers` (`tc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `test_result`
--

DROP TABLE IF EXISTS `test_result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_result` (
  `result_id` int NOT NULL AUTO_INCREMENT,
  `citizen_id` int NOT NULL,
  `testcenter_id` int NOT NULL,
  `result_date` varchar(20) NOT NULL,
  `result_status` varchar(45) NOT NULL,
  PRIMARY KEY (`result_id`),
  KEY `citize_id_idx` (`citizen_id`),
  KEY `center_id_idx` (`testcenter_id`),
  CONSTRAINT `center_id` FOREIGN KEY (`testcenter_id`) REFERENCES `testing_centers` (`tc_id`),
  CONSTRAINT `citize_id` FOREIGN KEY (`citizen_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `testing_centers`
--

DROP TABLE IF EXISTS `testing_centers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `testing_centers` (
  `tc_id` int NOT NULL AUTO_INCREMENT,
  `tc_name` varchar(75) NOT NULL,
  `tc_district_id` int NOT NULL DEFAULT '0',
  `tc_address` varchar(80) NOT NULL,
  `tc_registernumber` varchar(70) NOT NULL,
  `tc_amount` int NOT NULL,
  `tc_type` varchar(50) NOT NULL,
  PRIMARY KEY (`tc_id`),
  KEY `dis_id_idx` (`tc_district_id`),
  CONSTRAINT `dis_id` FOREIGN KEY (`tc_district_id`) REFERENCES `districts` (`dist_id`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `total_affected_list`
--

DROP TABLE IF EXISTS `total_affected_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `total_affected_list` (
  `sl_no` int NOT NULL AUTO_INCREMENT,
  `citiz_id` int DEFAULT NULL,
  PRIMARY KEY (`sl_no`),
  UNIQUE KEY `citiz_id_UNIQUE` (`citiz_id`),
  KEY `citt_id_idx` (`citiz_id`),
  CONSTRAINT `citt_id` FOREIGN KEY (`citiz_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `total_recoverd_list`
--

DROP TABLE IF EXISTS `total_recoverd_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `total_recoverd_list` (
  `sl_num` int NOT NULL AUTO_INCREMENT,
  `citi_id` int DEFAULT NULL,
  PRIMARY KEY (`sl_num`),
  UNIQUE KEY `citi_id_UNIQUE` (`citi_id`),
  KEY `citizz_id_idx` (`citi_id`),
  CONSTRAINT `citz_id` FOREIGN KEY (`citi_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user_query`
--

DROP TABLE IF EXISTS `user_query`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_query` (
  `query_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `query` text COLLATE utf8mb4_general_ci,
  PRIMARY KEY (`query_id`),
  KEY `cid_idx` (`user_id`),
  CONSTRAINT `cid` FOREIGN KEY (`user_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `volunteer_list`
--

DROP TABLE IF EXISTS `volunteer_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `volunteer_list` (
  `v_id` int NOT NULL AUTO_INCREMENT,
  `citizen_id` int NOT NULL,
  `languages_known` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `alternate_phone` bigint DEFAULT NULL,
  `work_type` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `aadhar_number` bigint NOT NULL,
  PRIMARY KEY (`v_id`),
  UNIQUE KEY `citizen_id_UNIQUE` (`citizen_id`),
  KEY `citi_id_idx` (`citizen_id`),
  CONSTRAINT `citi_id` FOREIGN KEY (`citizen_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `volunteer_requests`
--

DROP TABLE IF EXISTS `volunteer_requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `volunteer_requests` (
  `req_id` int NOT NULL AUTO_INCREMENT,
  `cit_id` int NOT NULL,
  `date_time` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `req_status` varchar(45) COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'Under Process',
  `languages_known` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `alternate_number` bigint DEFAULT NULL,
  `work_type` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `preferred_ward` tinyint DEFAULT NULL,
  `aadhar_number` bigint NOT NULL,
  PRIMARY KEY (`req_id`),
  KEY `citiz_id_idx` (`cit_id`),
  CONSTRAINT `citiz_id` FOREIGN KEY (`cit_id`) REFERENCES `citizen_list` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-10 11:11:28
