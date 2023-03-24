<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./giaodien/index1.css">
    <link rel="stylesheet" href="./giaodien/themify-icons/themify-icons.css">
    <title>Carriomotorcars</title>
</head>
<body>
<div id="container">

    <div id="header">
        <div id="tt">
            <ul id="ul1">
                <li class="sales">Sales 954-733-7555</li>
                <li class="ti-map-alt map"><span class="spanheader"> <a href="#map">MAP</a></span></li>
                <li class="ti-email email"> <a href="./thanhphan/formtuvan.php"><span class="spanheader"> CONTACT </span></a></li>
            </ul>
        </div>
        <div id="menu">
            <div id="logo">
               <a href="index.php"> <img src="./images/logo.png" alt=""> </a>
            </div>
        <div id="divmenu">
        <ul id="menu1">
            <li> <a href="index.php" class="ti-home"> TRANG CHỦ</a></li>
            <li> <a href="./thanhphan/rollsroyce.php">ROLLS-ROYCE</a></li>
            <li><a href="./thanhphan/ferrari.php">FERRARI</a></li>
            <li><a href="./thanhphan/bmw.php">BMW</a></li>
            <li><a href="./thanhphan/testdrive.php">TEST DRIVE</a></li>
        </ul>
     </div>
            
        </div>
        </div>

    <div id="content">
        <div id="search" style="background-image: url(./images/imgcontent1.jpg);">
            <div id="form">
            <div id="title">
                <h1>158 VEHICLES AVAILABLE</h1>
            </div>
            <div id="formsr">
                <form action="" method="get">
                    <select class="user">
                        <option value="">Used</option>
                        <option value="">Certified</option>
                    </select>

                    <select class="year">
                        <option value="">Any Year</option>
                        <option value="">2022</option>
                        <option value="">2021</option>
                        <option value="">2020</option>

                    </select>

                    <select class="make">
                        <option value="">Any Make</option>
                        <option value="">Ford</option>
                        <option value="">Honda</option>
                        <option value="">Kia</option>
                    </select>

                    <br/><br/>
                    <div id="form2">
                    <select name="" id="" class="model">
                        <option value="">Any Model</option>
                        <option value="">360</option>
                        <option value="">570S</option>
                        <option value="">600LT</option>
                    </select>

                    <button type="submit" class="tk">SEARCH</button>
                </div>

                    <br/>
                    <br/>
                <div id="form3">
                    <input type="text" placeholder="Type to search" class="micro">
                     <span class="ti-microphone"></span>
                    <button class="btnsr"> <span class="ti-search"></span></button>
                </div>
                </form>
            </div>
        </div>
        </div>

        <div id="slider">
            <div id="slider1">
                <div id="imgsl">
                    <div id="slimg1">
                        <?php
                            require_once('./db1/connect.php');
                            $query = "SELECT * FROM tbl_slider where slider_active = '1'";
                            $result = mysqli_query($conn,$query);
                            $data = [];
                            while($row = mysqli_fetch_array($result,1)) {
                                $data[] = $row;
                            };
                            require_once('./db1/close.php');
                            for($i=0;$i < count($data);$i++){
                            echo '<img src="./images/'.$data[$i]['slider_image'].'" alt="">';
                            };
                    ?>
                     </div>
                     <div id="btnsld1">
                    <button>GET PRE-QUALIFIED</button>
                     </div>
                </div>
            </div>

            <div id="slider23">
                <div id="imgsl2">
                    <div id="slimg2">
                    <img src="./images/slider2.jfif" alt="">
                    </div>
                    <div id="btnsld2">
                    <button><span> GET APPRAISAL</span></button>
                    </div>
                </div>

                <div id="imgsl3">
                    <div id="slimg3">
                    <img src="./images/slider3.jpg" alt="">
                     </div>
                     <div id="btnsld3">
                    <button>VIEW GALLERY</button>
                    </div>
                </div>
            </div>
     </div>
    </div>

    <div id="content6">
        <div id="content61">
            <div id="content61tt">
                    <h2>EXPLORE BY MAKE</h2>
            </div>
            <div id="conten62a">
                <div id="conten62a1" class="ct6"><a href="#"><h4>LAMBORGHINI</h4></a></div>
                <div id="conten62a2" class="ct6"><a href="./thanhphan/rollsroyce.php"><h4>ROLLS-ROYCE</h4></a></div>
                <div id="conten62a3" class="ct6"><a href="./thanhphan/ferrari.php"><h4>FERRARI</h4></a></div>
                <div id="conten62a4" class="ct6"> <a href="#"><h4>PORSCHE</h4></a></div>
                <div id="conten62a5" class="ct6"> <a href="#"><h4>BENTLEY</h4></a></div>
                <div id="conten62a6" class="ct6"><a href="#"><h4>MCLAREN</h4></a></div>
            </div>
        </div>

    </div>

    <div id="contten7" style = " background-image: url(./images/ct7.jpg);">
        <div id="contten71">
            <div id="trong">
                
            </div>
            <div id="ndct7">
                <h2>TEST DRIVE</h2>
                <h3>THE BEST LUXURY BRANDS IN THE WORLD.</h3>
                <p>Experience the beauty of our pre-owned inventory in the most exhilarating way possible - behind the wheel of one of our iconic models.</p>
                <p>It is easy to register your interest. Simply complete the form below.</p>
                <a href="./thanhphan/testdrive.php"> SCHEDULE TEST DRIVE </a>
            </div>
        </div>
    </div>

    <div id="content2">
        <div id="noidung2">
            <h1>CARRIO MOTOR CARS</h1>
            <h2>LUXURY DEALERSHIP IN FORT LAUDERDALE, FL</h2>
            <p>Founded in 1987, Carrio Motor Cars boasts over 35 years as the most ideal and convenient dealership destination where you should purchase your premium luxury pre-owned high-end cars. We are based in Fort Lauderdale with a customer base that stretches all over Miami, West Palm Beach, Hillsboro Beach, Naples, Fisher Island, and beyond.</p>
            <button>MORE ABOUT US</button>
        </div>
    </div>

    <div id="content3" style="background-image: url(./images/noidung32.jpg);">
        <div id="noidung3">
            <h1>SELL US YOUR CAR</h1>
            <h2>GET THE BEST VALUE FOR YOUR VEHICLE</h2>
            <p>If you are ready to start the car-shopping process and are considering trading in your ride, we encourage you to do so. You can value your trade-in online, so you know just how much your vehicle is worth.
                <br/> <br/>Follow the link below and get the first step done for your next dream car.
            </p>
            <button>GET APPRAISAL</button>
        </div>
    </div>

    <div id="map">
        <div id="nhungmap">
            <iframe src="https://www.google.com/maps/embed?pb=!1m23!1m12!1m3!1d6830.000129407308!2d105.84779007178165!3d21.029337907919867!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m8!3e6!4m0!4m5!1s0x3135abbf59d8f429%3A0x7830a3dfd6e566a1!2zSG_DoG4gS2nhur9tLCBIw6AgTuG7mWksIFZp4buHdCBOYW0!3m2!1d21.027964!2d105.8510132!5e0!3m2!1svi!2s!4v1671433883906!5m2!1svi!2s" frameborder="0"></iframe>
        </div>
    </div>

    <div id="content4">
        <div id="noidung4">
           <ul class="menu2">
            <li class="menuli1">FOLLOW US ON SOCIAL MEDIA</li>
            <li class="ti-facebook ti"></li>
            <li class="ti-twitter ti"></li>
            <li class="ti-youtube ti"></li>
            <li class="ti-instagram ti"></li>
        </ul>  
        </div>
    </div>

    <div id="content5">
        <div id="noidung5">
            <div id="noidung51">
                <h3>WHY SHOULD YOU SHOP WITH US?</h3>
                <br />
                <p>Our, state-of-the-art showroom and great customer service, ensures customers are extremely satisfied when they buy from Carrio Motor Cars. As a result, we are committed to offer unparalleled levels of service for our customers. <br/> <br/>As a prestigious dealership selling pre-owned luxurious models, we believe our customers should enjoy excellent customer care throughout their ownership of such a car.</p>
            </div>

            <div id="noidung52">
                <h3>TOP-SELLING MODELS</h3>
                <br/>
                <p>Carrio Motor Cars offers a fantastic range of prestigious pre-owned brands including Lamborghini, McLaren, Bentley, Aston Martin, Ferrari and Roll Royce. This means, you can be sure that for any motoring need, we will have the right car to suit it!</p>
            </div>

            <div id="noidung53">
                <h3>FINANCING OPTIONS</h3>
                <br/>
                <p>Financing through Carrio Motor Cars is quick, convenient and easy. You can take advantage of our different personal or business financing programs. Allow you more control over your deposit, monthly payments, and deferred final payment, whether you are looking to buy or lease, you can fill out a financing form and one of our representatives will reach out to you with splendid packages that offer the best interest rates.</p>
            </div>
        </div>
    </div>

    <div id="footer">
        <div id="footernd">
            <ul id="ulft">
                <li> <img src="./images/logoft.png" alt=""> </li>
                <li> Copyright © 2022 by <a>DealerOn</a> | <a>Sitemap</a> | <a>Privacy</a> | Carrio Motor Cars | 5120 North State Road 7, Fort Lauderdale, FL 33309 | Sales: 954-733-7555 </li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>