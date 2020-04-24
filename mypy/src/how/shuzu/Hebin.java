package how.shuzu;
import java.util.Arrays;
public class Hebin {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];
        for (int i =0;i<a.length;i++){
            a[i] = (int) (Math.random() * 10);
            b[i] = (int) (Math.random() * 10);
        }
        System.out.println("数组a的内容"+Arrays.toString(a));
        System.out.println("数组b的内容"+Arrays.toString(b));
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,5,b.length);
        System.out.println("数组c的内容"+Arrays.toString(c));
    }
}
