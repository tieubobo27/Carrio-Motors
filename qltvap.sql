-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 16, 2023 lúc 06:59 PM
-- Phiên bản máy phục vụ: 10.4.28-MariaDB
-- Phiên bản PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qltvap`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nguoidung`
--

CREATE TABLE `nguoidung` (
  `id` int(11) NOT NULL,
  `hovaten` varchar(50) DEFAULT NULL,
  `tuoi` int(11) DEFAULT NULL,
  `sdt` varchar(20) DEFAULT NULL,
  `gioitinh` varchar(10) DEFAULT NULL,
  `diachi` varchar(150) DEFAULT NULL,
  `chucvu` varchar(50) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL,
  `mk` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nguoidung`
--

INSERT INTO `nguoidung` (`id`, `hovaten`, `tuoi`, `sdt`, `gioitinh`, `diachi`, `chucvu`, `email`, `mk`) VALUES
(1, 'Phạm Nhật Vượng', 50, '0989097027', 'nam', 'tây hồ ', 'giám đốc thư viện', 'admin@gmail.com', '25d55ad283aa400af464c76d713c07ad');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieumuon`
--

CREATE TABLE `phieumuon` (
  `maphieumuon` int(11) NOT NULL,
  `msv_muon` varchar(50) DEFAULT NULL,
  `id_sach` int(11) DEFAULT NULL,
  `ngaymuon` varchar(15) DEFAULT NULL,
  `trangthaimuon` varchar(20) DEFAULT 'DangMuon',
  `ngaytra` date DEFAULT NULL,
  `ngayphaitra` date DEFAULT NULL,
  `songaymuon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phieumuon`
--

INSERT INTO `phieumuon` (`maphieumuon`, `msv_muon`, `id_sach`, `ngaymuon`, `trangthaimuon`, `ngaytra`, `ngayphaitra`, `songaymuon`) VALUES
(86, '1551060665', 1, '2023-06-12', 'DaTra', '2023-06-15', '2023-09-14', 4),
(87, '1551060665', 2, '2023-02-16', 'DaTra', '2023-05-16', '2023-09-14', 0),
(88, '1551060665', 4, '2023-06-16', 'DaTra', '2023-06-16', '2023-09-14', 0),
(89, '1551060665', 2, '2023-02-16', 'DangMuon', NULL, '2023-05-14', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sach`
--

CREATE TABLE `sach` (
  `id` int(11) NOT NULL,
  `tensach` varchar(255) DEFAULT NULL,
  `tacgia` varchar(255) DEFAULT NULL,
  `theloai` varchar(255) DEFAULT NULL,
  `soluong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sach`
--

INSERT INTO `sach` (`id`, `tensach`, `tacgia`, `theloai`, `soluong`) VALUES
(1, 'Đắc Nhân Tâm', 'Xuân Khang', 'Tình Cảm', 1000),
(2, 'Truyện Hài dân Gian', 'Dân Gian', 'Hài', 999),
(4, 'Truyện cười 1', 'Sưu tầm', 'Hài', 1000),
(5, 'hai dan gian', 'tay nguyen', 'chien tranh', 1000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinhvien`
--

CREATE TABLE `sinhvien` (
  `msv` varchar(50) NOT NULL,
  `tensv` varchar(50) DEFAULT NULL,
  `diachi` varchar(150) DEFAULT NULL,
  `sdt` varchar(20) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sinhvien`
--

INSERT INTO `sinhvien` (`msv`, `tensv`, `diachi`, `sdt`, `email`) VALUES
('1551060665', 'truong van long', 'tay ho', '09890970247', 'truongdz@gmail.com'),
('1551060666', 'Nguyễn Trường Giang', 'Gia Lâm', '0989097024', 'Giang123@gmail.com'),
('1551060667', 'Phạm Hoàng Giang', 'Gia Lâm', '0989097024123', 'Giang123@gmail.com'),
('1551060668', 'nguyễn thương giang', 'hà nam', '09890970244', 'giang555@gmail.com'),
('1551060669', 'truong khong dep lm', 'thanh hoa', '09890970247', 'truongdz@gmail.com');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `nguoidung`
--
ALTER TABLE `nguoidung`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD PRIMARY KEY (`maphieumuon`),
  ADD KEY `msv_muon` (`msv_muon`),
  ADD KEY `id_sach` (`id_sach`);

--
-- Chỉ mục cho bảng `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`msv`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `nguoidung`
--
ALTER TABLE `nguoidung`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `phieumuon`
--
ALTER TABLE `phieumuon`
  MODIFY `maphieumuon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=90;

--
-- AUTO_INCREMENT cho bảng `sach`
--
ALTER TABLE `sach`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD CONSTRAINT `phieumuon_ibfk_1` FOREIGN KEY (`msv_muon`) REFERENCES `sinhvien` (`msv`),
  ADD CONSTRAINT `phieumuon_ibfk_2` FOREIGN KEY (`id_sach`) REFERENCES `sach` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
