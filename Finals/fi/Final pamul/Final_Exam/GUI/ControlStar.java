package Final_Exam.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlStar extends JFrame {
    // ─── ส่วนที่ 1: การประกาศพาเนลสำหรับวาดรูปดาว ─────────────────────────
    private StarPanel1 starPanel = new StarPanel1();

    public ControlStar() {
        // เพิ่ม starPanel ลงในกึ่งกลางของหน้าต่าง
        this.add(starPanel, BorderLayout.CENTER);

        // ตั้งค่าให้ starPanel สามารถรับโฟกัสเพื่อใช้งานคีย์บอร์ดได้
        starPanel.setFocusable(true);

        // ─── ส่วนที่ 2: การรองรับการกดปุ่มจากคีย์บอร์ด (Key Listener) ──────────────
        starPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // ตรวจสอบปุ่มลูกศรเพื่อเลื่อนตำแหน่งดาว
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_DOWN:
                        starPanel.plusY += 100; // เลื่อนลง
                        break;
                    case KeyEvent.VK_UP:
                        starPanel.plusY -= 100; // เลื่อนขึ้น
                        break;
                    case KeyEvent.VK_LEFT:
                        starPanel.plusX -= 100; // เลื่อนไปทางซ้าย
                        break;
                    case KeyEvent.VK_RIGHT:
                        starPanel.plusX += 100; // เลื่อนไปทางขวา
                        break;
                    default:
                        // ไม่ทำอะไรถ้ากดปุ่มอื่น
                        System.out.print("");
                }
                // สั่งให้วาดรูปใหม่หลังจากเลื่อนตำแหน่ง
                starPanel.repaint();
            }
        });
    }

    /**
     * จุดเริ่มต้นของโปรแกรม — สร้างและแสดงหน้าต่างควบคุมรูปดาว
     *
     * @param args อาร์กิวเมนต์จาก command line
     */
    public static void main(String[] args) {
        ControlStar frame = new ControlStar();
        frame.setTitle("Control Star with Keyboard");
        frame.setLocationRelativeTo(null); // ให้หน้าต่างอยู่ตรงกลางหน้าจอ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}