<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="css/web.css">
</head>
<body>
<header>
    <div class="header-line"></div>

</header>
<div class="content">
    <img class="content-logo" src="images/icon.png">
    <div class="content-form">
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post">
            <input class="kuang" type="text" name="student" id="student" placeholder="请输入学号" required>
            <input class="content-form-signup" type="submit" name="submit" id="submit" value="点击搜索">
        </form>
        <?php
        //生成会话
        session_start();
        if (!isset($_SESSION['student'])){
            echo <<<Eof
        <b class="content-login-description">没有账户？</b>
        <a class="content-login-link" href="web2.php">点击注册</a>--
        <a class="content-login-link" href="web3.php">点击登录</a>
Eof;
        }else{
            echo $_SESSION['name'],' 欢迎你！进入 <a href="web5.php">个人中心</a> 或者  ';
            echo '<a href="web6.php">更新成绩</a>';
        }
        $logoutAction = $_SERVER['PHP_SELF']."?doLogout=true";
        if (isset($_GET['doLogout'])){
            unset($_SESSION['name']);
            unset($_SESSION['student']);
            header("Location: web1.php");
        }
        ?>
        <div>
            <?php
            if (isset($_POST['submit'])){
                $student=$_POST['student'];
                include 'mysql.php';
                $sql="SELECT * FROM course WHERE stu_no = '".$student."'";
                $result = $conn->query($sql);
                echo "<table id='table-3'>
<tr>
<th>病毒与防范</th>
<th>网络安全</th>
<th>网络工程</th>
<th>php</th>
</tr>";

                while($row = $result->fetch_assoc())
                {
                    echo "<tr>";
                    echo "<td>" . $row['yingyu'] . "</td>";
                    echo "<td>" . $row['javaweb'] . "</td>";
                    echo "<td>" . $row['shuxue'] . "</td>";
                    echo "<td>" . $row['jisuan'] . "</td>";
                    echo "</tr>";
                }
                echo "</table>";

                $conn->close();
            }
            ?>
        </div>
    </div>
</div>


</body>
</html>