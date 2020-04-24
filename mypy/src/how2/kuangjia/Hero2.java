package how2.kuangjia;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-06-07
 *  Time:    12:09
 *  Blog:     http://yejun.cf
 ******************/
public class Hero2 implements Comparable<Hero2>{
    String name;
    int hp;
    int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Hero2(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "name:"+name+"\thp："+hp+"\t击杀数："+damage;
    }

    @Override
    public int compareTo(Hero2 o) {//如果需要从大到小则反设计即可
       if (hp<o.hp){
           return 1;
       }else {
           return -1;
       }
    }
}
