import javax.swing.*;
import java.awt.*;
public class Q09_431_01{
  public static void main(String[] args) {
     
    JFrame frame = new JFrame("Calculator");
    JPanel p = new JPanel();
  
    p.setLayout(new GridLayout(2,2,5,0));
   
    JLabel num1 = new JLabel("Number 1");            
    JTextField t1 = new JTextField(10);
    JLabel num2 = new JLabel("Number 2");            
    JTextField t2 = new JTextField(10);
    JLabel num3 = new JLabel("Result");              
    JTextField t3 = new JTextField(10);
   
    JButton b1 = new JButton("+");
    JButton b2 = new JButton("-");
    JButton b3 = new JButton("x");
    JButton b4 = new JButton("/");
    JButton b5 = new JButton(".");
    JButton b6 = new JButton("%");
    JButton b7 = new JButton("=");
    
    JButton c1 = new JButton("1");
    JButton c2 = new JButton("2");
    JButton c3 = new JButton("3");
    JButton c4 = new JButton("4");
    JButton c5 = new JButton("5");
    JButton c6 = new JButton("6");
    JButton c7 = new JButton("7");
    JButton c8 = new JButton("8");
    JButton c9 = new JButton("9");
   
   
    JPanel p1 = new JPanel(); 
    p1.setLayout(new GridLayout(3,2));
   
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(3,1));
   
    JPanel p3 = new JPanel();
    p3.setLayout(new GridLayout(3,1));
   
    JPanel p5 = new JPanel();
    p5.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
    
    JPanel p6 = new JPanel();
    p6.setLayout(new BorderLayout());
    
  
    p3.add(num1);  
    p3.add(t1); 
    p3.add(num2);
    p3.add(t2);
    p3.add(num3);        
    p3.add(t3);
    
    p2.add(c1);
    p2.add(c2);
    p2.add(c3);
    p2.add(c4);
    p2.add(c5);
    p2.add(c6);
    p2.add(c7);
    p2.add(c8);
    p2.add(c9);
   
    p1.add(b1);     
    p1.add(b2);     
    p1.add(b3);     
    p1.add(b4);     
    p1.add(b5);     
    p1.add(b6);
    p5.add(p1);
   // p6.add(p5,BorderLayout.CENTER);
   
    p.add(p5);      
    p.add(b7);      
    p.add(p3);      
    p.add(p2);
   
    frame.add(p);
    frame.setSize(250,250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}