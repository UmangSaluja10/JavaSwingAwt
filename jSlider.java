// JSlider = GUI component that let user enter a value by using an adjustable sliding knob on a track
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;     // not awt.*; bexause this is used for buttons,checkbox,etc and we need to use for slider
public class jSlider
{
    public static class SliderDemo implements ChangeListener{
        JFrame frame;
        JPanel panel;
        JLabel label;
        JSlider slider;
        SliderDemo(){
            frame = new JFrame("Slider Demo");
            panel = new JPanel();
            label = new JLabel();
            slider = new JSlider(0,100,30);
            
            slider.setPreferredSize(new Dimension(55,400));
            slider.setPaintTicks(true);
            slider.setMinorTickSpacing(10);
            
            slider.setPaintTrack(true);
            slider.setMajorTickSpacing(25);
            
            slider.setPaintLabels(true);
            slider.setFont(new Font("MV Boli",Font.PLAIN,15));
            label.setFont(new Font("MV Boli",Font.PLAIN,25));
            
            slider.setOrientation(SwingConstants.VERTICAL);
            
            label.setText("degree Celcius"+slider.getValue());
            slider.addChangeListener(this);
            panel.add(slider);
            panel.add(label);
            frame.add(panel);
            frame.setSize(420,420);
            frame.setVisible(true);
        }
        @Override
        public void stateChanged(ChangeEvent e){
            label.setText("degree Celcius"+slider.getValue());
        }
    }
    public static void main(String args[]){
        SliderDemo sliderDemo = new SliderDemo(); 
    }
}
