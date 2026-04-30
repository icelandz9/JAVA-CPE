import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowFlowLayout1_2 extends JFrame {
  private static final long serialVersionUID = 1L;
  
  public ShowFlowLayout1_2() {
    JPanel p = new JPanel(new BorderLayout());
    JPanel p1 = new JPanel(new BorderLayout());
    JPanel p2 = new JPanel(new BorderLayout());
    
    JButton a = new JButton("OK");
    JButton b = new JButton("Cancel");
    JButton c = new JButton("Exit");
    JLabel d = new JLabel("Name");
    JTextField e =  new JTextField(20);
    
    p.add(p1,BorderLayout.NORTH);
    p1.add(d,BorderLayout.WEST);
    p1.add(e,BorderLayout.CENTER);
    
    p.add(p2,BorderLayout.SOUTH);
    p2.add(a,BorderLayout.WEST);
    p2.add(b,BorderLayout.CENTER);
    p2.add(c,BorderLayout.EAST);
    
    add(p);
    
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