package Quiz.Quiz_Graymatter.Final.Final62;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Final62_Set2_2 extends JFrame {
  private StarPanel1 panel = new StarPanel1();

  public Final62_Set2_2() {

    setLayout(new BorderLayout());

    // �����Ǻ���
    JButton btnUp = new JButton("Up");
    JButton btnDown = new JButton("Down");
    JButton btnLeft = new JButton("<<");
    JButton btnRight = new JButton(">>");

    JPanel buttonPanel = new JPanel();
    buttonPanel.add(btnUp);
    buttonPanel.add(btnDown);
    buttonPanel.add(btnLeft);
    buttonPanel.add(btnRight);

    // ����������Ѻ�������͹���
    btnUp.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        panel.plusY -= 10;
        panel.repaint();
      }
    });

    btnDown.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        panel.plusY += 10;
        panel.repaint();
      }
    });

    btnLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        panel.plusX -= 10;
        panel.repaint();
      }
    });

    btnRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        panel.plusX += 10;
        panel.repaint();
      }
    });

    add(panel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);

    // �鹾����
    panel.setFocusable(true);
    panel.requestFocusInWindow();
    panel.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
          case KeyEvent.VK_UP:
            panel.plusY -= 10;
            break;
          case KeyEvent.VK_DOWN:
            panel.plusY += 10;
            break;
          case KeyEvent.VK_LEFT:
            panel.plusX -= 10;
            break;
          case KeyEvent.VK_RIGHT:
            panel.plusX += 10;
            break;
        }
        panel.repaint();
      }
    });

  }

  // ====== Panel �Ҵ�ٻ ======
  class StarPanel1 extends JPanel {
    public int plusX = 0, plusY = 0;

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      int x1 = getWidth() / 8;
      int y1 = getHeight() / 8;
      int x2 = getWidth() / 4;
      int y2 = getHeight() / 4;
      int x3 = getWidth() / 2;
      int y3 = getHeight() / 2;

      int xCenter = x3 + plusX;
      int yCenter = y3 + plusY;

      // �Ҵ�ٻ������������͹�ѹ
      g.setColor(Color.RED);
      Polygon p1 = new Polygon();
      p1.addPoint(xCenter - x2 - x1, yCenter);
      p1.addPoint(xCenter + x2, yCenter - y2);
      p1.addPoint(xCenter + x2, yCenter + y2);
      g.drawPolygon(p1);

      Polygon p2 = new Polygon();
      p2.addPoint(xCenter + x2 + x1, yCenter);
      p2.addPoint(xCenter - x2, yCenter - y2);
      p2.addPoint(xCenter - x2, yCenter + y2);
      g.drawPolygon(p2);
    }
  }

  public static void main(String[] args) {
    Final62_Set2_2 frame = new Final62_Set2_2();
    frame.setTitle("Control2Triangle");
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }

}
