package ceshi.zuoye;

import java.util.Scanner;

/********************
 * 两点间距离AB的平方为
 * AB²=(x1-x2)²+(y1-y2)²
 * 算出后开方得到距离AB。
 ******************/
public class Juli {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        Position p = new Position();
        try {
            System.out.println("请输入x坐标：");
            p.setX(input.nextDouble());
            System.out.println("请输入y坐标：");
            p.setY(input.nextDouble());
        }catch (Exception e){
            System.out.println("输入有误");
        }finally {
            input.close();
        }
        System.out.println(p.compareTo());
    }

}
