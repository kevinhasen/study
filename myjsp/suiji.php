<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2018/10/26
 * Time: 8:46
 * 返回给定字符串的长度
 */
function ran_text($count,$similar=false){
    //创建数组
    $char=array_flip(array_merge(range(0,9),range('A','Z')));
    //删除容易混淆的单词
    if ($similar){
        unset($char[0],$char[1],$char[2],$char['I'],$char['O'],$char['Z']);
    }
    //生成随机字符文本
    for ($i=0,$text='';$i<$count;$i++){
        $text .= array_rand($char);
    }
    return $text;
}
//生成会话
if (!isset($_SESSION)){
    session_start();
}
//创建65x20画布
$width=65;
$height=20;
$image=imagecreate($width,$height);
//分配颜色
$bg_color=imagecolorallocate($image,0x33,0x66,0xff);
//取得随机字符串
$text=ran_text(5);

//定义字体位置
$font=5;
$x = imagesx($image)/2 - strlen($text)*imagefontwidth($font)/2;
$y = imagesy($image)/2 - imagefontheight($font)/2;
//输出字符到图片
$fg_color=imagecolorallocate($image,0xff,0xff,0xff);
imagestring($image,$font,$x,$y,$text,$fg_color);
//保存会话
$_SESSION['suiji']=$text;
//输出图像
header('Content-type:image/png');//声明这是图片
imagepng($image);
imagedestroy($image);
?>