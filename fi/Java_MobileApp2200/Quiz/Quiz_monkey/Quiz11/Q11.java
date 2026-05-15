package Quiz.Quiz_monkey.Quiz11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Q11 extends JFrame {
  drawArc A = new drawArc();
  int click = 0;

  public Q11() {
    JPanel p = new JPanel(new GridLayout(1, 1));
    p.add(A);
    add(p);

    A.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (click != 1) {
          A.getColor(3);
          A.getRadius(0);
          int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter radius of Polygon"));
          A.getRadius(c);
          click = 1;
        } else {
          int c2 = Integer.parseInt(JOptionPane.showInputDialog(null,
              "Please enter 0 for Black or 1 for Green or 2 for Blue. It will the Red otherwise."));
          A.getColor(c2);
          click = 0;
        }
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new Q11();
    frame.setTitle("CPE 222 : Quiz 11");
    frame.setSize(600, 600);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class drawArc extends JButton {
  int radius = 0;
  int color = 3;

  public void getRadius(int Radius) {
    radius = Radius;
    repaint();
  }

  public void getColor(int Color) {
    color = Color;
    repaint();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    switch (color) {
      case 0:
        g.setColor(Color.BLACK);
        break;
      case 1:
        g.setColor(Color.GREEN);
        break;
      case 2:
        g.setColor(Color.BLUE);
        break;
      default:
        g.setColor(Color.RED);
        break;
    }

    int xcenter = getWidth() / 2;
    int ycenter = getHeight() / 2;

    int r = radius - 20;
    int x = xcenter - r / 2;
    int y = ycenter - r / 2;

    Polygon polygon = new Polygon();
    polygon.addPoint(xcenter + radius, ycenter);
    polygon.addPoint((int) (xcenter + radius * Math.cos(2 * Math.PI / 6)),
        (int) (ycenter - radius * Math.sin(2 * Math.PI / 6)));
    polygon.addPoint((int) (xcenter + radius * Math.cos(2 * 2 * Math.PI / 6)),
        (int) (ycenter - radius * Math.sin(2 * 2 * Math.PI / 6)));
    polygon.addPoint((int) (xcenter + radius * Math.cos(3 * 2 * Math.PI / 6)),
        (int) (ycenter - radius * Math.sin(3 * 2 * Math.PI / 6)));
    polygon.addPoint((int) (xcenter + radius * Math.cos(4 * 2 * Math.PI / 6)),
        (int) (ycenter - radius * Math.sin(4 * 2 * Math.PI / 6)));
    polygon.addPoint((int) (xcenter + radius * Math.cos(5 * 2 * Math.PI / 6)),
        (int) (ycenter - radius * Math.sin(5 * 2 * Math.PI / 6)));
    g.drawPolygon(polygon);
    g.setColor(Color.WHITE);
    g.fillRect(x, y, r, r);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, r, r);
  }
}