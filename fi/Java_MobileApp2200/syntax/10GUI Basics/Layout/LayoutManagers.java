/*
 * ชื่อไฟล์: LayoutManagers.java
 * หัวข้อ: การจัดเรียง Components (Layout Managers)
 * คำอธิบาย: แสดงตัวอย่าง Layout หลักๆ ใน Swing
 *           1. FlowLayout: เรียงซ้ายไปขวา ทะลุก็ปัดลง
 *           2. BorderLayout: แบ่ง 5 โซน (North, South, East, West, Center)
 *           3. GridLayout: เป็นตารางช่องๆ เท่ากัน
 * ตัวอย่างการใช้งาน: ออกแบบหน้าจอโปรแกรมให้ยืดหยุ่นตอนขยายขนาด
 */

import javax.swing.*;
import java.awt.*;

public class LayoutManagers {
    public static void main(String[] args) {
        // === 1. FlowLayout (ค่าเริ่มต้นของ JPanel) ===
        JFrame frame1 = new JFrame("FlowLayout");
        frame1.setSize(300, 150);
        frame1.setLayout(new FlowLayout()); // เรียงต่อกันตรงกลาง
        for (int i = 1; i <= 5; i++) {
            frame1.add(new JButton("ปุ่ม " + i));
        }
        frame1.setLocation(100, 100);
        frame1.setVisible(true);

        // === 2. BorderLayout (ค่าเริ่มต้นของ JFrame) ===
        JFrame frame2 = new JFrame("BorderLayout");
        frame2.setSize(300, 200);
        // ไม่ต้อง setLayout เพราะเป็นค่า default
        frame2.add(new JButton("ทิศเหนือ (North)"), BorderLayout.NORTH);
        frame2.add(new JButton("ทิศใต้ (South)"), BorderLayout.SOUTH);
        frame2.add(new JButton("ตะวันออก (East)"), BorderLayout.EAST);
        frame2.add(new JButton("ตะวันตก (West)"), BorderLayout.WEST);
        frame2.add(new JButton("ตรงกลาง (Center)"), BorderLayout.CENTER);
        // Center จะขยายเต็มพื้นที่ที่เหลือ
        frame2.setLocation(450, 100);
        frame2.setVisible(true);

        // === 3. GridLayout ===
        JFrame frame3 = new JFrame("GridLayout");
        frame3.setSize(300, 200);
        // GridLayout(rows, cols, hgap, vgap)
        // 3 แถว 2 คอลัมน์, ห่างกันแนวนอน 5px, แนวตั้ง 5px
        frame3.setLayout(new GridLayout(3, 2, 5, 5));
        for (int i = 1; i <= 6; i++) {
            frame3.add(new JButton("ช่องที่ " + i));
        }
        frame3.setLocation(800, 100);
        frame3.setVisible(true);
    }
}

/*
 * หมายเหตุ:
 * - Layout Manager ช่วยจัด Components อัตโนมัติเมื่อย่อ/ขยายหน้าต่าง
 * - หน้าต่างซับซ้อน มักใช้ JPanel ซ้อนกัน (เช่น Center เป็น GridLayout, แปะบน BorderLayout)
 * - FlowLayout: เหมาะกับแถบเครื่องมือเล็กๆ
 * - BorderLayout: เหมาะกับจัดโครงสร้างหลัก (Header, Sidebar, Main Content)
 * - GridLayout: เหมาะกับเครื่องคิดเลข, กระดานเกมหมากรุก
 */
