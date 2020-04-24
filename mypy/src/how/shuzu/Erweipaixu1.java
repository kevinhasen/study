package how.shuzu;
import java.util.Arrays;
public class Erweipaixu1 {
    public static void main(String[] args) {
        int index1 = 5, index2 = 8;
        int[][] arr = new int[index1][index2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }
        int[] arrAll = new int[index1 * index2];
        System.out.println("原二维数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));//思路不错
            System.arraycopy(arr[i], 0, arrAll, i * index2, index2);
            //懂了，因为复制到一维数组，第一次是0x8 = 0；从0开始，复制，0-1-2...，第二次是从1x8开始，从下标8开始复制，8-9-10...
        }
        //src: 源数组
        //srcPos: 从源数组复制数据的启始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度
        Arrays.sort(arrAll);
        System.out.println("排序后的数组：");
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arrAll, i * index2, arr[i], 0, index2);
            System.out.println(Arrays.toString(arr[i]));
            //懂了，因为复制到二维数组，第一次是0x8 = 0；从0开始，复制到a1数组，0-1-2...，
            //第二次是从原数组1x8开始，从下标8开始复制，8-9-10..
        }
    }
}
