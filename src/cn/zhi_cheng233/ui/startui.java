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
        //����ͼƬ
        //��ͼƬ����JLabel����ٺ�JFrameһ����ʾ
        ImageIcon bg=new ImageIcon("src/Resources/StartUI/StartPictures.png");
        JLabel label=new JLabel(bg);//�½�label���������bgͼƬ
        //����ͼƬ����������lable�������
        label.setSize(bg.getIconWidth(),bg.getIconHeight());
        frame.getLayeredPane().add(label,new Integer (Integer.MIN_VALUE));
        JPanel pan=(JPanel)frame.getContentPane();
        pan.setOpaque(false);
        //��������
        JLabel loadtext = new JLabel("Waiting...�ȴ���ʼ����Ӧ��...");
        loadtext.setBounds(5,bg.getIconHeight()-60,bg.getIconWidth(),100);
        loadtext.setForeground(Color.WHITE);
        loadtext.setFont(new Font("΢���ź�", Font.PLAIN, 14));
        loadtext.setVisible(true);
        frame.add(loadtext);

        //����ͼƬ���������ô��ڳ���
        frame.setSize(bg.getIconWidth(),bg.getIconHeight());
       //���ô����ޱ߿�
        frame.setLocationRelativeTo(null);//����
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);// ����������,

        main.showGUI();

        frame.dispose();//����������,�ͷ��ڴ���Դ



    }
    

    public static void showGUI(){
        FlatDarculaLaf.setup();

        //��ʾGUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    createAndShowGUI();
                }
        });

    }




}
