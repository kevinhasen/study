package how2.kuangjia;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-06-06
 *  Time:    1:08
 *  Blog:     http://yejun.cf
 ******************/
public class Hero1 implements Comparable<Hero1>{
    public String name;
    public float hp;

    public int damage;

    public Hero1(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getHp() {
        return hp;
    }
    public void setHp(float hp) {
        this.hp = hp;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public Hero1(String name) {
        this.name =name;
    }
    //初始化name,hp,damage的构造方法
    public Hero1(String name,float hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }
    @Override
    public int compareTo(Hero1 anotherHero) {
        if(damage<anotherHero.damage)
            return 1;
        else
            return -1;
    }
    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
}
