//Java JCheckBox exmaple with ItemListener
import javax.swing.*;
import java.awt.event.*;
public class CheckBoxExample1
{
 CheckBoxExample1()
 {
   JFrame f = new JFrame("CheckBox Example");
   final JLabel label = new JLabel();
   label.setHorizontalAlignment(JLabel.CENTER);
   label.setSize(400,400);
   JCheckBox checkbox1 = new JCheckBox("C++");
   checkbox1.setBounds(150,100,100,50);
   JCheckBox checkbox2 = new JCheckBox("Java",true);
   checkbox2.setBounds(150,150,100,50);
   f.add(checkbox1);
   f.add(checkbox2);
   f.add(label);
   checkbox1.addItemListener(new ItemListener()
   {
     public void itemStateChanged(ItemEvent e)
     {
        label.setText("C++ CheckBox:" + (e.getStateChange()==1?"checked":"unchecked"));
     }
   });
   checkbox2.addItemListener(new ItemListener()
   {
     public void itemStateChanged(ItemEvent e)
     {
        label.setText("C++ CheckBox:" + (e.getStateChange()==1?"checked":"unchecked"));
     }
   });   
   f.setSize(400,400);
   f.setLayout(null);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
  public static void main(String[] args)
  {
    new CheckBoxExample1();
  }
}