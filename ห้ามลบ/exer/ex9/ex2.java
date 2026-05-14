import javax.swing.*;
import java.awt.*;
public class ex2{
  public static void main(String[] args){
    JFrame frame = new JFrame("Exercise08_v2_01");
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    
    JButton a = new JButton("Button 1");
    JButton b = new JButton("Button 2");
    JButton c = new JButton("Button 3");
    JButton d = new JButton("Button 4");
    JButton e = new JButton("Button 5");
    JButton f = new JButton("Button 6");
    
   
    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout());
    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
  
   
    p.add(p2,BorderLayout.SOUTH);
    p.add(p1,BorderLayout.CENTER);
    
    p1.add(d);
    p1.add(e);
    p1.add(f);
    p2.add(a);
    p2.add(b);
    p2.add(c);
    
    
    frame.add(p);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350,160);
    frame.setVisible(true);
    }
}