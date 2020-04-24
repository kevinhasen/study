package how.jiekou;
//如果父类没有无参构造方法，那么子类的构造方法会报错
//使用super关键字显性的调用父类调用父类的带参构造方法即可解决
public class AdHero1 extends Hero1{
    public AdHero1(String name){
        super(name);
    }
    public static void main(String[] args) {
        new AdHero1("叶子");
    }
}
