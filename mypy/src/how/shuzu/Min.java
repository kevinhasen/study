package how.shuzu;
import java.util.Arrays;
public class Min {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i=0;i<a.length;i++){
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("数组中的各个随机数是:");
//        for (int i:a){
//            System.out.println(i);
//        }
        System.out.println(Arrays.toString(a));
        //这个方法就是依次将数组按照顺序并按照给定的格式输出，就是[a,b,c,d,e,]。
        int min=a[0];
        for (int j=0;j<a.length;j++){
            min=(a[j]>min?min:a[j]);
//            if (a[j]<min){// min=(a[i]>min?min:a[i]);
//                min=a[j];//啧啧，参考，三目运算
            }
        System.out.println("本练习的目的是，找出最小的一个值: "+min);
        }

    }
