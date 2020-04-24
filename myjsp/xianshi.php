<?php
//从请求URL地址中获取 q 参数
$q = $_POST[''];
$con = mysqli_connect('localhost','root','1214478365');
if (!$con)
{
    die('无法连接: ' . mysqli_error($con));
}
// 选择数据库
mysqli_select_db($con,"myceshi");
// 设置编码，防止中文乱码
mysqli_set_charset($con, "utf8");
$sql="SELECT * FROM zc WHERE xh = '".$q."'";
$result = mysqli_query($con,$sql);
echo "<table border='1'>
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
?>