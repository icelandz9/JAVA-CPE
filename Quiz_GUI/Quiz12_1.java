import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz12_1 extends JFrame {
  public Quiz12_1() {
    setTitle("Handle Event");
    setSize(350, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    
    final JTextField field1 = new JTextField(5); // ??? final ??? JTextField
    final JTextField field2 = new JTextField(5);
    final JTextField result = new JTextField(5);
    result.setEditable(false); 
    
    JPanel UnderPanel = new JPanel(new GridLayout(3,1, 60, 20));
    UnderPanel.add(new JLabel("Number 1")); 
    UnderPanel.add(field1);
    UnderPanel.add(new JLabel("Number 2")); 
    UnderPanel.add(field2);
    UnderPanel.add(new JLabel("Result"));   
    UnderPanel.add(result);
    
    field1.setPreferredSize(new Dimension(20, 25));
    
    
    JPanel bottomPanel = new JPanel(new GridLayout(2, 2, 2, 2));
    JButton mulBtn = new JButton("Multiply");
    JButton divBtn = new JButton("Divide");
    JButton addBtn = new JButton("Add");
    JButton subBtn = new JButton("Subtract");
    bottomPanel.add(addBtn);
    bottomPanel.add(subBtn);
    bottomPanel.add(mulBtn);
    bottomPanel.add(divBtn);
    
    bottomPanel.setPreferredSize(new Dimension(200, 80));
    
    JPanel wrapperPanel = new JPanel();
    wrapperPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); 
    wrapperPanel.add(bottomPanel);
    
    
    
    // --- ActionListener ??????????????? ---
    mulBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(field1.getText());
        double num2 = Double.parseDouble(field2.getText());
        double sum = num1 * num2;
        result.setText(String.valueOf(sum));
        
          System.out.println("Process New");
      }
    });
    
    divBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(field1.getText());
        double b = Double.parseDouble(field2.getText());
        double sum = a / b;
        result.setText(String.valueOf(sum));
      }
    }
    );
    
    addBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(field1.getText());
        double b = Double.parseDouble(field2.getText());
        double sum = a + b;
        result.setText(String.valueOf(sum));
      }
    }
    );
    
    subBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(field1.getText());
        double b = Double.parseDouble(field2.getText());
        double sum = a - b;
        result.setText(String.valueOf(sum));
      }
    }
    );

    // --- ????? panel ???? frame ---
    add(UnderPanel, BorderLayout.SOUTH);
    add(bottomPanel, BorderLayout.NORTH);
    
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new Quiz12_1();
  }
}