import javax.swing.*;
public class Simple2 extends JFrame
{
  //inheriting JFrame
  JFrame f;
  Simple2()
  {
   JButton b = new JButton("click");  // create button
   b.setBounds(130,100,100,40);
   add(b); // adding buttonon frame
   setSize(400,500);
   setVisible(true);
  }
  public static void main(String[] args)
  {
    new Simple2();
  }
}