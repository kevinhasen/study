package how.jiekou;

public class B extends A{
    public int a = 2;
    public void A(){//重写是相对与方法的
        System.out.println("我是B类中的A方法");
    }

    public static void main(String[] args) {
        A b = new B();//父类对象引用子类对象，子类不会去重写覆盖父类的成员变量
        b.A();//调用子类的方法，调用父类的变量
        b.A(2);
        System.out.println(b.a);
    }
}
