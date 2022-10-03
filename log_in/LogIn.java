package javaapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaApplication implements ActionListener {
private static JLabel userlabel; 
private static JLabel passwordlabel;
private static JTextField passwordText;
private static JTextField userText;
private static JButton button;
private static JLabel success;
    
    public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setSize(350,200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JPanel panel = new JPanel();
       frame.add(panel);
       
       panel.setLayout(null);
          
       userlabel = new JLabel("Username");
       userlabel.setBounds(10,20,80,25);
       panel.add(userlabel);
       
       passwordlabel = new JLabel("Password");
       passwordlabel.setBounds(10,55,80,25);
       panel.add(passwordlabel);
        
       userText = new JTextField(20);
       userText.setBounds(100,20,165,25);
       panel.add(userText);
       
       passwordText = new JTextField(20);
       passwordText.setBounds(100,55,165,25);
       panel.add(passwordText);
       
       button = new JButton("Log In");
       button.setBounds(110,110,80,25);
       button.addActionListener(new JavaApplication());
       panel.add(button);
       
       success = new JLabel("");
       success.setBounds(10,20,165,25);
       panel.add(success);
        
        frame.setVisible(true);
    }
        @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Log In success");
    }

   
}
    
  
