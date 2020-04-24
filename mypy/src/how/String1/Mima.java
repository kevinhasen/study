package how.String1;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-10
 *  Time:    16:28
 *  Blog:     http://yejun.cf
 ******************/
public class Mima {
    public static void main(String[] args) {
        String str="" ;
        for (int i=0;i<3;i++){
            str += mm(1);
        }
        System.out.println("密码:"+str);
        mmpp(str);

    }
    public static String mm(int len){
        char[] chars = new char[len];
        short s;
        for (int i = 0;i<len;i++){
            s=(short) (Math.random()*126);
            while (!(s>=48 && s<=57|| s>=65 && s<=90 || s>=97 && s<=122)){
                s=(short) (Math.random()*126);
                //如果不是就循环
                //判断是否为数字、大小写字母
                //直到生成符合条件的就跳出循环
            }//是数字字母就跳出循环
            chars[i] =(char) s;
        }
        return new String(chars);//新颖
    }
    public static void mmpp(String str){//未完成

    }
}
