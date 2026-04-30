import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HandleEvent1 extends JFrame {
  private JTextField Number1 = new JTextField(5);
  private JTextField Number2 = new JTextField(5);
  private JTextField Resuit = new JTextField(5);
  
  public HandleEvent1() {
    JPanel BpanelMain = new JPanel();
    BpanelMain.setLayout(new BorderLayout());
    JPanel BpanelTop = new JPanel();
    BpanelTop.setLayout(new BorderLayout());
    JPanel BpanelButtom = new JPanel();
    BpanelButtom.setLayout(new BorderLayout());
    
    BpanelMain.add(BpanelTop,BorderLayout.NORTH);
    BpanelMain.add(BpanelButtom,BorderLayout.SOUTH);
    
    JPanel GpanelTop = new JPanel(new GridLayout(1, 6));
    JPanel GpanelButtom = new JPanel(new GridLayout(1, 4, 5, 5));
    BpanelTop.add(GpanelTop);
    BpanelButtom.add(GpanelButtom);
    
    GpanelTop.add(new JLabel("Number 1"));
    GpanelTop.add(Number1);
    GpanelTop.add(new JLabel("Number 2"));
    GpanelTop.add(Number2);
    GpanelTop.add(new JLabel("Result"));
    GpanelTop.add(Resuit);
    
    JButton jAdd = new JButton("Add");
    JButton jSubtract = new JButton("Subtract");
    JButton jMultiply = new JButton("Multiply");
    JButton jDivide = new JButton("Divide");
    GpanelButtom.add(jAdd);
    GpanelButtom.add(jSubtract);
    GpanelButtom.add(jMultiply);
    GpanelButtom.add(jDivide);
    
    jAdd.addActionListener(new jAdd_());
    jSubtract.addActionListener(new jSubtract_());
    jMultiply.addActionListener(new jMultiply_());
    jDivide.addActionListener(new jDivide_());
    
    Resuit.setEditable(false);
    
    add(BpanelMain);
    addComponentListener(new ComponentAdapter() {
      public void componentResized(ComponentEvent e) {
        int width = getWidth();
        int height = getHeight();
        System.out.println("Current size: " + width + " x " + height);
      }
    });
    setVisible(true);
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
      double num1 = Double.parseDouble(Number1.getText());
      double num2 = Double.parseDouble(Number2.getText());
      Resuit.setText(String.format("%.2f", num1/num2));
    }
  }
}