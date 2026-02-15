import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;

// FlowLayout = places components in a row, sized at their preferred size,
//              if the horizontal sapce in the container is too small,
//              the FlowLayout class uses the next available row.
public class flowLayout{
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setVisible(true);                 // sst visiblity at end so that the components added can be visible
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));  //LEADING is used to start adding components from top-left
        // we can use CENTER or TRAILING          . The 10 and 15 are the gap between the elements in the frame
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());
        
        //JButton button1 = new JButton("1");
        //frame.add(button1);
        //or directly we can do it like this:
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));
        
        frame.add(panel);
        frame.setVisible(true);
    }
}