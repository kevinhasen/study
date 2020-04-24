<?php
$q = isset($_GET["q"]) ? intval($_GET["q"]) : '';
if(empty($q)) {
    echo '请选择一个网站';
    exit;
}

$con = mysqli_connect('localhost','root','1214478365');
if (!$con)
{
    die('连接失败: ' . mysqli_error($con));
}
// 选择数据库
mysqli_select_db($con,"myceshi");
// 设置编码，防止中文乱码
mysqli_set_charset($con, "utf8");

$sql="SELECT * FROM zc WHERE id = '".$q."'";

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