import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
public class ShowFlowLayout3 extends JFrame {
  private static final long serialVersionUID = 1L;
  private ImageIcon DEN = new ImageIcon("f:\\/!Cpe121/Advanced Com/Code/JAVA FINAL/9 GUI/img/DEN.png");
  private ImageIcon FRA = new ImageIcon("f:\\/!Cpe121/Advanced Com/Code/JAVA FINAL/9 GUI/img/FRA.png");
  private ImageIcon GER = new ImageIcon("f:\\/!Cpe121/Advanced Com/Code/JAVA FINAL/9 GUI/img/GER.png");
  private ImageIcon UK = new ImageIcon("f:\\/!Cpe121/Advanced Com/Code/JAVA FINAL/9 GUI/img/UK.png");
  
  public ShowFlowLayout3() {
    setLayout(new GridLayout(2, 2, 5, 5));
    add(new JLabel(DEN));
    add(new JLabel(FRA));
    add(new JLabel(GER));
    add(new JLabel(UK));
    
    
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