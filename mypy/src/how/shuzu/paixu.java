package how.shuzu;

public class paixu {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int)(Math.random()*100);//Math。random产生浮点数*100强转成整形即可。
        a[1] = (int)(Math.random()*100);
        a[2] = (int)(Math.random()*100);
        a[3] = (int)(Math.random()*100);
        a[4] = (int)(Math.random()*100);

        System.out.print("原始随机数组：");
        for(int j = 0 ;j < 5; j++) {
            System.out.print(a[j]+" ");
        }
        //选择排序
        for( int i = 0; i< a.length-1; i++ ){
            for(int j = i+1; j<a.length;j++)
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        }
        System.out.println("选择排序 正排序后的数组:");
        for(int h = 0;h < a.length; h++){
            System.out.print(a[h]+" ");
        }
        //冒泡排序
        for(int j = a.length-1 ;j >0; j--){
            for(int k = j-1; k >= 0 ;k--){
                if(a[j] > a[k]){
                    int temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                }
            }
        }
        System.out.println("冒泡倒排序后的数组:");
        for(int h = 0;h < a.length; h++){
            System.out.print(a[h]+" ");
        }
    }
}
