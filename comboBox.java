import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
// JComboBox = A component that combines a button or editable field and a drop-down list
public class comboBox
{
    public static class MyFrame extends JFrame implements ActionListener{
        JComboBox comboBox;
        MyFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());
            
            String[] animals={"Dog","Cat","Horse"};  //Wrapper class should be use i.e.Integer,Character,etc;
            comboBox=new JComboBox(animals);
            comboBox.addActionListener(this);
            //comboBox.setEditable(true);
            //System.out.println(comboBox.getItemCount());
            //comboBox.addItem("Cow");
            //comboBox.insertItemAt("Pig",3);
            //comboBox.setSelectedIndex(0);
            //comboBox.removeItem("Cow");
            //comboBox.removeItemAt(0);
            //comboBox.removeAllItems();
            
            this.add(comboBox);
            this.pack();
            this.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==comboBox){
                System.out.println("pokemon!!!");
                /*if(comboBox.getSelectedItem()=="Dog"){
                    System.out.println("Main tumhe chunta hu Dog!!");
                }*/
                //OR
                if(comboBox.getSelectedIndex()==0){
                    System.out.println("Main tumhe chunta hu Dog!!");
                }
                else if(comboBox.getSelectedIndex()==1){
                    System.out.println("Main tumhe chunta hu Cat!!");
                }
                else if(comboBox.getSelectedIndex()==2){
                    System.out.println("Main tumhe chunta hu Horse!!");
                }
            }
        }
    }
    public static void main(String args[]){
        new MyFrame();
    }
}