import javax.swing.*;
import java.awt.*;
public class FlowLayoutTest {
public static void main(String[] args) {
Font fn = new Font("Microsoft Sans Serif", Font.BOLD, 14);
JFrame f = new JFrame("FlowLayOut Test");
JPanel p = new JPanel();
p.setLayout(new FlowLayout()); 
JButton a = new JButton("????? "); JButton b = new JButton("???");
JButton c = new JButton("???"); JButton d = new JButton("???") ;
JButton e = new JButton("???"); JButton g = new JButton("??");
JButton h = new JButton("????"); JButton i = new JButton("???");
JButton j = new JButton("????"); 
a.setFont(fn); b.setFont(fn); c.setFont(fn);
d.setFont(fn); e.setFont(fn); g.setFont(fn);
h.setFont(fn); i.setFont(fn); j.setFont(fn); 
p.add(a); p.add(b); p.add(c); p.add(d); p.add(e);
p.add(g); p.add(h); p.add(i); p.add(j); 
f.add(p);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(200, 180);
f.setVisible(true);
}
}