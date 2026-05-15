// ══════════════════════════════════════════════════════════════
//  PracticeV2_MouseDraw.java  —  Final_4 ดัดแปลง
//
//  ต้นแบบ: Final_4 (MouseDrawApp.java) + Q10_442_01 (Graphic)
//
//  แนวคิดหลักที่ต้องทำได้ในสอบ (Mouse Event + Graphics):
//    1. MouseListener / MouseAdapter — mousePressed(), mouseReleased()
//    2. ArrayList<Point> เก็บพิกัดที่คลิก
//    3. paintComponent(Graphics g) override
//    4. repaint() เรียกหลังเปลี่ยนข้อมูล
//    5. วาดรูปหลายแบบ: fillRect, drawString, drawLine
//
//  สิ่งที่เปลี่ยน (ดักทาง):
//    - จาก "วาดวงกลม (fillOval)" → "วาดสี่เหลี่ยมที่แต่ละจุดคลิก (fillRect)"
//    - เพิ่ม: คลิกขวา (mouseReleased) ล้างหน้าจอ
//    - แสดงขนาดที่วาดได้จาก input ด้วย JTextField
// ══════════════════════════════════════════════════════════════

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PracticeV2_MouseDraw extends JFrame {

    // ─── ส่วนที่ 1: ช่องรับขนาดของ shape + ปุ่มล้าง ─────────────
    //  (เพิ่มจาก Final_4 เพื่อดัก event handling กับ component)
    JTextField tfSize = new JTextField("20", 5);
    JButton    btnClear = new JButton("Clear");
    DrawPanel  drawPanel = new DrawPanel();

    public PracticeV2_MouseDraw() {

        // ─── Top bar: ช่องรับขนาด + ปุ่มล้าง ────────────────────
        JPanel topBar = new JPanel(new FlowLayout());
        topBar.add(new JLabel("Size:"));
        topBar.add(tfSize);
        topBar.add(btnClear);

        add(topBar, BorderLayout.NORTH);     // ด้านบน
        add(drawPanel, BorderLayout.CENTER); // ตรงกลาง

        // ─── ส่วนที่ 2: ปุ่ม Clear ล้าง ArrayList ───────────────
        //  (เทียบ Final_4 ไม่มีปุ่มนี้ — ดักทาง Event กับ JButton)
        btnClear.addActionListener(e -> {
            drawPanel.clearAll(); // ลบข้อมูลทั้งหมดใน list
        });
    }

    // ─── ส่วนที่ 3: Inner Class DrawPanel ───────────────────────
    //  เทียบ Final_4: class DrawPanel extends JPanel
    class DrawPanel extends JPanel {

        // ArrayList เก็บพิกัด — เหมือน Final_4
        private ArrayList<Point> points = new ArrayList<>();

        public DrawPanel() {
            setBackground(Color.WHITE);

            // ─── MouseAdapter: mousePressed ───────────────────────
            //  เทียบ Final_4: addMouseListener(new MouseAdapter() { mousePressed ... })
            addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    // คลิกซ้าย: เพิ่มจุดใหม่
                    if (e.getButton() == MouseEvent.BUTTON1) {
                        points.add(e.getPoint()); // เก็บพิกัด
                        repaint();                // วาดใหม่ — เหมือน Final_4
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    // คลิกขวา: ลบจุดล่าสุดออก (Undo 1 ขั้น)
                    if (e.getButton() == MouseEvent.BUTTON3 && !points.isEmpty()) {
                        points.remove(points.size() - 1);
                        repaint();
                    }
                }
            });
        }

        // ─── ล้างจุดทั้งหมด ───────────────────────────────────────
        public void clearAll() {
            points.clear(); // clear() ของ ArrayList
            repaint();
        }

        // ─── ส่วนที่ 4: วาดรูปด้วย paintComponent ───────────────
        //  เทียบ Final_4: protected void paintComponent(Graphics g)
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // ต้องเรียก super เสมอ

            // อ่านขนาดจาก TextField (ถ้ากรอกผิดให้ใช้ค่าเริ่มต้น 20)
            int size = 20;
            try {
                size = Integer.parseInt(tfSize.getText());
            } catch (NumberFormatException ex) {
                // ถ้ากรอกผิดใช้ค่า default 20
            }

            // ─── วนลูปวาดสี่เหลี่ยมทุกจุด (ต่างจาก Final_4 ที่วาด Oval) ─
            for (Point p : points) {
                // วาด Rectangle แทน Circle
                g.setColor(Color.BLUE);
                g.fillRect(p.x - size/2, p.y - size/2, size, size); // สี่เหลี่ยมเล็ก
                g.setColor(Color.BLACK);
                g.drawRect(p.x - size/2, p.y - size/2, size, size); // ขอบ
                // แสดงพิกัด — เหมือน Final_4
                g.drawString("(" + p.x + "," + p.y + ")", p.x + size/2 + 2, p.y);
            }

            // ─── ข้อความแสดงสถานะด้านบนซ้าย ─────────────────────
            g.setColor(Color.RED);
            g.drawString("Total points: " + points.size(), 10, 20);   // เหมือน Final_4
            g.drawString("Left-click=Draw  Right-click=Undo", 10, 40);
        }
    }

    public static void main(String[] args) {
        PracticeV2_MouseDraw f = new PracticeV2_MouseDraw();
        f.setTitle("Rect Draw - Click to Draw");  // เทียบ "Mouse Event Remix"
        f.setSize(500, 450);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
