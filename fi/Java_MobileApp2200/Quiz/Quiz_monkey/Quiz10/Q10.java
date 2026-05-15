package Quiz.Quiz_monkey.Quiz10;

import javax.swing.*;
import java.awt.*;

public class Q10 {
  public static void main(String[] args) {
    JFrame f = new JFrame("DrawCircle");

    f.add(new miwsaral());
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(600, 600);
    f.setVisible(true);
  }
}

class miwsaral extends JPanel {
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int x = getWidth();
    int y = getHeight();

    int x1 = (int) (getWidth() / 8);
    int y1 = (int) ((getHeight() / 2) - x1);

    int x2 = (int) ((getWidth() / 2) - x1);
    int y2 = (int) (getHeight() / 8);

    int w = (int) (getWidth() / 2);
    int h = (int) (getHeight() / 2);

    g.setColor(Color.WHITE);
    g.fillOval(x1, y1, w, h);
    g.setColor(Color.WHITE);
    g.fillOval(x2, y2, w, h);
    g.setColor(Color.BLACK);
    g.drawOval(x1, y1, w, h);
    g.drawOval(x2, y2, w, h);
    g.setColor(Color.RED);
    g.drawOval(x / 4, y / 2, w / 2, h / 2);
    g.drawLine(x / 2, y / 2, x / 8 + x / 2, y / 4);
    g.drawLine(x - (x / 4), y / 2, x / 8 + x / 2, y / 4);
    g.drawLine(x / 2, y / 2, (x / 2) + (x / 4), y / 2);
  }
}