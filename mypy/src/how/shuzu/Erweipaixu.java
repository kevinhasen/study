package how.shuzu;
import java.util.Arrays;
public class Erweipaixu {
    public static void main(String[] args) {///报错
        int a[][] = new int[5][8];
        int b[] = new int[40];
        int c[][] = new int[5][8];
        int k = 0;
        for (int i = 0;i<a.length;i++){
            for (int j = 0; j<a[i].length;j++){//重要。老是忘记a的
                a[i][j] = (int) (Math.random() * 100);
                b[k] = a[i][j];
                k++;
            }
        }
        //当执行Arrays.toString的时候相当于遍历数组，并且输出数组的元素，
        // 但是这个数组的元素是数组，所以这里输出的是地址。
//        System.out.println(Arrays.toString(a));
        System.out.println("愿数组"+Arrays.deepToString(a));
        Arrays.sort(b);
        System.out.println("排序后"+Arrays.toString(b));
        for (int i = 0;i<c.length;i++){
            for (int j = 0; j<c[i].length;j++){//重要。老是忘记a的
              c[i][j] = b[k];
                k++;
            }
        }
        System.out.println("转回原二维数组"+Arrays.deepToString(c));
    }
}
