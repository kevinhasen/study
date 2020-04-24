package how2.kuangjia;

import java.util.*;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-06-07
 *  Time:    11:58
 *  Blog:     http://yejun.cf
 ******************/
public class Juhecaozou {

    public static void main(String[] args) {
        List<Hero2> h = new ArrayList<>();
        Random r = new Random();
        //随记产生10个英雄
        for (int i =0;i<10;i++){
            h.add(new Hero2("hero"+i,r.nextInt(1000),r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        for (Hero2 i:h){
            System.out.println(i);
        }
        System.out.println("传统的for：");
        Collections.sort(h);//比较器排序
        for (int j = 0;j<h.size();j++){
                if (j==2){//取第三个
                    System.out.println(h.get(j));
                    break;
                }
        }
        System.out.println("聚合操作：");
        String name = h//重点
                .stream()//没有分号,这是一个源
                .sorted()//可以引入Comparator，指定比较的算法
                .skip(2)//忽略前两个
                .map((h1)->h1.getName())
                .findFirst()//第一个元素
                .get();//get获取
        System.out.println("通过聚合操作:" + name);
    }
}
