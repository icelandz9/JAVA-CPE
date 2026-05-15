package Final_Exam.Final_CODE.Final_5;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * cpe222_442_05_star
 *
 * โปรแกรมนี้เป็น version ดัดแปลงจาก cpe222_442_05
 * เปลี่ยนรูปทรงจาก "วงกลม 3 วงซ้อน" เป็น "ดาว 5 แฉก"
 * โดยยังคงโครงสร้าง Layout, ปุ่มควบคุม, และ KeyListener เดิมไว้ทั้งหมด
 */
public class cpe222_442_05_star extends JFrame {

    // ─── ส่วนที่ 1: การประกาศตัวแปรปุ่มควบคุม ─────────────────────────────
    JButton jbtUp = new JButton("Up");
    JButton jbtDown = new JButton("Down");
    JButton jbtLeft = new JButton("<<");
    JButton jbtRight = new JButton(">>");

    Star ss = new Star(); // พาเนลสำหรับวาดรูปดาว

    public cpe222_442_05_star() {
        // ─── ส่วนที่ 2: การจัดวาง Layout และคอมโพเนนต์ ───────────────────────
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(ss, BorderLayout.CENTER); // วางพาเนลวาดรูปไว้ตรงกลาง

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jbtLeft);
        p2.add(jbtRight);
        p2.add(jbtUp);
        p2.add(jbtDown);
        p1.add(p2, BorderLayout.SOUTH); // วางปุ่มควบคุมไว้ด้านล่าง

        add(p1);

        // ─── ส่วนที่ 3: การผูก Event Listener กับปุ่มต่าง ๆ ─────────────────────
        jbtUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ss.requestFocusInWindow();
                ss.up();
                repaint();
            }
        });
        jbtDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ss.requestFocusInWindow();
                ss.down();
                repaint();
            }
        });
        jbtLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ss.requestFocusInWindow();
                ss.left();
                repaint();
            }
        });
        jbtRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ss.requestFocusInWindow();
                ss.right();
                repaint();
            }
        });

        // ─── ส่วนที่ 4: การรองรับการกดปุ่มจากคีย์บอร์ด ──────────────────────────
        ss.setFocusable(true);
        ss.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        ss.up();
                        repaint();
                        break;
                    case KeyEvent.VK_DOWN:
                        ss.down();
                        repaint();
                        break;
                    case KeyEvent.VK_LEFT:
                        ss.left();
                        repaint();
                        break;
                    case KeyEvent.VK_RIGHT:
                        ss.right();
                        repaint();
                        break;
                }
            }
        });
    }

    /**
     * คลาสภายในสำหรับวาดรูปดาว 5 แฉกที่เคลื่อนที่ได้
     *
     * วิธีคำนวณจุดดาว:
     * - วาดจาก 10 จุด (5 จุดปลายแฉก + 5 จุดมุมใน)
     * - ใช้ Math.sin / Math.cos หมุนทุก 36 องศา
     * - outerR = รัศมีปลายแฉก, innerR = รัศมีมุมใน (≈ 40% ของ outer)
     */
    class Star extends JPanel {
        // ─── ส่วนที่ 5: พิกัดและการเคลื่อนที่ ──────────────────────────────────
        private int x = 0;
        private int y = 0;

        public void up() {
            y--;
            repaint();
        }

        public void down() {
            y++;
            repaint();
        }

        public void left() {
            x--;
            repaint();
        }

        public void right() {
            x++;
            repaint();
        }

        /**
         * สร้างอาร์เรย์จุด x และ y ของดาว 5 แฉก
         *
         * @param cx    จุดกึ่งกลาง X
         * @param cy    จุดกึ่งกลาง Y
         * @param outer รัศมีปลายแฉก
         * @param inner รัศมีมุมใน
         * @return Polygon ของดาว
         */
        private Polygon buildStar(int cx, int cy, int outer, int inner) {
            int nPoints = 10;
            int[] xp = new int[nPoints];
            int[] yp = new int[nPoints];

            // วนลูป 10 จุด สลับระหว่างปลายแฉก (outer) และมุมใน (inner)
            for (int i = 0; i < nPoints; i++) {
                // เริ่มที่ -90 องศา (ปลายแฉกขึ้น) แล้วหมุนทีละ 36 องศา
                double angle = Math.toRadians(-90 + i * 36);
                int r = (i % 2 == 0) ? outer : inner;
                xp[i] = cx + (int) Math.round(r * Math.cos(angle));
                yp[i] = cy + (int) Math.round(r * Math.sin(angle));
            }
            return new Polygon(xp, yp, nPoints);
        }

        /**
         * เมธอดสำหรับวาดรูปดาวลงบนพาเนล
         */
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // ─── คำนวณจุดกึ่งกลางและขนาดตามขนาดพาเนล ──────────────────────
            int cx = getWidth() / 2 + x;
            int cy = getHeight() / 2 + y;
            int outer = Math.min(getWidth(), getHeight()) / 3; // รัศมีปลายแฉก
            int inner = outer * 2 / 5; // รัศมีมุมใน (~40%)

            Polygon star = buildStar(cx, cy, outer, inner);

            // ─── วาดพื้นสีเหลือง + เส้นขอบสีดำ ─────────────────────────────
            g.setColor(Color.YELLOW);
            g.fillPolygon(star);

            g.setColor(Color.BLACK);
            g.drawPolygon(star);

            // ─── วาดจุดกึ่งกลางเล็ก ๆ เพื่อบอกตำแหน่ง ──────────────────────
            g.setColor(Color.RED);
            g.fillOval(cx - 4, cy - 4, 8, 8);
        }
    }

    /**
     * จุดเริ่มต้นของโปรแกรม
     */
    public static void main(String[] args) {
        JFrame frame = new cpe222_442_05_star();
        frame.setTitle("ControlStar — Move with Arrow Keys or Buttons");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
