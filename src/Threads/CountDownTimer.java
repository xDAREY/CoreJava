package Threads;

import javax.swing.*;
import java.awt.*;

public class CountDownTimer extends Thread {
        JTextField textField;
        JLabel label;
        JFrame frame;

        @Override
        public void run(){
            buildGUI();
        }
        void display(){
            for (int i = 60; i >=0; i--) {
                try{
                    Thread.sleep(1000);
                    String s = Integer.toString(i);
                    textField.setText(" " +s + " seconds to go....." );
                }catch (Exception e){
                    System.out.println(e);
                }
            }
            JOptionPane.showMessageDialog(frame, "Time up!!!");
            textField.setText("");
        }

     void buildGUI() {
        frame = new JFrame ("Countdown Timer");
        JPanel panel = new JPanel();
        label = new JLabel("");
        textField = new JTextField(15);

        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.RED);
        panel.setBackground(Color.GRAY);
        frame.add(panel);
        panel.add(textField);
        panel.add(label);

        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);

    }

    public static void main(String[] args) {
        CountDownTimer dc = new CountDownTimer();
        dc.run();
        dc.display();

    }
}
