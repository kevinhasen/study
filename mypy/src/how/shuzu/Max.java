package how.shuzu;

public class Max {
    public static void main(String[] args) {
        int max=0;
        int[] a = new int[]{1,5,69,35,9};
        for (int values : a){ //直接获取的是值，没有下标
//            max = a[values];思维习惯性把它当成数组
            for (int each : a){
                System.out.println("当前值："+each);
                if (each>max){//如果当前值大于初始值则
                    max = each;
                    System.out.println(max);
                }
            }
//            if (max<a[values]){不要当成数组对待
//                max = a[values];
//            }
        }
        System.out.println(max);
    }
}
