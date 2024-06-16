-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 08:47 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospitial`
--

-- --------------------------------------------------------

--
-- Table structure for table `channelling`
--

CREATE TABLE `channelling` (
  `Name` varchar(30) NOT NULL,
  `Nic` varchar(20) NOT NULL,
  `Clinic` varchar(30) NOT NULL,
  `Date` int(10) NOT NULL,
  `Time` int(15) NOT NULL,
  `Amount` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `channelling`
--

INSERT INTO `channelling` (`Name`, `Nic`, `Clinic`, `Date`, `Time`, `Amount`) VALUES
('maduwantha', '52875', 'Dental Clinic', 7823, 2782, 782787),
('dinu', '786', 'Eye Clinic', 87, 8, 86),
('ehgre', '7896', 'Dental Clinic', 786, 786, 876),
('maleesha', '8963', 'Eye Clinic', 876, 7, 8738),
('gseg', '89638', 'Eye Clinic', 876, 786, 876);

-- --------------------------------------------------------

--
-- Table structure for table `doctordetails`
--

CREATE TABLE `doctordetails` (
  `Name` varchar(20) NOT NULL,
  `Nic` varchar(20) NOT NULL,
  `RegNo` varchar(20) NOT NULL,
  `Eligibility` varchar(20) NOT NULL,
  `SpecializedIn` varchar(30) NOT NULL,
  `ContactNumber` int(15) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctordetails`
--

INSERT INTO `doctordetails` (`Name`, `Nic`, `RegNo`, `Eligibility`, `SpecializedIn`, `ContactNumber`, `UserName`, `Password`) VALUES
('rgr', '453', '453', '543', 'Eyes', 453, 'ds', '666'),
('ftjt', '74836', '786', '876', 'Eyes', 78678, 'kk', '222'),
('fege', '7868', '5786', '86', 'Eyes', 786, 'iresh', '1234'),
('madu', '866', '8768', '8', 'Physiotherapy&Orthopedic ', 78686876, 'im', '4444'),
('rth', '868', '786', '78', 'Physiotherapy&Orthopedic ', 7868, 'mm', '22');

-- --------------------------------------------------------

--
-- Table structure for table `doctortreatment`
--

CREATE TABLE `doctortreatment` (
  `Nic` varchar(20) NOT NULL,
  `Date` int(15) NOT NULL,
  `Time` int(15) NOT NULL,
  `Treatment` varchar(100) NOT NULL,
  `Medicience` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patientdetails`
--

CREATE TABLE `patientdetails` (
  `NIC` varchar(20) NOT NULL,
  `First Name` varchar(25) NOT NULL,
  `LastName` varchar(25) NOT NULL,
  `Dateofbirth` int(15) NOT NULL,
  `Gender` varchar(15) NOT NULL,
  `address` varchar(20) NOT NULL,
  `ContactNumber` varchar(30) NOT NULL,
  `Bloodtype` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patientdetails`
--

INSERT INTO `patientdetails` (`NIC`, `First Name`, `LastName`, `Dateofbirth`, `Gender`, `address`, `ContactNumber`, `Bloodtype`) VALUES
('387687', 'sdgfd', 'gdsg', 87678, 'Male', 'B', 'esyeryer', '7678766'),
('7637', 'ytjyt', 'tyjytjyt', 786, 'Male', 'b', 'yreyer', '786876'),
('iresh', 'maduwantha', '896', 78, 'male', 'ewgte', '786387', 'b'),
('maduwantha', 'fger', '876', 78, 'male', 'rtujrt', '8768', 'a'),
('pasindu', 'fewf', '896', 876, 'male', 'eewe', '9876', 'a'),
('tt', 'hh', '765', 87, 'male', 'dxzvgd', '8765', 'A'),
('wet', 'ewt', '876', 87, 'male', 'yjy', '9889', 'b');

-- --------------------------------------------------------

--
-- Table structure for table `pharmacydetails`
--

CREATE TABLE `pharmacydetails` (
  `Name` varchar(30) NOT NULL,
  `Nic` varchar(20) NOT NULL,
  `phregno` int(15) NOT NULL,
  `ContactNumber` int(15) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `confirm` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pharmacydetails`
--

INSERT INTO `pharmacydetails` (`Name`, `Nic`, `phregno`, `ContactNumber`, `UserName`, `Password`, `confirm`) VALUES
('iresh', '8768', 786, 786, 'madu', '7759', '7759');

-- --------------------------------------------------------

--
-- Table structure for table `receptiondetails`
--

CREATE TABLE `receptiondetails` (
  `Name` varchar(30) NOT NULL,
  `Nic` varchar(20) NOT NULL,
  `ContactNumber` int(15) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `confirm` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `receptiondetails`
--

INSERT INTO `receptiondetails` (`Name`, `Nic`, `ContactNumber`, `UserName`, `Password`, `confirm`) VALUES
('ertwe', '8768', 786786, 'null', '0425', 'null');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `channelling`
--
ALTER TABLE `channelling`
  ADD PRIMARY KEY (`Nic`);

--
-- Indexes for table `doctordetails`
--
ALTER TABLE `doctordetails`
  ADD PRIMARY KEY (`Nic`);

--
-- Indexes for table `doctortreatment`
--
ALTER TABLE `doctortreatment`
  ADD PRIMARY KEY (`Nic`);

--
-- Indexes for table `patientdetails`
--
ALTER TABLE `patientdetails`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `pharmacydetails`
--
ALTER TABLE `pharmacydetails`
  ADD PRIMARY KEY (`Nic`);

--
-- Indexes for table `receptiondetails`
--
ALTER TABLE `receptiondetails`
  ADD PRIMARY KEY (`Nic`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
