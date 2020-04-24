import ceshi.xuesheng.Person;

import java.util.List;
import java.util.ArrayList;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-07-01
 *  Time:    0:12
 *  Blog:     http://yejun.cf
 ******************/
public class Emplyee {
    int id;
    String name;
    String sex;
    int salary;
    public Emplyee(int id, String name, String sex, int salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }
    public static void main(String[] args) {
        List t = new ArrayList();
        Emplyee a = new Emplyee(1,"测试1","男",2000);
        Emplyee b = new Emplyee(2,"测试2","男",2000);
        Emplyee c = new Emplyee(3,"测试3","男",2000);
        t.add(a);
        t.add(b);
        t.add(c);
    }
}
