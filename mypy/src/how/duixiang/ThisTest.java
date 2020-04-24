package how.duixiang;

public class ThisTest {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public ThisTest(){

    }
    public ThisTest(String name,float hp){
        System.out.println("这是两个参数的构造方法");
        this.name = name;
        this.hp = hp;
    }
    public ThisTest(String name,float hp,float armor,int moveSpeed){
        this(name,hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
        System.out.println("这是四个参数的构造方法");
    }

    public static void main(String[] args) {
        new ThisTest("提莫",50,60,100);
    }

}
