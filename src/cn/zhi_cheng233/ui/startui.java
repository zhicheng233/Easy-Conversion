package cn.zhi_cheng233.ui;

import cn.zhi_cheng233.Start;
import cn.zhi_cheng233.function.update;
import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.*;

public class startui {
    public static void createAndShowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame frame = new JFrame("starting....");
        frame.setLayout(null);
        //设置图片
        //将图片传入JLabel组件再和JFrame一起显示
        ImageIcon bg=new ImageIcon("src/Resources/StartUI/StartPictures.png");
        JLabel label=new JLabel(bg);//新建label组件并传入bg图片
        //根据图片像素来设置lable组件长宽
        label.setSize(bg.getIconWidth(),bg.getIconHeight());
        frame.getLayeredPane().add(label,new Integer (Integer.MIN_VALUE));
        JPanel pan=(JPanel)frame.getContentPane();
        pan.setOpaque(false);
        //加载文字
        JLabel loadtext = new JLabel("Waiting...等待初始化响应中...");
        loadtext.setBounds(5,bg.getIconHeight()-60,bg.getIconWidth(),100);
        loadtext.setForeground(Color.WHITE);
        loadtext.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        loadtext.setVisible(true);
        frame.add(loadtext);

        //根据图片像素来设置窗口长宽
        frame.setSize(bg.getIconWidth(),bg.getIconHeight());
       //设置窗口无边框
        frame.setLocationRelativeTo(null);//居中
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);// 本窗口隐藏,

        main.showGUI();

        frame.dispose();//本窗口销毁,释放内存资源



    }
    

    public static void showGUI(){
        FlatDarculaLaf.setup();

        //显示GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    createAndShowGUI();
                }
        });

    }




}
