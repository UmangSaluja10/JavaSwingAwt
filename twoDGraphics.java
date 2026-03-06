import javax.swing.*;
import java.awt.*;


public class twoDGraphics
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
    public static class MyPanel extends JPanel{
        Image image;
        MyPanel(){
            
            image = new ImageIcon("C:/Users/dell/Pictures/smileyEmoji.jpg").getImage();
            this.setPreferredSize(new Dimension(500,500));
        }
        public void paint(Graphics g){
            //last created item will overlap over previously created items
            Graphics2D g2D = (Graphics2D) g;
            
            g2D.setPaint(Color.black);
            g2D.setStroke(new BasicStroke(5));
            //g2D.drawLine(0,0,500,500);            //(x1,y1,x2,y2)
            //g2D.setPaint(Color.pink);
            //g2D.drawRect(0,0,100,200);               //(xPos,ypos,l,b)
            //g2D.fillRect(0,0,100,200);
            //g2D.setPaint(Color.yellow);
            //g2D.drawOval(0,0,100,100);
            //g2D.fillOval(0,0,100,100);
            g2D.setPaint(Color.red);
            g2D.fillArc(0,0,100,100,0,180);                          //(x,y,width,height,startAngel,arcAngel)
            g2D.setPaint(Color.black);
            g2D.drawArc(0,0,100,100,0,180);
            g2D.setPaint(Color.white);
            g2D.fillArc(0,0,100,100,180,180);
            g2D.setPaint(Color.black);
            g2D.drawArc(0,0,100,100,180,180);
            g2D.drawLine(0,50,100,50);
            g2D.fillOval(43,43,15,15);
            
            int[] xPoints = {150,250,350};
            int[] yPoints = {300,150,300};
            g2D.setPaint(Color.yellow);
            //g2D.drawPolygon(xPoints,yPoints,3);
            g2D.fillPolygon(xPoints,yPoints,3);
            
            g2D.setPaint(Color.magenta);
            g2D.setFont(new Font("Ink Free",Font.BOLD,20));
            g2D.drawString("You are a Winner",100,100);
            
            g2D.drawImage(image,200,200,null);
        }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}
