package how.duixiang;

public class Zhiliao {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "赏金猎人";
        Hero h1 = new Hero();
        h1.name = "提莫";
        Support s = new Support();
        s.heal();
        s.heal(20,h,h1);
        System.out.println(h == h1);
    }
}
