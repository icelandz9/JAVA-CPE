/*
 * ชื่อไฟล์: MultipleButtons.java
 * หัวข้อ: การจัดการหลายปุ่มในคลาสเดียว
 * คำอธิบาย: แสดงวิธีให้คลาสหลัก implements ActionListener และใช้ตัวแปร 
 *           ActionEvent.getSource() ตรวจสอบว่าปุ่มไหนถูกกด
 * ตัวอย่างการใช้งาน: หน้าจอเครื่องคิดเลข, หน้าจอตั้งค่า
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ให้คลาสหลัก implements ActionListener เพื่อจัดการหลายปุ่ม
public class MultipleButtons extends JFrame implements ActionListener {
    
    // ประกาศ Component ไว้ระดับคลาส (Global) เพื่อให้เมธอดอื่นมองเห็น
    JButton btnRed, btnGreen, btnBlue;
    JPanel colorPanel;

    public MultipleButtons() {
        setTitle("เปลี่ยนสีพื้นหลัง");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // แผงหลักสำหรับแสดงสี
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        // แผงสำหรับใส่ปุ่ม
        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        btnRed = new JButton("แดง");
        btnGreen = new JButton("เขียว");
        btnBlue = new JButton("น้ำเงิน");

        // ให้ทุกปุ่มส่ง Event มาที่คลาสนี้ (this)
        btnRed.addActionListener(this);
        btnGreen.addActionListener(this);
        btnBlue.addActionListener(this);

        buttonPanel.add(btnRed);
        buttonPanel.add(btnGreen);
        buttonPanel.add(btnBlue);

        add(colorPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // เมธอดที่ต้อง Override เมื่อ implements ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        // e.getSource() คืนค่า Object ที่เป็นตัวสร้าง Event (เช่น ปุ่มไหนโดนกด)
        Object source = e.getSource();

        if (source == btnRed) {
            colorPanel.setBackground(Color.RED);
        } else if (source == btnGreen) {
            colorPanel.setBackground(Color.GREEN);
        } else if (source == btnBlue) {
            colorPanel.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new MultipleButtons();
    }
}

/*
 * หมายเหตุ:
 * - วิธี implements ActionListener ที่คลาสหลัก เหมาะสำหรับหน้าต่างที่มีหลายปุ่ม
 * - e.getSource() คือการตรวจสอบโดยใช้ Reference ของ Object
 * - อีกวิธีคือ e.getActionCommand() ซึ่งจะคืนค่าข้อความบนปุ่ม (เช่น "แดง", "เขียว")
 */
