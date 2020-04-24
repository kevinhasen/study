package how.jiekou;


public class JiekouAnli {
    public static void main(String[] args) {

        //Animal animal = new Cat(); //向上转型
      //  animal.eat();
    //animal.run()会报错
        //animal = new Dog();//向上转型时，子类单独定义的方法会丢失
       // animal.eat();
        //子类引用不能指向父类对象。Cat c = (Cat)new Animal()这样是不行的。
    }
    public class Animal {
        public void eat(){
            System.out.println("animal eatting...");
        }
    }

    class Cat extends Animal{

        public void eat(){

            System.out.println("我吃鱼");
        }
    }

    public class Dog extends Animal{

        public void eat(){

            System.out.println("我吃骨头");
        }

        public void run(){
            System.out.println("我会跑");
        }
    }
}
