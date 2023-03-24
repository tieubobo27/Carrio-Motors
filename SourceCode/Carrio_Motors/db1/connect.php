<?php
    require_once('config.php');

    $conn = mysqli_connect(HOST, USERNAME, PASSWORD,DB);
    mysqli_set_charset($conn, 'utf8');
?>