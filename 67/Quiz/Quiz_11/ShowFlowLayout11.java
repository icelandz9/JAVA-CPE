import javax.swing.*;
import java.awt.*;
public class ShowFlowLayout11 extends JFrame {
  public ShowFlowLayout11() {
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    
    JButton a = new JButton("+");
    JButton b = new JButton("-");
    JButton c = new JButton("X");
    JButton d = new JButton("/");
    JButton e = new JButton(".");
    JButton f = new JButton("%");
    JButton g = new JButton("=");
    
    JButton aa = new JButton("1");
    JButton bb = new JButton("2");
    JButton cc = new JButton("3");
    JButton dd = new JButton("4");
    JButton ee = new JButton("5");
    JButton ff = new JButton("6");
    JButton gg = new JButton("7");
    JButton hh = new JButton("8");
    JButton ii = new JButton("9");
    JButton jj = new JButton("0");
    JButton kk = new JButton("#");
    JButton ll = new JButton("*");
    
    JLabel n1 = new JLabel("Number 1");
    JTextField h = new JTextField(5);
    JLabel n2 = new JLabel("Number 2");
    JTextField i = new JTextField(5);
    JLabel r = new JLabel("Result");
    JTextField j = new JTextField(5);
    
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout());
    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
    JPanel p3 = new JPanel();
    p3.setLayout(new GridLayout(3,2));
    JPanel p4 = new JPanel();
    p4.setLayout(new FlowLayout(FlowLayout.CENTER));
    JPanel p5 = new JPanel();
    p5.setLayout(new GridLayout(4,3));
    
    
    p.add(p2,BorderLayout.SOUTH);
    p.add(p5,BorderLayout.CENTER);
    p.add(p1,BorderLayout.NORTH);
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
    p5.add(aa);
    p5.add(bb);
    p5.add(cc);
    p5.add(dd);
    p5.add(ee);
    p5.add(ff);
    p5.add(gg);
    p5.add(hh);
    p5.add(ii);
    p5.add(ll);
    p5.add(jj);
    p5.add(kk);
    add(p);
  }
}