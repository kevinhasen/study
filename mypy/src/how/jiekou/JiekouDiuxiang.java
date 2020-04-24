package how.jiekou;

public class JiekouDiuxiang {
    public static void main(String[] args) {

        PetInterface p = new Cat();////向上转型 Cat->PetInterface 子类转父类(向上转型)
        p.talk();
        //p.batheSelf();//无法调用 ，报错The method batheSelf() is//子类自带方法会消失
        ((Cat)p).batheSelf();//向下转型，可正常调用执行
        //方法batheSelf()仅仅存在实现类中时
        //仍然使用接口来引用对象时
        //那些仅仅存在实现类中的方法，是无法直接调用的
        //这时使用Cat p = new Cat()即类来引用是更好的
        Cat a = new Cat();
        a.batheSelf();
        //使用接口类去引用对象是有前提条件的——即实现类中全是接口类的方法的实现
        //当实现类存在自己的方法时，使用实现类来声明变量
    }

}
interface PetInterface {

    public void talk();

}
class Dog implements PetInterface {

    @Override
    public void talk() {
        System.out.println("Bark!");
    }

}
class Cat implements PetInterface {

    @Override
    public void talk() {
        System.out.println("Meow!");
    }

    public void batheSelf() {
        System.out.println("Cat bathing");
    }
}
