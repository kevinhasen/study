import java.util.Random;
import java.util.Scanner;

public class cai {
    public static void main(String[] args) {
        int i = 0;
        int j;
        j = (int) (Math.random() * 100);
        while (i < 10) {
                System.out.println("请输入你要猜的数：");
                Scanner sc= new Scanner(System.in);
                int k = sc.nextInt();
                if (j != k) {
                    if (j > k) {
                        System.out.println("你猜得数小了");
                    } else {
                        System.out.println("你猜得数大了");
                    }
                } else {
                    System.out.println("恭喜你猜对了！");
                    return;
                }
                i++;
        }
        System.out.println("你的猜数次数已经用完了！");
    }
}
