/*
 * ชื่อไฟล์: KeyEvents.java
 * หัวข้อ: การจัดการเหตุการณ์แป้นพิมพ์ (KeyListener)
 * คำอธิบาย: ตรวจจับการกดปุ่มบนคีย์บอร์ด (keyPressed, keyReleased, keyTyped)
 * ตัวอย่างการใช้งาน: ควบคุมตัวละครในเกม, ดักจับการพิมพ์เฉพาะตัวเลข
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEvents extends JFrame implements KeyListener {

    JLabel lblDisplay;
    int x = 150, y = 100; // ตำแหน่งเริ่มต้นของตัวละครสมมติ (วงกลม)

    public KeyEvents() {
        setTitle("ควบคุมด้วยคีย์บอร์ด (ลูกศร / WASD)");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // ไม่ใช้ Layout เพราะเราจะวาดรูปเอง
        setLayout(null); 

        lblDisplay = new JLabel("O"); // ตัวละครสมมติ
        lblDisplay.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblDisplay.setForeground(Color.RED);
        lblDisplay.setBounds(x, y, 30, 30);
        add(lblDisplay);

        // ผูก Listener กับ JFrame ให้รับรู้การพิมพ์
        this.addKeyListener(this);
        
        // กำหนดให้หน้าต่างรับ Focus เสมอ เพื่อให้พิมพ์แล้วติด
        this.setFocusable(true); 

        setVisible(true);
    }

    // === เมธอดจาก KeyListener ===

    @Override
    public void keyPressed(KeyEvent e) {
        // เมื่อ "กดปุ่ม" ลงไป (ใช้สำหรับปุ่มพิเศษ เช่น ลูกศร, Shift, Ctrl)
        int keyCode = e.getKeyCode(); // รับรหัสของปุ่มที่ถูกกด

        // KeyEvent มีค่าคงที่ของปุ่มต่างๆ เช่น VK_UP, VK_W
        if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_W) {
            y -= 10; // เลื่อนขึ้น (ค่า y ลดลง)
        } else if (keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_S) {
            y += 10; // เลื่อนลง
        } else if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_A) {
            x -= 10; // ไปซ้าย
        } else if (keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_D) {
            x += 10; // ไปขวา
        }

        // อัพเดทตำแหน่งของ JLabel
        lblDisplay.setLocation(x, y);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // เมื่อ "ปล่อยปุ่ม"
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // เมื่อมีการ "พิมพ์" จนเกิดตัวอักษรจริงๆ (ไม่นับพวกปุ่มลูกศร, Shift)
        char ch = e.getKeyChar();
        // นำไปใช้ดักกรองการป้อนข้อมูลได้ เช่น ห้ามพิมพ์ตัวอักษรในช่องตัวเลข
    }

    public static void main(String[] args) {
        new KeyEvents();
    }
}

/*
 * หมายเหตุ:
 * - keyPressed/Released ใช้กับ "รหัสปุ่ม" (KeyCode) ตรวจสอบปุ่มทิศทางได้
 * - keyTyped ใช้กับ "ตัวอักษร" (KeyChar) เช่น 'a', '1', ' '
 * - Component ที่จะรับ Key Event ต้องอยู่ในสถานะ Focus เสมอ (setFocusable(true))
 */
