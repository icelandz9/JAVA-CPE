import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1 extends JFrame {
    private CirclePanel circlePanel = new CirclePanel();

    public Ex1() {
        setSize(450, 300);
        setTitle("Exercise10_02");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(circlePanel);
        setVisible(true);
    }

    static class CirclePanel extends JPanel {
        private int x = 175;
        private int y = 100;
        private final int DIAMETER = 50;
        private final int STEP = 10;

        public CirclePanel() {
            setupKeyBindings();
        }

        private void setupKeyBindings() {
            // WHEN_IN_FOCUSED_WINDOW = ทำงานได้ทันทีโดยไม่ต้องคลิก focus ก่อน
            InputMap im = getInputMap(WHEN_IN_FOCUSED_WINDOW);
            ActionMap am = getActionMap();

            // --- ผูกปุ่มลูกศร ---
            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "up");
            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "down");
            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "left");
            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "right");

            // --- กำหนด Action ของแต่ละปุ่ม ---
            am.put("up", new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    y -= STEP;
                    repaint();
                }
            });
            am.put("down", new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    y += STEP;
                    repaint();
                }
            });
            am.put("left", new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    x -= STEP;
                    repaint();
                }
            });
            am.put("right", new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    x += STEP;
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            // ทำให้วงกลมคมชัดขึ้น
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.drawOval(x, y, DIAMETER, DIAMETER);
        }
    }

    public static void main(String[] args) {
        new Ex1();
    }
}