import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class Drawing extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) 
    {
        g.fillOval(100, 100, 20,20);
        g.setColor(Color.red);
       
//available colors: black,blue,cyan,darkGray,gray,green,lightGray,magenta,orange, pink,white,yellow
    }
}