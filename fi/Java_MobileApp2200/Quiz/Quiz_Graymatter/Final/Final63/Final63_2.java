package Quiz.Quiz_Graymatter.Final.Final63;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Final63_2 extends JFrame {
  private CirclePanel canvas = new CirclePanel();

  public Final63_2() {
    setTitle("ControlCircleSquare");
    setLayout(new BorderLayout());

    // ᶺ������ҧ
    JPanel buttonPanel = new JPanel(new GridLayout(1, 4));

    JButton btnRight = new JButton("Right");
    JButton btnLeft = new JButton("Left");
    JButton btnDown = new JButton("Down");
    JButton btnUp = new JButton("Up");
    JButton btnShrink = new JButton("Shrink");
    JButton btnEnlarge = new JButton("Enlarge");

    buttonPanel.add(btnRight);
    buttonPanel.add(btnLeft);
    buttonPanel.add(btnDown);
    buttonPanel.add(btnUp);

    JPanel buttonPanelSE = new JPanel(new GridLayout(1, 2));
    buttonPanelSE.add(btnShrink);
    buttonPanelSE.add(btnEnlarge);

    JPanel buttonAll = new JPanel(new GridLayout(2, 1));
    buttonAll.add(buttonPanel);
    buttonAll.add(buttonPanelSE);

    // ����������Ѻ�ѧ��ѹ
    btnRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        canvas.move(10, 0);
      }
    });

    btnLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        canvas.move(-10, 0);
      }
    });

    btnDown.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        canvas.move(0, 10);
      }
    });

    btnUp.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        canvas.move(0, -10);
      }
    });

    btnShrink.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        canvas.resize(-5);
      }
    });

    btnEnlarge.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        canvas.resize(5);
      }
    });

    add(canvas, BorderLayout.CENTER);
    add(buttonAll, BorderLayout.SOUTH);

    // ���� key listener
    canvas.setFocusable(true);
    canvas.requestFocusInWindow();
    canvas.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
          case 'j':
            canvas.move(-10, 0);
            break;
          case 'l':
            canvas.move(10, 0);
            break;
          case 'i':
            canvas.move(0, -10);
            break;
          case 'k':
            canvas.move(0, 10);
            break;
          case '-':
            canvas.resize(-5);
            break;
          case '+':
            canvas.resize(5);
            break;
        }
        canvas.repaint();
      }
    });
  }

  // �Ҵǧ���
  class CirclePanel extends JPanel {
    private int x = 150;
    private int y = 150;
    private int radius = 50;

    public void move(int dx, int dy) {
      x += dx;
      y += dy;
      repaint();
    }

    public void resize(int dr) {
      radius += dr;
      if (radius < 10)
        radius = 10; // ��ͧ�ѹǧ������
      repaint();
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      // ���᡹
      g.setColor(Color.RED);
      g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
      g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);

      // ǧ��� 1
      g.setColor(Color.GREEN);
      g.fillOval(x, y, radius * 2, radius * 2);

      // ǧ��� 2 (���)
      g.setColor(Color.BLACK);
      g.drawOval(x - 100, y + 100, radius * 2, radius * 2);
    }
  }

  public static void main(String[] args) {
    Final63_2 frame = new Final63_2();
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
