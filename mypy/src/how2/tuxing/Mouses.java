package how2.tuxing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-06-12
 *  Time:    0:37
 *  Blog:     http://yejun.cf
 ******************/
public class Mouses {
    public static void main(String[] args) {
        JFrame f = new JFrame("标题");//窗口
        f.setSize(800, 600);//设置大小
//        f.setLocation(580,200);//设置显示位置
        //如果组件当前未显示，或者 c  - 确定窗口位置涉及的组件为 null，则此窗口将置于屏幕的中央
        f.setLocationRelativeTo(null);
        f.setLayout(null);//清空布局器，适合固定容器的大小

        final JLabel l = new JLabel();//JLabel 对象可以显示文本、图像或同时显示二者
        //添加图片
        ImageIcon i = new ImageIcon("G:/编程/java笔记/中级/shana_heiheihei.png");
        l.setIcon(i);//添加到图片
        //图片大小，位置为50,50，图片长宽为图片的长宽
        l.setBounds(375, 275, i.getIconWidth(), i.getIconHeight());
        f.add(l);
        l.addMouseListener(new MouseListener() {

            // 释放鼠标
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            // 按下鼠标
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            // 鼠标退出
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            // 鼠标进入
            public void mouseEntered(MouseEvent e) {
                //随机数random
                Random r = new Random();
                //x= 窗口的宽-组件的宽也就是图片的宽？
                //y= 窗口的长-组件的长也就是图片的长？
                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());

                l.setLocation(x, y);

            }

            // 按下释放组合动作为点击鼠标
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });




        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
