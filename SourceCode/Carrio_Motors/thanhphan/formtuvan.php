<?php

    if(isset($_POST['fname']))
    {
        $ten = $_POST['fname'];
        $ho = $_POST['lname'];
        $email = $_POST['email'];
        $phone = $_POST['sdt'];
        $nd = $_POST['nd'];
        $thoigian_gui = date('Y-m-d');
        
        require_once('../db1/connect.php');
        $query = "INSERT INTO form_tuvan(ten,ho,email,sdt,noidung,ngay_gui) values ('$ten','$ho','$email','$phone','$nd','$thoigian_gui')";
        $conn->query($query);
       
        
    }
    
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../giaodien/index1.css">
    <link rel="stylesheet" href="../giaodien/themify-icons/themify-icons.css">
    <link rel="stylesheet" href="../giaodien/formtuvan1.css">
    

    
    <title>Tư Vấn</title>
</head>
<body>
    <div id="container">
        <div id="header">
            <div id="tt">
                <ul id="ul1">
                    <li class="sales">Sales 954-733-7555</li>
                    <li class="ti-map-alt map"><span class="spanheader"> <a href="#">MAP</a></span></li>
                    <li class="ti-email email"> <a href="#"><span class="spanheader"> CONTACT </span></a></li>
                </ul>
            </div>
            <div id="menu">
                <div id="logo">
                   <a href="../index.php"><img src="../images/logo.png" alt=""></a> 
                </div>
            <div id="divmenu">
            <ul id="menu1">
                <li > <a href="../index.php" class="ti-home"> TRANG CHỦ</a></li>
                <li><a href="rollsroyce.php">ROLLS-ROYCE</a></li>
                <li><a href="ferrari.php">FERRARI</a></li>
                <li><a href="bmw.php">BMW</a></li>
                <li><a href="testdrive.php">TEST DRIVE</a></li>

            </ul>
         </div>
                
            </div>
            </div>
        <div id="all" style="margin-top:155px;">
        <div id="formtuvan">
            <div id="formtv">
                <form action="" method="post">
                    <div id="fname a" class="chung" >
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

                        <div id="btnform" class="chung">
                            <button>GET QUOTE</button>
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