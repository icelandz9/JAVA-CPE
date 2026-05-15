import javax.swing.*;
import java.awt.*;
public class Q09_453{
  public static void main(String[] args){
    JFrame frame = new JFrame("Calculator");
    
    JLabel num1 = new JLabel("Number 1");
    JTextField t1 = new JTextField(1);
    
    JLabel num2 = new JLabel("Number 2");
    JTextField t2 = new JTextField(6);
    
    JLabel res = new JLabel("Result");
    JTextField t3 = new JTextField(6);
    
    JButton a = new JButton("+");
    JButton b = new JButton("-");
    JButton c = new JButton("X");
    JButton d = new JButton("/");
    JButton e = new JButton(".");
    JButton f = new JButton("%");
    JButton g = new JButton("=");
    
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(3,2));
    
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(2,3));
    
    JPanel p3 = new JPanel();
    p3.setLayout(new FlowLayout(FlowLayout.CENTER,50,10));
    
    p.add(g,BorderLayout.NORTH);
    p.add(p3,BorderLayout.SOUTH);
    p3.add(p1);
    p3.add(p2);
    p1.add(num1);
    p1.add(t1);
    p1.add(num2);
    p1.add(t2);
    p1.add(res);
    p1.add(t3);
    p2.add(a);
    p2.add(b);
    p2.add(c);
    p2.add(d);
    p2.add(e);
    p2.add(f);
    
    frame.add(p);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(340,140);
    frame.setVisible(true);
    }
}