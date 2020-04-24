package how.jiekou;

import how.duixiang.Hero;

public class Ez extends Hero implements Ad,Ap{
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
