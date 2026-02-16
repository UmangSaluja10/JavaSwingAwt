// GridLayout = places components in a grid of cells.
//              Each component takes all the available space within it's cell,
//              and each cell is the same size
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;

public class gridLayout{
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(5,4,5,5));
        
        frame.add(new JButton("C"));
        frame.add(new JButton("()"));
        frame.add(new JButton("%"));
        frame.add(new JButton("/"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("x"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("-"));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("+"));
        frame.add(new JButton("+/-"));
        frame.add(new JButton("0"));
        frame.add(new JButton("."));
        frame.add(new JButton("="));
        frame.setVisible(true);
    }
}