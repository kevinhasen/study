package how.lianxi;

public class Fish extends Animal implements Pet{
    private String name;
    public Fish(){}
    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name = name;
    }
    public void play(){
        System.out.println("鱼玩的方法");
    }
    public void walk(){
        System.out.println("鱼不能走且没有腿");
    }
    public void eat(){
        System.out.println("鱼吃的方法");
    }
}