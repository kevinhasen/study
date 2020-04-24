package how.String1;

/**
 * Created by  IntelliJ  Idea 2018.1
 * Author:  Kevin Hasen
 * Date:    2018-05-09
 * Time:    21:57
 * Blog:     http://yejun.cf
 */
public class Zifu1 {
    public static void main(String[] args) {
        char[] cs = new char[5];
        short s;
        for (int i=0;i<cs.length;i++){
            s=(short) (Math.random()*126);
            while (!(s>=48 && s<=57|| s>=65 && s<=90 || s>=97 && s<=122)){
                s=(short) (Math.random()*126);
                //如果不是就循环
                //判断是否为数字、大小写字母
                //直到生成符合条件的就跳出循环
            }//是数字字母就跳出循环
            cs[i] = (char) s;
        }
        String str = new String(cs);
        System.out.println(str);
    }

}
