package Final_Exam.Final_CODE.Final_5;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * รวมฮิตรูปทรงที่ออกสอบบ่อย:
 * 1. Rectangle (สี่เหลี่ยม) - ใช้ fillRect
 * 2. Triangle (สามเหลี่ยม) - ใช้ Polygon
 * 3. Diamond (ข้าวหลามตัด) - ใช้ Polygon
 * 4. Rounded Rect (สี่เหลี่ยมมุมโค้ง) - ใช้ fillRoundRect
 * 5. House (รูปบ้าน - รวม Rect + Triangle)
 */
public class cpe222_442_05_all_shapes extends JFrame {

    // ปุ่มควบคุมการเคลื่อนที่
    JButton jbtUp = new JButton("Up");
    JButton jbtDown = new JButton("Down");
    JButton jbtLeft = new JButton("<<");
    JButton jbtRight = new JButton(">>");

    // ปุ่มเปลี่ยนรูปทรง
    String[] shapes = { "Rectangle", "Triangle", "Diamond", "RoundRect", "House" };
    JComboBox<String> shapeCombo = new JComboBox<>(shapes);

    ShapePanel canvas = new ShapePanel();

    public cpe222_442_05_all_shapes() {
        // --- การจัดเลย์เอาต์ ---
        JPanel pMove = new JPanel(new FlowLayout());
        pMove.add(jbtLeft);
        pMove.add(jbtRight);
        pMove.add(jbtUp);
        pMove.add(jbtDown);

        JPanel pControl = new JPanel(new BorderLayout());
        pControl.add(new JLabel(" Select Shape: "), BorderLayout.WEST);
        pControl.add(shapeCombo, BorderLayout.CENTER);
        pControl.add(pMove, BorderLayout.EAST);

        add(canvas, BorderLayout.CENTER);
        add(pControl, BorderLayout.SOUTH);

        // --- Event Listeners ---
        // เปลี่ยนรูปทรงเมื่อเลือกใน ComboBox
        shapeCombo.addActionListener(e -> {
            canvas.setShape(shapeCombo.getSelectedIndex());
            canvas.requestFocusInWindow();
        });

        // ปุ่มกดเคลื่อนที่
        jbtUp.addActionListener(e -> {
            canvas.move(0, -10);
            canvas.requestFocusInWindow();
        });
        jbtDown.addActionListener(e -> {
            canvas.move(0, 10);
            canvas.requestFocusInWindow();
        });
        jbtLeft.addActionListener(e -> {
            canvas.move(-10, 0);
            canvas.requestFocusInWindow();
        });
        jbtRight.addActionListener(e -> {
            canvas.move(10, 0);
            canvas.requestFocusInWindow();
        });

        // รองรับคีย์บอร์ด
        canvas.setFocusable(true);
        canvas.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP)
                    canvas.move(0, -10);
                if (e.getKeyCode() == KeyEvent.VK_DOWN)
                    canvas.move(0, 10);
                if (e.getKeyCode() == KeyEvent.VK_LEFT)
                    canvas.move(-10, 0);
                if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                    canvas.move(10, 0);
            }
        });
    }

    class ShapePanel extends JPanel {
        private int x = 0, y = 0;
        private int shapeType = 0; // 0:Rect, 1:Tri, 2:Diamond, 3:Round, 4:House

        public void move(int dx, int dy) {
            x += dx;
            y += dy;
            repaint();
        }

        public void setShape(int type) {
            this.shapeType = type;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int w = 100, h = 100; // ขนาดมาตรฐานของรูปทรง
            int cx = getWidth() / 2 - w / 2 + x;
            int cy = getHeight() / 2 - h / 2 + y;

            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            switch (shapeType) {
                case 0: // Rectangle
                    g.setColor(Color.BLUE);
                    g.fillRect(cx, cy, w, h);
                    g.setColor(Color.BLACK);
                    g.drawRect(cx, cy, w, h);
                    break;

                case 1: // Triangle (Polygon)
                    int[] tx = { cx + w / 2, cx, cx + w };
                    int[] ty = { cy, cy + h, cy + h };
                    g.setColor(Color.GREEN);
                    g.fillPolygon(tx, ty, 3);
                    g.setColor(Color.BLACK);
                    g.drawPolygon(tx, ty, 3);
                    break;

                case 2: // Diamond (Polygon 4 จุด)
                    int[] dx = { cx + w / 2, cx + w, cx + w / 2, cx };
                    int[] dy = { cy, cy + h / 2, cy + h, cy + h / 2 };
                    g.setColor(Color.CYAN);
                    g.fillPolygon(dx, dy, 4);
                    g.setColor(Color.BLACK);
                    g.drawPolygon(dx, dy, 4);
                    break;

                case 3: // RoundRect (มุมโค้ง)
                    g.setColor(Color.MAGENTA);
                    g.fillRoundRect(cx, cy, w, h, 30, 30); // 30 คือความโค้งของมุม
                    g.setColor(Color.BLACK);
                    g.drawRoundRect(cx, cy, w, h, 30, 30);
                    break;

                case 4: // House (ผสม Rect + Polygon)
                    // ตัวบ้าน
                    g.setColor(Color.ORANGE);
                    g.fillRect(cx, cy + h / 2, w, h / 2);
                    g.setColor(Color.BLACK);
                    g.drawRect(cx, cy + h / 2, w, h / 2);
                    // หลังคา
                    int[] rx = { cx, cx + w / 2, cx + w };
                    int[] ry = { cy + h / 2, cy, cy + h / 2 };
                    g.setColor(Color.RED);
                    g.fillPolygon(rx, ry, 3);
                    g.setColor(Color.BLACK);
                    g.drawPolygon(rx, ry, 3);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        JFrame f = new cpe222_442_05_all_shapes();
        f.setTitle("Exam Shape Cheat Sheet");
        f.setSize(600, 500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
