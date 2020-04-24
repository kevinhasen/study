package how2.tuxing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-06-12
 *  Time:    0:35
 *  Blog:     http://yejun.cf
 *  貌似不能同时和按钮事件一起用
 *  keyCode与方向的对应关系
 *  38 上
 40 下
 37 左
 39 右
 *  getKeyChar():处理的是比较高层的事件，返回的是每欠敲击键盘后得到的字符（中文输入法下就是汉字）。
 *  getKeyCode():键盘上每一个按钮都有对应码(Code),可用来查知用户按了什么键，返回当前按钮的数值
 *  getKeyText():返回与此事件中的键关联的字符。比如getKeyText(e.getKeyCode())就返回你所按下的键盘
 ******************/
public class Jianpan {
    public static void main(String[] args) {
        JFrame f = new JFrame("标题");//窗口
        f.setSize(400,300);//设置大小
        f.setLocation(580,200);//设置显示位置
        f.setLayout(null);//清空布局器，适合固定容器的大小

        final JLabel l = new JLabel();//JLabel 对象可以显示文本、图像或同时显示二者
        //添加图片
        ImageIcon i = new ImageIcon("G:/编程/java笔记/中级/shana.png");
        l.setIcon(i);//添加到图片
        //图片大小，位置为50,50，图片长宽为图片的长宽
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());

        // 增加键盘监听
        f.addKeyListener(new KeyListener() {

            // 键被弹起
            public void keyReleased(KeyEvent e) {

                // 39代表按下了 “右键”
                if (e.getKeyCode() == 39) {
                    // 图片向右移动 （y坐标不变，x坐标增加）
                    l.setLocation(l.getX() + 10, l.getY());
                }else if (e.getKeyCode() == 37){//37 左
                    l.setLocation(l.getX()-10,l.getY());
                }else if (e.getKeyCode() == 40){//40 下
                    l.setLocation(l.getX(),l.getY()+10);
                }else if (e.getKeyCode() == 38){//38 上
                    l.setLocation(l.getX(),l.getY()-10);
                }
            }

            //键被按下
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            // 一个按下弹起的组合动作
            public void keyTyped(KeyEvent e) {

            }
        });



        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
