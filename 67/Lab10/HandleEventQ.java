import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HandleEventQ extends JFrame {
  private JTextField Number1 = new JTextField(5);
  private JTextField Number2 = new JTextField(5);
  private JTextField Resuit = new JTextField(5);
  
  public HandleEventQ() {
    JPanel BpanelMain = new JPanel(new BorderLayout());
    JPanel BpanelTop = new JPanel(new BorderLayout());
    JPanel BpanelCenter = new JPanel(new BorderLayout());
    JPanel GpanelButtom = new JPanel(new BorderLayout());
    
    BpanelMain.add(BpanelTop,BorderLayout.WEST);
    BpanelMain.add(BpanelCenter,BorderLayout.CENTER);
    BpanelMain.add(GpanelButtom,BorderLayout.EAST);
    
    JPanel GpanelLeft = new JPanel(new GridLayout(3, 1));
    JPanel GpanelCenter = new JPanel(new GridLayout(3, 1));
    JPanel GpanelRight = new JPanel(new GridLayout(4, 1));
    
    BpanelTop.add(GpanelLeft);
    BpanelCenter.add(GpanelCenter);
    GpanelButtom.add(GpanelRight);
    
    GpanelLeft.add(new JLabel("Number 1"));   
    GpanelLeft.add(new JLabel("Number 2"));
    GpanelLeft.add(new JLabel("Result"));
    
    GpanelCenter.add(Number1);
    GpanelCenter.add(Number2);
    GpanelCenter.add(Resuit);
    
    JButton jAdd = new JButton("Add");
    JButton jSubtract = new JButton("Subtract");
    JButton jMultiply = new JButton("Multiply");
    JButton jDivide = new JButton("Divide");
    GpanelRight.add(jAdd);
    GpanelRight.add(jSubtract);
    GpanelRight.add(jMultiply);
    GpanelRight.add(jDivide);
    
    jAdd.addActionListener(new jAdd_());
    jSubtract.addActionListener(new jSubtract_());
    jMultiply.addActionListener(new jMultiply_());
    jDivide.addActionListener(new jDivide_());
    
    Resuit.setEditable(false);
    
    add(BpanelMain);
  }
  
  private class jAdd_ implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double num1 = Double.parseDouble(Number1.getText());
      double num2 = Double.parseDouble(Number2.getText());
      Resuit.setText(String.format("%.2f", num1+num2));
    }
  }
  
  private class jSubtract_ implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double num1 = Double.parseDouble(Number1.getText());
      double num2 = Double.parseDouble(Number2.getText());
      Resuit.setText(String.format("%.2f", num1-num2));
    }
  }
  
  private class jMultiply_ implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double num1 = Double.parseDouble(Number1.getText());
      double num2 = Double.parseDouble(Number2.getText());
      Resuit.setText(String.format("%.2f", num1*num2));
    }
  }
  
  private class jDivide_ implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double num = 0;
      double num1 = Double.parseDouble(Number1.getText());
      double num2 = Double.parseDouble(Number2.getText());
      if (num1/num2 == 0 || num2/num1 == 0) {
        Resuit.setText(String.format("%.2f", num));
      } else {
        Resuit.setText(String.format("%.2f", num1/num2));
      } 
    }
  }
  public static void main(String[] args) {
    HandleEventQ frame = new HandleEventQ();
    frame.setTitle("CPE 121:Frame Layout");
    frame.setSize(400, 200 );
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
