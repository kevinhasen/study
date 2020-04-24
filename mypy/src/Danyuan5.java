import java.util.Scanner;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-07-01
 *  Time:    0:09
 *  Blog:     http://yejun.cf
 ******************/
public class Danyuan5 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a =str.next();
        String[] st = a.split("@");
        System.out.print(st[1]);
    }
}
