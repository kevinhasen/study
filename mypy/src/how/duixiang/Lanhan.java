package how.duixiang;

public class Lanhan {
    private Lanhan(){
//私有化构造方法使得该类无法在外部通过new 进行实例化
    }
    //准备一个类属性，用于指向一个实例化对象，但是暂时指向null
    private static Lanhan lanhan;
    //public static 方法，返回实例对象
    public static Lanhan getLanhan(){
        //第一次访问的时候，发现item没有指向任何对象，这时实例化一个对象
        if (null == lanhan){
            lanhan = new Lanhan();
        }
        //返回 item指向的对象
        return lanhan;
    }
}
