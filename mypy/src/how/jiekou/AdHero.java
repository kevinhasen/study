package how.jiekou;

import how.duixiang.Hero;

public class AdHero extends Hero implements Ad{//实现某个接口，就相当于承诺了某种约定
    public void physicAttack(){//实现了AD这个接口，就必须提供AD接口中声明的方法physicAttack()
        System.out.println("进行物理攻击");
    }
}
