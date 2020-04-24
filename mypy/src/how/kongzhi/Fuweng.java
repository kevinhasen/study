package how.kongzhi;

public class Fuweng {
    public static void main(String[] args) {
        double sum = 0;//总收入
        int i;//年数
        for ( i = 1; i < 100; i++) {
            sum=(sum+12000)*1.2;
            if(sum>=1000000) {
                break;
            }
        }
        System.out.println(i+"年后，收益达到"+(int)sum+"元");
    }
}
