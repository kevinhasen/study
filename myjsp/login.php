<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>这是登录界面</title>
</head>
<body style="text-align: center">
<form method="post" action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']); ?>">
    用户名：<input type="text" id="zh" name="zh" required>
    <br>
    密码：<input type="password" id="mm" name="mm" required>
    <br>
    验证：<img id="code" title="点击刷新" src="suiji.php" alt="验证码不存在"  onclick="this.src='suiji.php?'+Math.random();"/>
    <br>
    输入验证码：<input  type="text" name="suiji" id="suiji">
    <br>
    <input type="submit" id="submit" name="submit" value="登录">
</form>
<?php
session_start();
if (isset($_POST["submit"])){
    $zh=$_POST['zh'];
    $mm=$_POST['mm'];
    $suiji=$_POST['suiji'];
    if ($zh=="123456" && $mm=="mima"){
        echo "账户密码正确"."<br>";
        if(strtolower($_SESSION['suiji'])==strtolower($suiji)){
            echo "验证码正确"."<br>";
        }else{
            echo "验证码不正确"."<br>";
        }
    }else{
        echo "账户密码错误"."<br>";
    }
}


?>
</body>
</html>