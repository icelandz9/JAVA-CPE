/*
 * ชื่อไฟล์: ButtonClickEvent.java
 * หัวข้อ: การจัดการเหตุการณ์ปุ่มกด (ActionListener)
 * คำอธิบาย: แสดงวิธีตอบสนองเมื่อผู้ใช้คลิกปุ่ม โดยการใช้ ActionListener
 *           แบบสืบทอดคลาส และระบุใน addActionListener
 * ตัวอย่างการใช้งาน: หน้าจอ Login เมื่อกดปุ่ม "เข้าสู่ระบบ"
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickEvent extends JFrame {
    
    int count = 0; // ตัวแปรนับจำนวนคลิก

    public ButtonClickEvent() {
        setTitle("การจัดการปุ่มกด");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // 1. สร้าง Components
        JLabel lblDisplay = new JLabel("ยังไม่ได้กดปุ่ม");
        JButton btnClick = new JButton("คลิกฉัน!");

        // 2. ผูกปุ่มเข้ากับ Listener
        // วิธีแบบ Anonymous Inner Class (ใช้บ่อยที่สุดสำหรับปุ่มเดี่ยว)
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // โค้ดส่วนนี้จะทำงานเมื่อปุ่มถูกคลิก
                count++;
                lblDisplay.setText("กดปุ่มแล้ว " + count + " ครั้ง!");
            }
        });

        // 3. แปะ Components
        add(btnClick);
        add(lblDisplay);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonClickEvent();
    }
}

/*
 * หมายเหตุ:
 * - Event Handling คือการรอรับการกระทำของผู้ใช้ (เช่น คลิกเมาส์, พิมพ์คีย์บอร์ด)
 * - ActionListener ใช้สำหรับเหตุการณ์ทั่วไป เช่น กดปุ่ม (JButton) หรือกด Enter ในช่องข้อความ (JTextField)
 * - เมธอดที่สำคัญใน ActionListener คือ actionPerformed(ActionEvent e)
 */
