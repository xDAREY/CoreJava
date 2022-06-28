package Gift;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Translator extends JFrame {
    JFrame frame;
    JLabel label1, label2, label3;
    JPanel panel;
    JButton button1 , button2;

    public Translator() {

        frame = new JFrame("Translator");

        Locale eng = new Locale ("en" , "EN");
        Locale spn = new Locale ("es" , "ES");
        Locale itl = new Locale ("it" , "IT");

        PropertyResourceBundle rb1 = (PropertyResourceBundle) ResourceBundle.getBundle("message", eng);
        PropertyResourceBundle rb2 = (PropertyResourceBundle) ResourceBundle.getBundle("message", spn);
        PropertyResourceBundle rb3 = (PropertyResourceBundle) ResourceBundle.getBundle("message", itl);

        panel = new JPanel();

        button1 = new JButton("Translate to Italian");
        button2 = new JButton("Translate to English");

        panel.add(button1);
        panel.add(button2);



        label1 = new JLabel(rb1.getString(("First")));
        label2 = new JLabel(rb2.getString(("Second")));
        label3 = new JLabel(rb3.getString(("Third")));

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        //FOR FRAME
        frame.add(panel);
        frame.setDefaultCloseOperation(3);
        frame.setSize(600, 600);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocation(600, 90);
        frame.setLocationRelativeTo(null);

        //ACTION LISTENERS
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(rb1.getString(("First")));
                label2.setText(rb2.getString(("Second")));
                label3.setText(rb3.getString(("Third")));

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(rb1.getString(("First")));
                label2.setText(rb2.getString(("Second")));
                label3.setText(rb3.getString(("Third")));
            }
        });


}
    public static void main(String[] args) {
       Translator obj = new Translator();
    }
}
