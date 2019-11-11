-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2018 at 04:32 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ppl_simulasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `cuaca`
--

CREATE TABLE `cuaca` (
  `id_cuaca` int(22) NOT NULL,
  `cuaca` varchar(22) NOT NULL,
  `keterangan` varchar(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cuaca`
--

INSERT INTO `cuaca` (`id_cuaca`, `cuaca`, `keterangan`) VALUES
(1, 'Kemarau', 'Kurang Baik'),
(2, 'Hujan', 'Baik');

-- --------------------------------------------------------

--
-- Table structure for table `estimasisusu`
--

CREATE TABLE `estimasisusu` (
  `id_estimasi` int(11) NOT NULL,
  `id_produksisusu` int(11) NOT NULL,
  `p_susubulan` double(22,1) NOT NULL,
  `b_laktasi1` double(22,1) NOT NULL,
  `b_laktasi2` double(22,1) NOT NULL,
  `b_laktasi3` double(22,1) NOT NULL,
  `b_laktasi4` double(22,1) NOT NULL,
  `b_laktasi5` double(22,1) NOT NULL,
  `b_laktasi6` double(22,1) NOT NULL,
  `b_laktasi7` double(22,1) NOT NULL,
  `b_laktasi8` double(22,1) NOT NULL,
  `b_laktasi9` double(22,1) NOT NULL,
  `b_laktasi10` double(22,1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `estimasisusu`
--

INSERT INTO `estimasisusu` (`id_estimasi`, `id_produksisusu`, `p_susubulan`, `b_laktasi1`, `b_laktasi2`, `b_laktasi3`, `b_laktasi4`, `b_laktasi5`, `b_laktasi6`, `b_laktasi7`, `b_laktasi8`, `b_laktasi9`, `b_laktasi10`) VALUES
(31, 62, 105.0, 136.5, 137.8, 128.4, 129.6, 109.0, 110.0, 99.9, 89.6, 79.1, 68.4),
(32, 63, 103.0, 133.9, 135.2, 126.0, 127.2, 107.0, 108.0, 98.1, 88.0, 77.7, 67.2),
(33, 64, 71.0, 92.3, 93.6, 87.6, 88.8, 75.0, 76.0, 69.3, 62.4, 55.3, 48.0),
(34, 65, 70.0, 91.0, 92.3, 86.4, 87.6, 74.0, 75.0, 68.4, 61.6, 54.6, 47.4),
(35, 67, 97.0, 126.1, 127.4, 118.8, 120.0, 101.0, 102.0, 92.7, 83.2, 73.5, 63.6),
(36, 68, 120.0, 156.0, 157.3, 146.4, 147.6, 124.0, 125.0, 113.4, 101.6, 89.6, 77.4),
(37, 69, 90.0, 117.0, 118.3, 110.4, 111.6, 94.0, 95.0, 86.4, 77.6, 68.6, 59.4);

-- --------------------------------------------------------

--
-- Table structure for table `kualitassusu`
--

CREATE TABLE `kualitassusu` (
  `id_kualitas` int(22) NOT NULL,
  `id_produksisusu` int(22) NOT NULL,
  `bulanlak_ke` int(22) NOT NULL,
  `id_cuaca` int(22) NOT NULL,
  `kualitas_susu` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kualitassusu`
--

INSERT INTO `kualitassusu` (`id_kualitas`, `id_produksisusu`, `bulanlak_ke`, `id_cuaca`, `kualitas_susu`) VALUES
(42, 62, 1, 1, 'Kurang Baik'),
(43, 63, 1, 1, 'Kurang Baik'),
(44, 64, 1, 1, 'Kurang Baik'),
(45, 67, 1, 1, 'Kurang Baik'),
(46, 68, 1, 1, 'Kurang Baik'),
(47, 69, 1, 1, 'Kurang Baik');

-- --------------------------------------------------------

--
-- Table structure for table `produksisusu`
--

CREATE TABLE `produksisusu` (
  `id_produksisusu` int(11) NOT NULL,
  `umur_sapi` double(22,1) NOT NULL,
  `ps1` double(22,1) NOT NULL,
  `ps2` double(22,1) NOT NULL,
  `ps3` double(22,1) NOT NULL,
  `total_ps` double(22,1) NOT NULL,
  `rata_rata` double(22,1) NOT NULL,
  `p_susubulan` double(22,1) NOT NULL,
  `periodelaktasi` int(22) NOT NULL,
  `nama` varchar(22) NOT NULL,
  `pakan_tambahan` enum('Katul','Ampas Tahu','Kosong') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produksisusu`
--

INSERT INTO `produksisusu` (`id_produksisusu`, `umur_sapi`, `ps1`, `ps2`, `ps3`, `total_ps`, `rata_rata`, `p_susubulan`, `periodelaktasi`, `nama`, `pakan_tambahan`) VALUES
(62, 3.0, 3.6, 3.3, 3.6, 10.5, 3.5, 105.0, 1, 'Sapi1', 'Kosong'),
(63, 3.0, 3.7, 2.7, 3.9, 10.3, 3.4, 103.0, 1, 'Sapi2', 'Kosong'),
(64, 3.0, 2.1, 2.8, 2.2, 7.1, 2.4, 71.0, 1, 'Sapi3', 'Katul'),
(65, 2.0, 3.0, 2.0, 2.0, 7.0, 2.3, 70.0, 2, 'sapi 4', 'Ampas Tahu'),
(66, 2.0, 3.0, 4.0, 3.0, 10.0, 3.3, 100.0, 3, 'sapi 4', 'Katul'),
(67, 3.0, 3.0, 3.2, 3.5, 9.7, 3.2, 97.0, 1, 'Sjia 1', 'Kosong'),
(68, 3.0, 5.0, 4.0, 3.0, 12.0, 4.0, 120.0, 3, 'sapi 6', 'Katul'),
(69, 3.0, 3.0, 2.0, 4.0, 9.0, 3.0, 90.0, 3, 'Sapi bayu', 'Ampas Tahu');

-- --------------------------------------------------------

--
-- Table structure for table `standarisasisusu`
--

CREATE TABLE `standarisasisusu` (
  `id_standarisasi` int(11) NOT NULL,
  `id_produksisusu` int(11) NOT NULL,
  `susu_bulan` double(22,1) NOT NULL,
  `standarisasi_susu` double(22,1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `standarisasisusu`
--

INSERT INTO `standarisasisusu` (`id_standarisasi`, `id_produksisusu`, `susu_bulan`, `standarisasi_susu`) VALUES
(23, 62, 105.0, 42.6),
(24, 63, 103.0, 41.8),
(25, 64, 71.0, 29.0),
(26, 66, 100.0, 40.6),
(27, 67, 97.0, 39.4),
(28, 68, 120.0, 48.6),
(29, 69, 90.0, 36.6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cuaca`
--
ALTER TABLE `cuaca`
  ADD PRIMARY KEY (`id_cuaca`);

--
-- Indexes for table `estimasisusu`
--
ALTER TABLE `estimasisusu`
  ADD PRIMARY KEY (`id_estimasi`),
  ADD KEY `id_produksisusu` (`id_produksisusu`);

--
-- Indexes for table `kualitassusu`
--
ALTER TABLE `kualitassusu`
  ADD PRIMARY KEY (`id_kualitas`),
  ADD KEY `id_produksisusu` (`id_produksisusu`),
  ADD KEY `bulanlak_ke` (`bulanlak_ke`),
  ADD KEY `cuaca` (`id_cuaca`);

--
-- Indexes for table `produksisusu`
--
ALTER TABLE `produksisusu`
  ADD PRIMARY KEY (`id_produksisusu`);

--
-- Indexes for table `standarisasisusu`
--
ALTER TABLE `standarisasisusu`
  ADD PRIMARY KEY (`id_standarisasi`),
  ADD KEY `id_produksisusu` (`id_produksisusu`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cuaca`
--
ALTER TABLE `cuaca`
  MODIFY `id_cuaca` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `estimasisusu`
--
ALTER TABLE `estimasisusu`
  MODIFY `id_estimasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `kualitassusu`
--
ALTER TABLE `kualitassusu`
  MODIFY `id_kualitas` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `produksisusu`
--
ALTER TABLE `produksisusu`
  MODIFY `id_produksisusu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT for table `standarisasisusu`
--
ALTER TABLE `standarisasisusu`
  MODIFY `id_standarisasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `estimasisusu`
--
ALTER TABLE `estimasisusu`
  ADD CONSTRAINT `estimasisusu_ibfk_1` FOREIGN KEY (`id_produksisusu`) REFERENCES `produksisusu` (`id_produksisusu`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `kualitassusu`
--
ALTER TABLE `kualitassusu`
  ADD CONSTRAINT `kualitassusu_ibfk_1` FOREIGN KEY (`id_produksisusu`) REFERENCES `produksisusu` (`id_produksisusu`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kualitassusu_ibfk_2` FOREIGN KEY (`id_cuaca`) REFERENCES `cuaca` (`id_cuaca`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `standarisasisusu`
--
ALTER TABLE `standarisasisusu`
  ADD CONSTRAINT `standarisasisusu_ibfk_1` FOREIGN KEY (`id_produksisusu`) REFERENCES `produksisusu` (`id_produksisusu`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
