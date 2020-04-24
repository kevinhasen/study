<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="css/ceshi.css">

</head>
<body>
<div class="dowebok">
    <div onclick="document.getElementById('id01').style.display='block' " class="logo"></div>
    <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
        <div class="form-item">
            <input type="text" id="username" name="username" placeholder="输入学号" value="<?php if (isset($_POST['submit1'])) echo $_POST['username']; ?>"  required>
        </div>
        <div class="form-item">
            <button id="submit1" name="submit1" value="submit">搜索</button>
        </div>
    </form>
    <div class="hr"></div>

    <div id="show">
        <?php
        if (isset($_POST['submit1'])){
            $xuehao=$_POST['username'];
            $con = mysqli_connect('localhost','root','1214478365');
            if (!$con)
            {
                die('无法连接: ' . mysqli_error($con));
            }
// 选择数据库
            mysqli_select_db($con,"myceshi");
// 设置编码，防止中文乱码
            mysqli_set_charset($con, "utf8");
            $sql="SELECT * FROM zc WHERE xh = '".$xuehao."'";
            $result = mysqli_query($con,$sql);
            echo "<table id='table-3'>
<tr>
<th>学号</th>
<th>姓名</th>
<th>专业</th>
</tr>";

            while($row = mysqli_fetch_array($result))
            {
                echo "<tr>";
                echo "<td>" . $row['xh'] . "</td>";
                echo "<td>" . $row['xm'] . "</td>";
                echo "<td>" . $row['zy'] . "</td>";
                echo "</tr>";
            }
            echo "</table>";

            mysqli_close($con);
        }
        ?>
    </div>

</div>

<div id="id01" class="modal">

    <form class="modal-content animate" method="post" action="xianshi.php">

        <div class="login-wrap">

            <div class="login-html">
                <span onclick="document.getElementById('id01').style.display='none'" class="close" title="关闭">&times;</span>
                <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">点击登录</label>
                <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">点击注册</label>
                <div class="login-form">

                    <div class="sign-in-htm">

                        <div class="form-item">
                            <input id="username1" name="xuehao" type="text"  placeholder="输入学号" required>
                        </div>

                        <div class="form-item">
                            <input id="mm" name="mima" type="text"  placeholder="输入密码" required>
                        </div>

                        <div class="form-item">
                            <button id="submit2" name="submit2" value="submit">登陆</button>
                        </div>

                    </div>

                    <div class="sign-up-htm">

                        <div class="form-item">
                            <input id="username2" name="xuehao" type="text"  placeholder="输入学号" required>
                        </div>

                        <div class="form-item">
                            <input id="mm1" name="mima" type="text"  placeholder="输入密码" required>
                        </div>

                        <div class="form-item">
                            <button id="submit2" name="submit2" value="submit">注册</button>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </form>

</div>
<script>
    // 获取模型
    var modal = document.getElementById('id01');

    // 鼠标点击模型外区域关闭登录框
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
</script>

</body>
</html>