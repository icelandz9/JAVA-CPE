import javax.swing.*;
import java.awt.*;
public class Quiz9_1{
  public static void main(String[] args){
    JFrame frame = new JFrame("Calculator");
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    
    JButton a = new JButton("+");
    JButton b = new JButton("-");
    JButton c = new JButton("X");
    JButton d = new JButton("/");
    JButton e = new JButton(".");
    JButton f = new JButton("%");
    JButton g = new JButton("=");
    
    JLabel n1 = new JLabel("Number 1");
    JTextField h = new JTextField(5);
    JLabel n2 = new JLabel("Number 2");
    JTextField i = new JTextField(5);
    JLabel r = new JLabel("Result");
    JTextField j = new JTextField(5);
    
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(1,2));
    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
    JPanel p3 = new JPanel();
    p3.setLayout(new GridLayout(3,2));
    JPanel p4 = new JPanel();
    p4.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    
    p.add(p2,BorderLayout.NORTH);
    p.add(p1,BorderLayout.SOUTH);
    p4.add(p3);
    p1.add(p4);
    p1.add(g);
    p2.add(n1);
    p2.add(h);
    p2.add(n2);
    p2.add(i);
    p2.add(r);
    p2.add(j);
    p3.add(a);
    p3.add(b);
    p3.add(c);
    p3.add(d);
    p3.add(e);
    p3.add(f);
    
    frame.add(p);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(380,165);
    frame.setVisible(true);
    }
}