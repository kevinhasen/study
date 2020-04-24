package how.duixiang;

public class Gaozao {
    String heroName;
    float heroHp;
    float heroArmor;
    int heroMoveSpeed;
    public Gaozao(){

    }
    public Gaozao(String heroName,float heroHp,float heroArmor,int heroMoveSpeed){
        this.heroName = heroName;
        this.heroHp = heroHp;
        this.heroArmor = heroArmor;
        this.heroMoveSpeed = heroMoveSpeed;
        System.out.println("实例化带参数对象的时候一定会调用这个方法");
    }

    public static void main(String[] args) {
        new Gaozao("提莫",350,5,350);
    }
}
