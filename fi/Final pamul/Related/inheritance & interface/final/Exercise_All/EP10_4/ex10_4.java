import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class ex10_4 extends JFrame {

  private JTextField Number1 = new JTextField(4);
  private JTextField Number2 = new JTextField(4);
  private JTextField Result = new JTextField(10);
  private JButton Add = new JButton("Add");  
  private JButton Subtract = new JButton("Subtract"); 
  private JButton Multiply = new JButton("Multiply"); 
  private JButton Divide = new JButton("Divide"); 

  public ex10_4() {

    JPanel p1 = new JPanel(new GridLayout(3,2));
    JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 1, 1));

    p1.add(new JLabel("Number1"));     p1.add(Number1);
    p1.add(new JLabel("Number2"));     p1.add(Number2);
    p1.add(new JLabel("Result"));      p1.add(Result);

    p2.add(Add);   
    p2.add(Subtract);   
    p2.add(Multiply);   
    p2.add(Divide);

    add(p1, BorderLayout.CENTER);
    add(p2, BorderLayout.SOUTH); 
    Add.addActionListener(new ActionListener() {
    @Override 
    public void actionPerformed(ActionEvent e) {
    double number1 = Double.parseDouble(Number1.getText());
    double number2 = Double.parseDouble(Number2.getText());
    double sum = number1+number2;
    Result.setText(String.format("%.2f", sum));}}); 
    Subtract.addActionListener(new ActionListener() {
    @Override 
    public void actionPerformed(ActionEvent e) {
    double number1 = Double.parseDouble(Number1.getText());
    double number2 = Double.parseDouble(Number2.getText());
    double sum = number1-number2;
    Result.setText(String.format("%.2f", sum));}}); 
    Multiply.addActionListener(new ActionListener() {
    @Override 
    public void actionPerformed(ActionEvent e) {
    double number1 = Double.parseDouble(Number1.getText());
    double number2 = Double.parseDouble(Number2.getText());
    double sum = number1*number2;
    Result.setText(String.format("%.2f", sum));}});
    Divide.addActionListener(new ActionListener() {
    @Override 
    public void actionPerformed(ActionEvent e) {
    double number1 = Double.parseDouble(Number1.getText());
    double number2 = Double.parseDouble(Number2.getText());
    double sum = number1/number2;
    Result.setText(String.format("%.2f", sum));}});
}

public static void main(String[] args) {
  ex10_4 frame = new ex10_4();
  frame.setTitle("ex10_4");
  frame.setSize(500, 150);
  frame.setLocationRelativeTo(null); // Center the frame
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
}
}