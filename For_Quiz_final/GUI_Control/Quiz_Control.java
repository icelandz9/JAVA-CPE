import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz_Control extends JFrame {
    private CirclePanel circlePanel; // Panel สำหรับวาดวงกลม

    public Quiz_Control() {
        setTitle("ControlCircle"); // ชื่อหน้าต่าง
        setSize(400, 350); // ขนาดหน้าต่าง กว้าง x สูง
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ปิดโปรแกรมเมื่อกด X
        setLocationRelativeTo(null); // แสดงหน้าต่างกลางจอ
        setLayout(new BorderLayout()); // ใช้ BorderLayout เป็น layout หลัก

        circlePanel = new CirclePanel(); // สร้าง panel วาดวงกลม

        // สร้างปุ่มควบคุมทิศทาง
        JButton btnLeft = new JButton("<<");
        JButton btnRight = new JButton(">>");
        JButton btnUp = new JButton("Up");
        JButton btnDown = new JButton("Down");

        // เมื่อกดปุ่ม ให้เรียก move() เพื่อเลื่อนวงกลม
        btnUp.addActionListener(e -> {
            circlePanel.move(0, -10);
        }); // เลื่อนขึ้น (y ลด)
        btnDown.addActionListener(e -> {
            circlePanel.move(0, 10);
        }); // เลื่อนลง (y เพิ่ม)
        btnLeft.addActionListener(e -> {
            circlePanel.move(-10, 0);
        }); // เลื่อนซ้าย (x ลด)
        btnRight.addActionListener(e -> {
            circlePanel.move(10, 0);
        }); // เลื่อนขวา (x เพิ่ม)

        // Panel สำหรับวางปุ่ม จัดให้อยู่กึ่งกลาง
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(btnLeft);
        buttonPanel.add(btnRight);
        buttonPanel.add(btnUp);
        buttonPanel.add(btnDown);

        add(circlePanel, BorderLayout.CENTER); // วาง circlePanel ตรงกลาง
        add(buttonPanel, BorderLayout.SOUTH); // วาง buttonPanel ด้านล่าง

        // KeyListener รับการกดแป้นพิมพ์จากคีย์บอร์ด
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        circlePanel.move(0, -10);
                        break; // ลูกศรขึ้น
                    case KeyEvent.VK_DOWN:
                        circlePanel.move(0, 10);
                        break; // ลูกศรลง
                    case KeyEvent.VK_LEFT:
                        circlePanel.move(-10, 0);
                        break; // ลูกศรซ้าย
                    case KeyEvent.VK_RIGHT:
                        circlePanel.move(10, 0);
                        break; // ลูกศรขวา
                }
            }
        });

        setFocusable(true); // ให้ JFrame รับ focus เพื่อใช้ KeyListener ได้
        setVisible(true); // แสดงหน้าต่าง
    }

    public static void main(String[] args) {
        new Quiz_Control(); // สร้างและแสดงหน้าต่าง
    }
}

class CirclePanel extends JPanel {
    private int cx = 150, cy = 120; // ตำแหน่งเริ่มต้นของกลุ่มวงกลม (x, y)
    private final int R = 80; // ขนาดเส้นผ่านศูนย์กลางวงกลม

    // เลื่อนวงกลมตามค่า dx, dy ที่รับมา แล้ววาดใหม่
    public void move(int dx, int dy) {
        cx += dx; // เลื่อนแนวนอน
        cy += dy; // เลื่อนแนวตั้ง
        repaint(); // สั่งวาดใหม่
    }

    // วงกลม
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        g.drawOval(cx - R / 2, cy - R / 2, R, R); // วงกลมบน
        g.drawOval(cx - R, cy, R, R); // วงกลมล่างซ้าย
        g.drawOval(cx, cy, R, R); // วงกลมล่างขวา
    }

    // สี่เหลี่ยม
    // protected void paintComponent(Graphics g) {
    // super.paintComponent(g);
    // g.setColor(Color.BLACK);

    // // เปลี่ยนจาก drawOval เป็น drawRect
    // g.drawRect(cx - R / 2, cy - R / 2, R, R); // สี่เหลี่ยมบน
    // g.drawRect(cx - R, cy, R, R); // สี่เหลี่ยมล่างซ้าย
    // g.drawRect(cx, cy, R, R); // สี่เหลี่ยมล่างขวา
    // }

    // สามเหลี่ยม

    // protected void paintComponent(Graphics g) {
    // super.paintComponent(g);
    // g.setColor(Color.BLACK);

    // // สามเหลี่ยมบน
    // int[] xTop = { cx, cx - R / 2, cx + R / 2 };
    // int[] yTop = { cy - R / 2, cy + R / 2, cy + R / 2 };
    // g.drawPolygon(xTop, yTop, 3);

    // // สามเหลี่ยมล่างซ้าย
    // int[] xLeft = { cx - R / 2, cx - R, cx };
    // int[] yLeft = { cy, cy + R, cy + R };
    // g.drawPolygon(xLeft, yLeft, 3);

    // // สามเหลี่ยมล่างขวา
    // int[] xRight = { cx + R / 2, cx, cx + R };
    // int[] yRight = { cy, cy + R, cy + R };
    // g.drawPolygon(xRight, yRight, 3);
    // }

}
