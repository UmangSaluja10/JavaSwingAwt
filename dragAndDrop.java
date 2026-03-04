import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class dragAndDrop
{
    public static class MyFrame extends JFrame{
        DragPanel dragPanel = new DragPanel();
        MyFrame(){
            this.add(dragPanel);
            this.setTitle("Drag & Drop demo");
            this.setSize(600,600);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }
    }
    public static class DragPanel extends JPanel{
        ImageIcon image = new ImageIcon("C:/Users/dell/Pictures/smileyEmoji.jpg");
        int WIDTH = image.getIconWidth();
        int HEIGHT = image.getIconHeight();
        Point imageCorner;
        Point prevPt;
        DragPanel(){
            imageCorner = new Point(0,0);
            ClickListener clickListener = new ClickListener();
            DragListener dragListener = new DragListener();
            this.addMouseListener(clickListener);
            this.addMouseMotionListener(dragListener);
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            image.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
        }
        
        private class ClickListener extends MouseAdapter{
            public void mousePressed(MouseEvent e){
                prevPt=e.getPoint();
            }
        }
        private class DragListener extends MouseMotionAdapter{
            public void mouseDragged(MouseEvent e){
                Point currentPt = e.getPoint();
                imageCorner.translate(
                (int)(currentPt.getX() - prevPt.getX()),
                (int)(currentPt.getY() - prevPt.getY())
                );
                prevPt=currentPt;
                repaint();
            }
        }
    }
    public static void main(String args[]){
        MyFrame myframe = new MyFrame();
    }
}
