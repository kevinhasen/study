package how.shuzu;

public class Erwei {////自己写的有问题的，数组下标不正确
    public static void main(String[] args) {//已改正
        int a[][] = new int[5][5];
        int x=0;
        int y=0;
        for (int i = 0;i<a.length;i++){
            for (int j = 0;j<a.length;j++){
                a[i][j] = (int) (Math.random() * 100);
                if (j%5==0){
                    System.out.println();
                }
                System.out.print(a[i][j]+"\t");
            }
        }
//        for (int i[]:a){
//            for (int j :i){
//                System.out.println(j);
//                if (j%5==0){
//                    System.out.println();
//                }
//            }
//        }
//        int max =0;
//        for (int i[] :a){
//            for (int j :i){
//                max = (max>j ? max:j);
//            }
//        }增强形for
        int max = a[0][0];
        for (int i = 0;i<a.length;i++){
            for (int j = 0;j<a.length;j++) {
//                max=(a[i][j]<max?max:a[i][j]);
//                x=i;
//                y=j;
                if (max<a[i][j]){
                    max = a[i][j];
                    x=i;
                    y=j;
                }
            }
            }
        System.out.println("最大值："+max);
        System.out.print("坐标是["+x+"]["+y+"]");
    }
}
