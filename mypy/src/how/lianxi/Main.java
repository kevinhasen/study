package how.lianxi;

public class Main {
    public static void main(String[] args) {
    Spider p = new Spider();
        p.eat();
    p.walk();

    Cat c = new Cat();
    c.setName("猫");
    c.eat();
    c.play();
    c.walk();
    Fish f = new Fish();
    f.setName("鱼");
    f.eat();
    f.play();
    f.walk();
    }
}
