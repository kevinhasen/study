package how.kongzhi;

import java.util.Scanner;

public class Jiecheng3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        //int sum = 1;//我之前错误在这。我是0开始
        try {
            System.out.println("请输入一个整数：");
            a = input.nextInt();
        }catch (Exception e){
            System.out.println("输入有误");
        }finally {//必须执行
            input.close();
        }
        System.out.println(new Jiecheng3().digui(a));
    }
    public int digui(int a){
        if (a == 0){
            return 1;//输入0则阶乘为1
        }else {
            return a*digui(a-1);//利用递归n!=n*(n-1)!直到0
        }
    }
}
