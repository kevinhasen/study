package how2.kuangjia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-30
 *  Time:    22:53
 *  Blog:     http://yejun.cf
 ******************/
public class TestLambda {

    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用匿名类的方式，筛选出 hp>100 && damange<50的英雄");
        //Lambda表达式可以看成是匿名类一点点演变过来
        //临时需要一个接口的实现类，
        //通过new表达式返回的引用自动向上转型为对 HeroChecker的引用
        //只要实现了他的抽象方法就可以
        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(Hero h) {
                return (h.hp>100 && h.damage<50);
            }
        };

        //filter(heros,checker);//把checker 作为参数传递进去
        // 把new HeroChcekcer，方法名，方法返回类型信息去掉
        // 只保留方法参数和方法体
        // 参数和方法体之间加上符号 ->
//        HeroChecker c2 = (Hero h) -> {
//            return h.hp > 100 && h.damage < 50;
//        };
//
//        // 把return和{}去掉
//        HeroChecker c3 = (Hero h) -> h.hp > 100 && h.damage < 50;
//
//        // 把 参数类型和圆括号去掉
//        HeroChecker c4 = h -> h.hp > 100 && h.damage < 50;
//
//        // 把c4作为参数传递进去
//        filter(heros, c4);
//
//        // 直接把表达式传递进去
//        filter(heros, h -> h.hp > 100 && h.damage < 50);
//    }

    //Lambda方式
        //Lambda 其实就是匿名方法，这是一种把方法作为参数
        //Java会在背后，悄悄的，把这些都还原成匿名类方式。
//        System.out.println("使用Lamdba的方式，筛选出 hp>100 && damange<50的英雄");
//        //参数和方法体之间加上符号 ->      h是参数
//        filter(heros,h->h.hp>100 && h.damage<50);//直接把表达式传递进去

        System.out.println("使用匿名类过滤");
        filter(heros, checker);
        System.out.println("使用Lambda表达式");
        filter(heros, h->h.hp>100 && h.damage<50);
        System.out.println("在Lambda表达式中使用静态方法");
        filter(heros, h -> TestLambda.testHero(h) );
        System.out.println("直接引用静态方法");
        filter(heros, TestLambda::testHero);
        //::是java8里引入lambda后的一种用法,表示引用,比如静态方法的引用
        //简单来讲,就是构造一个该方法的闭包。比如:Math::max等效于(a, b)->Math.max(a, b)
       // System.out.println("使用引用对象方法  的过滤结果：");
        //使用类的对象方法
//        TestLambda Lambda = new TestLambda();
//        filter(heros, Lambda::testHero);
        System.out.println("Lambda表达式：");
        filter(heros,h-> h.hp>100 && h.damage<50 );

        System.out.println("Lambda表达式中调用容器中的对象的matched方法：");
        filter(heros,h-> h.matched() );

        System.out.println("引用容器中对象的方法 之过滤结果：");
        filter(heros, Hero::matched);
        System.out.println("自定义类遍历list：");
        heros.forEach(System.out::println);
    }

    private static void filter(List<Hero> heros,HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }

    }
    public static boolean testHero(Hero h) {
        return h.hp>100 && h.damage<50;
    }
}
