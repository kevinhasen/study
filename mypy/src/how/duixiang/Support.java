package how.duixiang;

public class Support extends Hero{
    public void heal(){
        System.out.println("没有任何操作");
    }
//    public void heal(Hero h){
//        System.out.println("为"+h.name+"加血");
//    }
//    public void heal(Hero h,int hp){
//        System.out.println("为"+h.name+"加了"+hp+"血");
//    }
    public void heal(int hp,Hero... heroes){
        for (int i =0;i<heroes.length;i++){
            System.out.println("为"+heroes[i].name+"加了"+hp+"血");
        }
    }
}
