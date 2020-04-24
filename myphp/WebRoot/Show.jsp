<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <base href="<%=basePath%>" />
        <title>成绩显示</title>
        
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    
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
    width: 60%;
    margin: 80px auto 0;
}
/*字体设置*/
.content-title {
    margin: 10px 0 25px 0;
    font-size: 2em;
    color: #747474;
    font-weight: normal;
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
#table-3 thead, #table-3 tr {
border-top-width: 1px;
border-top-style: solid;
border-top-color: rgb(235, 242, 224);
}
#table-3 {
border-bottom-width: 1px;
border-bottom-style: solid;
border-bottom-color: rgb(235, 242, 224);
}

#table-3 td, #table-3 th {
padding: 20px 20px;
font-size: 12px;
font-family: Verdana;
text-align: center;
color: rgb(149, 170, 109);
}

#table-3 tr:nth-child(even) {
background: rgb(230, 238, 214)
}
#table-3 tr:nth-child(odd) {
background: #FFF
}
</style> 
    </head>
    <body>
<header>
        <div class="header-line"></div>
        <div><a class="content-login-link" href="index.jsp">返回查询</a></div>
    </header>
   <div class="content">
    <h1 class="content-title">成绩显示:</h1>
    <div id="table-3">
        <table>
    <tr>
        <th>javaweb</th>
        <th>计算机基础</th>
        <th>大学英语</th>
        <th>高等数学</th>
        <th>学生学号</th>
    </tr>
<c:forEach var="row" items="${listProjectName}">
    <tr>
        <td><c:out value="${row.javaweb}"/></td>
        <td><c:out value="${row.computer}"/></td>
        <td><c:out value="${row.english}"/></td>
        <td><c:out value="${row.math}"/></td>
        <td><c:out value="${row.student_no}"/></td>
    </tr>
</c:forEach>
</table>
    </div>
   </div>
    </body>
</html>
