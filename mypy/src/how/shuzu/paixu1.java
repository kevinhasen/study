package how.shuzu;

public class paixu1 {
    public static void main(String[] args){
        int [] a= new int[]{13,16,34,65,32};

        for(int i=0; i<a.length-1; i++){
            for(int j=i+1;  j<a.length; j++){
                if(a[j]<a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("正序排法：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[j] < a[j+1]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(" ");
        System.out.println("逆序排法：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
