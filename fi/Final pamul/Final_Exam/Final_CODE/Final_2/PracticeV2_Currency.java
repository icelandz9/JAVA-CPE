// ══════════════════════════════════════════════════════════════
//  PracticeV2_Currency.java  —  Final_2 ดัดแปลง
//
//  ต้นแบบ: Final_2 (cpe222_442_02.java) + EP10_4 + Quiz9_1/9_2/9_3
//
//  แนวคิดหลักที่ต้องทำได้ในสอบ (Basic GUI + Event Handling):
//    1. extends JFrame
//    2. ประกาศ JTextField, JLabel, JButton เป็น field ของคลาส
//    3. จัดวาง layout ด้วย GridLayout / FlowLayout / BorderLayout
//    4. ผูก ActionListener ด้วย Anonymous Inner Class
//    5. Double.parseDouble() อ่านค่าจาก TextField
//    6. String.format() จัดรูปแบบตัวเลข
//
//  สิ่งที่เปลี่ยน (ดักทาง context ต่างออกไป):
//    - จาก "แปลงสกุลเงิน (USD/CNY)" → "คำนวณ BMI (Weight/Height)"
//    - Pattern layout: GridLayout 3x2 (input) + GridLayout 2x1 (button) เหมือนเดิม
// ══════════════════════════════════════════════════════════════

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PracticeV2_Currency extends JFrame {

    // ─── ส่วนที่ 1: ประกาศ Component เป็น field ─────────────────
    //  เทียบ: a1, a2 ใน Final_2
    JTextField tfWeight = new JTextField(15);  // ช่องรับน้ำหนัก (kg)
    JTextField tfHeight = new JTextField(15);  // ช่องรับส่วนสูง (m)
    JTextField tfResult = new JTextField(15);  // ช่องแสดงผล BMI

    //  เทียบ: wa, ft ใน Final_2
    JButton btnBMI     = new JButton("BMI");      // คำนวณ BMI
    JButton btnCategory = new JButton("Category"); // บอกระดับน้ำหนัก

    public PracticeV2_Currency() {

        // ─── ส่วนที่ 2: สร้าง Panel และ Layout ───────────────────
        //  เทียบ Final_2: JPanel p = new JPanel(); p.setLayout(new GridLayout(1,2))
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2, 3, 3)); // 1 แถว 2 คอลัมน์ — เหมือน Final_2

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2)); // 3 แถว 2 คอลัมน์ (label + field)
        //  เทียบ Final_2: p1.setLayout(new GridLayout(2,1))
        //  แต่ข้อนี้เพิ่ม row เป็น 3 เพราะมี input 3 ช่อง (weight, height, result)

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1)); // 2 ปุ่ม — เหมือน Final_2

        // ─── เพิ่ม component ลง p1 ───────────────────────────────
        p1.add(new JLabel("Weight (kg):"));
        p1.add(tfWeight);
        p1.add(new JLabel("Height (m):"));
        p1.add(tfHeight);
        p1.add(new JLabel("Result:"));
        p1.add(tfResult);

        // ─── เพิ่ม component ลง p2 ───────────────────────────────
        p2.add(btnBMI);
        p2.add(btnCategory);

        // ─── รวม panel ───────────────────────────────────────────
        p.add(p1);
        p.add(p2);
        add(p);

        // ─── ส่วนที่ 3: ผูก ActionListener — pattern เดียวกับ Final_2 ─
        //  Final_2: wa.addActionListener(new ActionListener() { ... })
        btnBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // อ่านค่าจาก TextField ด้วย Double.parseDouble
                double weight = Double.parseDouble(tfWeight.getText());
                double height = Double.parseDouble(tfHeight.getText());
                // สูตร BMI = น้ำหนัก / (ส่วนสูง^2)
                double bmi = weight / (height * height);
                // String.format เหมือน Final_2 แต่เปลี่ยน format string
                tfResult.setText(String.format("%.2f", bmi));
            }
        });

        btnCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ต้องอ่านจาก weight/height ใหม่ (pattern เดียวกับ Final_2 ft button)
                double weight = Double.parseDouble(tfWeight.getText());
                double height = Double.parseDouble(tfHeight.getText());
                double bmi = weight / (height * height);
                // แสดงผลเป็นหมวดหมู่ (ดักทาง if-else ที่อาจออกสอบ)
                String category;
                if (bmi < 18.5)      category = "Underweight";
                else if (bmi < 25.0) category = "Normal";
                else if (bmi < 30.0) category = "Overweight";
                else                 category = "Obese";
                tfResult.setText(category + " (" + String.format("%.2f", bmi) + ")");
            }
        });
    }

    /**
     * จุดเริ่มต้นของโปรแกรม
     *  Pattern เดียวกับ Final_2: สร้าง JFrame, ตั้ง title/size/location/close/visible
     */
    public static void main(String[] args) {
        JFrame frame = new PracticeV2_Currency();
        frame.setTitle("BMI Calculator");      // เทียบ "Unit Converter" ใน Final_2
        frame.setSize(400, 160);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
