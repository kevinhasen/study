package how2.tuxing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-06-13
 *  Time:    0:00
 *  Blog:     http://yejun.cf
 ******************/
public class Aniu {
    public static void main(String[] args) {
        JFrame f= new JFrame("切换显示");
        f.setSize(400,300);//设置大小
        f.setLocation(580,200);//设置显示位置
        f.setLayout(null);//清空布局器，适合固定容器的大小

        final JLabel l = new JLabel();//JLabel 对象可以显示文本、图像或同时显示二者
        //添加图片
        ImageIcon i = new ImageIcon("G:/编程/java笔记/中级/shana.png");
        l.setIcon(i);//添加到图片
        //图片大小，位置为50,50，图片长宽为图片的长宽
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());
        JButton b = new JButton("隐藏图片");//按钮
        b.setBounds(150, 200, 100, 30);//设置按钮大小

        // 给按钮 增加 监听
        b.addActionListener(new ActionListener() {

            // 当按钮被点击时，就会触发 ActionEvent事件
            // actionPerformed 方法就会被执行
            public void actionPerformed(ActionEvent e) {
                l.setVisible(false);//显示为关
            }
        });
        f.add(l);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
