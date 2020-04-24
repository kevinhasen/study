package how.lianxi;

public class Cat extends Animal implements Pet{
    String name;
    public Cat(String name){
    super(4);
    }
    public Cat(){
        this("");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name = name;
    }
    public void play(){
        System.out.println("猫玩的方法");
    }
    public void eat(){
        System.out.println("猫吃的方法");
    }

}