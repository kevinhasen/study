package how.duixiang;

import how.duixiang.Ehan;
import how.duixiang.Lanhan;

public class Danli {
    public static void main(String[] args) {
    Ehan e = Ehan.getEhan();
    Ehan e1 = Ehan.getEhan();
    Lanhan l = Lanhan.getLanhan();
    Lanhan l1 = Lanhan.getLanhan();
        System.out.println(e == e1);
        System.out.println(l == l1);
    }
}
