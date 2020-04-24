package how.kongzhi;

public class Runnian {
    int n;
    public void show(){
        if (n%4 == 0){
            if (n%100 == 0){
                System.out.println(n+"不是闰年");
            }else{
                System.out.println(n+"是闰年");
            }
        }else{
            System.out.println(n+"不是闰年");
        }
    }
}
