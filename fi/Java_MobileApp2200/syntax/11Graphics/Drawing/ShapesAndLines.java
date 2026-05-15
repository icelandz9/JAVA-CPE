/*
 * ชื่อไฟล์: ShapesAndLines.java
 * หัวข้อ: การวาดรูปทรงและเส้น (Graphics)
 * คำอธิบาย: แสดงวิธีการใช้คลาส Graphics (g) ในการวาดเส้น สี่เหลี่ยม วงรี
 *           และใช้วิธี Override เมธอด paint() ของ JFrame
 * ตัวอย่างการใช้งาน: วาดกราฟเรขาคณิต, สร้างเกม 2D เบื้องต้น
 */

import javax.swing.*;
import java.awt.*;

public class ShapesAndLines extends JFrame {

    public ShapesAndLines() {
        setTitle("วาดรูปทรงพื้นฐาน");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Override เมธอด paint (เมธอดนี้จะถูกเรียกอัตโนมัติเมื่อต้องการแสดงผล)
    @Override
    public void paint(Graphics g) {
        // ต้องเรียก super.paint(g) เพื่อวาดขอบหน้าต่างเดิมด้วย
        super.paint(g);

        // จุดอ้างอิง (0,0) อยู่ที่มุมซ้ายบนของหน้าต่าง

        // 1. วาดเส้น (x1, y1, x2, y2)
        g.drawLine(50, 50, 350, 50);

        // 2. วาดสี่เหลี่ยม (x, y, กว้าง, สูง)
        g.drawRect(50, 70, 100, 80);        // แค่เส้นขอบ
        g.fillRect(200, 70, 100, 80);       // ระบายสีทึบ (สีค่าเริ่มต้นคือดำ)

        // 3. วาดวงรี/วงกลม (x, y, กว้าง, สูง ของกรอบสี่เหลี่ยมที่ล้อมรอบ)
        g.drawOval(50, 180, 100, 100);      // วงกลม (กว้าง=สูง)
        g.fillOval(200, 180, 150, 80);      // วงรี

        // 4. วาดสี่เหลี่ยมมุมโค้ง
        // drawRoundRect(x, y, กว้าง, สูง, ความโค้งแกนx, ความโค้งแกนy)
        g.drawRoundRect(50, 300, 100, 30, 15, 15);
    }

    public static void main(String[] args) {
        new ShapesAndLines(); // สร้าง Object ของ Frame ขึ้นมา
    }
}

/*
 * หมายเหตุ:
 * - แกนพิกัด (Coordinate System) ของ Java: แกน X เพิ่มจากซ้ายไปขวา, แกน Y เพิ่มจากบนลงล่าง
 * - เมธอด drawXXX() จะวาดเฉพาะเส้นขอบ | เมธอด fillXXX() จะวาดระบายสีทึบ
 * - การวาดรูปทับเมธอด paint() ของ JFrame อาจทำให้เกิดปัญหาภาพกระพริบได้
 *   (วิธีที่ดีกว่าคือวาดบน JPanel แทน)
 */
