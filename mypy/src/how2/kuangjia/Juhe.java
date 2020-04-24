package how2.kuangjia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-06-06
 *  Time:    1:00
 *  Blog:     http://yejun.cf
 *  对元素进行筛选：
 filter 匹配
 distinct 去除重复(根据equals判断)
 sorted 自然排序
 sorted(Comparator<T>) 指定排序
 limit 保留
 skip 忽略
 常见结束操作如下：
 forEach() 遍历每个元素
 toArray() 转换为数组
 min(Comparator<T>) 取最小的元素
 max(Comparator<T>) 取最大的元素
 count() 总数
 findFirst() 第一个元素
 ******************/
public class Juhe {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("通过传统操作方式找出满足条件的数据：");

        for (Hero h : heros) {
            if (h.hp > 100 && h.damage < 50)
                System.out.println(h.name);
        }
        System.out.println("通过聚合操作方式找出满足条件的数据：");
        heros
                .stream()
                .filter(h -> h.hp > 100 && h.damage < 50)
                .forEach(h -> System.out.println(h.name));
        //制造一个重复数据
        heros.add(heros.get(0));
        System.out.println("初始化集合后的数据 (最后一个数据重复)：");
        System.out.println(heros);
        System.out.println("满足条件hp>100&&damage<50的数据");

        heros
                .stream()
                .filter(h->h.hp>100&&h.damage<50)
//                .forEach(h->System.out.print(h));
                .forEach(System.out::println);

        System.out.println("去除重复的数据，去除标准是看equals");
        heros
                .stream()
                .distinct()
//                .forEach(h->System.out.print(h));
                .forEach(System.out::println);

        System.out.println("按照血量排序");
        heros
                .stream()
                .sorted((h1,h2)->h1.hp>=h2.hp?1:-1)
//                .forEach(h->System.out.print(h));
                .forEach(System.out::println);

        System.out.println("保留3个");
        heros
                .stream()
                .limit(3)
//                .forEach(h->System.out.print(h));
                .forEach(System.out::println);

        System.out.println("忽略前3个");
        heros
                .stream()
                .skip(3)
//                .forEach(h->System.out.print(h));
                .forEach(System.out::println);

//        System.out.println("转换为double的Stream");
//        heros
//                .stream()
//                .mapToDouble(Hero1::getHp)
//                .forEach(h->System.out.println(h));

        System.out.println("转换任意类型的Stream");
        heros
                .stream()
                .map((h)-> h.name + " - " + h.hp + " - " + h.damage)
//                .forEach(h->System.out.println(h));
                .forEach(System.out::println);

        System.out.println("遍历集合中的每个数据");
        heros
                .stream()
//                .forEach(h->System.out.print(h));
                .forEach(System.out::println);

        System.out.println("返回一个数组");
        Object[] hs= heros
                .stream()
                .toArray();
        System.out.println(Arrays.toString(hs));

        System.out.println("返回伤害最低的那个英雄");
        Hero minDamageHero =
                heros
                        .stream()
                        .min((h1,h2)->h1.damage-h2.damage)
                        .get();
        System.out.print(minDamageHero);

        System.out.println("返回伤害最高的那个英雄");

        Hero mxnDamageHero =
                heros
                        .stream()
                        .max((h1,h2)->h1.damage-h2.damage)
                        .get();
        System.out.print(mxnDamageHero);

        System.out.println("流中数据的总数");
        long count = heros
                .stream()
                .count();
        System.out.println(count);

        System.out.println("第一个英雄");
        Hero firstHero =
                heros
                        .stream()
                        .findFirst()
                        .get();

        System.out.println(firstHero);

    }
}
