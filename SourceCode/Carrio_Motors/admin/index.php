<?php

	session_start();
 include('../db/connect.php'); 

?>
<?php
	// session_destroy();
	// unset('dangnhap');
	if(isset($_POST['taikhoan'])) {
		$taikhoan = $_POST['taikhoan'];
		$matkhau = md5($_POST['matkhau']);
		if($taikhoan=='' || $matkhau ==''){
			echo '<p>Xin nhập đủ</p>';
		}else{
			$sql_select_admin = mysqli_query($con,"SELECT * FROM tbl_admin WHERE email='$taikhoan' AND password='$matkhau' LIMIT 1");
			$count = mysqli_num_rows($sql_select_admin);
			$row_dangnhap = mysqli_fetch_array($sql_select_admin);
       
			if($count>0){
				$_SESSION['dangnhap'] = $row_dangnhap['admin_name'];
				$_SESSION['admin_id'] = $row_dangnhap['admin_id'];
				header('Location: dashboard.php');
			}else{
				echo '<p>Tài khoản hoặc mật khẩu sai</p>';
			}
		}
	}
?>
<html>
    <head>
        <title>Đăng nhập vào website</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="index.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <div class="container">
           
            </div>
        </header>
        <main>
            <div class="container">
            <div class="login-form">
                <form action="" method="post">
                    <h1>Đăng nhập vào website</h1>
                    <div class="input-box">
                        <i ></i>
                        <input type="text" name ="taikhoan" placeholder="Nhập admin username">
                    </div>
                    <div class="input-box">
                        <i ></i>
                        <input type="password" name="matkhau" placeholder="Nhập mật khẩu">
                    </div>
                    <div class="btn-box">
                        <button type="submit">
                            Đăng nhập admin
                        </button>
                    </div>
                </form>
            </div>
            </div>
        </main>
        <footer>
            <div class="container">
        
            </div>
        </footer>
    </body>
</html>