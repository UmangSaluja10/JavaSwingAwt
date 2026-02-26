import java.awt.event.*;
import javax.swing.*;
public class menuBarDemo
{
    public static class MyFrame extends JFrame implements ActionListener{
        JMenuItem loadItem;
        JMenuItem saveItem;
        JMenuItem exitItem;
        JMenuBar menuBar;
        JMenu fileMenu;
        JMenu editMenu;
        JMenu helpMenu;
        ImageIcon icon;
        MyFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(420,420);
            this.setLayout(null);
            
            //icon= new ImageIcon("")          //can add icon
            
            menuBar = new JMenuBar(); 
            fileMenu = new JMenu("File");
            editMenu = new JMenu("Edit");
            helpMenu = new JMenu("Help");
            
            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            menuBar.add(helpMenu);
            
            loadItem = new JMenuItem("Load");
            saveItem = new JMenuItem("Save");
            exitItem = new JMenuItem("Exit");
            
            //loadItem.setIcon(icon);          //will add icon
            loadItem.addActionListener(this);
            saveItem.addActionListener(this);
            exitItem.addActionListener(this);
            
            fileMenu.setMnemonic(KeyEvent.VK_F);     //Alt+F for file
            editMenu.setMnemonic(KeyEvent.VK_E);     //Alt+E for edit
            helpMenu.setMnemonic(KeyEvent.VK_H);     //Alt+H for help
            loadItem.setMnemonic(KeyEvent.VK_L);     //L for load
            saveItem.setMnemonic(KeyEvent.VK_S);     //S for save
            exitItem.setMnemonic(KeyEvent.VK_E);     //E for exit
            
            fileMenu.add(loadItem);
            fileMenu.add(saveItem);
            fileMenu.add(exitItem);
            
            this.setJMenuBar(menuBar);
            this.setVisible(true);
        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==loadItem){
                System.out.println("\"beep boop\" you loaded a file");
            }
            if(e.getSource()==saveItem){
                System.out.println("\"beep boop\" you saved a file");
            }
            if(e.getSource()==exitItem){
                System.out.println("\"beep boop\" you exited a file");
                System.exit(0);
            }
        }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}