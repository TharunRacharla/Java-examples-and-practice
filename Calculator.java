import javax.swing.*;
import java.awt.event.*;
public class Calculator implements ActionListener
{
  JTextField x,y,output;
  JButton add,sub,mul,div;
  Calculator()
  {
     JFrame f = new JFrame("Calculator");
     x = new JTextField();
     x.setBounds(50,50,150,20);
     y = new JTextField();
     y.setBounds(50,100,150,20);
     output = new JTextField();
     output.setBounds(50,150,150,20);
     output.setEditable(false);

     add = new JButton();
     add.setBounds(50,200,50,50);
     sub = new JButton();
     sub.setBounds(150,200,50,50);
     mul = new JButton();
     mul.setBounds(50,250,50,50);
     div = new JButton();
     div.setBounds(150,250,50,50);
    
     add.addActionListener(this);
     sub.addActionListener(this);
     mul.addActionListener(this);
     div.addActionListener(this);

     f.add(x);
     f.add(y); 
     f.add(output);
     f.add(add);
     f.add(sub);
     f.add(mul);
     f.add(div);
     
     f.setSize(500,500);
     f.setVisible(true);
     f.setLayout(null);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e)
  {
    String s1 = x.getText();
    String s2 = y.getText();
    int c = 0;
    int a = Integer.parseInt(s1);
    int b = Integer.parseInt(s2);

    if(e.getSource()==add)
    {
       c=a+b;
    }    
    else if(e.getSource()==sub)
    {
       c=a-b;
    }    
    else if(e.getSource()==mul)
    {
       c=a*b;
    }    
    else if(e.getSource()==div)
    {
       c=a/b;
    }
  String result = String.valueOf(c);
  output.setText(result);    
  }
  public static void main(String[] args)
  {
    new Calculator();
  }
}