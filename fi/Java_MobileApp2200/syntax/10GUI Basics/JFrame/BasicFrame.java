/*
 * ชื่อไฟล์: BasicFrame.java
 * หัวข้อ: การสร้างหน้าต่างด้วย JFrame
 * คำอธิบาย: JFrame เป็น container หลักของ Swing GUI
 *           กำหนด Title, ขนาด, ตำแหน่ง, การปิดหน้าต่าง
 * ตัวอย่างการใช้งาน: สร้างหน้าต่างโปรแกรม GUI
 * หมายเหตุ: ไฟล์นี้ไม่มี console output (แสดงเป็นหน้าต่าง GUI)
 */

import javax.swing.*;

public class BasicFrame {
    public static void main(String[] args) {
        // วิธีที่ 1: สร้าง JFrame โดยตรง
        JFrame frame = new JFrame("หน้าต่างแรกของฉัน"); // Title

        frame.setSize(400, 300);           // ขนาด (กว้าง x สูง) pixels
        frame.setLocationRelativeTo(null); // จัดหน้าต่างไว้กลางจอ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ปิดหน้าต่าง = จบโปรแกรม
        /*
         * ตัวเลือก DefaultCloseOperation:
         * EXIT_ON_CLOSE        = จบโปรแกรมทั้งหมด
         * DISPOSE_ON_CLOSE     = ปิดเฉพาะหน้าต่างนี้
         * HIDE_ON_CLOSE        = ซ่อน (ค่า default)
         * DO_NOTHING_ON_CLOSE  = ไม่ทำอะไร (ต้อง handle เอง)
         */
        frame.setResizable(true);          // อนุญาตปรับขนาดได้
        frame.setVisible(true);            // แสดงหน้าต่าง (ต้องเรียกเป็นอันสุดท้าย!)
    }
}

/*
 * วิธีที่ 2 (แนะนำ): extends JFrame
 *
 * class MyFrame extends JFrame {
 *     public MyFrame() {
 *         setTitle("My App");
 *         setSize(400, 300);
 *         setLocationRelativeTo(null);
 *         setDefaultCloseOperation(EXIT_ON_CLOSE);
 *         setVisible(true);
 *     }
 * }
 *
 * หมายเหตุ:
 * - setVisible(true) ต้องเรียกหลังจากตั้งค่าทุกอย่างเสร็จ
 * - setLocationRelativeTo(null) = กลางจอ
 * - ต้อง import javax.swing.*;
 */
