import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowFlowLayout2 extends JFrame {
  private static final long serialVersionUID = 1L;
  
  public ShowFlowLayout2() {
    setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
    JPanel p = new JPanel(new BorderLayout(10,10));
    JPanel p1 = new JPanel(new BorderLayout(10,10));
    JPanel p2 = new JPanel(new BorderLayout(10,10));
    JButton a = new JButton("Button1");
    JButton b = new JButton("Button2");
    JButton c = new JButton("Button3");
    JButton d = new JButton("Button4");
    JButton e = new JButton("Button5");
    JButton f = new JButton("Button6");
    p.add(p1,BorderLayout.SOUTH);
    p1.add(a,BorderLayout.WEST);
    p1.add(b,BorderLayout.CENTER);
    p1.add(c,BorderLayout.EAST);
    
    p.add(p2,BorderLayout.CENTER);
    p2.add(d,BorderLayout.WEST);
    p2.add(e,BorderLayout.CENTER);
    p2.add(f,BorderLayout.EAST);
    
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