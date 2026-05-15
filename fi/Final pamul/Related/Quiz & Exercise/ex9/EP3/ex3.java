import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class ex3 extends JFrame{
   public static void main(String[] args){
    JFrame frame = new JFrame("Exercise08_v2_02");
    Border lineBorder = new LineBorder(Color.BLUE,1);
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(2,2));
    
    ImageIcon UK  = new ImageIcon("img/UK.png");
    ImageIcon FRA = new ImageIcon("img/FRA.png");
    ImageIcon GER = new ImageIcon("img/GER.png");
    ImageIcon DEN = new ImageIcon("img/DEN.png");
    
    JLabel a = new JLabel(UK);
    JLabel b = new JLabel(FRA);
    JLabel c = new JLabel(GER);
    JLabel d = new JLabel(DEN);
    
    a.setBorder(lineBorder);
    b.setBorder(lineBorder);
    c.setBorder(lineBorder);
    d.setBorder(lineBorder);
    
    p.add(a);
    p.add(b);
    p.add(c);
    p.add(d);
    
    frame.add(p);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1500,1500);
    frame.setVisible(true);
  }
}