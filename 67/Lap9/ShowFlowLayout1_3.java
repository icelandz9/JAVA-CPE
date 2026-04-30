import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
public class ShowFlowLayout1_3 extends JFrame {
  private static final long serialVersionUID = 1L;
  
  public ShowFlowLayout1_3() {
//    Font font = new Font("", Font.BOLD, 16);
    JPanel p = new JPanel(new GridLayout(4,1));
    JLabel a = new JLabel("Hello ,My name is CPE 320");
    JLabel b = new JLabel("Department of computer Engineering.");
    JLabel c = new JLabel("Srinakharinwirot University");
    JLabel d = new JLabel("Ongkarak Nakornnayok");
    LineBorder lineBorder = new LineBorder(Color.BLUE, 1);
    a.setBorder(lineBorder);
    b.setBorder(lineBorder);
    c.setBorder(lineBorder);
    d.setBorder(lineBorder);
//    a.setFont(font);
//    b.setFont(font);
//    c.setFont(font);
//    d.setFont(font);
    p.add(a);
    p.add(b);
    p.add(c);
    p.add(d);
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