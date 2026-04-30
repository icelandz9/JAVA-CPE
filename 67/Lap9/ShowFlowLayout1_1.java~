import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowFlowLayout1_1 extends JFrame {
  private static final long serialVersionUID = 1L;
  
  public ShowFlowLayout1_1() {
    setLayout(new FlowLayout(FlowLayout.LEFT, 5, 20));
    add(new JLabel("Name"));
    add(new JTextField(16));
    add(new JButton("OK"));
    add(new JButton("Cancel"));
    add(new JButton("Exit"));
    
    addComponentListener(new ComponentAdapter() {
      @Override
      public void componentResized(ComponentEvent e) {
        int width = getWidth();
        int height = getHeight();
        System.out.println("Current size: " + width + " x " + height);
      }
    });

    setVisible(true);
    
  }
}