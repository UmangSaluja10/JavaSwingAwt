import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class keyListener
{
    public static class MyFrame extends JFrame implements KeyListener{
        JLabel label;
        MyFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(420,420);
            this.setLayout(null);
            this.addKeyListener(this);
            
            label = new JLabel();
            label.setBounds(0,0,100,100);
            label.setBackground(Color.red);
            label.setOpaque(true);
            
            this.add(label);
            this.setVisible(true);
        }
        @Override
        public void keyTyped(KeyEvent e){
            // keyTyped = Invoked when a key is typed. Uses KeyChar, char output.
            switch(e.getKeyChar()){
                case 'a':
                    label.setLocation(label.getX()-10,label.getY());
                    break;
                case 'w':
                    label.setLocation(label.getX(),label.getY()-10);
                    break;
                case 's':
                    label.setLocation(label.getX(),label.getY()+10);
                    break;
                case 'd':
                    label.setLocation(label.getX()+10,label.getY());
                    break;
                case 'q':
                    label.setLocation(label.getX()-10,label.getY()-10);
                    break;
                case 'e':
                    label.setLocation(label.getX()+10,label.getY()-10);
                    break;
                case 'z':
                    label.setLocation(label.getX()-10,label.getY()+10);
                    break;
                case 'c':
                    label.setLocation(label.getX()+10,label.getY()+10);
                    break;
            }
        }
        @Override
        public void keyPressed(KeyEvent e){
            // keypressed = Invoked when a physical key is pressed down. Uses keyCode, int output.
            switch(e.getKeyCode()){
                case 37:
                    label.setLocation(label.getX()-10,label.getY());
                    break;
                case 38:
                    label.setLocation(label.getX(),label.getY()-10);
                    break;
                case 39:
                    label.setLocation(label.getX()+10,label.getY());
                    break;
                case 40:
                    label.setLocation(label.getX(),label.getY()+10);
                    break;
            }
        }
        @Override
        public void keyReleased(KeyEvent e){
            // keyReleased = Called whenever a button is released.
            System.out.println("You released key Character: "+e.getKeyChar());
            System.out.println("You released key Code: "+e.getKeyCode());
        }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}
