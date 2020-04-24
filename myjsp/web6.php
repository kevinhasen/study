<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>更新成绩</title>
    <link rel="stylesheet" type="text/css" href="css/web2.css">
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
            echo $_SESSION['name'],' 欢迎你！进入 <a href="web5.php">个人中心</a><br />';
        }
        $logoutAction = $_SERVER['PHP_SELF']."?doLogout=true";
        if (isset($_GET['doLogout'])){
            unset($_SESSION['name']);
            unset($_SESSION['student']);
            header("Location: web1.php");
        }
        $qk = $_SERVER['PHP_SELF']."?qk=true";
        if (isset($_GET['qk'])){
            $student=$_SESSION['student'];
            include 'mysql.php';
            $sql= "DELETE FROM course WHERE stu_no='$student'";
            if ($conn->query($sql) === TRUE) {
                header("Location: web5.php");
            } else {
                echo "Error: " . $sql . "<br>" . $conn->error;
            }

            $conn->close();
        }
        ?>
        <a href="<?php echo $logoutAction ?>">点击注销</a>
        <a href="web1.php">进入首页</a>
    </div>
</header>
<div class="content">
    <h1 class="content-title">更新成绩</h1>
    <div class="content-form">
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post" >
            <div>
                <input class="kuang" type="text" name="bd" placeholder="输入病毒与防范成绩" required>
            </div>
            <div>
                <input class="kuang" type="text" name="aq" placeholder="输入网络安全成绩" required>
            </div>
            <div>
                <input class="kuang" type="text" name="wl" placeholder="输入网络工程成绩" required>
            </div>
            <div>
                <input class="kuang" type="text" name="php" placeholder="输入php成绩" required>
            </div>
            <input class="content-form-signup"  type="submit" id="submit" name="submit"  value="更新成绩">
            <br>
            <a href="<?php echo $qk ?>" id="qk" name="qk" >删除成绩</a>
        </form>
    </div>
</div>
<?php
if (isset($_POST['submit'])){
    $student=$_SESSION['student'];
    $bd=$_POST['bd'];
    $aq=$_POST['aq'];
    $wl=$_POST['wl'];
    $php=$_POST['php'];
    include 'mysql.php';
    $sql = "UPDATE course SET yingyu='$bd', javaweb='$aq', shuxue='$wl', jisuan='$php' WHERE stu_no='$student'";
    if ($conn->query($sql) === TRUE) {
        header("Location: web5.php");
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }

    $conn->close();
}

?>
</body>
</html>