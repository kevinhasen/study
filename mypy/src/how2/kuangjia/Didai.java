package how2.kuangjia;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-06-05
 *  Time:    22:24
 *  Blog:     http://yejun.cf
 *  foreach一般结合泛型使用。
 *  可以迭代集合中所有的对象，并且将lambda表达式带入其中。
 *  stream()方法用于把一个集合变成Stream
 *  通过filter()、map()等实现Stream的变换。Stream还有一个forEach()来完成每个元素的迭代。
 ******************/
public class Didai {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("java","php","python");
        Map<String, Integer> items = new HashMap<>();
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        System.out.println("增强for：");
        for (String s :str){
            System.out.println(s);
        }
        System.out.println("lambda表达式：");
        str.forEach(x -> System.out.println(x));//简化
        System.out.println("调用静态方法：");
        str.forEach(System.out::println);//闭包，省略了参数
        System.out.println("循环map：");
        items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
        System.out.println("通过map方法将cost增加了0,05倍的大小然后输出:");
        cost.stream().map(x -> x + x*0.5).forEach(x -> System.out.println(x));
        //map的作用是将一个对象变换为另外一个
        //stream()方法用于把一个集合变成Stream
        //通过filter()、map()等实现Stream的变换。Stream还有一个forEach()来完成每个元素的迭代。
        System.out.println("reduce实现的则是将所有值合并为一个:");
        double allCost = cost.stream().map(x -> x+x*0.5).reduce((sum,x) -> sum + x).get();
        System.out.println(allCost);
        //用for循环来做这件事情：
//        double sum = 0;
////        for(double each:cost) {
////            each += each * 0.05;
////            sum += each;
////        }
////        System.out.println(sum);
    }
}
