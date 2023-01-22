import java.awt.event.*;
import javax.swing.*;
public class ButtonExample
{
  ButtonExample()
  {
     JFrame f = new JFrame("Button Example");
     JButton b  = new JButton(new ImageIcon("D:\\icon.jpg"));
     b.setBounds(100,100,100,40);
     f.add(b);
     f.setSize(600,800);
     f.setLayout(null);
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String[] args)
  {
     new ButtonExample();
  }
}