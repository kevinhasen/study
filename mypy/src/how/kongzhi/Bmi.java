package how.kongzhi;

public class Bmi {
     double tz;
     double sg;
    public Bmi(){

    }
    public Bmi(double tz,double sg){
        this.tz = tz;
        this.sg = sg;
    }
    public void show(){
        double z = tz/(sg*sg);
//        String b;
        System.out.println("当前的BMI是:"+z);
        if (z<18.5){
            System.out.println("身体状态是：体重过轻");
//            b = "体重过轻";
        }else if(z<24){
            System.out.println("身体状态是：正常范围");
//            b = "正常范围";
        }else if(z<27){
            System.out.println("身体状态是：体重过重");
//            b = "体重过重";
        }else if(z<30){
            System.out.println("身体状态是：轻度肥胖");
//            b = "轻度肥胖";
        }else if(z<35){
            System.out.println("身体状态是：中度肥胖");
//            b = "中度肥胖";
        }else {
            System.out.println("身体状态是：重度肥胖");
//            b = "重度肥胖";
        }
//        return b;
    }
}
