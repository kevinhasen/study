package how.jiekou;

public class Hp extends Item{
    public boolean disposable(){
        System.out.println("血瓶用了会消失");
        return true;
    }
}
