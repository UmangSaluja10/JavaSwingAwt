// JOptionPane = pop up a standard dialogue box that prompts users for a value or informs that of something.
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class dialogueBox{
    public static void main(String args[]){
        //JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);      
        //(parentComponent,message,title,messageType)
        //JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.INFORMATION_MESSAGE);   
        //JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.QUESTION_MESSAGE);   
        //JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.WARNING_MESSAGE);   
        //JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.ERROR_MESSAGE);  
        
        
        /*int x=(JOptionPane.showConfirmDialog(null,"Yo Buddy do you know Java??","Apni Aukaat Batao",JOptionPane.YES_NO_CANCEL_OPTION));
        if(x==0){
            System.out.println("YES");
        }
        if(x==1){
            System.out.println("NO");
        }
        if(x==2){
            System.out.println("CANCEL");
        }
        if(x==-1){
            System.out.println("X");
        }*/
        
        
        
        /*String name = JOptionPane.showInputDialog("What is your name??");
        System.out.println("Hello "+name+"!!");*/
        
        
        String[] responses = {"No you are Awesome","Thank you!","Blush"};
        ImageIcon icon = new ImageIcon("C:/Users/dell/Downloads/logo_math.jpg");
        JOptionPane.showOptionDialog(null,"You are Awesome","secret message",
                             JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,responses,0);      
        //(parentComponent,message,title,optionType,messageType,icon,options,initialValue)
    }
}