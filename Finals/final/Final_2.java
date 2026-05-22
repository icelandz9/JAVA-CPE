import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Final_2 extends JFrame {
  private JTextField B = new JTextField(8);
  private JTextField H = new JTextField(8);
  private JTextField A = new JTextField(8);
  private JButton Triangle = new JButton("Triangle");
  private JButton Rectangle = new JButton("Rectangle");
  
  public Final_2() {
    JPanel Main = new JPanel(new BorderLayout(10,10));
    
        JPanel FLeft = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
    Main.add(FLeft, BorderLayout.WEST);
    
    JPanel GLeft = new JPanel(new GridLayout(3,2));
    JPanel GRight = new JPanel(new GridLayout(2,1));
    FLeft.add(GLeft, BorderLayout.WEST);
    Main.add(GRight, BorderLayout.CENTER);
   
    GLeft.add(new JLabel("B"));
    GLeft.add(B);
    GLeft.add(new JLabel("H"));
    GLeft.add(H);
    GLeft.add(new JLabel("A"));
    GLeft.add(A);
    
    GRight.add(Triangle);
    GRight.add(Rectangle);
    
    Triangle.addActionListener(new jTriangle_());
    Rectangle.addActionListener(new jRectangle_());
    A.setEditable(false);
    add(Main);
  }
  
  private class jTriangle_ implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double b = Double.parseDouble(B.getText());
      double h = Double.parseDouble(H.getText());
      A.setText(String.format("%.2f", ((1.0/2.0)*b*h)));
    }
  }
  
  private class jRectangle_ implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double b = Double.parseDouble(B.getText());
      double h = Double.parseDouble(H.getText());
      A.setText(String.format("%.2f",(b*h)));
    }
  }
  
  public static void main(String[] args) {
    Final_2 frame = new Final_2();
    frame.setTitle("CPE 121:Frame Layout");
    frame.setSize(400, 200 );
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}