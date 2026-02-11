import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;


// JLabel = a GUI display area for a string of text, an image, or both
public class MyLabelDemo{
    public static void main(String args[]){
        ImageIcon image = new ImageIcon("C:/Users/dell/Downloads/logo_math.jpg");  // adding image icon
        Border border = BorderFactory.createLineBorder(Color.green,3); // adding border
        JLabel label = new JLabel();              // create a label
        label.setText("Bro do you even code?");    // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);  // set text to LEFT, CENTER or RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP);       // set text to TOP, CENTER or BOTTOM of image icon
        label.setForeground(new Color(255,190,190));     // font color of text
        label.setFont(new Font("MV Boli",Font.BOLD,50)); // font of text
        label.setIconTextGap(80);                        // set gap between image and text(can give a negative value also)
        label.setBackground(Color.black);                // set background color;
        label.setOpaque(true);                           // display background color
        label.setBorder(border);                         // appling the border in the label
        label.setVerticalAlignment(JLabel.CENTER);       // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);       // set horizontal position of icon+text within label
        //label.setBounds(0,0,300,300);                    // set x and y position within frame as well as dimension
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);                            //make a layout for the frame 
        frame.setVisible(true);
        frame.add(label);
        frame.pack();                                         // use add() before pack!!
    }
}