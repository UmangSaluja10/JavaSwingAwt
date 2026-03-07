import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class animations
{
    public static class MyFrame extends JFrame{
        MyPanel panel;
        MyFrame(){
            panel= new MyPanel();
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.add(panel);
            this.pack();
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        }
    }
    public static class MyPanel extends JPanel implements ActionListener{
        final int PANEL_WIDTH = 1000;
        final int PANEL_HEIGHT = 650;
        Image enemy;
        Image backgroundImage;
        Timer timer;
        int xVelocity = 2;
        int yVelocity = 3;
        int x=0;
        int y=0;
        MyPanel(){
            this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
            this.setBackground(Color.white);
            enemy= new ImageIcon("C:/Users/dell/Pictures/laughingEmoji2.jpg").getImage();
            timer= new Timer(10,this);
            timer.start();
        }
        public void paint(Graphics g){
            super.paint(g);     // this will paint background
            Graphics2D g2D =(Graphics2D) g;
            g2D.drawImage(enemy,x,y,null);
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0){
                xVelocity=xVelocity*(-1);
            }
            x= x+xVelocity;
            if(y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0){
                yVelocity=yVelocity*(-1);
            }
            y= y+yVelocity;
            repaint();
        }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}
