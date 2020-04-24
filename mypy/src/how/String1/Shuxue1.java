package how.String1;

public class Shuxue1 {//未完善
    public static void main(String[] args) {
        int count = 0;
        for (int i=2;i<100;i++){
            if (zhisu(i)){
                count++;
            }
        }
        System.out.println("质数一共有"+count+"个");
    }
    public static boolean zhisu(int i){
        //boolean zs = true;
        for (int j = 2;j<=Math.sqrt(i);j++){//j<=Math.sqrt(i)，i为2,3时，j>Math.sqrt(i)。所以2,3的时候，return true
            if (i%j == 0){
                // zs=false;
                return false;
            }

        }
        return true;
        //  return zs;
    }
}
