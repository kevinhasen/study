package how.lianxi;

public abstract class Animal {
    protected int legs;
    public Animal(){}
    protected Animal(int legs){
    this.legs = legs;
    }
    public void walk(){
        System.out.println(legs+"只脚走路");
    }
    public abstract void eat();

}

