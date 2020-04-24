package how2;

import java.io.File;
import java.util.Date;
/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-21
 *  Time:    19:11
 *  Blog:     http://yejun.cf
 *  文件和文件夹都是用File代表
 ******************/
public class Wenjian {
    public static void main(String[] args) {
        File f1 = new File("G://编程//java笔记/测试文档.txt");
        //说明重写了tostring方法
        System.out.println("当前文件是："+f1);

        //文件是否存在
        System.out.println("判断是否存在："+f1.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹："+f1.isDirectory());
        //是否是文件（非文件夹）
        System.out.println("判断是否是文件："+f1.isFile());
        //文件长度
        System.out.println("获取文件的长度："+f1.length());
        //文件最后修改时间
        long time = f1.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+d);
        //设置文件修改时间为1970.1.1 08:00:00
        f1.setLastModified(0);

        //文件重命名
        File f2 =new File("G://编程//java笔记/修改名字.txt");
        f1.renameTo(f2);
        System.out.println("把测试文档.txt改名成了修改名字.txt");

        //注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息
    }
}
