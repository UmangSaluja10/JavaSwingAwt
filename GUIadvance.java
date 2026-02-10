import java.util.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class GUIadvance{
    public static class myFrame extends JFrame{
        myFrame(){      
        this.setSize(420,420);                // sets a and y dimension of frame
        this.setTitle("JFrame Title");        // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application with x button on top
        this.setResizable(false);             // force to not to change the dimensions of the JFrame
        this.setVisible(true);                // makes frame visible
        ImageIcon image = new ImageIcon("C:/Users/dell/Downloads/dbz2.jpg");   // will create an image icon
        this.setIconImage(image.getImage());   // set icon of JFrame
        this.getContentPane().setBackground(new Color(50, 50, 50));  //to take input on JFrame and set the color of the window
        
        }
    }
    public static void main(String args[]){
        /*
        JFrame frame = new JFrame();           // create a frame
        frame.setSize(420,420);                // sets a and y dimension of frame
        frame.setTitle("JFrame Title");        // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application with x button on top
        frame.setResizable(false);             // force to not to change the dimensions of the JFrame
        frame.setVisible(true);                // makes frame visible
        ImageIcon image = new ImageIcon("C:/Users/dell/Downloads/dbz2.jpg");   // will create an image icon
        frame.setIconImage(image.getImage());   // set icon of JFrame
        frame.getContentPane().setBackground(new Color(50, 50, 50));  //to take input on JFrame and set the color of the window
        */
        myFrame myframe = new myFrame();
        
    }
}