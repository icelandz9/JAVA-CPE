import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.BorderLayout;
public class Ex2
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Handle Event");
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    frame.setSize(500,200);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    p.setLayout(new BorderLayout(5,10));
    JButton a = new JButton("Button 1");
    JButton b = new JButton("Button 2");
    JButton c = new JButton("Button 3");
    JButton d = new JButton("Button 4");
    JButton f = new JButton("Button 5");
    JButton e = new JButton("Button 6");
    p.add(p1,BorderLayout.CENTER);
    p1.add(a,BorderLayout.WEST);
    p1.add(b,BorderLayout.CENTER);
    p1.add(c,BorderLayout.EAST);
    p.add(p2,BorderLayout.SOUTH);
    p2.add(d,BorderLayout.WEST);
    p2.add(e,BorderLayout.CENTER);
    p2.add(f,BorderLayout.EAST);
    frame.add(p);
  }
}