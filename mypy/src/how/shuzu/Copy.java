package how.shuzu;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int a [][] = new int[x][y];
        int b [] = new int[x*y];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int)(Math.random() * 100);
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("循环了"+(i+1)+"次");
            System.out.println(Arrays.toString(a[i]));//思路不错
            System.arraycopy(a[i], 0, b, i * y, y);
            //懂了，因为复制到一维数组，第一次是0x3 = 0；从0开始，复制，0-1-2，第二次是从1x3开始，从下标3开始复制，3-4-5
        }
        //src: 源数组
        //srcPos: 从源数组复制数据的启始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度
        System.out.println("排序后的数组：");
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(b, i * y, a[i], 0, y);
            //懂了，因为复制到二维数组，第一次是0x3 = 0；从0开始，复制到a1数组，0-1-2，
            //第二次是从原数组1x3开始，从下标3开始复制，3-4-5
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
