<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="css/web1.css">
</head>
<body>
<header>
    <div class="header-line"></div>
</header>
<div class="content">
    <img class="content-logo" src="images/icon.png" />
    <h1 class="content-title">创建账户</h1>
    <div class="content-form">
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post">
            <div>
                <input class="user" type="text" id="student" name="student" placeholder="请输入学号" required>
            </div>
            <div>
                <input class="user" type="text" id="username" name="username" placeholder="请输入姓名" required>
            </div>
            <div>
                <input class="password" type="password" id="password" name="password" placeholder="请输入密码" required>
            </div>
            <div>
                <input class="yan" type="text" name="suiji" id="suiji" placeholder="请输入验证码" required>
                <img id="code" title="点击刷新" src="suiji.php" alt="验证码不存在"  onclick="this.src='suiji.php?'+Math.random();"/>
            </div>
            <div>
                <input class="content-form-signup" type="submit" name="submit" id="submit" value="创建账户">
            </div>
        </form>
    </div>
    <b class="content-login-description">已经拥有账户？</b>
    <a class="content-login-link" href="web3.php">点击登录</a>
    <b class="content-login-description">或者</b>
    <a class="content-login-link" href="web1.php">跳转主页</a>
</div>
<?php
//生成会话
if (!isset($_SESSION)){
    session_start();
}
if (isset($_POST['submit'])){
    $student=$_POST['student'];
    $username=$_POST['username'];
    $password=$_POST['password'];
    $suiji=$_POST['suiji'];
    include 'mysql.php';
    $sql = "INSERT INTO stu (stu_no, stu_user, stu_password) VALUES ('$student','$username','$password')";
    if(strtolower($_SESSION['suiji'])==strtolower($suiji)){
        if ($conn->query($sql) === TRUE) {
            //保存会话
            $_SESSION['name']=$username;
            $_SESSION['student']=$student;
            header("Location: web4.php");
        } else {
            echo "Error: " . $sql . "<br>" . $conn->error;
        }
    }else{
        echo "<script> alert('验证码不正确') </script>";
    }


    $conn->close();
}

?>
</body>
</html>
