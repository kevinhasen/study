package how;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-20
 *  Time:    16:43
 *  Blog:     http://yejun.cf
 *  找出下个月的倒数第3天是哪天
 *  Calender的月份是从0开始的，但日期和年份是从1开始的
 ******************/
public class Riqi {
    //格式化日期
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//默认是当前时间
        Date now = c.getTime();//返回毫秒数
        // 当前日期
        System.out.println("当前日期：\t" + format(c.getTime()));
        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));

        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));

        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));

        //下个月的倒数第3天
        //日期设为0表示上个月的最后一天
        //月份也可以是负数，规则与日期一样
        c.setTime(now);
        c.add(Calendar.MONTH,2);
        c.set(Calendar.DATE,-2);
        System.out.println("下个月的倒数第三天:\t" +format(c.getTime()));
    }
    //日期转字符串
    private static String format(Date time) {
        return sdf.format(time);
    }
}
