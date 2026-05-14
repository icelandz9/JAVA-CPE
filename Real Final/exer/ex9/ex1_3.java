import javax.swing.*;
import java.awt.*;
public class ex1_3{
  public static void main(String[] args){
    Font fn = new Font("Microsoft Sans Serif",Font.BOLD,14);
    JFrame frame = new JFrame("Exercise 7");
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(4,1));
    
    JLabel a = new JLabel("Hello,My name is CPE 230");
    JLabel b = new JLabel("Department of computer Engineering.");
    JLabel c = new JLabel("Srinakharinwirot University");
    JLabel d = new JLabel("Ongkarak Nakornnayok");
    
    a.setFont(fn);
    b.setFont(fn);
    c.setFont(fn);
    d.setFont(fn);
    
    p.add(a);
    p.add(b);
    p.add(c);
    p.add(d);
    
    frame.add(p);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,180);
    frame.setVisible(true);
  }
}