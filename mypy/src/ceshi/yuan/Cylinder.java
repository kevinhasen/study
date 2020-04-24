package ceshi.yuan;

public class Cylinder extends Circle {

    private double hight;

    public Cylinder(double r,double h){
        Circle a = new Circle(r);
        hight = h;
    }
    public double getVolume(){
        double tj = getArea()*hight;

        return tj;
    }
    public void showVolume(){
        System.out.println("圆柱体的体积："+getVolume());
    }
}
