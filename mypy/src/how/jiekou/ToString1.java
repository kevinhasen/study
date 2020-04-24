package how.jiekou;

public class ToString1 {
    public String name;
    protected float hp;

    public String toString(){
        return name;//建议所有子类都重写此方法
    }

    public static void main(String[] args) {

        ToString1 h = new ToString1();
        h.name = "盖伦";
        System.out.println(h.toString());//object中的toString方法是对象才能调用的
        //直接打印对象就是打印该对象的toString()返回值（字符串方式）
        System.out.println(h);//这两句是一样的
        //如果不重写tostring，则不一样，输出的是内部地址
        //为什么都输出盖伦呢
        //println(Ojbect object)的方法他会自动调用被打印对象的toString方法
    }
}
