package Group4.Banking;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class Login extends JFrame {

    JFrame frame= new JFrame();
    JButton loginButton = new JButton("Login");
    JTextField userfield = new JTextField();
    JPasswordField passfield = new JPasswordField();
    JLabel username = new JLabel("USERNAME");
    JLabel password = new JLabel("PASSWORD");
    JLabel message = new JLabel("");
    ImageIcon node;
    Image img;
    Login(){

        img = new ImageIcon(("loginode.png")).getImage();
        node = new ImageIcon(getClass().getResource("Node2.png"));

        username.setBounds(50,100,75,25);
        password.setBounds(50,150,75,25);

        message.setBounds(125,250,250,35);
        message.setFont(new Font(null,Font.ITALIC, 25));

        userfield.setBounds(125,100,200,25);
        passfield.setBounds(125,150,200,25);

        loginButton.setBounds(150,200,100,25);
        loginButton.setFocusable(false);
        loginButton.setBackground(Color.pink);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = null;
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","" );
                    String sql = "Select * from login where Username=? and password=?";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, userfield.getText());
                    pst.setString(2, passfield.getText());
                    ResultSet rs = pst.executeQuery();

                    if(rs.next()){
                        JOptionPane.showMessageDialog(
                                null, "Login successful");
                        frame.dispose();
                      //  Homepage homepage = new Homepage();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Username or Password incorrect");
                        userfield.setText("");
                        passfield.setText("");
                    }
                    conn.close();

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex);

                }
            }
        });

        frame.add(username);
        frame.add(password);
        frame.add(message);
        frame.add(userfield);
        frame.add(passfield);
        frame.add(loginButton);
        frame.setDefaultCloseOperation(3);
        frame.setSize(400,400);
        frame.setLocation(500,130);
        frame.setIconImage(node.getImage());
        frame.setLayout(null);
        frame.setUndecorated(true);
        frame.setVisible(true);
        //   frame.pack();
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(img, 0 , 0, null);
    }
}
