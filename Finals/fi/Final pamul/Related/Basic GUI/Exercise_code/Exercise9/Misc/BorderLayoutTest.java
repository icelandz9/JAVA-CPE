package EP2;
import javax.swing

import java.awt.*; 
public class BorderLayoutTest{ 
  public static void main(String[] args){  
    Font fn = new Font("Microsoft Sans Serif",Font.BOLD,14);
    JFrame frame = new JFrame("FlowLayOut Test");
    JPanel p = new JPanel();

    
    JButton a = new JButton("?????");
    JButton b = new JButton("???");
    JButton c = new JButton("???");
    JButton d = new JButton("???");
    JButton e = new JButton("???");
    JButton f = new JButton("??");
    JButton g = new JButton("????");
    JButton h = new JButton("???");

    
    a.setFont(fn);
    b.setFont(fn);
    c.setFont(fn);
    d.setFont(fn);
    e.setFont(fn);
    f.setFont(fn);
    g.setFont(fn);
    h.setFont(fn);

    
    JPanel p1 = new JPanel();
    p1.setLayout(new BorderLayout());
    JPanel p2 = new JPanel();

     
    p.add(p1, BorderLayout.NORTH);
    p1.add(a, BorderLayout.WEST);
    p1.add(b, BorderLayout.CENTER

     

     
    p.add(p2, BorderLayout.CENTER);
    p2.add(e, BorderLayout.NORTH);
    p2.add(f, BorderLayout.CENTER)

     
    p.add(h, BorderLayout.EAST);

    
    frame.add(p);
    frame.setDefaultCl oseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,180);
    frame.setVisible(true);
  }
}