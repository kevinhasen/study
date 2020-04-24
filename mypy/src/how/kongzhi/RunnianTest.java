package how.kongzhi;

import java.util.Scanner;

public class RunnianTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Runnian rn = new Runnian();
        System.out.println("请输入年份：");
        rn.n = sc.nextInt();
        rn.show();
        sc.close();
        System.out.println();
        String str = new String();
    }

}
