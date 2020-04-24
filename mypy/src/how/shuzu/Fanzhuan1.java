package how.shuzu;

public class Fanzhuan1 {
    public static void main(String[] args){
        int[] a = new int [6];
        System.out.println("反转前~~~~~~~~~~~~~");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
            System.out.println("第"+(i+1)+"个数"+":"+a[i]);

        }
        System.out.println("反转后~~~~~~~~~~~~~");
        int tempNum;
        for (int i = 0; i <(a.length/2); i++) {//i<a的长度/2=3
            tempNum = a[i];//将当前的值给第三方
            a[i] = a[a.length-1-i];//把当前位置的值改为a[a的长度6-1-0]，替换成最后一个值
            a[a.length-1-i]=tempNum;//最后一个值改为之前第三方的值
            //所以只需循环一半
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("第"+(i+1)+"个数"+":"+a[i]);

        }
    }
}
