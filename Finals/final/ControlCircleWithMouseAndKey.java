import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class ControlCircleWithMouseAndKey extends JFrame {
  private JButton down = new JButton("Down");
  private JButton up = new JButton("Up");
  private JButton left = new JButton("Left");
  private JButton right = new JButton("Right");
  private CirclePanel circle = new CirclePanel();
  
  public ControlCircleWithMouseAndKey() {
    JPanel panel = new JPanel(new BorderLayout());
    JPanel p1 = new JPanel();
    panel.add(circle, BorderLayout.CENTER);
    panel.add(p1, BorderLayout.SOUTH);
    p1.add(down);
    p1.add(up);
    p1.add(left);
    p1.add(right);
    add(panel);
    
    down.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        circle.down();
        circle.requestFocusInWindow();
      }
    });
    up.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        circle.up();
        circle.requestFocusInWindow();
      }
    });
    left.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        circle.left();
        circle.requestFocusInWindow();
      }
    });
    right.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        circle.right();
        circle.requestFocusInWindow();
      }
    });
    circle.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
          circle.down();
        }
        else if (e.getButton() == MouseEvent.BUTTON2) {
          circle.up();
        }
        else if (e.getButton() == MouseEvent.BUTTON3) {
          circle.left();
        }
      }
    });
    circle.setFocusable(true);
    circle.addKeyListener(new KeyAdapter() {
      @Override
      public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
          circle.down();
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
          circle.up();
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
          circle.left();
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
          circle.right();
        }
      }
    });
  }
  public static void main(String[] args) {
    JFrame frame = new ControlCircleWithMouseAndKey();
    frame.setTitle("ControlCircle");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setVisible(true); }
  class CirclePanel extends JPanel {
    private int radius = 40;
    private int x = 190;
    private int y = 170;
    private int x1 = 70;
    private int y1 = 70;
    public void down() {
      y += 10; 
      repaint();
    }
    public void up() {
      y -= 10;
      repaint();
    }
    public void left() {
      x -= 10;
      repaint();
    }
    public void right() {
      x += 10; 
      repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.YELLOW);
      g.fillRect(x-70, y, x1, y1);
      g.setColor(Color.BLACK);
      g.drawRect(x-70, y, x1, y1);
      
      g.setColor(Color.GREEN);
      g.fillRect(x, y-70, x1, y1);
      g.setColor(Color.BLACK); 
      g.drawRect(x, y-70, x1, y1);
      
      g.setColor(Color.WHITE);
      g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
      g.setColor(Color.BLACK);
      g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
  }
}