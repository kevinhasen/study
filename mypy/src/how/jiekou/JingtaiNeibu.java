package how.jiekou;

public class JingtaiNeibu {
    public  String name;
    protected float hp;

    private static void battleWin(){
        System.out.println("battle win");
    }

    //敌方的水晶
    static class EnemyCrystal{
        int hp=5000;

        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory(){
            if(hp==0){
                JingtaiNeibu.battleWin();

               // 静态内部类不能直接访问外部类的实例属性和方法
                //只能访问静态属性
                //System.out.println(name + " win this game");
            }
        }
    }

    public static void main(String[] args) {
        //实例化静态内部类
      //  JingtaiNeibu.EnemyCrystal crystal = new JingtaiNeibu().EnemyCrystal();
//        不需要一个外部类的实例为基础，可以直接实例化
        //语法：new 外部类.静态内部类();
       // crystal.checkIfVictory();
    }

}
