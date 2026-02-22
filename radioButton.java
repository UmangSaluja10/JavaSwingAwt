import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;


public class radioButton{
    public static class MyFrame extends JFrame implements ActionListener{
        JRadioButton pizzaButton;
        JRadioButton hamburgerButton;
        JRadioButton hotdogButton;
        ImageIcon icon;
        MyFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());
            
            pizzaButton = new JRadioButton("Pizza🍕");
            hamburgerButton = new JRadioButton("Hamburger🍔");
            hotdogButton = new JRadioButton("Hotdog🌭");
            
            pizzaButton.addActionListener(this);
            hamburgerButton.addActionListener(this);
            hotdogButton.addActionListener(this);
            
            icon = new ImageIcon("C:/Users/dell/Pictures/crosspng.jpg");    // can do for pizza, burger and hotdog..
            //pizzaButton.setIcon(icon);
            //hamburgerButton.setIcon(icon);
            //hotdogButton.setIcon(icon);
            
            ButtonGroup group = new ButtonGroup();
            group.add(pizzaButton);
            group.add(hamburgerButton);
            group.add(hotdogButton);
            
            this.add(pizzaButton);
            this.add(hamburgerButton);
            this.add(hotdogButton);
            this.pack();
            this.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e){
            dispose();
            if(e.getSource()==pizzaButton){
                System.out.println("Aaj tumhari pizza party meri taraf se");
            }
            else if(e.getSource()==hamburgerButton){
                System.out.println("Aaj meri burger party tumhari taraf se");
            }
            else if(e.getSource()==hotdogButton){
                System.out.println("Aaj tumhari Garam Kutte ki party meri taraf se"); 
            }
        }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}