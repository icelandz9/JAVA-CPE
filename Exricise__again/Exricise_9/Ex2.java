import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex2 extends JFrame {
    public Ex2() {
        setTitle("Exercise08_v2_01");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // กำหนด Layout ของ JFrame ให้เป็น BorderLayout
        setLayout(new BorderLayout()); // ใช้ BorderLayout สำหรับจัดการส่วนต่างๆ


        // สร้าง JPanel สำหรับปุ่มใน FlowLayout (South)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10)); // ใช้ FlowLayout และตั้งระยะห่างระหว่างปุ่มให้เท่ากัน

        // เพิ่มปุ่มลงใน buttonPanel
        buttonPanel.add(new JButton("Button 1"));
        buttonPanel.add(new JButton("Button 2"));
        buttonPanel.add(new JButton("Button 3"));

        // เพิ่ม buttonPanel ไปที่ตำแหน่ง South ของ JFrame
        add(buttonPanel, BorderLayout.SOUTH);

        // สร้าง JPanel สำหรับปุ่มในตำแหน่ง Center
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10)); // ใช้ FlowLayout ให้ปุ่มอยู่กลางและตั้งระยะห่างเท่ากัน

        // เพิ่มปุ่มลงใน centerPanel
        centerPanel.add(new JButton("Button 4"));
        centerPanel.add(new JButton("Button 5"));
        centerPanel.add(new JButton("Button 6"));

        // เพิ่ม centerPanel ไปที่ตำแหน่ง Center ของ JFrame
        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex2();
    }
}
