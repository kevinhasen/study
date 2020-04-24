<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>成绩显示</title>
<link rel="stylesheet" type="text/css" href="css/web3.css">
</head>
<body>
<header>
    <div class="header-line"></div>
    <div>
        <?php
        //生成会话
        session_start();
        if (!isset($_SESSION['student'])){
//    echo "<script>location.href='web1.php'</script>"; // JS 跳转
            header("Location: web1.php");
            exit();
        }else{
            echo $_SESSION['name'],' 欢迎你！<br>';
        }
        $logoutAction = $_SERVER['PHP_SELF']."?doLogout=true";
        if (isset($_GET['doLogout'])){
            unset($_SESSION['name']);
            unset($_SESSION['student']);
            header("Location: web1.php");
        }
        ?>
        <a class="content-login-link" href="<?php echo $logoutAction ?>">点击注销</a>--
        <a class="content-login-link" href="web1.php">返回首页</a>
    </div>
</header>
<div class="content">
    <h1 class="content-title">成绩显示:</h1>
    <div>
        <?php
        if (isset($_SESSION['student'])){
            $student=$_SESSION['student'];
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
</body>
</html>
