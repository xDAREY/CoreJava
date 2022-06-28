package Group4.Banking;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launchpage extends JFrame {
    JFrame frame;
    JLabel header;
    ImageIcon node;
    Timer time;

    Launchpage(){
        frame = new JFrame();
        header = new JLabel("");
        node = new ImageIcon(getClass().getResource("node.png"));

        Border border = BorderFactory.createLineBorder(Color.BLACK);

        header.setFont(new Font("Verdana", Font.BOLD, 25));
        header.setForeground(Color.RED);
        header.setBounds(0,0,700,250);
        header.setIcon(node);
        header.setOpaque(true);
        header.setIconTextGap(-150);
        header.setBackground(Color.WHITE);
        header.setHorizontalTextPosition(JLabel.CENTER);
        header.setVerticalTextPosition(JLabel.TOP);
        header.setBorder(border);
        header.setVerticalAlignment(JLabel.CENTER);
        header.setHorizontalAlignment(JLabel.CENTER);

        frame.add(header);


        frame.setDefaultCloseOperation(3);
        frame.setSize(550,350);
        frame.getContentPane().setBackground(Color.RED);
        frame.setLocation(550,300);
        frame.setUndecorated(true);
        frame.setVisible(true);

        time = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Login();
                time.stop();
            }
        });
                time.start();
    }

}
