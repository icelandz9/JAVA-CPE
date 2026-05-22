import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ex1 extends JFrame
{
  public Ex1()
  {
    JButton addbt = new JButton("Add"); 
    JButton sub = new JButton("Subtract");
    JButton mul = new JButton("Mulitiply");
    JButton di = new JButton("Divide");
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JTextField nm1 = new JTextField(10);
    JTextField nm2 = new JTextField(10);
    JTextField result = new JTextField(10);
    result.setEditable(false);
    p.setLayout(new BorderLayout());
    p1.add(addbt);
    p1.add(sub);
    p1.add(mul);
    p1.add(di);
    p2.add(new JLabel("Number1: "));
    p2.add(nm1);
    p2.add(new JLabel("Number2: "));
    p2.add(nm2);
    p2.add(new JLabel("Result: "));
    p2.add(result);
    AddListener lis1 = new AddListener(nm1,nm2,result);
    SubtractListener lis2 = new SubtractListener(nm1,nm2,result);
    MulitiplyListener lis3 = new MulitiplyListener(nm1,nm2,result);
    DivideListener lis4 = new DivideListener(nm1,nm2,result);
    addbt.addActionListener(lis1); 
    sub.addActionListener(lis2); 
    mul.addActionListener(lis3);
    di.addActionListener(lis4); 
    p.add(p1,BorderLayout.SOUTH);
    p.add(p2,BorderLayout.CENTER);
    add(p);
  }
  public static void main(String[] args)
  {
    JFrame frame = new Ex1();
    frame.setSize(800,120);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
class AddListener implements ActionListener
{
  private JTextField nm1;
  private JTextField nm2;
  private JTextField result;
  private double sum;
  AddListener(JTextField nm1,JTextField nm2,JTextField result)
  {
    this.nm1 = nm1;
    this.nm2 = nm2;
    this.result = result;
  } 
  public void actionPerformed(ActionEvent e)
  {
    double num1 = Double.parseDouble(nm1.getText());
    double num2 = Double.parseDouble(nm2.getText());
    sum = num1+num2;
    result.setText(String.valueOf(sum));
  }
}
class SubtractListener implements ActionListener
{
  private JTextField nm1;
  private JTextField nm2;
  private JTextField result;
  private double sum;
  SubtractListener(JTextField nm1,JTextField nm2,JTextField result)
  {
    this.nm1 = nm1;
    this.nm2 = nm2;
    this.result = result;
  } 
  public void actionPerformed(ActionEvent e)
  {
    double num1 = Double.parseDouble(nm1.getText());
    double num2 = Double.parseDouble(nm2.getText());
    sum = num1-num2;
    result.setText(String.valueOf(sum));
  }
}
class MulitiplyListener implements ActionListener
{
  private JTextField nm1;
  private JTextField nm2;
  private JTextField result;
  private double sum = 0.0;
  MulitiplyListener(JTextField nm1,JTextField nm2,JTextField result)
  {
    this.nm1 = nm1;
    this.nm2 = nm2;
    this.result = result;
  } 
  public void actionPerformed(ActionEvent e)
  {
    double num1 = Double.parseDouble(nm1.getText());
    double num2 = Double.parseDouble(nm2.getText());
    sum = num1*num2;
    result.setText(String.valueOf(sum));
  }
}
class DivideListener implements ActionListener
{
  private JTextField nm1;
  private JTextField nm2;
  private JTextField result;
  private double sum;
  DivideListener(JTextField nm1,JTextField nm2,JTextField result)
  {
    this.nm1 = nm1;
    this.nm2 = nm2;
    this.result = result;
  } 
  public void actionPerformed(ActionEvent e)
  {
    double num1 = Double.parseDouble(nm1.getText());
    double num2 = Double.parseDouble(nm2.getText());
    sum = num1/num2;
    result.setText(String.valueOf(sum));
  }
}
