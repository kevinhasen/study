package how.String1;

import java.util.Random;

public class Zifu {//要点
    public static void main(String[] args) {
//            String[] s = new String[5];
//            Random random = new Random();
//        for (int i =0;i<s.length;i++){
//            for (int j =48;j<58;j++){
//                s[i] =String.valueOf(j);
//                System.out.println();
//            }
//
//        }
        System.out.println("产生一个随机字符串");
        char[] cs=new char[5];
        short s;
        for(int i=0;i<cs.length;i++){
            s=(short) (Math.random()*126);//ASCII码，但未过滤非字母字符情况
            while(!(48<=s && s<=57||65<= s&&s <=90||97<=s && s<=122)){//判断是否为数字、大小写字母
                s=(short) (Math.random()*126);
            }//用while判断
            cs[i]=(char)s;
//            System.out.println(cs[i]);//字符数组
        }
        String string=new String(cs);//字符串
        System.out.println(string);
    }
}
