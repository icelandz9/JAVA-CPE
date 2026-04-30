import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
public class ShowFlowLayout1_4 extends JFrame {
  private static final long serialVersionUID = 1L;
  
  public ShowFlowLayout1_4() {
    JPanel p = new JPanel(new GridLayout(8,8));
    LineBorder lineBorder = new LineBorder(Color.BLUE, 1);
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 8; j++) {
        JLabel  color = new JLabel ();
        if ((i + j) % 2 == 0) { 
          color.setBackground(Color.WHITE);
        } else {
          color.setBackground(Color.BLACK);
        }
        color.setOpaque(true);
        p.add(color);
        color.setBorder(lineBorder);
      }
    }
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