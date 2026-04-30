import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MoveMessageDemo extends JFrame {
  public MoveMessageDemo() {
    // สร้าง panel และเพิ่ม mouse listener
    JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);

    panel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse clicked at (" + x + ", " + y + ")");
        JOptionPane.showMessageDialog(null, "You clicked at (" + x + ", " + y + ")");
      }
    });

    add(panel);
    setTitle("Mouse Click Example");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  }

  public static void main(String[] args) {
    new MoveMessageDemo();
  }
}
