import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Exam11 {

    public Exam11() {

        JFrame frame = new JFrame("Calculator");

        // ─── ส่วนที่ 1: แผงปุ่มตัวเลข (4 แถว x 3 คอลัมน์) ───────────────────────────
        // กำหนดป้ายชื่อปุ่มตัวเลขและสัญลักษณ์พิเศษ (เรียงลำดับเหมือนโทรศัพท์)
        String num[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#" };

        // สร้าง JPanel ด้วย GridLayout 4 แถว 3 คอลัมน์ ระยะห่างแนวนอน/แนวตั้ง 5px
        //ระยะห่างของแต่ละตัวเลขทั้งบล็อค
        JPanel numberPanel = new JPanel(new GridLayout(4, 3, 5, 5));

        // วนลูปสร้างปุ่มจากทุก element ใน num แล้วเพิ่มลง numberPanel
        for (String s : num) {
            numberPanel.add(new JButton(s));
        }
        // ─── ส่วนที่ 5: ปุ่ม "=" ────────────────────────────────────────────────────────
        // สร้างปุ่ม "=" สำหรับสั่งให้คำนวณ (ยังไม่ผูก ActionListener ใน Exam นี้)
        JButton equalButton = new JButton("=");

        // ห่อปุ่ม "=" ด้วย JPanel เพื่อกำหนด padding รอบ ๆ ปุ่ม
        JPanel equalPanel = new JPanel(new BorderLayout());
        equalPanel.add(equalButton, BorderLayout.CENTER);
        equalPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // padding รอบด้าน 10px

        // ─── ส่วนที่ 6: ประกอบ Layout หลักของ JFrame ──────────────────────────────────
        // ใช้ BorderLayout เป็น Layout หลัก ระยะห่างแนวนอน/แนวตั้ง 10px
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(numberPanel, BorderLayout.NORTH);   // ปุ่มตัวเลขอยู่ด้านบน
        frame.add(equalPanel, BorderLayout.SOUTH);    // ปุ่ม "=" อยู่ด้านล่าง

        // ─── ส่วนที่ 7: ตั้งค่าและแสดงหน้าต่าง ────────────────────────────────────────
        frame.setSize(500, 450);                                    // ขนาดหน้าต่าง กว้าง x สูง
        frame.setLocationRelativeTo(null);                          // ให้หน้าต่างอยู่ตรงกลางจอ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // กด X แล้วปิดโปรแกรม
        frame.setVisible(true);                                     // แสดงหน้าต่าง
    }

    /**
     * จุดเริ่มต้นของโปรแกรม — สร้าง instance ของ Exam11 เพื่อแสดง GUI
     *
     * @param args อาร์กิวเมนต์จาก command line (ไม่ได้ใช้งาน)
     */
    public static void main(String[] args) {
        new Exam11();  // สร้าง instance เดียว — JFrame ถูกสร้างและแสดงใน Constructor
    }
}