public class Student {
    int sNO;
    String sName;
    String sSex;
    int sAge;
    double sJava;
    public Student(){

    }
    public Student(int a,String b,String c,int d, double e){//可选对象形参
    sNO = a;
    sName = b;
    sSex = c;
    sAge = d;
    sJava = e;
    }
//    public Student(Student i){
//        sNO = i.sNO;
//        sName = i.sName;
//        sSex = i.sSex;
//        sAge = i.sAge;
//        sJava = i.sJava;
//    }
    public int getsNO() {
        return sNO;
    }
    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }
    public int getsAge() {
        return sAge;
    }
    public double getsJava() {
        return sJava;
    }
    public double pinjun(double i){
    double j = i/5;
    return j;
    }
//    public double maxmin(double a,double b,double c,double d,double e){
//        double max = a;
//
//        return max;
//    }
}
