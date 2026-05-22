import javax.swing.*;
import java.awt.*;
public class cpe222_391_1 {
  public static void main(String[] args){
    JFrame frame = new JFrame("CPE 222 : Frame Layout");
    
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton bplus = new JButton("+");
    JButton bmin = new JButton("-");
    JButton bmul = new JButton("*");
    JButton bdiv = new JButton("/");
    JButton bs = new JButton("=");
    JButton bp = new JButton(".");
    JButton bvoid = new JButton("");
    JButton blogin = new JButton("Log in");
    JButton bcancel = new JButton("Cancel");
    
    JLabel la1 = new JLabel("Username");
    JLabel la2 = new JLabel("Password");
    JLabel la3 = new JLabel("***Please enter information***");
    
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JTextField t3 = new JTextField(10);
    
    la3.setForeground(Color.red);
    
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(4,4));
    
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(bplus);
    p1.add(b4);
    p1.add(b5);
    p1.add(b6);
    p1.add(bmin);
    p1.add(b7);
    p1.add(b8);
    p1.add(b9);
    p1.add(bmul);
    p1.add(bvoid);
    p1.add(bp);
    p1.add(bs);
    p1.add(bdiv);
    
    JPanel p2 = new JPanel();
    p2.setLayout(new BorderLayout());
    
    JPanel p5 = new JPanel();
    p5.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    p5.add(la3);
    
    p2.add(p5,BorderLayout.NORTH);
    
    JPanel p3 = new JPanel();
    p3.setLayout(new GridLayout(2,2));
    
    p3.add(la1);
    p3.add(t1);
    p3.add(la2);
    p3.add(t2);
    
    p2.add(p3,BorderLayout.CENTER);
    
    JPanel p4 = new JPanel();
    p4.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    p4.add(blogin);
    p4.add(bcancel);
    
    p2.add(p4,BorderLayout.SOUTH);
    
    p.add(p1,BorderLayout.WEST);
    p.add(t3,BorderLayout.SOUTH);
    p.add(p2,BorderLayout.CENTER);
    
    
    frame.add(p);
    frame.setSize(400,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
    