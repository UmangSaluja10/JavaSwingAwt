import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class selectAFile
{
    public static class MyFrame extends JFrame implements ActionListener{
        JButton button;
        MyFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());
            
            button = new JButton("Select File");
            button.addActionListener(this);
            
            this.add(button);
            this.pack();
            this.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button){
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("C:/Users/dell/Desktop")); // to open a specific directory in computer
                //fileChooser.showOpenDialog(null);                 //select file to open.
                //fileChooser.showSaveDialog(null);                 //select file to save. wont't create a new file right now
                //System.out.println(fileChooser.showOpenDialog(null));                
                /*will return 0 if we open any file and 1 if we click on cancel or X. */
                int response = fileChooser.showOpenDialog(null);
                if(response== JFileChooser.APPROVE_OPTION){
                    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                    System.out.println(file);
                }
            }
        }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}
