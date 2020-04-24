package how.shuzu;
import java.util.Arrays;
public class Maxpaixu {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,4,6};//数组
        Arrays.sort(arr);//Arrays排序,从小到大
        System.out.println(Arrays.toString(arr));
        System.out.println("最大值:"+arr[arr.length-1]);//0下标就是最小值 length-1就是最大值，长度是6，最大值下标是5
        //        prt(Arrays.toString(arr));//toString输出就可以了,调用Arrays.toString将数组a的值转换为字符串并 显示出来
//       节省了上面的循环步骤，而一步输出
        //这个方法就是依次将数组按照顺序并按照给定的格式输出，就是[a,b,c,d,e,]。
// prt("最大值:"+arr[arr.length-1]);//取最大值
    }
//    public static void prt(String num){
//        System.out.println(num);
//    }
    }
