import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;

public class LaunchPage implements ActionListener{
        JFrame frame = new JFrame();
        JButton button = new JButton("New Window");
        LaunchPage(){
            button.setBounds(100,160,200,40);
            button.setFocusable(false);
            button.addActionListener(this);
            
            frame.add(button);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,420);
            frame.setLayout(null);
            frame.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button){
                frame.dispose();       //will close the launch page and hence we won't be able to add multiple new windows
                NewWindow window = new NewWindow();
            }
        }
}