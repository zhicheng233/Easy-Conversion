package cn.zhi_cheng233.ui;
import javax.swing.*;

public class main {
    public static void createAndShowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame frame = new JFrame("ÇáËÉ×ª»»");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lable = new JLabel("Text");
        frame.getContentPane().add(lable);
        frame.pack();
        frame.setVisible(true);

    }
    public static void showGUI(){

            //ÏÔÊ¾GUI
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    createAndShowGUI();
                }
            });

    }
}
