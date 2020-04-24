<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>主页</title>
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
    width: 150px;
    height: 80px;
}
/*设置表单子元素*/
.content-form {
    width: 100%;
    padding: 10px 0 20px;
}
/*设置孙类*/
.content-form form .kuang{
    width: 80%;
    height: 20px;
    padding: 15px;
    font-size: 1em;
    border: 1px solid  #cccbcb;
    border-radius: 8px;
    letter-spacing: 2px;
}
/*输入框加入轮廓蓝色*/
.content-form form input:focus {
    outline: none;
    -webkit-box-shadow: 0 0 5px #0dbfdd;
            box-shadow: 0 0 5px #0dbfdd;
}
/*鼠标样式*/
.content-form-signup {
    width: 85%;
    margin: 2px auto;
    padding: 10px;
    border: 1px solid  #cccbcb;
    border-radius: 8px;
    font-size: 1em;
    font-weight: bold;
    color: #fff;
    background: #0dbfdd;
    cursor: pointer;
    letter-spacing: 2px;
}
/*链接样式*/
.content-login-link {
    left: 100px;
    right: 100px;
    font-size: 15px;
    color: #0dbfdd;
    text-decoration: none;
    letter-spacing: 2px;
}
</style> 
</head>
<body>
    <header>
        <div class="header-line"></div>
        <div> <%
          //获取session标记
        String user = (String)session.getAttribute("user");
       %>
       <%
           if(user == null || "".equals(user)){//用户没有登录
               %>
                   <a class="content-login-link" href="${pageContext.request.contextPath }/Login.jsp">登录</a>
                   <a class="content-login-link" href="${pageContext.request.contextPath }/Register.jsp">注册</a>
               <%
           }else{//用户登录过
               %>
                   欢迎：<%=user %>
                   <a class="content-login-link" href="${pageContext.request.contextPath }/servlet/Logout">注销</a>
                    <a class="content-login-link" href="${pageContext.request.contextPath }/Update.jsp">更新成绩</a>
               <%
           }
        %></div>
    </header>
   <div class="content">
        <img class="content-logo" src="http://o8nqkm0ac.bkt.clouddn.com/sousuo.png">
       <div class="content-form">
        <form action="<%=path %>/servlet/Show" method="post">
            <input class="kuang" type="text" name="student_no" placeholder="请输入学号">
            <input class="content-form-signup" type="submit" value="点击搜索">
       </form>
       </div>
   </div>
</body>
</html>