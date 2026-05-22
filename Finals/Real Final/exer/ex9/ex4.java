import javax.swing.*;
import java.awt.*;
public class ex4 extends JFrame{
   public static void main(String[] args){
    JFrame frame = new JFrame("Exercise08_v2_03");
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(1,4));
    
    ImageIcon UK = new ImageIcon("img/UKicon.png");
    ImageIcon FRA = new ImageIcon("img/FRAicon.png");
    ImageIcon GER = new ImageIcon("img/GERicon.png");
    ImageIcon DEN = new ImageIcon("img/DENicon.png");
    
    JLabel a = new JLabel("UK",UK,SwingConstants.CENTER);
    JLabel b = new JLabel("FRA",FRA,SwingConstants.CENTER);
    JLabel c = new JLabel("GER",GER,SwingConstants.CENTER);
    JLabel d = new JLabel("DEN",DEN,SwingConstants.CENTER);
    
    a.setHorizontalTextPosition(SwingConstants.CENTER);
    a.setVerticalTextPosition(SwingConstants.BOTTOM);
    b.setHorizontalTextPosition(SwingConstants.RIGHT);
    c.setHorizontalTextPosition(SwingConstants.LEFT);
    d.setHorizontalTextPosition(SwingConstants.CENTER);
    d.setVerticalTextPosition(SwingConstants.TOP);
    
    
    p.add(a);
    p.add(b);
    p.add(c);
    p.add(d);
    
    frame.add(p);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,200);
    frame.setVisible(true);
  }
}