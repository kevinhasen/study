package how.jiekou;

public class Wuqi extends Item{
    public boolean disposable(){
        System.out.println("武器用了不会消失");
        return false;
    }
}
