package how.kongzhi;

public class Qigai {
    public static void main(String[] args) {
        int sum = 1;
        int s=1;
        for (int i = 1; i<10; i++){
        sum = sum*2;
        s +=sum;
        }
        System.out.println("收入："+s);
    }
}
