package HomeWork;

import javax.swing.*;

public class calculator2 extends JFrame {
    JFrame frame;
    JLabel label1, label2, label3;
    JPanel panel;
    JButton button1 , button2;

    calculator2() {
        //FOR LABEL
        label1 = new JLabel("Three");
        label2 = new JLabel("Second");
        label3 = new JLabel("One");

        //FOR PANEL
        panel = new JPanel();
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(button1);
        panel.add(button2);

        //FOR BUTTON
        button1 = new JButton("Translate to Italian");
        button2 = new JButton("Translate to English");

        //FOR FRAME
        frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setSize(600, 600);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setTitle("Translator");
        //  frame.setLocation(600, 90);
        frame.add(panel);





    }

    public static void main(String[] args) {
        calculator2 obj = new calculator2();
    }
}
