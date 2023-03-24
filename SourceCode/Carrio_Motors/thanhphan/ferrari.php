<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../giaodien/index1.css">
    <link rel="stylesheet" href="../giaodien/themify-icons/themify-icons.css">
    <link rel="stylesheet" href="../giaodien/roll.css">
    <title>Ferrari</title>
</head>
<body>
    <div id="container">
        
    <div id="header">
        <div id="tt">
            <ul id="ul1">
                <li class="sales">Sales 954-733-7555</li>
                <li class="ti-map-alt map"><span class="spanheader"> <a href="#">MAP</a></span></li>
                <li class="ti-email email"> <a href="formtuvan.php"><span class="spanheader"> CONTACT </span></a></li>
        </div>
        <div id="menu">
            <div id="logo">
            <a href="../index.php"><img src="../images/logo.png" alt=""></a> 
            </div>
        <div id="divmenu">
        <ul id="menu1">
            <li > <a href="../index.php" class="ti-home"> TRANG CHỦ</a></li>
            <li><a href="rollsroyce.php">ROLLS-ROYCE</a></li>
            <li><a href="#">FERRARI</a></li>
            <li><a href="bmw.php">BMW</a></li>
            <li><a href="testdrive.php">TEST DRIVE</a></li>

        </ul>
     </div>
            
        </div>
        </div>

        <div id="contentrollall" style="margin-top: 130px;">
        <?php
            require_once('../db1/connect.php');
            $query = "SELECT * FROM tbl_xe where thuong_hieu ='3'";
            $result = mysqli_query($conn,$query);
            $data = [];
            while($row = mysqli_fetch_array($result,1)){
                $data[] = $row;
            };
            
            require_once('../db1/close.php');
            for($i = 0; $i < count($data);$i ++){
                echo '<div id="contentroll" style="margin: 30px auto;">
                <div id="left">
                    <div id="logo_item">
                        <img src="../images/'.$data[$i]['sanpham_image'].'" alt="">
                    </div>
    
                    <div id="btn_logo">
                        <button class="ti-camera camera btn"> SNEAK PEEK</button>
                        <br />
                        <br />
                        <button class="ti-zoom-in view btn"> VIEW OPTIONS</button>
                    </div>
    
                </div>
    
                <div id="right">
                    <div id="rtitle">
                        <h1>'.$data[$i]['ten_xe'].'</h1>
                        <h3>View Vehicle Details</h3>
                    </div>
    
                    <div id="thongtinsp">
                        <div id="thongtinchitiet">
                                <ul>
                                    <li><b>Body Style:</b>'.$data[$i]['mau_xe'].'</li>
                                    <li><b>Model Code:</b>'.$data[$i]['dong_co'].'</li>
                                    <li><b>Engine:</b> 12 Cyl - 6.7 L</li>
                                    <li><b>Drive Type:</b> AWD</li>
                                    <li><b>Transmission:</b> Automatic</li>
                                    <li><b>MPG:</b> 12 City / 20 Hwy</li>
                                    <li><b>xMileage:</b> 51</li>
                                    <li><b>VIN #:</b> SLATV8C05PU214971</li>
                                    <li><b>Stock #:</b> 214971</li>
                                </ul>
                        </div>
    
                        <div id="btn_thongtin">
                            <div id="btnchitiet">
                                <div id="price">
                                    <div id="nameprice">
                                        <b><p>Internet Price</p></b>
                                    </div>
                                    <div id="gia">
                                        <b><p>$'.$data[$i]['gia_xe'].'</p></b>
                                    </div>
                                </div> 
    
                                <div id="btnclick">
                                    <div id="btn1">
                                        <button><a href="formtuvan.php">SUPPORT NOW</a></button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>';
            };
        ?>

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