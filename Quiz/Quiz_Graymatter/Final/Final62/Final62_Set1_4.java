package Quiz.Quiz_Graymatter.Final.Final62;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Final62_Set1_4 extends JFrame {
    private SquarePanel canvas = new SquarePanel();

    public Final62_Set1_4() {
        setLayout(new BorderLayout());

        // �����Ǻ���
        JPanel panel = new JPanel();
        JButton btnLeft = new JButton("Left");
        JButton btnRight = new JButton("Right");
        JButton btnUp = new JButton("Up");
        JButton btnDown = new JButton("Down");

        panel.add(btnLeft);
        panel.add(btnRight);
        panel.add(btnUp);
        panel.add(btnDown);

        // ���� -> �������͹���
        btnLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvas.move(-10, 0);
            }
        });
        btnRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvas.move(10, 0);
            }
        });
        btnUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvas.move(0, -10);
            }
        });
        btnDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvas.move(0, 10);
            }
        });

        add(canvas, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        // Keyboard control
        canvas.setFocusable(true);
        canvas.requestFocusInWindow();
        canvas.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        canvas.move(-10, 0);
                        break;
                    case KeyEvent.VK_RIGHT:
                        canvas.move(10, 0);
                        break;
                    case KeyEvent.VK_UP:
                        canvas.move(0, -10);
                        break;
                    case KeyEvent.VK_DOWN:
                        canvas.move(0, 10);
                        break;
                }
            }
        });

    }

    // ==== Canvas Panel ====
    class SquarePanel extends JPanel {
        private int centerX = 150;
        private int centerY = 150;
        private int squareSize = 60;

        public void move(int dx, int dy) {
            centerX += dx;
            centerY += dy;
            repaint();
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int offset = squareSize / 2;

            // �Ҵ��������������ͧ (��ҧ����)
            int yellowX = centerX - squareSize;
            int yellowY = centerY + offset;
            g.setColor(Color.YELLOW);
            g.fillRect(yellowX, yellowY, squareSize, squareSize);
            g.setColor(Color.BLACK);
            g.drawRect(yellowX, yellowY, squareSize, squareSize);

            // �Ҵ�������������� (�����)
            int greenX = centerX + offset;
            int greenY = centerY - squareSize;
            g.setColor(Color.GREEN);
            g.fillRect(greenX, greenY, squareSize, squareSize);
            g.setColor(Color.BLACK);
            g.drawRect(greenX, greenY, squareSize, squareSize);

            // �Ҵǧ�����͹��ҧ�����ҧ�ͧ����������
            int circleX = (yellowX + greenX + squareSize) / 2 - offset;
            int circleY = (yellowY + greenY + squareSize) / 2 - offset;
            g.setColor(Color.WHITE);
            g.fillOval(circleX, circleY, squareSize, squareSize);
            g.setColor(Color.BLACK);
            g.drawOval(circleX, circleY, squareSize, squareSize);
        }
    }

    public static void main(String[] args) {
        Final62_Set1_4 frame = new Final62_Set1_4();
        frame.setTitle("ControlSquare");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
