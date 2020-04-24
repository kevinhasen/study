package how2.kuangjia;

import java.util.ArrayList;
import java.util.List;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-30
 *  Time:    0:07
 *  Blog:     http://yejun.cf
 *  放100个Hero对象
 *  通过遍历的手段，删除掉名字编号是8的倍数的对象
 *  大概思路，通过get获取位置，然后删除
 ******************/
public class Bianli {
    public static void main(String[] args) {
//        List<Hero> heros = new ArrayList<Hero>();
//        //放100个Hero进入容器
//        for (int i = 0; i < 100; i++) {
//            heros.add(new Hero("hero " +i));
//        }
//        //思路，因为0开始，所以从下标7开始，然后每次是2倍
//        //在因为每次删除会重排，所以减12345.。。
////        for (int a=1;a<13;a++){
////        for(int j=7;j<12;j=(j*2)-a) {
////            Hero li = heros.get(j);
////            if (heros.remove(li)) {
////                System.out.println("删除的对象是：" + li);
////                break;
////            }
////        }
////        }
//        //改进：
//        for(int i = 8; i < heros.size(); i+=7) {//改进，8变7
//            //返回对象
//            Hero h = heros.remove(i);//8,15,22.29,36
//            System.out.println(h);
//            //i--;//8-1=7
//        }
    }
}
