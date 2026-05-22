import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1C extends JFrame {

    public Ex1C() {
        setTitle("Exercise 7");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // สร้าง JPanel สำหรับเก็บข้อความแต่ละบรรทัด
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // ใช้ BoxLayout เพื่อจัดข้อความในแนวตั้ง

        // ข้อความที่ต้องการแสดง
        String[] data = {
                "Hello, My name is CPE 120",
                "Department of Computer Engineering",
                "Srinakharinwirot University",
                "Ongkarak Nakhornnayok"
        };

        // สร้าง JPanel และ JLabel สำหรับแต่ละบรรทัด
        for (String text : data) {
            JPanel labelPanel = new JPanel(); // สร้าง JPanel สำหรับกรอบสีน้ำเงิน
            labelPanel.setPreferredSize(new Dimension(350, 50)); // กำหนดขนาดตายตัวให้กรอบ
            labelPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2)); // กรอบสีน้ำเงิน
            labelPanel.setLayout(new BorderLayout()); // จัดการให้ข้อความอยู่กลางกรอบ

            // จัดกึ่งกลางของ text
            // JLabel label = new JLabel(text, JLabel.CENTER); // สร้าง JLabel และแสดงข้อความ
            // labelPanel.add(label, BorderLayout.CENTER); // เพิ่ม JLabel ลงใน JPanel

            JLabel label = new JLabel(text, JLabel.LEFT); // ข้อความชิดซ้าย
            labelPanel.add(label, BorderLayout.WEST); //เพิ่ม JLabel ที่ชิดซ้ายลงใน JPanel

            panel.add(labelPanel);
        }

        JScrollPane scrollPane = new JScrollPane(panel); //ทำให้ เลื่อน scroll ได้ เมื่อข้อความยาวเกินจะเลื่อนได้
        add(scrollPane); // เพิ่ม scrollPane เข้า JFrame เพื่อแสดงผล

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex1C();
    }
}