package Threads;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class Race implements Runnable {
    String ThreadName;
    JLabel label;
    JPanel panel1, panel2, panel3;
    JFrame frame;

    public Race(){
        buildGUI();
    }

    @Override
    public void run(){
        if (Thread.currentThread().getName().equals("ObstacleA")){
            runObstacleA();
        }
        if (Thread.currentThread().getName().equals("ObstacleB")){
            runObstacleB();
        }
        if (Thread.currentThread().getName().equals("ObstacleC")){
            runObstacleC();
        }

    }
    public void runObstacleA(){
        Random ran = new Random();
        int s = ran.nextInt(1000);
        for (int i = -10; i<400; i++){
            panel1.setBounds(i,s, 20,20);

        try {
            Thread.sleep(5);
        }
        catch (InterruptedException e){
            System.out.println(e);
        };

        }
        runObstacleC();
    }
    public void runObstacleB(){
        Random ran = new Random();
        int r = ran.nextInt(1000);
        for (int i = -10; i<400; i++){
            panel2.setBounds(i,r, 20,20);

            try {
                Thread.sleep(11);
            }
            catch (InterruptedException e){
                System.out.println(e);
            };

        }
        runObstacleA();
    }
    public void runObstacleC(){
        Random ran = new Random();
        int m = ran.nextInt(1000);
        for (int i = -10; i<400; i++){
            panel3.setBounds(i,m, 20,20);

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                System.out.println(e);
            };

        }
        runObstacleB();
    }

     public void buildGUI(){
        frame = new JFrame("Moving Objects");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(400,200);
        frame.setLayout(null);

        label = new JLabel("");
        label.setBounds(10,10, 400, 20);
        frame.add(label);

        panel1 = new JPanel();
        panel1.setSize(20,20);
        panel1.setBackground(Color.black);
        panel1.setBounds(10,80,20,20);
        frame.add(panel1);

        panel2 = new JPanel();
        panel2.setSize(20,20);
        panel2.setBackground(Color.red);
        panel2.setBounds(10,80,20,20);
        frame.add(panel2);

        panel3 = new JPanel();
        panel3.setSize(20,20);
        panel3.setBackground(Color.blue);
        panel3.setBounds(10,80,20,20);
        frame.add(panel3);

     }

    public static void main(String[] args) {
        Race obj = new Race();
        Thread Obstancle1 = new Thread(obj);
        Thread Obstancle2 = new Thread(obj);
        Thread Obstancle3 = new Thread(obj);

        Obstancle1.setName("ObstacleA");
        Obstancle2.setName("ObstacleB");
        Obstancle3.setName("ObstacleC");

        Obstancle1.start();
        Obstancle2.start();
        Obstancle3.start();
    }
}
