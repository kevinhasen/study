package how.kongzhi.lianxi;

public class Shuixian {
    public static void main(String[] args) {
        int sum;
        // 获取百位数
        //            b = i/100;
        //
        //            // 获取十位数
        //            s = i/10 % 10;
        //
        //            // 获取个位数
        //            g = i%10;
        for (int a=1;a<=9;a++){//100为起点
            for (int b =0;b<9;b++){
                for (int c =0;c<9;c++){
                 sum = a*100+b*10+c;
                 if (sum == a*a*a+b*b*b+c*c*c){
                     System.out.println(sum);
                 }
                }
            }
        }
    }
}
