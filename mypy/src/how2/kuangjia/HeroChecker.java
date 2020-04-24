package how2.kuangjia;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-30
 *  Time:    22:54
 *  Blog:     http://yejun.cf
 *  注解的接口要有且仅有一个抽象方法
 *  一个抽象方法，一个Object的public方法
 ******************/
@FunctionalInterface
public interface HeroChecker {
    public boolean test(Hero h);

}
