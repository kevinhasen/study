package how.String1;

import java.util.Scanner;

public class Huanghe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入地名：");
        String dm = input.next();
        System.out.println("输入公司类型：");
        String lx = input.next();
        System.out.println("输入公司名称：");
        String mc = input.next();
        System.out.println("输入老板名称：");
        String lb = input.next();
        System.out.println("输入金额：");
        double je = input.nextDouble();
        System.out.println("输入产品：");
        String cp = input.next();
        System.out.println("输入价格单位：");
        String dw = input.next();
        String sc = "%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，" +
                "欠下了%.2f个亿，带着他的小姨子跑了!我们没有办法，拿着%s抵工资!" +
                "原价都是一%s多、两%s多、三%s多的%s，现在全部只卖二十块，统统只要二十块!" +
                "%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.printf(sc,dm,lx,mc,lb,je,cp,dw,dw,dm,cp,lb);
    }
}
