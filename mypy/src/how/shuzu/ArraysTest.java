package how.shuzu;
import java.util.Arrays;
public class ArraysTest {
    public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int c[] = new int[] { 18, 62, 68, 82, 65, 8 };
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 3);//数组复制
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        //转换为字符串
//        String content = Arrays.toString(a);
//        System.out.println(content);
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        //排序
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));
        //搜索
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的下标位置:"+Arrays.binarySearch(a, 62));
        //判断是否相同
        //比较两个数组的内容是否一样
        //第二个数组的最后一个元素是8，和第一个数组不一样，所以比较结果是false
        System.out.println(Arrays.equals(a, c));
        //填充,使用同一个值，填充整个数组
        int d[] = new int[10];
        Arrays.fill(d, 5);
        System.out.println(Arrays.toString(d));
    }
}
