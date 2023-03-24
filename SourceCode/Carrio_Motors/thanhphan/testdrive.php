<?php

    if(isset($_POST['fname']))
    {   
        $year = $_POST['year'];
        $make = $_POST['make'];
        $model = $_POST['model'];
        $time = $_POST['time'];
        $ten = $_POST['fname'];
        $ho = $_POST['lname'];
        $email = $_POST['email'];
        $phone = $_POST['sdt'];
        $nd = $_POST['nd'];
        
        require_once('../db1/connect.php');
        $query = "INSERT INTO testdrive(year_car,make_carID,model_car,ho_td,ten_td,email,phone,nd,ngay_thangtd) 
        values ('$year','$make','$model','$ho','$ten','$email','$phone','$nd','$time')";
        $conn->query($query);
    };
    
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../giaodien/index1.css">
    <link rel="stylesheet" href="../giaodien/themify-icons/themify-icons.css">
    <link rel="stylesheet" href="../giaodien/testdrive1.css">
    <title>TEST DRIVE</title>
</head>
<body>
<div id="container">
    <div id="header">
        <div id="tt">
            <ul id="ul1">
                <li class="sales">Sales 954-733-7555</li>
                <li class="ti-map-alt map"><span class="spanheader"> <a href="#map">MAP</a></span></li>
                <li class="ti-email email"> <a href="formtuvan.php"><span class="spanheader"> CONTACT </span></a></li>
            </ul>
        </div>
        <div id="menu">
            <div id="logo">
               <a href="../index.php"> <img src="../images/logo.png" alt=""> </a>
            </div>
        <div id="divmenu">
        <ul id="menu1">
            <li> <a href="../index.php" class="ti-home"> TRANG CHỦ</a></li>
            <li> <a href="rollsroyce.php">ROLLS-ROYCE</a></li>
            <li><a href="ferrari.php">FERRARI</a></li>
            <li><a href="bmw.php">BMW</a></li>
            <li><a href="#">TEST DRIVE</a></li>
        </ul>
        </div>
            
        </div>
    </div>

    <div id="all" style="margin-top:155px;">
        <div id="formtuvan">
            <div id="formtv">
                <div id="titlecenter" style="margin-top: 20px;
    margin-bottom: 20px; ">
               <h1 style="text-align: center  ;">SCHEDULE TEST DRIVE</h1>
               </div>
                <form action="" method="post">
                    <div id="divcar">
                    <h3>VEHICLE YOU WANT TO TEST DRIVE:</h3>
                    <div id="fname" class="chung" >
                            <label for=""><span class="red">*</span>Year:</label>
                            <input type="number" required placeholder="Year" name="year" id="fname1" class="a1">
                    </div>

                    <div id="lname" class="chung">
                        <label for=""><span class="red">*</span>Make:</label>
                        
                        <select name="make" id="" id="lname1" class="a2" style="width: 496px;
    height: 20px;  padding-left:0px; font-size: 12px;">
                        <?php
                        require_once('../db1/connect.php');
                        $query = "SELECT * FROM thuong_hieu_xe";
                        $result = mysqli_query($conn,$query);
                        $data = [];
                        while($row = mysqli_fetch_array($result,1)) {
                            $data[] = $row;
                        };
                        var_dump($data);
                        require_once('../db1/close.php');
                        for($i = 0; $i <count($data);$i++)
                        {
                           echo  '<option style=" transform: uppercase;" value="'.$data[$i]['id'].'">'.$data[$i]['thuong_hieu'].'</option>';
                         };
                      

                        ?>
                        </select>

                        <!-- <input type="text" required placeholder="Make" name="make" id="lname1" class="a2"> -->
                     </div>

                     <div id="email" class="chung">
                    <label for=""><span class="red">*</span>Model:</label>
                    <input type="text" required placeholder="Model" name="model" id="email1">
                    </div>
                    </div>

                    <h3>PERSONAL INFORMATION:</h3>
                    <div id="fname" class="chung" >
                            <label for=""><span class="red">*</span>First Name:</label>
                            <input type="text" required placeholder="First Name" name="fname" id="fname1">
                    </div>

                    <div id="lname" class="chung">
                        <label for=""><span class="red">*</span>Last Name:</label>
                        <input type="text" required placeholder="Last Name" name="lname" id="lname1">
                     </div>

                     <div id="email" class="chung">
                    <label for=""><span class="red">*</span>Email:</label>
                    <input type="email" required placeholder="Email Address" name="email" id="email1">
                    </div>

                    <div id="sdt" class="chung">
                        <label for=""><span class="red">*</span>Phone:</label>
                        <input type="text" required placeholder="Phone Number" name="sdt" id="sdt1">
                    </div>

                    <div id="nd" class="chung">
                        <div id="keolen">
                        <label for=""><span class="red">*</span>Comments:</label>
                        </div>
                        <textarea required cols="50" rows="5" placeholder="Comments" name="nd" id="nd1"></textarea>
                        </div>

                        <div id="timedirve">
                            <h3>TEST DRIVE APPOINTMENT:</h3>
                            <div id="fname" class="chung" >
                                    <label for=""><span class="red">*</span>Preferred Date:</label>
                                    <input type="date" name="time" id="lname1" class="a3">
                            </div>

                        <div id="btnform" class="chung">
                            <button>SCHEDULE</button>
                        </div>
                        
                </form>
            </div>
        </div>
        </div>

        <div id="footer">
            <div id="footernd">
                <ul id="ulft">
                    <li> <img src="../images/logoft.png" alt=""> </li>
                    <li> Copyright © 2022 by <a>DealerOn</a> | <a>Sitemap</a> | <a>Privacy</a> | Carrio Motor Cars | 5120 North State Road 7, Fort Lauderdale, FL 33309 | Sales: 954-733-7555 </li>
                </ul>
            </div>
        </div>
</div>
</body>
</html>