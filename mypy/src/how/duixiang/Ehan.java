package how.duixiang;

public class Ehan {
    private Ehan(){
//私有化构造方法使得该类无法在外部通过new 进行实例化
    }
    private static Ehan ehan = new Ehan();
    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
    public static Ehan getEhan(){
        return ehan;
    }
    //public static 方法，提供给调用者获取8行定义的对象
}
