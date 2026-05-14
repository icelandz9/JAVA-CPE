import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
public class Ex1_B
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Handle Event");
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    p1.setLayout(new GridLayout(1,2));
    frame.setSize(500,100);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p.setLayout(new GridLayout(2,2));
    p2.setLayout(new GridLayout(1,3));
    JButton ok = new JButton("Ok");
    JButton cancel = new JButton("Cancel");
    JButton exit = new JButton("Exit");
    p1.add(new JLabel("Name: "));
    p1.add(new JTextField(100));
    p2.add(ok);
    p2.add(cancel);
    p2.add(exit);
    p.add(p1);
    p.add(p2);
    frame.add(p);
    frame.setVisible(true);
  }
}