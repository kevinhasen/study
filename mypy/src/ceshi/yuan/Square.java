package ceshi.yuan;

public class Square extends Chart{
        double b1;
        double b2;
        double b3;
        double g;

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getB2() {
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }

    public double getB3() {
        return b3;
    }

    public void setB3(double b3) {
        this.b3 = b3;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }
    public double mianji(){
        double mj = b1*g/2;
        return mj;
    }
    public double zhouchang(){
        double zc = b1+b2+b3;
        return zc;
    }
    public void show(){
        System.out.println("三角形面积："+mianji());
        System.out.println("三角形周长："+zhouchang());
    }
    //面积 底x高除以2
    //周长 三边相加
}
