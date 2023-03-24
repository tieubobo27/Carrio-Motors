<?php
	session_start();
	if(!isset($_SESSION['dangnhap'])){
		header('Location: ./index.php');
	} 
	if(isset($_GET['login'])){
 	$dangxuat = $_GET['login'];
	 }else{
	 	$dangxuat = '';
	 }
	 if($dangxuat=='dangxuat'){
	 	session_destroy();
	 	header('Location: ./index.php');
	 }
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin</title>
    <link rel="stylesheet" type="text/css" href="dashboard.css" />
</head>

<body>
    <div class="container">
        <div class="navigation">
            <ul>
                <li>
                    <a href="#">
                        <span class="icon"></span>
                        <span class="title">Xin chào : <?php echo $_SESSION['dangnhap'] ?></span>
                       
                    </a>
                </li>
                <li>
                    <a href="xulysanpham.php">
                        <span class="icon"></span>
                        <span class="title"><ion-icon name="car-sport-outline"></ion-icon> xe</span>
                    </a>
                </li>
                <li>
                    <a href="xulykhachhang.php">
                        <span class="icon"></span>
                        <span class="title"><ion-icon name="person-outline"></ion-icon> Khach Hang</span>
                    </a>
                </li>
                <li>
                    <a href="testdrive.php">
                        <span class="icon"></span>
                        <span class="title"><ion-icon name="clipboard-outline"></ion-icon> lai thu</span>
                    </a>
                </li>
                <li>
                    <a href="index.php">
                        <span class="icon"></span>
                        <span class="title"><ion-icon name="log-out-outline"></ion-icon> Dang Xuat</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <!--main--->
    <div class="main">
        <div class="topbar">
            <div class="toggle">
                <ion-icon name="menu-outline"></ion-icon>
            </div>
   
            <!-- <div class="search">
                <label>
                    <input type="text" placeholder="search here" />
                    <ion-icon name="search-outline"></ion-icon>
                </label>
            </div>
            < !--userImg-->
            <!-- <div class="user">
                <img src="user.jpg">
            </div> -->
            <!--cards-->
            <div class="cardBox">
                <div class="card">
                    <div>
                        <div class="numbers">1,504</div>
                        <div class="cardName">Daily views</div>
                    </div>
                    <div class="iconBx">
                        <ion-icon name="eye-outline"></ion-icon>
                    </div>
                </div>

                <div class="card">
                    <div>
                        <div class="numbers">820</div>
                        <div class="cardName">comments</div>
                    </div>
                    <div class="iconBx">
                        <ion-icon name="logo-wechat"></ion-icon>
                    </div>
                </div>
                <div class="card">
                    <div>
                        <div class="numbers">80</div>
                        <div class="cardName">sales</div>
                    </div>
                </div>
            </div>

        </div>
    </div>
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    <script>
        let list = document.querySelectorAll('.navigation li');
        function activeLink() {
            list.forEach((item) =>
                item.classList.remove('hovered'));
            this.classList.add('hovered');
        }
        list.forEach((item) =>
            item.addEventListener('mouseover', activeLink));
    </script>
</body>

</html>