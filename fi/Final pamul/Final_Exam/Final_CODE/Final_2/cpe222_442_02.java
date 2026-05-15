package Final_Exam.Final_CODE.Final_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cpe222_442_02 extends JFrame {
    // ─── ส่วนที่ 1: การประกาศตัวแปร GUI ─────────────────────────────────
    JTextField a1 = new JTextField(15); // ช่องรับจำนวนเงิน (บาท)
    JTextField a2 = new JTextField(15); // ช่องแสดงผลลัพธ์การแปลงค่าเงิน

    JButton wa = new JButton("USD"); // ปุ่มสำหรับแปลงเป็นดอลลาร์สหรัฐ
    JButton ft = new JButton("CNY"); // ปุ่มสำหรับแปลงเป็นหยวนจีน

    public cpe222_442_02() {
        // ─── ส่วนที่ 2: การจัดวาง Layout ของหน้าต่าง ────────────────────────
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2, 3, 3)); // แบ่งเป็น 1 แถว 2 คอลัมน์ ระยะห่าง 3px

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 1)); // แผงสำหรับป้ายชื่อและช่องรับค่า

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1)); // แผงสำหรับปุ่มกด

        // เพิ่มคอมโพเนนต์ลงในพาเนล p1
        p1.add(new JLabel("จำนวนเงิน (บาท)"));
        p1.add(a1);
        p1.add(new JLabel("จำนวนเงินหลังแปลง"));
        p1.add(a2);

        // เพิ่มคอมโพเนนต์ลงในพาเนล p2
        p2.add(wa);
        p2.add(ft);

        // รวมพาเนลทั้งหมดเข้าด้วยกัน
        p.add(p1);
        p.add(p2);
        add(p);

        // ─── ส่วนที่ 3: การทำงานของปุ่ม USD ───────────────────────────────
        wa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(a1.getText());
                // คำนวณอัตราแลกเปลี่ยน (32.40 บาทต่อ 1 USD)
                a2.setText(String.format("%.7f", (num1 / 32.40)));
            }
        });

        // ─── ส่วนที่ 4: การทำงานของปุ่ม CNY ───────────────────────────────
        ft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(a1.getText());
                // คำนวณอัตราแลกเปลี่ยน (4.71 บาทต่อ 1 CNY)
                a2.setText(String.format("%.6f", (num1 / 4.71)));
            }
        });
    }

    /**
     * จุดเริ่มต้นของโปรแกรม — ตั้งค่า JFrame และแสดงผล
     *
     * @param args อาร์กิวเมนต์จาก command line
     */
    public static void main(String[] args) {
        JFrame frame = new cpe222_442_02();
        frame.setTitle("Unit Converter");
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}