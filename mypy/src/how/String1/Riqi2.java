package how.String1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-20
 *  Time:    18:06
 *  Blog:     http://yejun.cf
 ******************/
public class Riqi2 {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();//返回毫秒数
        System.out.println("今天是:" + format( c.getTime()));
        c.setTime(now);
        c.set(Calendar.DAY_OF_MONTH, 1);
        //先翻到下下个月
        c.add(Calendar.MONTH,2);
        //再往回翻3天
        c.add(Calendar.DATE,-3);

        System.out.println("下个月倒数第三天是:" + format(c.getTime()));
    }
    private static String format(Date time) {
        return sdf.format(time);
    }
}
