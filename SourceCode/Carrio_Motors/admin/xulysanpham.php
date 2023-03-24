<?php
	include('../db/connect.php');
?>
<?php
	if(isset($_POST['themsanpham'])){
		$ten_xe = $_POST['ten_xe'];
		$hinhanh = $_FILES['hinhanh']['name'];
		$thuong_hieu = $_POST['thuong_hieu'];
		$gia_xe = $_POST['gia_xe'];
		$dong_co = $_POST['dong_co'];
		$mau_xe = $_POST['mau_xe'];
		$nam_sanxuat = $_POST['nam_sanxuat'];
		$path = '../uploads/';
		
		$hinhanh_tmp = $_FILES['hinhanh']['tmp_name'];
		$sql_insert_product = mysqli_query($con,"INSERT INTO tbl_xe(ten_xe,thuong_hieu,gia_xe,dong_co,mau_xe,nam_sanxuat,sanpham_image) values ('$ten_xe','$thuong_hieu','$gia_xe','$dong_co','$mau_xe','$nam_sanxuat','$hinhanh')");
		move_uploaded_file($hinhanh_tmp,$path.$hinhanh);
	}elseif(isset($_POST['capnhatsanpham'])) {
		$id_update = $_POST['id_update'];
		$ten_xe = $_POST['ten_xe'];
		$hinhanh = $_FILES['hinhanh']['name'];
		$hinhanh_tmp = $_FILES['hinhanh']['tmp_name'];
		$thuong_hieu = $_POST['thuong_hieu'];
		$gia_xe = $_POST['gia_xe'];
		$dong_co = $_POST['dong_co'];
		$mau_xe = $_POST['mau_xe'];
		$nam_sanxuat = $_POST['nam_sanxuat'];
		$path = '../uploads/';
		if($hinhanh==''){
			$sql_update_image = "UPDATE tbl_xe SET ten_xe='$ten_xe',thuong_hieu='$thuong_hieu',gia_xe='$gia_xe',dong_co='$dong_co',mau_xe='$mau_xe',nam_sanxuat='$nam_sanxuat' WHERE Car_id='$id_update'";
		}else{
			move_uploaded_file($hinhanh_tmp,$path.$hinhanh);
			$sql_update_image = "UPDATE tbl_xe SET ten_xe='$ten_xe',thuong_hieu='$thuong_hieu',gia_xe='$gia_xe',dong_co='$dong_co',mau_xe='$mau_xe',nam_sanxuat='$nam_sanxuat',sanpham_image='$hinhanh' WHERE Car_id='$id_update'";
		}
		mysqli_query($con,$sql_update_image);
	}
	
?> 
<?php
	if(isset($_GET['xoa'])){
		$id= $_GET['xoa'];
		$sql_xoa = mysqli_query($con,"DELETE FROM tbl_xe WHERE Car_id='$id'");
	} 
?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Sản phẩm</title>
	<link href="xulysanpham.css" rel="stylesheet" type="text/css" media="all" />
	
