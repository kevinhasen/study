package how2.kuangjia;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-27
 *  Time:    23:47
 *  Blog:     http://yejun.cf
 ******************/
public class Item {
    String name;
    int price;

    public Item(){

    }

    //提供一个初始化name的构造方法
    public Item(String name){
        this.name = name;
    }

    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }
}
