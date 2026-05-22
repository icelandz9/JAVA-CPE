import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Exam11 - หน้าต่าง GUI เครื่องคิดเลขแบบ Layout เท่านั้น (ยังไม่มี Logic การคำนวณ)
 *
 * <p>
 * โครงสร้าง Layout ภายใน JFrame:
 * <ul>
 * <li>NORTH : numberPanel — ปุ่มตัวเลข 0-9, *, # แบบ GridLayout 4x3</li>
 * <li>CENTER : centerPanel — ช่องรับค่าตัวเลขและผลลัพธ์ (inputPanel) + ปุ่ม operator (operatorPanel)</li>
 * <li>SOUTH : equalPanel — ปุ่ม "=" สำหรับคำนวณ</li>
 * </ul>
 *
 * @author Graymatter
 */
public class Exam11 {

    /**
     * Constructor — สร้าง JFrame และจัดวาง Component ทั้งหมด
     */
    public Exam11() {

        // สร้าง JFrame พร้อมตั้งชื่อหน้าต่างโดยตรง (ไม่ extends JFrame)
        JFrame frame = new JFrame("Calculator");

        // ─── ส่วนที่ 1: แผงปุ่มตัวเลข (4 แถว x 3 คอลัมน์) ───────────────────────────
        // กำหนดป้ายชื่อปุ่มตัวเลขและสัญลักษณ์พิเศษ (เรียงลำดับเหมือนโทรศัพท์)
        String num[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#" };

        // สร้าง JPanel ด้วย GridLayout 4 แถว 3 คอลัมน์ ระยะห่างแนวนอน/แนวตั้ง 5px
        JPanel numberPanel = new JPanel(new GridLayout(4, 3, 5, 5));

        // วนลูปสร้างปุ่มจากทุก element ใน num แล้วเพิ่มลง numberPanel
        for (String s : num) {
            numberPanel.add(new JButton(s));
        }

        // ─── ส่วนที่ 2: แผงปุ่ม Operator (2 แถว x 3 คอลัมน์) ──────────────────────────
        // กำหนดป้ายชื่อปุ่มสำหรับการดำเนินการทางคณิตศาสตร์
        String ops[] = { "+", "-", "x", "/", ".", "%" };

        // สร้าง JPanel ด้วย GridLayout 2 แถว 3 คอลัมน์ ระยะห่าง 5px
        JPanel operatorPanel = new JPanel(new GridLayout(2, 3, 5, 5));

        // วนลูปสร้างปุ่ม operator แล้วเพิ่มลง operatorPanel
        for (String op : ops) {
            operatorPanel.add(new JButton(op));
        }

        // ─── ส่วนที่ 3: แผงรับค่าตัวเลขและผลลัพธ์ (3 แถว x 2 คอลัมน์) ─────────────────
        // สร้าง JPanel ด้วย GridLayout 3 แถว 2 คอลัมน์ ระยะห่าง 5px
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));

        // ช่องรับตัวเลขที่ 1
        JTextField n1 = new JTextField();

        // ช่องรับตัวเลขที่ 2
        JTextField n2 = new JTextField();

        // ช่องแสดงผลลัพธ์ (ตั้งให้แก้ไขไม่ได้ เพราะเป็นช่องแสดงผลเท่านั้น)
        JTextField result = new JTextField();
        result.setEditable(false); // ป้องกันไม่ให้ผู้ใช้พิมพ์ในช่อง result

        // เพิ่ม Label และ TextField ลงใน inputPanel ตามลำดับ
        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(n1);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(n2);
        inputPanel.add(new JLabel("Result:"));
        inputPanel.add(result);

        // ─── ส่วนที่ 4: แผงกลาง (รวม inputPanel + operatorPanel) ──────────────────────
        // ใช้ BorderLayout เพื่อวาง inputPanel ตรงกลาง และ operatorPanel ทางขวา
        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.add(inputPanel, BorderLayout.CENTER);
        centerPanel.add(operatorPanel, BorderLayout.EAST);

        // กำหนด padding รอบ ๆ centerPanel:
        // บน=10, ซ้าย=10, ล่าง=40 (เว้นพื้นที่สำหรับปุ่ม "="), ขวา=10
        centerPanel.setBorder(new EmptyBorder(10, 10, 40, 10));

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
        frame.add(centerPanel, BorderLayout.CENTER);  // ช่องรับค่า + operator อยู่ตรงกลาง
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