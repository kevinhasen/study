package how2.tuxing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/*******************
 *  Created by  IntelliJ  Idea 2018.1
 *  Author:  Kevin Hasen
 *  Date:    2018-06-12
 *  Time:    0:41
 *  Blog:     http://yejun.cf
 *  MouseAdapter 鼠标监听适配器
 *  在写监听器的时候，会实现MouseListener。
 *  但是MouseListener里面有很多方法实际上都没有用到，比如mouseReleased
 *  这个时候就可以使用 鼠标监听适配器，MouseAdapter 只需要重写必要的方法即可
 ******************/
public class Shipeiqi {
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
        // MouseAdapter 适配器，只需要重写用到的方法，没有用到的就不用写了
        l.addMouseListener(new MouseAdapter() {

            // 只有mouseEntered用到了
            public void mouseEntered(MouseEvent e) {

                Random r = new Random();

                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());

                l.setLocation(x, y);
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
