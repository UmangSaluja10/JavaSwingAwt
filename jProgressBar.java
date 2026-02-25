// porgress bar = visual aid to let user know that an operation is progressing
import java.awt.*;
import javax.swing.*;
public class jProgressBar
{
    public static class ProgressBarDemo{
        JFrame frame = new JFrame();
        //JProgressBar bar = new JProgressBar(0,500);   //set values for progress bar
        JProgressBar bar = new JProgressBar();
        ProgressBarDemo(){
            bar.setValue(0);
            bar.setBounds(0,0,420,50);
            bar.setStringPainted(true);
            bar.setFont(new Font("MV Boli",Font.BOLD,25));
            bar.setForeground(Color.black);
            bar.setBackground(Color.blue);
            
            frame.add(bar);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,420);
            frame.setLayout(null);
            frame.setVisible(true);
            fill();
        }
        public void fill(){
            int x=0;
            while(x<=100){
                bar.setValue(x);
                try
                {
                    Thread.sleep(50);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
                x+=1;
            }
            bar.setString("Done Buddy!!");
        }
    }
    public static void main(String args[]){
        ProgressBarDemo demo = new ProgressBarDemo();
        }
}
