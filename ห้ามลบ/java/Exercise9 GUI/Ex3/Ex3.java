import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class Ex3 extends JFrame
{
  public Ex3()
  {
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    p.setLayout(new GridLayout(2,2));
    p1.setLayout(new GridLayout(1,1));
    p2.setLayout(new GridLayout(1,1));
    p3.setLayout(new GridLayout(1,1));
    p4.setLayout(new GridLayout(1,1));
    Border lineb = new LineBorder(Color.BLUE,2);
    ImageIcon usim = new ImageIcon("f:\\photo\\uk.png");
    ImageIcon fraim = new ImageIcon("f:\\photo\\fra.png");
    ImageIcon denim = new ImageIcon("f:\\photo\\den.png");
    ImageIcon gerim = new ImageIcon("f:\\photo\\ger.png");
    JLabel uk = new JLabel(usim, SwingConstants.CENTER);
    JLabel fra = new JLabel(fraim, SwingConstants.CENTER);
    JLabel den = new JLabel(denim, SwingConstants.CENTER);
    JLabel ger = new JLabel(gerim, SwingConstants.CENTER);
    uk.setBorder(lineb);
    fra.setBorder(lineb);
    den.setBorder(lineb);
    ger.setBorder(lineb);
    p1.add(uk);
    p2.add(fra);
    p3.add(ger);
    p4.add(den);
    p.add(p1);
    p.add(p2);
    p.add(p3);
    p.add(p4);
    add(p);
    
  }
  public static void main(String[] args)
  {
    JFrame frame = new Ex3();
    frame.setSize(800,400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}