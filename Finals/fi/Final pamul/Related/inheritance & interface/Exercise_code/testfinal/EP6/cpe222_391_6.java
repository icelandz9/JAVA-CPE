import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cpe222_391_6 extends JFrame {
  
  private JTextField t1 = new JTextField(10);
  private JTextField t2 = new JTextField(10);
    
  private JButton b1 = new JButton("cm");
  private JButton b2 = new JButton("ft");
  private JButton b3 = new JButton("yd");
  private JButton b4 = new JButton("wa");
  
  public cpe222_391_6(){
    
    JPanel p = new JPanel(new BorderLayout());
    
    JLabel la1 = new JLabel("Lenght(in)");
    JLabel la2 = new JLabel("Lenght");
    
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(2,2));
    
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
    
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(2,1));
    
    JPanel p3 = new JPanel();
    p3.setLayout(new FlowLayout(FlowLayout.CENTER));
       
    JPanel p4 = new JPanel();
    p4.setLayout(new GridLayout(2,2));
    
    p4.add(la1);
    p4.add(t1);
    p4.add(la2);
    p4.add(t2);
    
    p3.add(p4);
    
  
    p.add(p1,BorderLayout.NORTH);
    p.add(p3,BorderLayout.CENTER);
    
    add(p);
    
     b1.addActionListener(new Al1());
     b2.addActionListener(new Al2());
     b3.addActionListener(new Al3());
     b4.addActionListener(new Al4());
  }
  
  private class Al1 implements ActionListener{
   
    public void actionPerformed(ActionEvent e){
      double tranfrom = Double.parseDouble(t1.getText());
      double newtran = tranfrom*2.54;
      t2.setText(String.format(""+newtran));
    }
}
  
  private class Al2 implements ActionListener{
   
    public void actionPerformed(ActionEvent e){
      double tranfrom = Double.parseDouble(t1.getText());
      double newtran = tranfrom*31.5;
      t2.setText(String.format(""+newtran));
    }
}
  
  private class Al3 implements ActionListener{
   
    public void actionPerformed(ActionEvent e){
      double tranfrom = Double.parseDouble(t1.getText());
      double newtran = tranfrom*0.914;
      t2.setText(String.format(""+newtran));
    }
}
  
  private class Al4 implements ActionListener{
   
    public void actionPerformed(ActionEvent e){
      double tranfrom = Double.parseDouble(t1.getText());
      double newtran = tranfrom*2;
      t2.setText(String.format(""+newtran));
    }
}
  
  
  public static void main(String[] args){
    JFrame frame = new cpe222_391_6();
    frame.setTitle("Metric Conversions");
    frame.setSize(400,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}