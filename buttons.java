import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class buttons{
    public static class MyFrame extends JFrame implements ActionListener{
        JButton button;
        JLabel label;
        MyFrame(){
            ImageIcon icon = new ImageIcon("C:/Users/dell/Downloads/logo_math.jpg");
            
            
            button = new JButton();
            button.setBounds(100,50,350,200);
            //button.addActionListener(e -> System.out.println("poo"));       // lamda expression :)
            button.addActionListener(this);
            button.setText("Button :)");
            button.setFocusable(false);
            button.setIcon(icon);
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.TOP);
            button.setFont(new Font("Comic Sans",Font.BOLD,25));
            //button.setIconTextGap(-15);                                  // Gap between text and icon
            button.setForeground(Color.cyan);
            button.setBackground(new Color(0,0,0));
            button.setBorder(BorderFactory.createEtchedBorder());
            
            ImageIcon icon1 = new ImageIcon("C:/Users/dell/Downloads/logo_math.jpg");
            label= new JLabel();
            label.setIcon(icon1);
            label.setBounds(150,250,350,200);
            label.setVisible(false);                                       // should not visible without button click
            
            
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(700,700);
            this.setVisible(true);
            this.add(button);
            this.add(label);
        }
        @Override
        public void actionPerformed(ActionEvent e){                    //button can be clicked once 
            if(e.getSource()==button){
                System.out.println("yoo");
                button.setEnabled(false);
                label.setVisible(true);
            }
        }
    }
    public static void main(String args[]){
        MyFrame frame=new MyFrame();
        
    }
}