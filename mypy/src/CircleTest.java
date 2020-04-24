import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle ci = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入面积：");
        ci.mianji(sc.nextDouble());
        System.out.println("输入周长：");
        ci.zhouchang(sc.nextDouble());
    }
}
