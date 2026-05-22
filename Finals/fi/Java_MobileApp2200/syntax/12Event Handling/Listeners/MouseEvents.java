/*
 * ชื่อไฟล์: MouseEvents.java
 * หัวข้อ: การจัดการเหตุการณ์ของเมาส์ (MouseListener & MouseMotionListener)
 * คำอธิบาย: ตรวจจับการคลิก, ปล่อย, เอาเมาส์เข้า/ออก และการลากเมาส์
 * ตัวอย่างการใช้งาน: โปรแกรมวาดภาพ, ทำปุ่มแบบ Custom (Hover effect)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener {
    
    JLabel lblStatus;

    public MouseEvents() {
        setTitle("ตรวจสอบสถานะเมาส์");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        lblStatus = new JLabel("สถานะเมาส์: ", SwingConstants.CENTER);
        lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblStatus, BorderLayout.SOUTH);

        // นำ Listener มาผูกกับ JFrame (เพื่อให้รับรู้การกระทำบนหน้าต่างนี้)
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

        setVisible(true);
    }

    // === เมธอดจาก MouseListener ===

    @Override
    public void mouseClicked(MouseEvent e) {
        // คลิก = กดแล้วปล่อยทันทีในจุดเดิม
        lblStatus.setText("คลิกที่พิกัด X:" + e.getX() + " Y:" + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // กดปุ่มเมาส์ค้างไว้
        lblStatus.setText("กดเมาส์ค้าง");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // ปล่อยปุ่มเมาส์
        lblStatus.setText("ปล่อยเมาส์");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // เอาเมาส์เข้ามาในพื้นที่หน้าต่าง (Hover)
        getContentPane().setBackground(Color.LIGHT_GRAY);
        lblStatus.setText("เมาส์เข้ามาในเขต");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // เอาเมาส์ออกนอกพื้นที่หน้าต่าง
        getContentPane().setBackground(UIManager.getColor("Panel.background"));
        lblStatus.setText("เมาส์ออกไปนอกเขต");
    }

    // === เมธอดจาก MouseMotionListener ===

    @Override
    public void mouseDragged(MouseEvent e) {
        // ลาก (กดเมาส์ค้างแล้วขยับ)
        lblStatus.setText("กำลังลาก X:" + e.getX() + " Y:" + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // ขยับเมาส์ธรรมดา (ไม่ได้กดค้าง)
        // เพื่อลดภาระระบบ มักจะไม่ค่อยทำอะไรที่กินสเปกตรงนี้
    }

    public static void main(String[] args) {
        new MouseEvents();
    }
}

/*
 * หมายเหตุ:
 * - MouseListener จัดการการ กด, ปล่อย, เข้า, ออก
 * - MouseMotionListener จัดการการ ขยับ, ลาก (แยกกันเพราะขยับเมาส์เกิด Event บ่อยมาก)
 * - e.getX(), e.getY() ใช้ดูพิกัดเมาส์เทียบกับกรอบของ Component นั้นๆ
 */
