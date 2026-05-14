import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ControlBall extends JFrame 
{
  private JButton jbtEnlarge = new JButton("Enlarge");
  private JButton jbtShrink = new JButton("Shrink");
  private CirclePanel canvas = new CirclePanel();
  public ControlBall()
  {
    JPanel p = new JPanel();
    p.add(jbtEnlarge);
    p.add(jbtShrink);
    this.add(canvas,BorderLayout.CENTER);
    this.add(p,BorderLayout.SOUTH);
    jbtEnlarge.addActionListener(new EnlargeListener());
    jbtShrink.addActionListener(new ShrinkListener());
  }
  public static void main(String[] args) 
  {
    JFrame frame = new ControlBall();
    frame.setTitle("ControlBall");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
  class EnlargeListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      canvas.enlarge();
    }
  }
    class ShrinkListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      canvas.shrink();
    }
  }

}
  
class CirclePanel extends JPanel
{
  private int radius = 5;
  public void enlarge()
  {
    radius++;
    repaint();
  }
    public void shrink()
  {
    radius--;
    repaint();
  }
  protected void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.drawOval(getWidth() / 2 - radius , getHeight() / 2 - radius , 2 * radius ,2 * radius);
  }
}
