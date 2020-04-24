package how.shuzu;

public class Fanzhuan {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];//如果是写一个方法的话，可以把这句写进方法里
        for (int i=0;i<a.length;i++){
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("未反转前:");
        for (int i:a){
            System.out.println(i);
        }
        for (int i=0,j=4;i<b.length;i++,j--){
             b[i]=a[j];
        }
        System.out.println("反转后：");
        for (int i:b){
            System.out.println(i);
        }
    }
}
