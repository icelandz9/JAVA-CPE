import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HandleEvent2 extends JFrame {
  private KeyboardPanel keyboardPanel = new KeyboardPanel();
  public HandleEvent2() {
    JPanel BpanelMain = new JPanel();
    BpanelMain.setLayout(new BorderLayout());
    
    BpanelMain.add(keyboardPanel);
    keyboardPanel.setFocusable(true);
    
    add(BpanelMain);
    addComponentListener(new ComponentAdapter() {
      public void componentResized(ComponentEvent e) {
        int width = getWidth();
        int height = getHeight();
        System.out.println("Current size: " + width + " x " + height);
      }
    });
    setVisible(true);
  }
  
  static class KeyboardPanel extends JPanel {
    private int x = 0; private int y = 0;    
    public KeyboardPanel() {
      addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: y += 10; break;
            case KeyEvent.VK_UP: y -= 10; break;
            case KeyEvent.VK_LEFT: x -= 10; break;
            case KeyEvent.VK_RIGHT: x += 10; break;
            default:;
          }
          repaint();
        }
      });
    }
    
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawOval(x, y, 10, 10);
    }
  }
}