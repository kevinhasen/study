<?php
/**
 * Created by PhpStorm.
 * User: silence
 * Date: 2018/11/17
 * Time: 20:29
 */
// 创建连接
$conn = new mysqli("localhost", "root", "1214478365", "student");
if ($conn->connect_error) {
    die("连接失败: " . $conn->connect_error);
}
?>