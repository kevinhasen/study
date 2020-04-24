<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>更新成绩</title>
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
/*字体设置*/
.content-title {
    margin: 10px 0 25px 0;
    font-size: 2em;
    color: #747474;
    font-weight: normal;
}
/*设置子元素*/
.content-form {
    width: 100%;
    padding: 10px 0 20px;
}
/*下外边距*/
.content-form form div {
    margin-bottom: 18px;
}
/*设置子元素孙类*/
.content-form form .kuang{
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
         String no = (String)session.getAttribute("stu");
       %>
       <%
           if(user == null || "".equals(user)){//用户没有登录
               %>
                 <jsp:forward page="index.jsp"></jsp:forward>
               <%
           }else{//用户登录过
               %>
                   欢迎：<%=user %>
                   <a class="content-login-link" href="${pageContext.request.contextPath }/servlet/Logout">注销</a>
                    <a class="content-login-link" href="${pageContext.request.contextPath }/index.jsp">主页</a>
               <%
           }
        %></div>
    </header>
   <div class="content">
    <h1 class="content-title">更新成绩</h1>
       <div class="content-form">
        <form action="<%=path %>/servlet/Update?order=update" method="post" name="choose_course">
            <div>
            <input class="kuang" type="text" name="javaweb" placeholder="输入javaweb成绩">
            </div>
            <div>
            <input class="kuang" type="text" name="computer" placeholder="输入计算机基础成绩">
            </div>
            <div>
            <input class="kuang" type="text" name="english" placeholder="输入大学英语成绩">
            </div>
            <div>
            <input class="kuang" type="text" name="math" placeholder="输入高等数学成绩">
            </div>
            <div>
            <input style="display: none;" type="text" name="student_no"  value=<%=no %>>
            </div>
            <input class="content-form-signup" type="submit" value="更新成绩">
       </form> 
       </div>
   </div>
    </body>
</html>
