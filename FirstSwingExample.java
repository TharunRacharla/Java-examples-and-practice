import javax.swing.*;
public class FirstSwingExample
{
  public static void main(String[] args)
  {
     JFrame f = new JFrame(); //creating instance of JFrame
     JButton b = new JButton(); // creating instance of JButton
     b.setBounds(130,100,100,40); // x axis, y axis , width, hieght
     f.add(b);  // adding JButton in JFrame
     f.setSize(400,500); // 400 width and 500 hieght
     f.setLayout(null); // using no layout managers
     f.setVisible(true); // making the frame visible
  }
}