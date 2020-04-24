package how.duixiang;

public class Hujia {
    public static void main(String[] args) {
        Armor a =new Armor();
        Armor b = new Armor();
        a.name = "布甲";
        b.name = "锁子甲";
        a.price = 300;
        b.price = 500;
        a.ac = 15;
        b.ac = 40;
        System.out.println("名称 价格 护甲等级");
        System.out.println(a.name+" "+a.price+" "+a.ac);
        System.out.println(b.name+" "+b.price+" "+b.ac);

    }

}
