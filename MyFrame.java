//TextField in Java

import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JTextField textField;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button = new JButton("Submit");
        button.addActionListener(this);
        
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(new Color(0,255,0));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);   // Color of curser on textField
        textField.setText("Username");    // Defalut text 
        //textField.setEditable(false);    // Username(default text) is no longer editable
        
        
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            //dispose();
            System.out.println("Welcome "+textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
    public static void main(String[] args) {
        new MyFrame(); 
    }
}