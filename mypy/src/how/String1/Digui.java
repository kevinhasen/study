package how.String1;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-10
 *  Time:    17:13
 *  Blog:     http://yejun.cf
 ******************/
public class Digui {//以后待看
    public static boolean found = false;
    public static void main(String[] args) {
        String passwd = stringRandom(3);//随机生成密码
        System.out.println("密码是："+passwd);
        char guessPasswd[] = new char[passwd.length()];
        generatePasswd(guessPasswd, passwd);
    }
    public static void generatePasswd(char guessPasswd[],String passwd){
        generatePasswd(guessPasswd,0, passwd);
    }
    public static void generatePasswd(char guessPasswd[],int index,String passwd){
        if(found){
            return ;
        }
        for(short i = '0';i<'z';i++){
            if (!Character.isLetterOrDigit(i)) {//如果i不是字母或者，就跳过当前i
                continue;
            }
            char c = (char)i;
            guessPasswd[index] = c;
            if(c == passwd.charAt(index)){
                if(index == passwd.length()-1){
                    System.out.println("找到了,密码是："+new String(guessPasswd));
                    return ;
                }else{
                    generatePasswd(guessPasswd,index+1, passwd);//此处递归
                }
            }
        }
    }
    public static String stringRandom(int length) {//生成密码
        String ran = "";
        for(short i = 65;i<91;i++){
            ran += Character.toString((char)i);
            //返回表示此 Character 值的 String 对象。
        }
        for(short i = 97;i<123;i++){
            ran += Character.toString((char)i);
            //返回表示此 Character 值的 String 对象。
        }
//        for(short i = 0;i<=9;i++){
//            ran += Integer.toString(i);
//            //返回表示此 Character 值的 String 对象。
//        }
        String str = "";
        for(int i = 0;i<length;i++){
            int num = (int)Math.round(Math.random()*ran.length());
            str += ran.charAt(num);
        }
        return str;
    }
}
