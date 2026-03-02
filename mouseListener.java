import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class mouseListener
{
    public static class MyFrame extends JFrame implements MouseListener{
        JLabel label;
        MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);
        //this.addMouseListener(this);    // if we use this the the component area would be the frame itself not the label
        
        this.add(label);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        // Invoked when a mouse button had been pressed and released on a component
        //System.out.println("You clicked the mouse");
    }
    @Override 
    public void mousePressed(MouseEvent e){
        // Invoked when a mouse button is pressed on a component
        //System.out.println("You pressed the mouse");
        label.setBackground(Color.yellow);
    }
    @Override 
    public void mouseReleased(MouseEvent e){
        // Invoked when a mouse button had been released
        //System.out.println("You released the mouse");
        label.setBackground(Color.blue);
    }
    @Override 
    public void mouseEntered(MouseEvent e){
        // Invoked when a mouse entered the area of the component 
        //System.out.println("You entered the component area");
        label.setBackground(Color.green);
    }
    @Override 
    public void mouseExited(MouseEvent e){
        // Invoked when a mouse exited the area of the comonent
        //System.out.println("You exited the component area");
        label.setBackground(Color.red);
    }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}
