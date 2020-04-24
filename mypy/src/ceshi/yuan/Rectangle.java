package ceshi.yuan;

public class Rectangle extends Chart{

        double c;
        double k;

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double mianji(){
            double mj = c*k;
            return mj;
        }
        public double zhouchang(){
            double zc = (c+k)*2;
            return zc;
        }
        public void show(){
            System.out.println("矩形面积："+mianji());
            System.out.println("矩形周长："+zhouchang());
        }

    //面积等于长x宽
    //周长（长+宽）x2
}
