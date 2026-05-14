//import javax.swing.*; 
//import java.awt.*; 
//import java.awt.event.*;
//public class ex1001 extends JFrame{
//  private JButton jbtadd = new JButton("ADD");
//  private JButton jbtsubtract = new JButton("Substract");
//  private JButton jbtmultiple = new JButton("Multiple");
//  private JButton jbtdivide = new JButton("Divide");
//  private JTextField fnum1 = new JTextField(5);
//  private JTextField fnum2 = new JTextField(5);
//  private JTextField fres = new JTextField(10);
// 
//public ex1001(){
//  JPanel p1 = new JPanel();
//  p1.setLayout(new GridLayout(1,6,5,5));
//  JPanel p2 = new JPanel();
//  p2.setLayout(new FlowLayout());
//  JPanel p3 = new JPanel();
//  p3.setLayout(new BorderLayout(5,10));
//  
//  JLabel num1 = new JLabel("Number1");
//  JLabel num2 = new JLabel("Number2");
//  JLabel res = new JLabel("Result");
//  
//  
//  p1.add(num1);
//  p1.add(fnum1);
//  p1.add(num2);
//  p1.add(fnum2);
//  p1.add(res);
//  p1.add(fres);
//  
//  p2.add(jbtadd);
//  p2.add(jbtsubtract);
//  p2.add(jbtmultiple);
//  p2.add(jbtdivide);
//  
//  p3.add(p1,BorderLayout.CENTER);
//  p3.add(p2,BorderLayout.SOUTH);
//  add(p3);
//  
//  jbtadd.addActionListener(new Jbtadd());
//  jbtsubtract.addActionListener(new Jbtsubtract());
//  jbtmultiple.addActionListener(new Jbtmultiple());
//  jbtdivide.addActionListener(new Jbtdivide());
//  }
//
//private class Jbtadd implements ActionListener {//Override
//    public void actionPerformed(ActionEvent e) {
//      double number1 = Double.parseDouble(fnum1.getText());
//      double number2 = Double.parseDouble(fnum2.getText());  
//      double addTotal = number1+number2;
//      fres.setText(String.format("%.1f",addTotal));
//    }
//  }
//private class Jbtsubtract implements ActionListener {//Override
//    public void actionPerformed(ActionEvent e) {
//      double number1 = Double.parseDouble(fnum1.getText());
//      double number2 = Double.parseDouble(fnum2.getText());  
//      double addTotal = number1-number2;
//      fres.setText(String.format("%.1f",addTotal));
//    }
//     }
//private class Jbtmultiple implements ActionListener {//Override
//    public void actionPerformed(ActionEvent e) {
//      double number1 = Double.parseDouble(fnum1.getText());
//      double number2 = Double.parseDouble(fnum2.getText());  
//      double addTotal = number1*number2;
//      fres.setText(String.format("%.1f",addTotal));
//    }
//  }
//private class Jbtdivide implements ActionListener {//Override
//    public void actionPerformed(ActionEvent e) {
//      double number1 = Double.parseDouble(fnum1.getText());
//      double number2 = Double.parseDouble(fnum2.getText());  
//      double addTotal = number1/number2;
//      fres.setText(String.format("%.1f",addTotal));
//    }
//  }
//
//public static void main(String[] args){
//  JFrame frame = new ex1001();
//  frame.setTitle("Exercise10_01");
//  frame.setSize(500,150);
//  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//  frame.setLocationRelativeTo(null);
//  frame.setVisible(true);  
// }
//}

//จากพิม
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
public class ex1001 extends JFrame{
    JTextField t1 = new JTextField(3);
    JTextField t2 = new JTextField(3);
    JTextField t3 = new JTextField(3);
    JButton b1 = new JButton("Add");
    JButton b2 = new JButton("Subtract");
    JButton b3 = new JButton("Multiply");
    JButton b4 = new JButton("Divide");

    public ex1001()
  {
    JPanel p = new JPanel(new GridLayout(2,1));  
    //row1
    JPanel p1 = new JPanel(new FlowLayout());
    JLabel l1 = new JLabel("Number 1");
    JLabel l2 = new JLabel("Number 2");
    JLabel l3 = new JLabel("Result");
    p1.add(l1);
    p1.add(t1);
    p1.add(l2);
    p1.add(t2);
    p1.add(l3);
    p1.add(t3);
    p.add(p1); 
    //row2
    JPanel p2 = new JPanel(new FlowLayout());
    JButton b1 = new JButton("Add");
    JButton b2 = new JButton("Subtract");
    JButton b3 = new JButton("Multiply");
    JButton b4 = new JButton("Divide");
    p2.add(b1);
    p2.add(b2);
    p2.add(b3);
    p2.add(b4);
    p.add(p2);
    
    add(p);
    b1.addActionListener(new add());
    b2.addActionListener(new subtract());
    b3.addActionListener(new multiple());
    b4.addActionListener(new divide());
  }
    
    public static void main(String[] args)
 {
    JFrame frame = new ex1001();
    
    frame.setTitle("Exercise10_01");
    frame.setLocationRelativeTo(null); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setVisible(true); 
    frame.setSize(350,125);
  }
    
  private class add implements ActionListener 
  {
    public void actionPerformed(ActionEvent e) {
      double num1 = Double.parseDouble(t1.getText());
      double num2 = Double.parseDouble(t2.getText());  
      double ans = num1+num2;
      t3.setText(String.format("%.1f",ans));
    }
  }

  private class subtract implements ActionListener 
  {
    public void actionPerformed(ActionEvent e) {
      double num1 = Double.parseDouble(t1.getText());
      double num2 = Double.parseDouble(t2.getText());  
      double ans = num1-num2;
      t3.setText(String.format("%.1f",ans));
    }
  }

  private class multiple implements ActionListener 
  {
    public void actionPerformed(ActionEvent e) {
      double num1 = Double.parseDouble(t1.getText());
      double num2 = Double.parseDouble(t2.getText());  
      double ans = num1*num2;
      t3.setText(String.format("%.1f",ans));
    }
  }

  private class divide implements ActionListener 
  {
    public void actionPerformed(ActionEvent e) {
      double num1 = Double.parseDouble(t1.getText());
      double num2 = Double.parseDouble(t2.getText());  
      double ans = num1/num2;
      t3.setText(String.format("%.1f",ans));
    }
  }
}
  
