package how.jiekou;
//非静态内部类
public class FeiNeibu {
    private String name; // 姓名

    float hp; // 血量

    float armor; // 护甲

    int moveSpeed; // 移动速度

    // 非静态内部类，只有一个外部类对象存在的时候，才有意义
    // 战斗成绩只有在一个英雄对象存在的时候才有意义
    class BattleScore { //内部类（类里面的类？？）
        int kill;//杀死
        int die;//死亡
        int assit;

        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    }
    public static void main(String[] args) {
        FeiNeibu garen = new FeiNeibu();
        garen.name = "盖伦";
        // 实例化内部类
        // BattleScore对象只有在一个英雄对象存在的时候才有意义
        // 所以其实例化必须建立在一个外部类对象的基础之上
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();//作为Hero的非静态内部类，是可以直接访问外部类的private实例属性name的
    }
}
