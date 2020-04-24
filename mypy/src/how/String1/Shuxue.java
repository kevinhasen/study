package how.String1;
/*
* 统计找出100以内，一共有多少质数
*质数概念: 只能被1和自己整除的数
* 2是最小的质数
* 25
* */
public class Shuxue {//未完善
    public static void main(String[] args) {
        int count = 0;
        for (int i =2; i<100;i++){
            if (zs(i)){
                count++;
            }
        }
        System.out.println(count);
     }
     public static boolean zs(int i){
        for (int j=2;j<=Math.sqrt(i);j++){//失误原因 ，等于号！！！！没加
            if(i%j == 0){
                return false;
            }
        }
        return true;
     }
}