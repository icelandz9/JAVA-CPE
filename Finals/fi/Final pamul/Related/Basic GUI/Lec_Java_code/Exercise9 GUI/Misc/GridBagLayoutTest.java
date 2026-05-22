import javax.swing.*;
import java.awt.*;
public class GridBagLayoutTest 
{
  public static void addItem(JPanel p, JComponent c,int x, int y, int width, int height, int align) 
  {
    GridBagConstraints gc = new GridBagConstraints();
    gc.gridx = x; gc.gridy = y;
    gc.gridwidth = width; gc.gridheight = height;
    gc.insets = new Insets(5, 5, 5, 5);
    gc.anchor = align; 
    gc.fill = GridBagConstraints.NONE;
    p.add(c, gc);
  }
public static void main(String[] args) 
{
  JFrame f = new JFrame("GridBagLayout Test");
  JPanel p = new JPanel();
  p.setLayout(new GridBagLayout());
  JButton a = new JButton("หนึ่ง"); JButton b = new JButton("สอง");
  JButton c = new JButton("สาม"); JButton d = new JButton("สี่");
  JLabel e = new JLabel("ห้า", SwingConstants.CENTER);
  e.setPreferredSize(new Dimension(60, 60)); e.setOpaque(true);
  e.setBackground(Color.cyan);
  JButton g = new JButton("หก"); JButton h = new JButton("เจ็ด");
  JButton i = new JButton("แปด");
  JLabel j = new JLabel("เก้า", SwingConstants.CENTER);
  j.setPreferredSize(new Dimension(200, 30));
  j.setOpaque(true); j.setBackground(Color.blue);
  j.setForeground(Color.white);
  addItem(p, a, 0, 0, 1, 1, GridBagConstraints.WEST);
  addItem(p, b, 1, 0, 1, 1, GridBagConstraints.WEST);
  addItem(p, c, 2, 0, 1, 1, GridBagConstraints.WEST);
  addItem(p, d, 0, 1, 1, 1, GridBagConstraints.WEST);
  addItem(p, e, 1, 1, 1, 2, GridBagConstraints.WEST);
  addItem(p, g, 2, 1, 1, 1, GridBagConstraints.WEST);
  addItem(p, h, 0, 2, 1, 1, GridBagConstraints.WEST);
  addItem(p, i, 2, 2, 1, 1, GridBagConstraints.WEST);
  addItem(p, j, 0, 3, 3, 1, GridBagConstraints.WEST);
  f.add(p);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setSize(250, 200);
  f.setVisible(true);
}
}