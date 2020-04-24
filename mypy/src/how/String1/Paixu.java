package how.String1;
import java.util.Arrays;
/**
 * Created by  IntelliJ  Idea 2018.1
 * Author:  Kevin Hasen
 * Date:    2018-05-09
 * Time:    22:31
 * Blog:     http://yejun.cf
 * 创建一个长度是8的字符串数组,长度为8
 * 使用8个长度是5的随机字符串初始化这个数组，一个长度里有5个字符
 * 对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
 * 注1： 不能使用Arrays.sort() 要自己写
 * 注2： 无视大小写，即 Axxxx 和 axxxxx 没有先后顺序
 * 因为char本身似乎可以自己转换，所以可以对他进行加减操作
 */
public class Paixu {//以后待看
    public static void main(String[] args) {
        String[] string = new String[8];
        for (int i = 0;i<string.length;i++){
            string[i] = random(5);//随机方法
        }
        //打印原数组
        System.out.println(Arrays.toString(string));
        //返回一个字符串
        //排序
        stringSort(string);
        //打印新数组
        System.out.println(Arrays.toString(string));
    }
    public static String random(int len){
        char[] chars = new char[len];
        char min = '0';
        char max = 'z';
        for (int i =0;i<len;i++){
            while (true){
                char temp = (char)(Math.random() * (max - min) + min);
                //生成0-1的随机数,然后对(max - min)取模得到[0-74]之间的随机数
                //然后加上min=122,最后生成的是74-122的随机数
                if (Character.isDigit(temp) || Character.isLetter(temp)){
                    //筛选字母和数字
                    //是否为数字
                    //是否为字母
                    chars[i] = temp;
                    break;
                }
            }
        }
        return new String(chars);//char可以转为字符串
    }
    private static void stringSort(String[] strings) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i; j < strings.length - 1; j++) {
                char a = Character.toLowerCase(strings[j].charAt(0));
                //Character.toLowerCase将字符参数转换为小写
                //strings[j].charAt(0)指定索引处的 char 值
                char b = Character.toLowerCase(strings[j + 1].charAt(0));
                //长度0和长度1的chartAt0索引位置进行比较
                if (a > b) {
                    swap(strings, j, j + 1);
                }
            }

        }

    }
    private static void swap(String[] strings, int a, int b) {
        String temp = strings[a];
        strings[a] = strings[b];
        strings[b] = temp;
    }
}
