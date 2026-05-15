/*
 * ชื่อไฟล์: ComponentsDemo.java
 * หัวข้อ: ส่วนประกอบพื้นฐานของ GUI (Components)
 * คำอธิบาย: แสดงการใช้งาน JLabel, JTextField, JTextArea, JButton
 *           พร้อมการจัด Layout พื้นฐาน (FlowLayout)
 * ตัวอย่างการใช้งาน: หน้าต่าง Login, ฟอร์มกรอกข้อมูล
 */

import javax.swing.*;
import java.awt.*;

public class ComponentsDemo {
    public static void main(String[] args) {
        // 1. สร้างหน้าต่างหลัก
        JFrame frame = new JFrame("แบบฟอร์มข้อมูล");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ตั้งค่า Layout ให้เรียงต่อกัน (FlowLayout)
        // ถ้ายาวเกิน จะปัดลงบรรทัดใหม่
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // 2. สร้าง Components
        // JLabel — ข้อความแสดงผล
        JLabel lblName = new JLabel("ชื่อ-สกุล: ");

        // JTextField — ช่องกรอกข้อความ (1 บรรทัด)
        // กำหนดความกว้าง 20 ตัวอักษร
        JTextField txtName = new JTextField(20);

        // JTextArea — กล่องข้อความ (หลายบรรทัด)
        // กำหนด (จำนวนบรรทัด, ความกว้างตัวอักษร)
        JLabel lblAddress = new JLabel("ที่อยู่: ");
        JTextArea txtAddress = new JTextArea(3, 20);

        // JScrollPane — แถบเลื่อน (สำหรับ JTextArea)
        JScrollPane scrollPane = new JScrollPane(txtAddress);

        // JButton — ปุ่มกด
        JButton btnSave = new JButton("บันทึกข้อมูล");
        JButton btnClear = new JButton("ล้างค่า");

        // 3. นำ Components ไปแปะใน Frame
        frame.add(lblName);
        frame.add(txtName);

        frame.add(lblAddress);
        frame.add(scrollPane); // แปะ scrollPane แทน txtAddress ตรงๆ

        frame.add(btnSave);
        frame.add(btnClear);

        // 4. แสดงหน้าต่าง
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

/*
 * หมายเหตุ:
 * - Components ทุกตัวใน Swing จะขึ้นต้นด้วยตัว 'J' (เช่น JButton, JLabel)
 * - JTextArea มักใช้คู่กับ JScrollPane เพื่อให้มีแถบเลื่อน (Scrollbar)
 * - setLayout สำคัญมาก ควบคุมการจัดเรียง Components ในหน้าต่าง
 * - ถ้าไม่กำหนด Layout (null layout) ต้อง setBounds() ให้ Components เอง (X, Y, กว้าง, สูง)
 */
