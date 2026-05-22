import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class final2_01 extends  JFrame{
  JTextField a1 = new JTextField(15);
  JTextField a2 = new JTextField(15);
  
  JButton wa = new JButton("USD");
  JButton ft = new JButton("CNY");
  
  public final2_01(){
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(1,2,3,3)); //(row,column,gap,gap)
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(2,1));
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(2,1));
    
    p1.add(new JLabel("จำนวนเงิน(บาท)"));
    p1.add(a1);
    p1.add(new JLabel("จำนวน"));
    p1.add(a2);
    
    p2.add(wa);
    p2.add(ft);
    
    p.add(p1);
    p.add(p2);
    add(p);
    
    wa.addActionListener(new ActionListener(){
    @Override
     public void actionPerformed(ActionEvent e){
      double num1 = Integer.parseInt(a1.getText());
      a2.setText(String.format("%.7f",(num1/32.40)));
    }
  });
    
    ft.addActionListener(new ActionListener(){
    @Override
     public void actionPerformed(ActionEvent e){
      double num1 = Integer.parseInt(a1.getText());
      a2.setText(String.format("%.6f",(num1/4.71)));
    }
  });
  }
  

   public static void main(String[] args){
    JFrame frame = new final2_01();
    frame.setTitle("Unit Conventor");
    frame.setSize(370,100);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}