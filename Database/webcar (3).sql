-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 09, 2023 lúc 01:24 PM
-- Phiên bản máy phục vụ: 10.4.27-MariaDB
-- Phiên bản PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `webcar`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `form_tuvan`
--

CREATE TABLE `form_tuvan` (
  `id` int(11) NOT NULL,
  `ten` varchar(50) NOT NULL,
  `ho` varchar(50) NOT NULL,
  `sdt` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `ngay_gui` date NOT NULL,
  `noidung` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `form_tuvan`
--

INSERT INTO `form_tuvan` (`id`, `ten`, `ho`, `sdt`, `email`, `ngay_gui`, `noidung`) VALUES
(36, 'nguyen', ' van a1', '1231241', '12314@gmail.com', '2023-01-04', '11111111111'),
(37, 'nguyen', 'van a2', '1231241', '12314@gmail.com', '2023-01-04', '13213'),
(38, 'nguyen', ' van a3', '1231241', '12314@gmail.com', '2023-01-04', '11111111111'),
(39, 'nguyen', ' van a4', '1231241', '12314@gmail.com', '2023-01-04', '11111111111'),
(40, 'nguyen', 'van a5', '1231241', '12314@gmail.com', '2023-01-04', '13213'),
(41, 'nguyen', 'van a6', '1231241', '12314@gmail.com', '2023-01-04', '13213'),
(42, 'nguyen', ' van a7', '1231241', '12314@gmail.com', '2023-01-04', '11111111111'),
(43, 'nguyen', ' van a8', '1231241', '12314@gmail.com', '2023-01-04', '11111111111'),
(44, 'nguyen', ' van a9', '1231241', '12314@gmail.com', '2023-01-04', '11111111111'),
(45, 'nguyen', 'van a10', '1231241', '12314@gmail.com', '2023-01-04', '13213'),
(46, 'nguyen', 'van a11', '1231241', '12314@gmail.com', '2023-01-04', '13213'),
(47, 'nguyen', ' van a12', '1231241', '12314@gmail.com', '2023-01-04', '11111111111'),
(48, 'nguyen', 'van a13', '1231241', '12314@gmail.com', '2023-01-04', '13213'),
(49, 'nguyen', ' van a14', '1231241', '12314@gmail.com', '2023-01-04', '11111111111'),
(50, 'nguyen', ' van a15', '1231241', '12314@gmail.com', '2023-01-04', '11111111111'),
(51, 'khang', 'xuan', '0989097027', '0989097027@gmail.com', '2023-01-09', 'toi can ho tro'),
(52, 'khang', 'nguyen', '0989097027', '0989097027@gmail.com', '2023-01-09', 'ho tro toi');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_admin`
--

CREATE TABLE `tbl_admin` (
  `admin_id` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(32) NOT NULL,
  `admin_name` varchar(100) NOT NULL,
  `tuoi` int(11) NOT NULL,
  `sdt` varchar(20) NOT NULL,
  `chuc_vu` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_admin`
--

INSERT INTO `tbl_admin` (`admin_id`, `email`, `password`, `admin_name`, `tuoi`, `sdt`, `chuc_vu`) VALUES
(1, 'admin@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'khang', 0, '', ''),
(2, 'admin1@gmail.com', 'e333725246f79bad2b8034df9d071276', 'hhji', 6, '0987999', 'ceo');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_slider`
--

CREATE TABLE `tbl_slider` (
  `slider_id` int(11) NOT NULL,
  `slider_image` varchar(500) NOT NULL,
  `slider_caption` varchar(255) NOT NULL,
  `slider_active` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_slider`
--

INSERT INTO `tbl_slider` (`slider_id`, `slider_image`, `slider_caption`, `slider_active`) VALUES
(1, 'anen12.jpg', '123330', 1),
(2, 'anen1.jpg', '12312', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_xe`
--

CREATE TABLE `tbl_xe` (
  `Car_id` int(11) NOT NULL,
  `ten_xe` varchar(255) NOT NULL,
  `thuong_hieu` int(11) NOT NULL,
  `gia_xe` float NOT NULL,
  `dong_co` varchar(100) NOT NULL,
  `mau_xe` varchar(100) NOT NULL,
  `nam_sanxuat` int(11) NOT NULL,
  `sanpham_image` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_xe`
--

INSERT INTO `tbl_xe` (`Car_id`, `ten_xe`, `thuong_hieu`, `gia_xe`, `dong_co`, `mau_xe`, `nam_sanxuat`, `sanpham_image`) VALUES
(18, '2023 ROLLS-ROYCE CULLINAN BLACK BADGE', 1, 5000000, 'aaaa', 'aaaaaaaaa', 2023, 'rr1.jpg'),
(19, '2023 BMW M8 COMPETITION', 2, 5000000, 'aaaaaaa', 'aaaaaaaaa', 2023, 'bmw1.jpg'),
(20, '2022 FERRARI SF90 STRADALE FIORANO PACKAGE', 3, 500000, 'aaaaaaa', 'aaaaaaaaa', 2022, 'ff1.jpg'),
(21, '2022 BMW M4 COMPETITION XDRIVE', 2, 500000, 'aaaa', 'aaaaaaaaa', 2022, 'bmw2.jpg'),
(22, '2021 BMW M4 COMPETITION XDRIVE', 2, 50000, 'aaaa', 'aaaaaaaaa', 2022, 'bmw3.jpg'),
(23, '2022 ROLLS-ROYCE GHOST', 1, 12321, 'aaaa', 'aaaaaaaaa', 2022, 'rr2.jpg'),
(24, '2022 ROLLS-ROYCE GHOST', 1, 12321, 'aaaa', 'aaaaaaaaa', 2022, 'rr3.jpg'),
(25, '2021 ROLLS-ROYCE CULLINAN', 1, 12321, 'aaaaaaa', 'aaaaaaaaa', 2021, 'rr1.jpg'),
(26, '2021 ROLLS-ROYCE CULLINAN', 1, 123211, 'aaaa', 'aaaaaaaaa', 2021, 'rr2.jpg'),
(27, '2021 ROLLS-ROYCE CULLINAN', 1, 123211, 'aaaa', 'aaaaaaaaa', 2021, 'rr3.jpg'),
(28, '2021 FERRARI F8 TRIBUTO', 3, 1232120, 'aaaa', 'aaaaaaaaa', 2021, 'ff2.jpg'),
(29, '2021 FERRARI SF90 STRADALE', 3, 123211, 'aaaaaaa', 'aaaaaaaaa', 2021, 'ff3.jpg'),
(30, '2020 FERRARI 812 MANSORY', 3, 123211, 'aaaa', 'aaaaaaaaa', 2020, 'ff2.jpg'),
(31, '2019 FERRARI PORTOFINO', 3, 1232110, 'aaaa', 'aaaaaaaaa', 2019, 'ff3.jpg'),
(32, '2018 ROLLS-ROYCE GHOST', 1, 12321, 'aaaa', 'aaaaaaaaa', 2018, 'rr3.jpg'),
(33, '2018 ROLLS-ROYCE PHANTOM', 1, 123214, 'aaaaaaa', 'aaaaaaaaa', 2018, 'rr1.jpg'),
(34, '2017 ROLLS-ROYCE DAWN', 1, 12321, 'aaaa', 'aaaaaaaaa', 2017, 'rr3.jpg'),
(35, '2016 BMW I8', 2, 12321, 'aaaaaaa', 'aaaaaaaaa', 2016, 'bmw3.jpg'),
(36, '2015 FERRARI 458 SPECIALE APERTA SPIDER', 3, 123211, 'aaaa', 'aaaaaaaaa', 2015, 'ff1.jpg'),
(37, '2015 ROLLS-ROYCE WRAITH', 1, 12321, 'aaaa', 'aaaaaaaaa', 2015, 'rr3.jpg'),
(38, '2015 FERRARI CALIFORNIA T', 3, 12321, 'aaaa', 'aaaaaaaaa', 2015, 'ff1.jpg'),
(39, '2015 FERRARI CALIFORNIA T', 3, 12321, 'aaaaaaa', 'aaaaaaaaa', 2015, 'ff2.jpg'),
(40, '2015 FERRARI CALIFORNIA T', 3, 12321, 'aaaaaaa', 'aaaaaaaaa', 2015, 'ff3.jpg'),
(41, '2015 FERRARI CALIFORNIA T', 3, 12321, 'aaaa', 'aaaaaaaaa', 2015, 'ff3.jpg'),
(42, '1997 BMW 5 SERIES 528IA', 2, 12321, 'aaaa', 'aaaaaaaaa', 1997, 'bmw2.jpg'),
(43, '1997 BMW 5 SERIES 528IA', 2, 12321, 'aaaa', 'aaaaaaaaa', 1997, 'bmw3.jpg'),
(44, '1997 BMW 5 SERIES 528IA', 2, 12321, 'aaaaaaa', 'aaaaaaaaa', 1997, 'bmw1.jpg'),
(45, '1997 BMW 5 SERIES 528IA', 2, 12321, 'aaaaaaa', 'aaaaaaaaa', 1997, 'bmw3.jpg'),
(46, '1997 BMW 5 SERIES 528IA', 2, 12321, 'aaaaaaa', 'aaaaaaaaa', 1997, 'bmw1.jpg'),
(47, '1997 BMW 5 SERIES 528IA', 2, 12321, 'aaaa', 'aaaaaaaaa', 1997, 'bmw2.jpg'),
(48, '1997 BMW 5 SERIES 528IA', 2, 12321, 'aaaaaaa', 'aaaaaaaaa', 1997, 'bmw3.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `testdrive`
--

CREATE TABLE `testdrive` (
  `id` int(11) NOT NULL,
  `year_car` int(11) NOT NULL,
  `make_carID` int(11) NOT NULL,
  `model_car` varchar(100) NOT NULL,
  `ho_td` varchar(100) NOT NULL,
  `ten_td` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `nd` varchar(500) NOT NULL,
  `ngay_thangtd` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `testdrive`
--

INSERT INTO `testdrive` (`id`, `year_car`, `make_carID`, `model_car`, `ho_td`, `ten_td`, `email`, `phone`, `nd`, `ngay_thangtd`) VALUES
(17, 2023, 1, '32111111', 'b1', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(18, 2023, 2, '32111111', 'b2', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(19, 2023, 1, '32111111', 'b2', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(20, 2023, 1, '32111111', 'b4', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(21, 2023, 1, '32111111', 'b5', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(22, 2023, 2, '32111111', 'b6', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(23, 2023, 1, '32111111', 'b7', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(24, 2023, 1, '32111111', 'b8', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(25, 2023, 1, '32111111', 'b9', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(26, 2023, 1, '32111111', 'b10', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(27, 2023, 1, '32111111', 'b11', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(28, 2023, 1, '32111111', 'b12', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(29, 2023, 1, '32111111', 'b13', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(30, 2023, 1, '32111111', 'b14', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(31, 2023, 1, '32111111', 'b15', 'tran van', '12314@gmail.com', '0900000000', 'aaaaaaaa', '2023-01-13'),
(32, 2021, 2, '12312', 'tran', 'vuong', '0989097029@gmail.com', '0989097029', 'toi muon lai thu', '2023-01-15'),
(33, 2021, 2, '12312', 'tran', 'vuong', '0989097029@gmail.com', '0989097029', 'toi muon lai thu', '2023-01-15');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thuong_hieu_xe`
--

CREATE TABLE `thuong_hieu_xe` (
  `id` int(11) NOT NULL,
  `thuong_hieu` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `thuong_hieu_xe`
--

INSERT INTO `thuong_hieu_xe` (`id`, `thuong_hieu`) VALUES
(1, 'ROLLSROYCE'),
(2, 'BMW'),
(3, 'FERRARI');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `form_tuvan`
--
ALTER TABLE `form_tuvan`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tbl_admin`
--
ALTER TABLE `tbl_admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Chỉ mục cho bảng `tbl_slider`
--
ALTER TABLE `tbl_slider`
  ADD PRIMARY KEY (`slider_id`);

--
-- Chỉ mục cho bảng `tbl_xe`
--
ALTER TABLE `tbl_xe`
  ADD PRIMARY KEY (`Car_id`),
  ADD KEY `thuong_hieu` (`thuong_hieu`);

--
-- Chỉ mục cho bảng `testdrive`
--
ALTER TABLE `testdrive`
  ADD PRIMARY KEY (`id`),
  ADD KEY `make_carID` (`make_carID`);

--
-- Chỉ mục cho bảng `thuong_hieu_xe`
--
ALTER TABLE `thuong_hieu_xe`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `form_tuvan`
--
ALTER TABLE `form_tuvan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT cho bảng `tbl_admin`
--
ALTER TABLE `tbl_admin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `tbl_slider`
--
ALTER TABLE `tbl_slider`
  MODIFY `slider_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `tbl_xe`
--
ALTER TABLE `tbl_xe`
  MODIFY `Car_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT cho bảng `testdrive`
--
ALTER TABLE `testdrive`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT cho bảng `thuong_hieu_xe`
--
ALTER TABLE `thuong_hieu_xe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `tbl_xe`
--
ALTER TABLE `tbl_xe`
  ADD CONSTRAINT `tbl_xe_ibfk_1` FOREIGN KEY (`thuong_hieu`) REFERENCES `thuong_hieu_xe` (`id`);

--
-- Các ràng buộc cho bảng `testdrive`
--
ALTER TABLE `testdrive`
  ADD CONSTRAINT `testdrive_ibfk_1` FOREIGN KEY (`make_carID`) REFERENCES `thuong_hieu_xe` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
