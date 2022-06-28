//OLUWADARE EMMANUEL CHATBOT

package HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class ChatBot extends JFrame {
    JFrame frame;
    JTextField textField;
    JTextArea textArea;
    JButton btn;
    JLabel lbl;
    Timer timer = new Timer();
    TimerTask timerTask;
    String text;

    // CONSTRUCTOR!!!
    ChatBot(){
        //INSTANCE OF MY IMPORTED METHOD!!!!!!!
        frame = new JFrame();
        textField = new JTextField();
        textArea = new JTextArea();
        btn = new JButton("REPLY");
        lbl = new JLabel();

       // btn.add(lbl);

        //FOR FRAME!!
        frame.setDefaultCloseOperation(3);
        frame.setSize(550, 550);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setTitle("MY CHATBOT");
        frame.setLocation(600,90);
        frame.getContentPane().setBackground(Color.GREEN);
        frame.add(textField);
        frame.add(textArea);
        frame.add(btn);
        btn.setSize(190,30);
        btn.setLocation(330,460);
        btn.setBackground(Color.WHITE);

        //FOR TEXTAREA!!!
        textArea.setSize(510,450);
        textArea.setLocation(10,5);
        textArea.setBackground(Color.BLACK);
        textArea.setEditable(false);

        //FOR TEXTFIELD!!!
        textField.setSize(350,30);
        textField.setLocation(10,460);
        textField.setBackground(Color.pink);
        textField.getScrollableTracksViewportHeight();

        //IMPLEMENTING ACTIONLISTENER!!
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sendChat();
            }
        });

        btn.addActionListener(e -> {
            sendChat();
        });
    }

    public void Bot(String s) {
        textArea.append(" ChatBot >> "+s+"\n" +"\n");
    }

    public void sendChat(){

            text=textField.getText().toLowerCase();
            System.out.println(text);
            if(text.strip() != "") {
                textArea.setForeground(Color.red);
                textArea.append(" You >> "+text+"\n" + "\n");
                textField.setText("");
                timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        // PRE-DEFINED RESPONSE
                        if(text.contains("hi")) {
                            Bot("Hi there, Welcome to DareChatBot! How can i help ?");
                        }
                        else if(text.contains("hello")) {
                            Bot("Hello there, Welcome to DareChatBot! How can i help ?");
                        }
                        else if(text.contains("hey")) {
                            Bot("Hey there, Welcome to DareChatBot! How can i help ?");
                        }
                        else if(text.contains("who is your mother")) {
                            Bot("MRS JAVA");
                        }
                        else if(text.contains("who is your father")) {
                            Bot("MR DARE");
                        }
                        else if(text.contains("who are your parents")) {
                            Bot("MR DARE & MRS JAVA");
                        }
                        else if(text.contains("do you eat")) {
                            Bot("Yes ofc!");
                        }
                        else if(text.contains("good morning")) {
                            Bot("Good morning, Did you dream about robots ?");
                        }
                        else if(text.contains("good afternoon")) {
                            Bot("Good afternoon, How is it going ?");
                        }
                        else if(text.contains("good evening")) {
                            Bot("Good evening, Hope your day was great :) ?");
                        }
                        else if(text.contains("good night")) {
                            Bot("Good night!");
                        }
                        else if(text.contains("what are you")) {
                            Bot("I'm just a Chat Bot, here to keep you company");
                        }
                        else if (text.contains("how are you")){
                            Bot("I'm good, would you like a cup of virtual coffee?" +"\n"+
                                    "                     " +  " Ooops i forgot i'm the only AI here.");
                        }
                        else if(text.contains("what's up")) {
                            Bot("Nothing much! human");
                        }
                        else if(text.contains("what time is it")) {
                            Bot("I can't answer that, would like me to access the clock app ? ");
                        }
                        else if(text.contains("how old are you")) {
                            Bot("i can't say");
                        }
                        else if(text.contains("sup")) {
                            Bot("Nothing much");
                        }
                        else if(text.contains("bye")) {
                            Bot("Goodbye! see you soon");
                        }
                        else if (text.contains("goodbye")){
                            Bot("Goodbye! see you soon!");
                        }
                        else
                            Bot("Sorry, I didn't get that");
                    }
                };
                //THIS HELPS IN THE DELAY BEFORE THE BOT REPLIES THE USER
                timer.schedule(timerTask, 1000);
            }

    }


    public static void main(String[] args) {
    new ChatBot();
    }

}