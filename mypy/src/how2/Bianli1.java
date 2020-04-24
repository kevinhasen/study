package how2;
import java.io.File;
/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-21
 *  Time:    22:20
 *  Blog:     http://yejun.cf
 *  * 遍历文件夹，并打印最小文件名以及最大文件名
 *  * File中的length()方法只是返回文件的大小而不是文件夹的大小
 *  * 如果File对象指向的是一个路径，使用length()方法返回的数值是未知的
 *  可能用到的知识点有：数组的遍历，数组中元素的比较，IO的文件常用方法。
 *  使用递归进行文件夹遍历。
 ******************/
public class Bianli1 {
    static int countFile= 0;
    static int subfolder =0;
    static long min = Integer.MAX_VALUE; //值为2的31次方-1的常量，int类型能表示的最大值？？？
    static long max = 0;
    static File minFileName =null;
    static File maxFileName =null;
    public static void main(String[] args) {
        File f =new File("G:/壁纸");
        showAllFile(f);
        System.out.println("文件数目为："+countFile+"个");
        System.out.println("子文件夹数目为："+subfolder+"个");
        System.out.println("最大文件为："+max+"字节");
        System.out.println("最小文件为："+min+"字节");
        System.out.println("最大文件为："+maxFileName);
        System.out.println("最小文件为："+minFileName);
    }
    //递归遍历文件夹
    public static void showAllFile(File file){
        //C盘可能有无访问权限的文件夹，如果遇到了，自定义一个异常抛出
        //先判断是文件还是文件夹，是文件把他们用listFile输出为文件数组
        if(file.isFile()){
            // System.out.println("--文件名："+file);
            countFile++;//文件数加一
            if(max<file.length()) {
                max=file.length();
                maxFileName=file;
            }

            if(file.length()!=0 && min>file.length()) {
                min=file.length();
                minFileName=file;
            }
        }else{
            //System.out.println("【文件夹】："+file);
            subfolder++;//文件夹数量+1
            //获取当前文件夹下的所有文件，包括文件夹
            File[] files=file.listFiles();

            //对当前文件夹下的文件进行遍历，此时需用重复上述操作：判断是否为文件，若是，直接输出；
            //若不是，需要再次遍历
            //此时就需要递归了
            for (File file2 : files) {
                showAllFile(file2);
            }
        }
    }
    }
