/*
 * ชื่อไฟล์: ColorsAndFonts.java
 * หัวข้อ: การจัดการสีและตัวอักษร (Color & Font)
 * คำอธิบาย: แสดงการเปลี่ยนสีวาดภาพด้วย setColor()
 *           การสร้างสีแบบ RGB และการใช้คลาส Font
 * ตัวอย่างการใช้งาน: ตกแต่งกราฟิกให้น่าสนใจ, วาดกราฟิกที่มีข้อความประกอบ
 */

import javax.swing.*;
import java.awt.*;

public class ColorsAndFonts extends JFrame {

    public ColorsAndFonts() {
        setTitle("วาดสีและข้อความ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // === 1. การใช้งานสี (Color) ===

        // เปลี่ยนสีพู่กันเป็นสีแดง (สีมาตรฐานจาก Color class)
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 50);

        // สร้างสีเองด้วย RGB (Red, Green, Blue) ค่าตั้งแต่ 0-255
        // (100, 200, 255) จะได้สีฟ้าอ่อน
        Color myColor = new Color(100, 200, 255);
        g.setColor(myColor);
        g.fillRect(200, 50, 100, 50);

        // สีแบบมี Alpha (โปร่งใส) (R, G, B, Alpha)
        // Alpha: 0 = ใสแจ๋ว, 255 = ทึบแสง
        Color transparentRed = new Color(255, 0, 0, 100);
        g.setColor(transparentRed);
        g.fillOval(100, 80, 100, 100); // จะเห็นว่ามันซ้อนทับสี่เหลี่ยมและโปร่งแสง

        // === 2. การใช้งานข้อความ (Font) ===

        // เปลี่ยนกลับเป็นสีดำ
        g.setColor(Color.BLACK);

        // สร้าง Font ใหม่ (ชื่อฟอนต์, สไตล์, ขนาด)
        // สไตล์: Font.PLAIN, Font.BOLD, Font.ITALIC (ใช้ + หรือ | เพื่อผสมได้)
        Font myFont = new Font("Tahoma", Font.BOLD | Font.ITALIC, 24);

        // ตั้งค่าให้พู่กันใช้ Font นี้
        g.setFont(myFont);

        // วาดข้อความลงไปที่ตำแหน่ง x, y
        g.drawString("สวัสดี Java Graphics", 50, 220);
    }

    public static void main(String[] args) {
        new ColorsAndFonts();
    }
}

/*
 * หมายเหตุ:
 * - g.setColor() จะมีผลกับคำสั่ง draw/fill ทั้งหมดที่ถูกเรียกหลังจากนั้น (จนกว่าจะ set สีใหม่)
 * - ตำแหน่ง x,y ใน drawString() คือจุด "มุมซ้ายล่าง" ของบรรทัดตัวอักษร (Baseline)
 *   (ต่างจากสี่เหลี่ยมที่เป็นมุมซ้ายบน)
 */
