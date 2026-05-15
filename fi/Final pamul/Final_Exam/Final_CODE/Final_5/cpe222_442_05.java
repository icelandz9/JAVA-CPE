package Final_Exam.Final_CODE.Final_5;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class cpe222_442_05 extends JFrame {
    // ─── ส่วนที่ 1: การประกาศตัวแปรปุ่มควบคุม ─────────────────────────────
    JButton jbtUp = new JButton("Up");
    JButton jbtDown = new JButton("Down");
    JButton jbtLeft = new JButton("<<");
    JButton jbtRight = new JButton(">>");

    Circle cc = new Circle(); // พาเนลสำหรับวาดรูปวงกลม

    public cpe222_442_05() {
        // ─── ส่วนที่ 2: การจัดวาง Layout และคอมโพเนนต์ ───────────────────────
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(cc, BorderLayout.CENTER); // วางพาเนลวาดรูปไว้ตรงกลาง

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
                cc.requestFocusInWindow();
                cc.up();
                repaint();
            }
        });
        jbtDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cc.requestFocusInWindow();
                cc.down();
                repaint();
            }
        });
        jbtLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cc.requestFocusInWindow();
                cc.left();
                repaint();
            }
        });
        jbtRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cc.requestFocusInWindow();
                cc.right();
                repaint();
            }
        });

        // ─── ส่วนที่ 4: การรองรับการกดปุ่มจากคีย์บอร์ด ──────────────────────────
        cc.setFocusable(true);
        cc.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        cc.up();
                        repaint();
                        break;
                    case KeyEvent.VK_DOWN:
                        cc.down();
                        repaint();
                        break;
                    case KeyEvent.VK_LEFT:
                        cc.left();
                        repaint();
                        break;
                    case KeyEvent.VK_RIGHT:
                        cc.right();
                        repaint();
                        break;
                }
            }
        });
    }

    /**
     * คลาสภายในสำหรับวาดรูปวงกลมที่เคลื่อนที่ได้
     */
    class Circle extends JPanel {
        // ─── ส่วนที่ 5: พิกัดและการเคลื่อนที่ ──────────────────────────────────
        private int x;
        private int y;

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
         * เมธอดสำหรับวาดรูปทรงลงบนพาเนล
         */
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // วาดวงกลม 3 วงซ้อนกันเพื่อให้เกิดรูปทรง
            g.setColor(Color.WHITE);
            g.fillOval(((getWidth() / 2) - (getWidth() / 8)) + x, (getHeight() / 8) + y, getWidth() / 2,
                    getHeight() / 2);
            g.fillOval((getWidth() / 8) + x, (getHeight() / 8) + y, getWidth() / 2, getHeight() / 2);
            g.fillOval(((getWidth() / 2) - (getWidth() / 4)) + x, ((getHeight() / 4) + (getHeight() / 8)) + y,
                    getWidth() / 2,
                    getHeight() / 2);

            g.setColor(Color.BLACK);
            g.drawOval(((getWidth() / 2) - (getWidth() / 8)) + x, (getHeight() / 8) + y, getWidth() / 2,
                    getHeight() / 2);
            g.drawOval((getWidth() / 8) + x, (getHeight() / 8) + y, getWidth() / 2, getHeight() / 2);
            g.drawOval(((getWidth() / 2) - (getWidth() / 4)) + x, ((getHeight() / 4) + (getHeight() / 8)) + y,
                    getWidth() / 2,
                    getHeight() / 2);
        }
    }

    /**
     * จุดเริ่มต้นของโปรแกรม
     */
    public static void main(String[] args) {
        JFrame frame = new cpe222_442_05();
        frame.setTitle("ControlCircle");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}