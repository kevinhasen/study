package ceshi.zuoye;

public class Position implements CompareObject{
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double compareTo(){
       double wuwu = (5*5)+(5*5);
       double dq = (this.x*this.x)+(this.y*this.y);
       double test = wuwu - dq;
       double var;
       if (test>0){
           var = 1;
       }else if (test == 0){
           var = 0;
       }else {
           var =  -1;
       }
        return var;
   }

}
