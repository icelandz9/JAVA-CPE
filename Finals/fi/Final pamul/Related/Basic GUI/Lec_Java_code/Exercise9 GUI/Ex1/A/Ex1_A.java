import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class Ex1_A
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Handle Event");
    JPanel p = new JPanel();
    frame.setSize(800,400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p.setLayout(new FlowLayout());
    JButton ok = new JButton("Ok");
    JButton cancel = new JButton("Cancel");
    JButton exit = new JButton("Exit");
    p.add(new JLabel("Name: "));
    p.add(new JTextField(20));
    p.add(ok);
    p.add(cancel);
    p.add(exit);
    frame.add(p);
    frame.setVisible(true);
  }
}