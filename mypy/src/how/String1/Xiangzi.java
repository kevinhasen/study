package how.String1;

public class Xiangzi {
    byte b = 2;
    short s = 3;
    float f = 1;
    double d = 4;
    int i = 9;

//自动装箱,将基本类型转换成对象
    Byte y = b;
    Short h = s;
    Float l = f;
    Double o = d;
//    Byte y1 = i;

//自动拆箱,将对象解析为基本类型
    byte b1 = y;
    short s1 = h;
    float f1 = l;
    double d1 = o;

//通过Byte获取byte的最大值
public static void main(String[] args) {
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Byte.MIN_VALUE);
}
}
