package how.String1;
import java.util.Scanner;
public class Daxiao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入字符串：");
        String str = input.next();
        char[] cs = str.toCharArray();
        for (char i:cs){
            xuan(i);
        }
    }
    public static void xuan(char i){
        if (i>='A' && i<='Z'){
            System.out.print(i);
        }else if(i>='0' && i<='9'){
            System.out.print(i);
        }
    }
}
