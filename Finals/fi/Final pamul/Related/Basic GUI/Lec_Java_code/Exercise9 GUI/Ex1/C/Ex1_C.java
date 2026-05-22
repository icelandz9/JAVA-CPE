import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Ex1_C extends JFrame
{
  public Ex1_C()
  {
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JLabel w = new JLabel("Hello my name is cpe120 ");
    JLabel x = new JLabel("Department of computer engineering");
    JLabel y = new JLabel("Srinakharinwirot University");
    JLabel z = new JLabel("Ongkarak Nakornnayok");
    Border lineb = new LineBorder(Color.BLUE,2);
    w.setBorder(lineb);
    x.setBorder(lineb);
    y.setBorder(lineb);
    z.setBorder(lineb);
    //p.setBackground(Color.blue);
    p.setLayout(new GridLayout(4,1,2,2));
    p1.setLayout(new GridLayout(1,1));
    p2.setLayout(new GridLayout(1,1));
    p3.setLayout(new GridLayout(1,1));
    p4.setLayout(new GridLayout(1,1));
    p1.add(w);
    p2.add(x);
    p3.add(y);
    p4.add(z);
    p.add(p1);
    p.add(p2);
    p.add(p3);
    p.add(p4);
    add(p);
  
  }
    public static void main(String[] args)
    {
      JFrame frame = new Ex1_C();
      frame.setSize(800,400);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
}