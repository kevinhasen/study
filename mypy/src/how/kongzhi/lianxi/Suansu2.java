package how.kongzhi.lianxi;

public class Suansu2 {
    public static void main(String[] args){
        /*leftUp rightUp
         * leftDown  rightDown
         * 这四个数进行计算*/
        for(int leftUp=1;leftUp<14;leftUp++){
            int leftDown = 14-leftUp;
            for(int rightUp=1;rightUp<10;rightUp++){
                int  rightDown = 10-rightUp;
                if(8==leftUp+rightUp && 6==leftDown-rightDown){
                    System.out.println("leftUp:"+leftUp+'\n'+"rightUp:"+rightUp+'\n'+"leftDown:"+leftDown+'\n'+"rightDown:"+rightDown);
                }
            }
        }
    }
}
