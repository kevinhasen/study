<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="css/web1.css">
</head>
<body>
<header>
    <div class="header-line"></div>
</header>
<div class="content">
    <img class="content-logo" src="images/icon.png" />
    <h1 class="content-title">登录</h1>
    <div class="content-form">
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post">
            <div>
                <input class="user" type="text" id="student" name="student" placeholder="请输入学号" required>
            </div>
            <div>
                <input class="password" type="password" id="password" name="password" placeholder="请输入密码" required>
            </div>
            <div>
                <input class="content-form-signup" type="submit" id="submit" name="submit" value="点击登录">
            </div>
        </form>
    </div>
    <b class="content-login-description">没有账户？</b>
    <a class="content-login-link" href="web2.php">点击注册</a>
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
    $password=$_POST['password'];
    include 'mysql.php';
    $sql = "SELECT stu_no, stu_password,stu_user FROM stu";
    $result = $conn->query($sql);
    for ($i=0;$i<=$result->num_rows;$i++){
        $row = $result->fetch_assoc();
        if ($row['stu_no']==$student and $row['stu_password']==$password){
           //保存会话
           $_SESSION['student']=$row['stu_no'];
           $_SESSION['name']=$row['stu_user'];
           header("Location: web5.php");
           break;
       }
       if ($i==$result->num_rows and $row['stu_no']!=$student and $row['stu_password']!=$password){
           echo "<script> alert('账户或密码错误') </script>";
       }
    }

    $conn->close();
}
?>
</body>
</html>
