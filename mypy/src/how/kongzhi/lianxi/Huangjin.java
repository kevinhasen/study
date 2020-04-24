package how.kongzhi.lianxi;

public class Huangjin {
    public static final double E = 0.618;
    public static void main(String[] args) {
        double temp=0;//存距离值
        double a=0;
        double b=0;
        for (double i =1;i<=20;i++){//分子
            for (double j = 1;j<20;j +=2){//分母
//                if(0 == i % 2 && 0 == j % 2){
//                    continue;//分子分母不能同时为偶数
//                }
                double z = i/j;//获得当前值
                temp = closeToE(temp,z);//返回距离最小的
                if (temp == z){
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("离黄金分割点（0.618）最近的两个数是：" + a + "/" + b + "=" + temp);
    }
    public static double closeToE(double a,double b){
        return (Math.abs(b - E)>Math.abs(a-E)) ? a:b;
        //当前距离-0.618》旧距离-0.618
    }
}
