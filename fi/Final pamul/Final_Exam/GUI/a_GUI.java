package Final_Exam.GUI;

import java.awt.*;
import javax.swing.*;

public class a_GUI {
    /**
     * จุดเริ่มต้นของโปรแกรม — สร้างหน้าต่าง GUI สำหรับแสดงรูปทรงต่าง ๆ
     *
     * @param args อาร์กิวเมนต์จาก command line
     */
    public static void main(String[] args) {
        // ─── ส่วนที่ 1: การตั้งค่า JFrame หลัก ───────────────────────────────
        JFrame frame = new JFrame("Polygon Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 800);

        // ─── ส่วนที่ 2: การสร้างแผงรวมรูปทรง (Panel) ──────────────────────────
        // ใช้ GridLayout เพื่อแบ่งพื้นที่แสดงผลเป็น 3 แถว 1 คอลัมน์
        JPanel shapesPanel = new JPanel();
        shapesPanel.setLayout(new GridLayout(3, 1));
        
        // เพิ่มพาเนลรูปทรงต่าง ๆ ลงในพาเนลหลัก
        shapesPanel.add(new StarPanel1());    // เพิ่มรูปดาวแบบที่ 1
        shapesPanel.add(new StarPanel2());    // เพิ่มรูปดาวแบบที่ 2
        shapesPanel.add(new HexagonPanel1()); // เพิ่มรูปหกเหลี่ยม

        // ─── ส่วนที่ 3: การแสดงผลหน้าต่าง ────────────────────────────────────
        frame.add(shapesPanel);
        frame.setVisible(true);
    }
}