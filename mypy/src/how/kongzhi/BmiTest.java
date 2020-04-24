package how.kongzhi;

import java.util.Scanner;

public class BmiTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bmi yj = new  Bmi();
        System.out.println("请输入体重(m)：");
        yj.tz = sc.nextDouble();
        System.out.println("输入身高(kg)：");
        yj.sg = sc.nextDouble();
        yj.show();
    }
}
