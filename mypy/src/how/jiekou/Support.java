package how.jiekou;

import how.duixiang.Hero;

public class Support extends Hero implements Healer{
    public void heal(){
        System.out.println("进行治疗");
    }
}
