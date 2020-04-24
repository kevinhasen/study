package how.jiekou;

public class BB extends AA{
    public String show(BB obj){//在B类中找show（B obj），找到了，可惜没用，因为show（B obj）方法不在可调用范围内
        return ("B and B");//因为父类没有，子类因为已经向上转型，所以无法调用
    }

    public String show(AA obj){
        return ("B and A");
    }
    //继承了A的  DD
    //继承了A的 AA
    //由于B重写了A的AA，所以调用B的AA
}
