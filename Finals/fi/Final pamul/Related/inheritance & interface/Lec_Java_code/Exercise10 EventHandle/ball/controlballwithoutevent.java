import javax.swing.*;
import java.awt.*;
public class controlballwithoutevent extends JFrame 
{
  private JButton jbtEnlarge = new JButton("Enlarge");
  private JButton jbtShrink = new JButton("Shrink");
  private CirclePanel canvas = new CirclePanel();
  public controlballwithoutevent()
  {
    JPanel p = new JPanel();
    p.add(jbtEnlarge);
    p.add(jbtShrink);
    this.add(canvas,BorderLayout.CENTER);
    this.add(p,BorderLayout.SOUTH);
  }
  public static void main(String[] args) 
  {
    JFrame frame = new controlballwithoutevent();
    frame.setTitle("controlballwithoutevent");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}
class CirclePanel extends JPanel
{
  private int radius = 5;
  protected void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.drawOval(getWidth() / 2 - radius , getHeight() / 2 - radius , 2 * radius ,2 * radius);
  }
}