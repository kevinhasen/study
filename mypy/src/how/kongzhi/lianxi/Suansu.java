package how.kongzhi.lianxi;

public class Suansu {
    /*
     * a+b=8; c-d=6; a+c=14; b+d=10;
     *
     * b=8-a; c=14-a; d=10-b=10-(8-a)=2+a;
     */
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        for (int i =1;i<8;i++){
            int d =i;
            a= 8-d;
            b = 14-d;
            c =10-a;
            if (b - c == 6){
                System.out.println("[a=" + a + ",b=" + b + ",c=" + c + ",d=" + d+"]");
                break;
            }else {
                continue;
            }
        }
    }
}
