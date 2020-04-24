package ceshi.yuan;

public class Circle {

    private double Radius;//圆的半径

    Circle(){//将半径设为0
        Radius = 0;
    }
    Circle(double r){//值初始化为r
        Radius = r;
    }
    public double getArea(){//圆的面积
        double mj = Math.PI*Radius*Radius;
        return mj;
    }
    public double getPerimeter(){//圆的周长
        double zc = Radius*2*Math.PI;
        return zc;
    }
    public void show(){
        System.out.println("圆的半径为："+Radius);
        System.out.println("圆的周长为："+getPerimeter());
        System.out.println("圆的面积为："+getArea());
    }
}
