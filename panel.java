import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.BorderLayout;

public class panel{
    public static void main(String args[]){
        ImageIcon icon = new ImageIcon("C:/Users/dell/Downloads/logo_math.jpg");
        
        JLabel label = new JLabel();
        label.setText("Jinne mera dil luttya!! OHHO!!!!");
        label.setIcon(icon);
        label.setForeground(new Color(255,255,255));    
        label.setFont(new Font("MV Boli",Font.BOLD,10));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(10,50,200,200);
        
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());    // setBounds is not needed 
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);                // setBounds is needed
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        /*greenPanel.add(label);
        redPanel.add(label);*/
        bluePanel.add(label);
    }
}