</head>
<body style="background-color: #E6E6FA">
	<nav>
		
	  <div class="navbar">
	    
	        <a   href="dashboard.php" class="active">
				<span class="title"><ion-icon name="home-outline"></ion-icon>Admin</span>
			</a>
	 
	   
	        <a   href="testdrive.php">
			<span class="title"><ion-icon name="clipboard-outline"></ion-icon>Test driver (current)</span></a>
	 
	 
	        <a   href="xulysanpham.php">
			<span class="title"><ion-icon name="car-sport-outline"></ion-icon>Sản phẩm</span></a>

		
	        <a   href="xulykhachhang.php">
			<span class="title"><ion-icon name="person-outline"></ion-icon>Khách hàng</span></a>
	   
	      
	
	  </div>
	 
	</nav><br><br>
	<div class="container">
		<div class="details">
		<?php
			if(isset($_GET['quanly'])=='capnhat'){
				$id_capnhat = $_GET['capnhat_id'];
				$sql_capnhat = mysqli_query($con,"SELECT * FROM tbl_xe WHERE Car_id='$id_capnhat'");
				$row_capnhat = mysqli_fetch_array($sql_capnhat);
				
				?>
				<div class="acentOrders">
				<h4 class="cardHeader">Cập nhật sản phẩm</h4>
				
				<form action="xulysanpham.php" method="POST" enctype="multipart/form-data">
					<label>Tên sản phẩm</label>
					<input type="text" class="form-control" name="ten_xe" value="<?php echo $row_capnhat['ten_xe'] ?>"><br>
					<input type="hidden" class="form-control" name="id_update" value="<?php echo $row_capnhat['Car_id'] ?>">
					<label>Hình ảnh</label>
					<input type="file" class="form-control" name="hinhanh"><br>
					<img src="../uploads/<?php echo $row_capnhat['sanpham_image'] ?>" height="80" width="80"><br>
					<label>Động Cơ</label>
					<input type="text" class="form-control" name="dong_co" value="<?php echo $row_capnhat['dong_co'] ?>"><br>
					<label>Màu Xe</label>
					<input type="text" class="form-control" name="mau_xe" value="<?php echo $row_capnhat['mau_xe'] ?>"><br>
					<label>Năm Sản Xuất</label>
					<input type="number" class="form-control" name="nam_sanxuat" value="<?php echo $row_capnhat['nam_sanxuat'] ?>"><br>
					<label>Giá Xe</label>
					<input type="number" class="form-control" name="gia_xe" value="<?php echo $row_capnhat['gia_xe'] ?>"><br>
					<label>Thương Hiệu</label>
					<input type="number" class="form-control" name="thuong_hieu" value="<?php echo $row_capnhat['thuong_hieu'] ?>"><br>
			</br>
					<input type="submit" name="capnhatsanpham" value="Cập nhật sản phẩm" class="btn btn-default">
				</form>
				</div>
			<?php
			}else{
				?> 
				<div class="col-md-4">
				<h4>Thêm sản phẩm</h4>
				
				<form action="" method="POST" enctype="multipart/form-data">
					<label>Tên Xe</label>
					<input type="text" class="form-control" name="ten_xe" placeholder="Tên xe"><br>
					<label>Hình ảnh</label>
					<input type="file" class="form-control" name="hinhanh"><br>
					<label>Động Cơ</label>
					<input type="text" class="form-control" name="dong_co" placeholder="Động Cơ"><br>
					<label>Màu Xe</label>
					<input type="text" class="form-control" name="mau_xe" placeholder="Màu Xe"><br>
					<label>Năm Sản Xuất</label>
					<input type="text" class="form-control" name="nam_sanxuat" placeholder="Năm Sản Xuất"><br>
					<label>Giá Xe</label>
					<input type="number" class="form-control" name="gia_xe"><br>
					<label>Thương Hiệu</label>
					<input type="number" class="form-control" name="thuong_hieu"><br>
			</br>
					<input type="submit" name="themsanpham" value="Thêm sản phẩm" class="btn btn-default">
				</form>
				</div>
				<?php
			} 
			
				?>
			<div class="recentCustomers">
				<h4>Liệt kê sản phẩm</h4>
				<?php
				$sql_select_sp = mysqli_query($con,"SELECT * FROM tbl_xe  ORDER BY tbl_xe.Car_id DESC"); 
				?> 
				<table >
					<tr>
						<th>Thứ tự</th>
						<th>Tên xe</th>
						<th>Hình ảnh</th>
						<th>Động Cơ</th>
						<th>Màu Xe</th>
						<th>Năm Sản Xuất</th>
						<th>Giá Xe</th>
						<th>Thương Hiệu</th>
						<th> Quản Lý  </th>
						
					</tr>
					<?php
					$i = 0;
					while($row_sp = mysqli_fetch_array($sql_select_sp)){ 
						$i++;
					?> 
					<tr>
						<td><?php echo $i ?></td>
						<td><?php echo $row_sp['ten_xe'] ?></td>
						<td><img src="../uploads/<?php echo $row_sp['sanpham_image'] ?>" height="100" width="80"></td>
						<td><?php echo $row_sp['dong_co']?></td>
						<td><?php echo $row_sp['mau_xe']?></td>
						<td><?php echo $row_sp['nam_sanxuat'] ?></td>
						<td><?php echo number_format($row_sp['gia_xe']) . '$' ?></td>
						<td><?php echo number_format ($row_sp['thuong_hieu']) ?></td>
						
						
						
						<td><a href="?xoa=<?php echo $row_sp['Car_id'] ?>">Xóa</a> || <a href="xulysanpham.php?quanly=capnhat&capnhat_id=<?php echo $row_sp['Car_id'] ?>">Cập nhật</a></td>
					</tr>
				<?php
					} 
					?> 
				</table>
			</div>
		</div>
	</div>
	
</body>
</html>