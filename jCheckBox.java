import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class jCheckBox{
    public static class MyFrame extends JFrame implements ActionListener{
        JButton button;
        JCheckBox checkBox;
        ImageIcon xIcon;
        ImageIcon checkIcon;
        MyFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());
            
            xIcon = new ImageIcon("C:/Users/dell/Pictures/crosspng.jpg");
            checkIcon = new ImageIcon("C:/Users/dell/Pictures/tickpng.jpg");

            
            button = new JButton();
            button.setText("Submit");
            button.addActionListener(this);
            button.setFocusable(false);
            
            checkBox = new JCheckBox();
            checkBox.setText("I am not a robot");
            checkBox.setFocusable(false);     // remove the box visible on the text
            checkBox.setFont(new Font("Consolas",Font.PLAIN,30));
            checkBox.setIcon(xIcon);
            checkBox.setSelectedIcon(checkIcon);
            
            this.add(button);
            this.add(checkBox);
            this.pack();
            this.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button){
                if(checkBox.isSelected()){
                    System.out.println("You are not a robot");
                }
                else{
                    System.out.println("You are a robot");
                }
            }
        }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}