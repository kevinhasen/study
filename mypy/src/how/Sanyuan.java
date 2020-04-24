package how;

import java.util.Scanner;

public class Sanyuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("今天是周几？：");
        int z = sc.nextInt();
        String a = z>5 ? "周末":"工作日";
        System.out.println("今天是"+a);
    }
}
