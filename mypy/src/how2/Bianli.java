package how2;

import java.io.File;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-21
 *  Time:    19:35
 *  Blog:     http://yejun.cf
 ******************/
public class Bianli {//未完成

    public static void main(String[] args) {
        long max = 0;
        long min = Integer.MAX_VALUE;
        File minFileName = null;
        File maxFileName = null;
        File f = new File("G:/壁纸");

        for (int i= 0;i<f.length();i++){
            if (f.isFile()) {

                if (max < f.length()) {
                    max = f.length();
                    maxFileName = f;
                }
                if(f.length()!=0 && min>f.length()) {
                    min=f.length();
                    minFileName=f;
                }
            }
        }

        System.out.println("最大文件为："+max+"字节");
        System.out.println("最小文件为："+min+"字节");
        System.out.println("最大文件为："+maxFileName);
        System.out.println("最小文件为："+minFileName);
    }
}