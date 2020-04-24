package ceshi;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-05-20
 *  Time:    18:18
 *  Blog:     http://yejun.cf
 ******************/
public class Timelei {
    public static void main(String[] args) {
        //Clock 时钟
        //Clock类提供了访问当前日期和时间的方法
        Clock clock1 = Clock.systemDefaultZone();//获取系统默认时区 (当前瞬时时间 )
        System.out.println( "系统时间日期："+clock1.instant() );

        final Clock clock = Clock.systemUTC();//获取系统时钟，并将其转换成使用UTC时区的日期和时间
        System.out.println( "时间日期："+clock.instant() );

        Clock clock2 = Clock.systemDefaultZone();// 获取系统默认时区 (当前瞬时时间 )

        //  LocalDate(本地日期)
        //能用来表示今天的日期。这个类与java.util.Date略有不同，
        // 因为它只包含日期，没有时间。
        final LocalDate date = LocalDate.now();
        System.out.println("今天的日期是："+date);

        //提取年月日
        System.out.println("获取年:"+date.getYear()+"\n获取月:"+date.getMonthValue()+"\n获取日："+date.getDayOfMonth());

        //检查两个日期是否相等
        LocalDate date1 = LocalDate.of(2018,5,19);
        System.out.println("今天是5-19号吗:"+date.equals(date1));

        //获取1周后的日期
        //也可以用这个方法来增加一个月，一年，一小时，一分等等
        //plus()方法可以用来增加日，星期，月
    LocalDate yizhou = date.plus(1, ChronoUnit.WEEKS);
        System.out.println("一周后的日期："+yizhou);

        //用minus()方法来找出一年前的那天
        System.out.println("一年前的日期："+date.minus(1,ChronoUnit.YEARS));
        System.out.println("一年后的日期："+date.plus(1,ChronoUnit.YEARS));

        //判断某个日期在另一个日期的前面还是后面
        //LocalDate类中使用isBefore()、isAfter()、equals()方法来比较两个日期。
        // 如果调用方法的那个日期比给定的日期要早的话，isBefore()方法会返回true
        LocalDate mt = date.plus(1,ChronoUnit.DAYS);
        System.out.println("明天的日期是："+mt);
        System.out.println("日期："+mt+"是否在"+date+"之后："+mt.isAfter(date));
        System.out.println("日期："+mt+"是否在"+date+"之前："+mt.isBefore(date));

        //检查闰年
        //LocalDate类由一个isLeapYear()方法来返回当前LocalDate对应的那年是否是闰年
        System.out.printf("%s 是否是闰年:%s",date,date.isLeapYear());
        System.out.println();

        //对日期进行解析/格式化
        //替换SimpleDateFormat来进行格式化
        String rq = "20180521";
        LocalDate gsh = LocalDate.parse(rq, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("字符%s格式化后的日期是：%s %n",rq,gsh);


    }



}
