package how2.kuangjia;

import java.util.ArrayList;
import java.util.List;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-27
 *  Time:    23:40
 *  Blog:     http://yejun.cf
 *  不指定泛型的容器，可以存放任何类型的元素（自动转为祖宗类，取出需要强转）
 指定了泛型的容器，只能存放指定类型的元素以及其子类(所以不需要强转)
 ******************/
public class Fanxing {
    public static void main(String[] args) {
//        //对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
//        List heros = new ArrayList();
//
//        heros.add(new Hero("盖伦"));
//
//        //本来用于存放英雄的容器，现在也可以存放物品了
//        heros.add(new Item("冰杖"));
//        //对象转型会出现问题
//        Hero h1=  (Hero) heros.get(0);
//        //尤其是在容器里放的对象太多的时候，就记不清楚哪个位置放的是哪种类型的对象了
//        Hero h2=  (Hero) heros.get(1); //引入泛型Generic
//        //声明容器的时候，就指定了这种容器，只能放Hero，放其他的就会出错
//    List<Hero> genericheros = new ArrayList<>();//1.7即泛型实例化类型自动推断。
//
//        genericheros.add(new Hero("盖伦"));
//        //如果不是Hero类型，根本就放不进去
//        //genericheros.add(new Item("冰杖"));
//
//        //除此之外，还能存放Hero的子类
////        genericheros.add(new APHero());
//
//        //并且在取出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或者其子类
//        Hero h = genericheros.get(0);



    }
}
