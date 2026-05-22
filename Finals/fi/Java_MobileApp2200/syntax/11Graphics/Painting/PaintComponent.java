/*
 * ชื่อไฟล์: PaintComponent.java
 * หัวข้อ: การวาดภาพบน JPanel (แนวทางที่ถูกต้อง)
 * คำอธิบาย: วิธีที่ดีที่สุดในการทำ 2D Graphics ใน Swing คือการสร้างคลาสใหม่ที่
 *           สืบทอดจาก JPanel และทำการ Override เมธอด paintComponent(Graphics g)
 * ตัวอย่างการใช้งาน: เป็นพื้นที่สำหรับวาดภาพ หรือพื้นที่เล่นเกม (Game Canvas)
 */

import javax.swing.*;
import java.awt.*;

// สร้างคลาส Canvas ของตัวเอง โดยสืบทอดจาก JPanel
class MyCanvas extends JPanel {

    // ตัวแปรเก็บพิกัดวงกลม
    int x = 50;
    int y = 50;

    // Override เมธอด paintComponent (ไม่ต้องยุ่งกับ paint() ของ JFrame อีกแล้ว)
    @Override
    protected void paintComponent(Graphics g) {
        // ต้องเรียก super.paintComponent(g) เพื่อล้างหน้าจอและเตรียมพื้นหลัง
        super.paintComponent(g);

        // วาดวงกลมสีส้ม
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, 60, 60);

        // วาดกรอบสี่เหลี่ยมรอบๆ
        g.setColor(Color.BLUE);
        g.drawRect(x, y, 60, 60);
    }
}

public class PaintComponent extends JFrame {

    public PaintComponent() {
        setTitle("วาดภาพบน JPanel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // สร้าง MyCanvas และนำไปแปะบน JFrame
        MyCanvas canvas = new MyCanvas();
        // ตั้งสีพื้นหลังให้ Canvas
        canvas.setBackground(Color.DARK_GRAY);

        // แปะลงตรงกลาง
        add(canvas, BorderLayout.CENTER);

        // เพิ่มปุ่มเพื่อทดสอบการเปลี่ยนพิกัด
        JButton btnMove = new JButton("ย้ายวงกลม");
        btnMove.addActionListener(e -> {
            canvas.x += 20; // เพิ่มค่า X
            canvas.y += 10; // เพิ่มค่า Y
            canvas.repaint(); // **สำคัญมาก** สั่งให้ Canvas วาดภาพตัวเองใหม่ (เรียก paintComponent อัตโนมัติ)
        });
        add(btnMove, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintComponent();
    }
}

/*
 * หมายเหตุ:
 * - ทำไมต้องวาดบน JPanel? : เพราะ JPanel มีระบบ Double Buffering อัตโนมัติ ช่วยลดปัญหาภาพกระพริบ
 * - paintComponent(g) จะถูกเรียกอัตโนมัติเมื่อ:
 *   1. หน้าต่างปรากฏครั้งแรก
 *   2. หน้าต่างถูกย่อ/ขยาย
 *   3. มีการเรียกคำสั่ง repaint() อย่างชัดเจน
 * - เวลาต้องการให้ภาพเปลี่ยน ต้องอัพเดทตัวแปรสถานะ (เช่น x, y) แล้วเรียก repaint() ห้ามเรียก paintComponent โดยตรง!
 */
