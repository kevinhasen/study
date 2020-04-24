package how.shuzu;

public class Erwei1 {
    public static void main(String[] args) {
        int[][]A=new int[5][5];
        int max=0;
        int I=0;
        int J=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j]=(int)(Math.random()*100);
                System.out.print(A[i][j]+" ");
                if( max<A[i][j]){
                    max=A[i][j];
                    I=i;
                    J=j;
                }
            }
            System.out.println(" ");
        }
        System.out.println("最大数为"+max);
        System.out.println("行数为"+(I+1)+"列数为"+(J+1));
    }
}
