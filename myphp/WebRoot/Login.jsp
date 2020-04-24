<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>登录</title>
        <style type="text/css">
body {
font-family: "微软雅黑";
background: #f4f4f4;
}
/*设置蓝色条纹线*/
.header-line {
width: 100%;
height: 4px;
background: #0dbfdd;
}
/*文本对齐为居中*/
.content {
    width: 40%;
    margin: 80px auto 0;
    text-align: center;
}
/*设置logo*/
.content-logo {
    width: 80px;
    height: 80px;
}
/*logo字体设置*/
.content-title {
    margin: 10px 0 25px 0;
    font-size: 2em;
    color: #747474;
    font-weight: normal;
}
/*设置表单子元素*/
.content-form {
    width: 100%;
    padding: 35px 0 20px;
    border: 1px solid  #dedede;
    background: #fff;
}
/*设置子元素*/
.content-form form div {
    margin-bottom: 18px;
}
/*设置子元素*/
.content-form form .user,
.content-form form .password {
    width: 80%;
    height: 20px;
    padding: 15px;
    font-size: 1em;
    border: 1px solid  #cccbcb;
    border-radius: 8px;
    letter-spacing: 2px;
}
/*加入轮廓蓝色*/
.content-form form input:focus {
    outline: none;
    -webkit-box-shadow: 0 0 5px #0dbfdd;
            box-shadow: 0 0 5px #0dbfdd;
}
/*鼠标样式*/
.content-form-signup {
    width: 85%;
    margin: 0 auto;
    padding: 10px;
    border: 1px solid  #cccbcb;
    border-radius: 8px;
    font-size: 1em;
    font-weight: bold;
    color: #fff;
    background: #0dbfdd;
    cursor: pointer;
}
/*鼠标指针浮动样式*/
.content-form-signup:hover {
    background: #0cb3d0;
}


/*表单外字体*/
.content-login-description {
    margin-top: 25px;
    line-height: 2;
    color: #747474;
    font-size: 1.0rem;
}
/*按钮样式*/
.content-login-link {
    font-size: 20px;
    color: #0dbfdd;
    text-decoration: none;
    letter-spacing: 2px;
}
    </style>
    </head>
    <body>
        <header>
            <div class="header-line"></div>
        </header>
        <div class="content">
            <img class="content-logo" src="http://o8nqkm0ac.bkt.clouddn.com/form_logo.png" />
            <h1 class="content-title">登录</h1>
        <div class="content-form">
            <form action="<%=path %>/servlet/Login" method="post">
                <div>
                    <input class="user" type="text" name="student_no" placeholder="请输入学号">
                </div>
            <div>
                <input class="password" type="password" name="student_Password" placeholder="请输入密码">
            </div>
            <div>
                <input class="content-form-signup" type="submit" value="点击登录">
            </div>
        </form>
        </div>
        <div class="content-login-description">没有账户？</div>
        <div>
            <a class="content-login-link" href="Register.jsp">注册</a>
            <a class="content-login-link" href="index.jsp">主页</a>
        </div>
        </div>
    </body>
</html>
