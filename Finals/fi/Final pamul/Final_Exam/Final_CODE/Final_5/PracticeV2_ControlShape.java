
// ══════════════════════════════════════════════════════════════
//  PracticeV2_ControlShape.java  —  Final_5 ดัดแปลง
//
//  ต้นแบบ: Final_5 (cpe222_442_05.java) + Quiz11_442_01 (Graphic+Event)
//
//  แนวคิดหลักที่ต้องทำได้ในสอบ (Graphics + Button Event + Key Event):
//    1. Inner Class extends JPanel → override paintComponent
//    2. JButton ผูก ActionListener → เรียกเมธอดเปลี่ยนพิกัด + repaint
//    3. KeyListener / KeyAdapter → keyPressed ด้วย switch(e.getKeyCode())
//    4. setFocusable(true) บน JPanel ก่อนใช้ KeyListener
//    5. BorderLayout: panel วาดตรงกลาง, ปุ่มด้านล่าง
//
//  สิ่งที่เปลี่ยน (ดักทาง):
//    - จาก "Circle 3 วง" → "สี่เหลี่ยมสีแดง (Rect)" ที่เคลื่อนที่ได้
//    - เพิ่มปุ่ม "Reset" กลับสู่จุดกลาง
//    - แสดง coordinate (x, y) ปัจจุบันบนหน้าจอ
// ══════════════════════════════════════════════════════════════

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PracticeV2_ControlShape extends JFrame {

    // ─── ส่วนที่ 1: ปุ่มควบคุม — เหมือน Final_5 ─────────────────
    JButton jbtUp = new JButton("Up");
    JButton jbtDown = new JButton("Down");
    JButton jbtLeft = new JButton("<<");
    JButton jbtRight = new JButton(">>");
    JButton jbtReset = new JButton("Reset"); // ปุ่มพิเศษ — ดักทาง

    MovingRect rect = new MovingRect(); // panel วาดรูป

    public PracticeV2_ControlShape() {

        // ─── ส่วนที่ 2: Layout — เหมือน Final_5 ─────────────────
        JPanel p1 = new JPanel(new BorderLayout());
        p1.add(rect, BorderLayout.CENTER); // วางพาเนลวาดรูปตรงกลาง

        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(jbtLeft);
        p2.add(jbtRight);
        p2.add(jbtUp);
        p2.add(jbtDown);
        p2.add(jbtReset); // ปุ่ม Reset
        p1.add(p2, BorderLayout.SOUTH); // ปุ่มด้านล่าง

        add(p1);

        // ─── ส่วนที่ 3: ActionListener — pattern เดียวกับ Final_5 ─
        jbtUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rect.requestFocusInWindow();
                rect.moveUp(); // เรียกเมธอดเคลื่อนที่
                repaint();
            }
        });
        jbtDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rect.requestFocusInWindow();
                rect.moveDown();
                repaint();
            }
        });
        jbtLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rect.requestFocusInWindow();
                rect.moveLeft();
                repaint();
            }
        });
        jbtRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rect.requestFocusInWindow();
                rect.moveRight();
                repaint();
            }
        });
        // ─── ปุ่ม Reset: คืนค่า x, y กลับศูนย์ ──────────────────
        jbtReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rect.requestFocusInWindow();
                rect.reset(); // method พิเศษ
                repaint();
            }
        });

        // ─── ส่วนที่ 4: KeyListener — เหมือน Final_5 ────────────
        rect.setFocusable(true); // ต้องตั้งก่อนจึงรับ keyboard ได้
        rect.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        rect.moveUp();
                        repaint();
                        break;
                    case KeyEvent.VK_DOWN:
                        rect.moveDown();
                        repaint();
                        break;
                    case KeyEvent.VK_LEFT:
                        rect.moveLeft();
                        repaint();
                        break;
                    case KeyEvent.VK_RIGHT:
                        rect.moveRight();
                        repaint();
                        break;
                    case KeyEvent.VK_R:
                        rect.reset();
                        repaint();
                        break; // กด R = reset
                }
            }
        });
    }

    // ─── ส่วนที่ 5: Inner Class MovingRect ───────────────────────
    // เทียบ Final_5: class Circle extends JPanel
    class MovingRect extends JPanel {
        private int x = 0; // offset จากกึ่งกลาง (เหมือน Final_5)
        private int y = 0;

        private static final int STEP = 5; // ขนาดก้าวการเคลื่อนที่

        // เมธอดเคลื่อนที่ — เหมือน Final_5 แต่ STEP = 5 แทน 1
        public void moveUp() {
            y -= STEP;
            repaint();
        }

        public void moveDown() {
            y += STEP;
            repaint();
        }

        public void moveLeft() {
            x -= STEP;
            repaint();
        }

        public void moveRight() {
            x += STEP;
            repaint();
        }

        public void reset() {
            x = 0;
            y = 0;
            repaint();
        } // ปุ่ม Reset

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // ─── วาดสี่เหลี่ยมสีแดงที่ตำแหน่งกึ่งกลาง + offset ───
            // เทียบ Final_5: วาด Circle 3 วงซ้อนกัน
            int cx = getWidth() / 2 + x; // จุดกึ่งกลาง X + offset
            int cy = getHeight() / 2 + y; // จุดกึ่งกลาง Y + offset
            int w = 60; // ความกว้างสี่เหลี่ยม
            int h = 40; // ความสูงสี่เหลี่ยม

            g.setColor(Color.RED);
            g.fillRect(cx - w / 2, cy - h / 2, w, h); // วาดสี่เหลี่ยมเต็ม

            g.setColor(Color.BLACK);
            g.drawRect(cx - w / 2, cy - h / 2, w, h); // ขอบสี่เหลี่ยม

            // ─── แสดง coordinate ปัจจุบัน (เพิ่มจาก Final_5) ──────
            g.setColor(Color.DARK_GRAY);
            g.drawString("offset x=" + x + "  y=" + y, 10, 20);
            g.drawString("Use Arrow Keys or Buttons to move | R = Reset", 10, 40);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new PracticeV2_ControlShape();
        frame.setTitle("Control Rectangle"); // เทียบ "ControlCircle" ใน Final_5
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
