package how2.kuangjia;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-27
 *  Time:    0:38
 *  Blog:     http://yejun.cf
 ******************/
public class Hero implements Comparable<Hero>{
    public String name;
    public float hp;

    public int damage;


    public Hero() {

    }

    // 增加一个初始化name的构造方法
    public Hero(String name,float hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    @Override
    public int compareTo(Hero anotherHero) {
        if(damage<anotherHero.damage)
            return 1;
        else
            return -1;
    }
    public boolean matched(){
        return this.hp>100 && this.damage<50;
    }
}
