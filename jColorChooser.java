import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class jColorChooser
{
    public static class MyFrame extends JFrame implements ActionListener{
        JButton button;
        JButton button1;
        JLabel label;
        MyFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());
            
            button = new JButton("Pick a Text-Colour");
            button.addActionListener(this);
            button1 = new JButton("Pick a Back-Colour");
            button1.addActionListener(this);
            
            label= new JLabel();
            label.setBackground(Color.white);
            label.setOpaque(true);
            label.setText("This is some text");
            label.setFont(new Font("MV Boli",Font.PLAIN,100));
            
            this.add(button);
            this.add(button1);
            this.add(label);
            this.pack();
            this.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button){
                JColorChooser colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(null,"Pick a color..I guess",Color.black);    
                //(parent component, title,initial color)
                label.setForeground(color);
            }
            if(e.getSource()==button1){
                JColorChooser colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(null,"Pick a color..I guess",Color.black);    
                //(parent component, title,initial color)
                label.setBackground(color);
            }
        }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}
