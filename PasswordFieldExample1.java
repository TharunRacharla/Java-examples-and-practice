import javax.swing.*;
import java.awt.event.*;
public class PasswordFieldExample1
{
 public static void main(String[] args)
 {
   JFrame f = new JFrame("Password Field Example1");
   final JLabel label = new JLabel();
   label.setBounds(20,150,200,30);
   final JPasswordField value = new JPasswordField();
   value.setBounds(100,75,100,30);
   JLabel l1 = new JLabel("Username : ");
   l1.setBounds(20,20,80,30);
   JLabel l2 = new JLabel("Password : ");
   l1.setBounds(20,75,80,30);
   JButton b = new JButton("Login : ");
   l1.setBounds(100,120,80,30);
   final JTextField text = new JTextField();
   text.setBounds(100,20,100,30);
   f.add(value);
   f.add(l1);
   f.add(label);
   f.add(l2);
   f.add(b);
   f.add(text);
   f.setSize(300,300);
   f.setLayout(null);
   f.setVisible(true);
  b.addActionListener(e -> {
     String data = "Username"+ text.getText();
     data += ",Password:" + new String(value.getPassword());
     label.setText(data);
  });
 }
}