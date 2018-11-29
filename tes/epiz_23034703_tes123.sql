-- phpMyAdmin SQL Dump
-- version 3.5.8.2
-- http://www.phpmyadmin.net
--
-- Host: sql201.epizy.com
-- Generation Time: Nov 22, 2018 at 06:45 AM
-- Server version: 5.6.41-84.1
-- PHP Version: 5.3.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `epiz_23034703_tes123`
--

-- --------------------------------------------------------

--
-- Table structure for table `Aturan`
--

CREATE TABLE IF NOT EXISTS `Aturan` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Gejala` text NOT NULL,
  `Penyakit` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `Aturan`
--

INSERT INTO `Aturan` (`ID`, `Gejala`, `Penyakit`) VALUES
(1, '0-4-', 'P1'),
(2, '0-1-4-', 'P1');

-- --------------------------------------------------------

--
-- Table structure for table `Gejala`
--

CREATE TABLE IF NOT EXISTS `Gejala` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Kode` text NOT NULL,
  `Gejala` text NOT NULL,
  `Range` text NOT NULL,
  `Bobot` double NOT NULL,
  `Int Min` double NOT NULL,
  `Int Max` double NOT NULL,
  `Nil Mid` double NOT NULL,
  `F Min` double NOT NULL,
  `F Max` double NOT NULL,
  `F Hasil` double NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `Gejala`
--

INSERT INTO `Gejala` (`ID`, `Kode`, `Gejala`, `Range`, `Bobot`, `Int Min`, `Int Max`, `Nil Mid`, `F Min`, `F Max`, `F Hasil`) VALUES
(1, 'G1', 'Bengkak', 'Parah', 0.8, 0.6, 1, 0.8, 1, 1, 1),
(2, 'G2', 'Batuk', 'Ringan', 0.4, 0, 0.4, 0.2, 2, 0, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
