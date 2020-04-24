package how.kongzhi;

import java.util.Scanner;

public class Jiecheng2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int sum = 1;//我之前错误在这。我是0开始
        try {
            System.out.println("请输入一个整数：");
            a = input.nextInt();
        }catch (Exception e){
            System.out.println("输入有误");
        }finally {//必须执行
            input.close();
        }
        while (a>0){
            sum *= a;
            a--;
        }
        System.out.println("阶乘："+sum);//如果是负值说明数据溢出。超过了int的范围
    }
}
