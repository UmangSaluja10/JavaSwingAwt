import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class mouseListener2
{
    public static class MyFrame extends JFrame implements MouseListener{
        JLabel label;
        ImageIcon image1;
        ImageIcon image2;
        ImageIcon image3;
        ImageIcon image4;
        ImageIcon image5;
        MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout( new FlowLayout());
        
        label = new JLabel();
        label.addMouseListener(this);
        //this.addMouseListener(this);    // if we use this the the component area would be the frame itself not the label
        
        image1 = new ImageIcon("C:/Users/dell/Pictures/smileyEmoji.jpg");
        image2 = new ImageIcon("C:/Users/dell/Pictures/handSmiley.jpg");
        image3 = new ImageIcon("C:/Users/dell/Pictures/laughingEmoji.jpg");
        image4 = new ImageIcon("C:/Users/dell/Pictures/appriciationEmoji.jpg");
        image5 = new ImageIcon("C:/Users/dell/Pictures/laughingEmoji2.jpg");
        
        label.setIcon(image1);
        
        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        // Invoked when a mouse button had been pressed and released on a component
        
    }
    @Override 
    public void mousePressed(MouseEvent e){
        // Invoked when a mouse button is pressed on a component
        label.setIcon(image3);
    }
    @Override 
    public void mouseReleased(MouseEvent e){
        // Invoked when a mouse button had been released
        label.setIcon(image2);
    }
    @Override 
    public void mouseEntered(MouseEvent e){
        // Invoked when a mouse entered the area of the component 
        label.setIcon(image4);
    }
    @Override 
    public void mouseExited(MouseEvent e){
        // Invoked when a mouse exited the area of the comonent
        label.setIcon(image1);
    }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}
