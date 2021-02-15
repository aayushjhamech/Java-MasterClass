CREATE DATABASE  IF NOT EXISTS `employee_records`;
USE `employee_records`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL auto_increment,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `company` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB auto_increment=1 DEFAULT CHARSET=latin1;

