package Group4.Banking;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Homepage extends JFrame {

    JFrame frame;
    JTabbedPane tp;
    JButton Airtime,Betting,CableTv,send,exit;
    JLabel AccountBalance, transfer,greet,Amount,receiverAcc,narration;
    JTextField AccBalField,transField,AmountField,receiverField,narrateField;
    JPanel DashPanel,Tfpanel,AirPanel,SetPanel;
 //   ImageIcon image = new ImageIcon(getClass().getResource("AccBal.jpg"));

    Homepage() {
        frame = new JFrame();

        //MY LABELS
        greet = new JLabel();
        AccountBalance = new JLabel();
      //  transfer = new JLabel();
        Amount = new JLabel();
        receiverAcc = new JLabel();
        narration = new JLabel();
        //

        //MY TEXTFIELDS
        AccBalField = new JTextField();
      //  transField = new JTextField();
        AmountField = new JTextField();
        receiverField= new JTextField();
        narrateField = new JTextField();
        //

        tp = new JTabbedPane();

        //MY PANELS
        DashPanel = new JPanel();
        Tfpanel = new JPanel();
        AirPanel = new JPanel();
        SetPanel = new JPanel();
        //

        //MY BUTTONS
        Airtime = new JButton("Airtime");
        Betting = new JButton("Betting");
        CableTv = new JButton("CableTv");
        send = new JButton("SEND MONEY");
        send.setBounds(130,190,120,20);
        send.setFocusable(false);
        send.setBackground(Color.GRAY);
        send.setForeground(Color.RED);
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //

        Border border = BorderFactory.createLineBorder(Color.GRAY);


        greet.setText("Welcome");
        greet.setFont(new Font("Cambria Math", Font.BOLD, 25));
        greet.setBounds(120,7,700,250);
        greet.setForeground(Color.BLUE);
        greet.setVerticalAlignment(JLabel.TOP);
        greet.setHorizontalAlignment(JLabel.LEFT);


        AccountBalance.setText("Account Balance");
        AccountBalance.setFont(new Font("Cambria Math", Font.BOLD, 20));
        AccountBalance.setForeground(Color.BLUE);
        AccountBalance.setBounds(7,50,700,250);
        AccountBalance.setVerticalAlignment(JLabel.TOP);
        AccountBalance.setHorizontalAlignment(JLabel.LEFT);


        AccBalField.setBounds(160,50,80,20);
        AccBalField.setEditable(false);
       AccBalField.setBackground(Color.RED);
       AccBalField.setBorder(border);


        Amount.setText("Amount");
        Amount.setFont(new Font("Cambria Math", Font.BOLD, 20));
        Amount.setForeground(Color.BLUE);
        Amount.setBounds(7,50,700,250);
        Amount.setVerticalAlignment(JLabel.TOP);
        Amount.setHorizontalAlignment(JLabel.LEFT);

        AmountField.setBounds(100,50,110,20);
        AmountField.setEditable(true);
        AmountField.setBackground(Color.gray);
        AmountField.setBorder(border);

        receiverAcc.setText("ACCOUNT NUMBER");
        receiverAcc.setFont(new Font("Cambria Math", Font.BOLD, 20));
        receiverAcc.setForeground(Color.BLUE);
        receiverAcc.setBounds(7,90,700,250);
        receiverAcc.setVerticalAlignment(JLabel.TOP);
        receiverAcc.setHorizontalAlignment(JLabel.LEFT);

        receiverField.setBounds(200,90,120,20);
        receiverField.setEditable(true);
        receiverField.setBackground(Color.gray);
        receiverField.setBorder(border);

        narration.setText("NARRATION");
        narration.setFont(new Font("Cambria Math", Font.BOLD, 20));
        narration.setForeground(Color.BLUE);
        narration.setBounds(7,130,700,250);
        narration.setVerticalAlignment(JLabel.TOP);
        narration.setHorizontalAlignment(JLabel.LEFT);

        narrateField.setBounds(150,130,120,20);
        narrateField.setEditable(true);
        narrateField.setBackground(Color.gray);
        narrateField.setBorder(border);



        DashPanel.setBackground(Color.GRAY);
        DashPanel.add(greet);
        DashPanel.add(AccountBalance);
        DashPanel.add(AccBalField);
        DashPanel.setBackground(Color.GRAY);
        DashPanel.setLayout(new BorderLayout());


        Tfpanel.add(new JLabel("Transfer"));
        Tfpanel.add(Amount);
        Tfpanel.add(AmountField);
        Tfpanel.add(receiverAcc);
        Tfpanel.add(receiverField);
        Tfpanel.add(narration);
        Tfpanel.add(narrateField);
        Tfpanel.add(send);
        Tfpanel.setBackground(Color.DARK_GRAY);
        Tfpanel.setLayout(new BorderLayout());


        AirPanel.add(Airtime);
        AirPanel.add(Betting);
        AirPanel.add(CableTv);

        SetPanel.add(new JLabel("Settings"));

        tp.setFocusable(false);
        tp.setBackground(Color.pink);

        //adding of panels to the TabbedPane
        tp.addTab("DashBoard", DashPanel);
        tp.addTab("Transfer",Tfpanel);
        tp.addTab("Airtime & Others", AirPanel);
        tp.addTab("Settings", SetPanel);
        tp.setTabPlacement(JTabbedPane.BOTTOM);


        //FOR FRAME!!
        frame.add(tp);
        frame.setDefaultCloseOperation(3);
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setTitle("Node-Bank");
        frame.setLocation(500,130);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Homepage();
    }
}
