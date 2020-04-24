package how.kongzhi;

import java.util.Scanner;

public class Jiecheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = 0;
        int i = 1;
        int j = 1;
        try {
            System.out.println("输入一个整数：");
            z = sc.nextInt();
        }catch (Exception e){
            System.out.println("输入有误");
        }
        while (i<z+1){//一直乘到小于用户输入的数值加一
            j = j*i;//从1开始乘
            i++;//计数
        }
        System.out.println("阶乘是："+j);
        sc.close();
    }
}
