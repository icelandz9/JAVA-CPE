import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Exam11 - โปรแกรม GUI จำลองหน้าตา Calculator Layout เท่านั้น (ยังไม่มี Logic
 * คำนวณ)
 *
 * <p>
 * โครงสร้าง Layout ภายใน JFrame:
 * <ul>
 * <li>NORTH : numberPanel - ปุ่มตัวเลข 0-9, *, # จัด GridLayout 4x3</li>
 * <li>CENTER : centerPanel - พื้นที่กรอกข้อมูล (inputPanel) + ปุ่ม operator
 * (operatorPanel)</li>
 * <li>SOUTH : equalPanel - ปุ่ม "=" สำหรับคำนวณ</li>
 * </ul>
 *
 * @author Graymatter
 */
public class Exam11 {

    /**
     * Constructor - สร้าง JFrame และประกอบ Component ทั้งหมด
     */
    public Exam11() {

        // สร้าง JFrame หลักของโปรแกรม (ไม่ได้ extends JFrame)
        JFrame frame = new JFrame("Calculator");

        // === ส่วนที่ 1: ปุ่มตัวเลข (4 แถว x 3 คอลัมน์) ===
        // กำหนดข้อความบนปุ่มแต่ละปุ่ม ตามลำดับจากซ้ายบนไปขวาล่าง
        String num[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#" };

        // สร้าง JPanel ใช้ GridLayout 4 แถว 3 คอลัมน์ ระยะห่างแนวนอน/แนวตั้ง 5px
        JPanel numberPanel = new JPanel(new GridLayout(4, 3, 5, 5));

        // วนลูปเพิ่มปุ่มตัวเลขทุก element จาก num ลงใน numberPanel
        for (String s : num) {
            numberPanel.add(new JButton(s));
        }

        // === ส่วนที่ 2: ปุ่ม Operator (2 แถว x 3 คอลัมน์) ===
        // กำหนดสัญลักษณ์การคำนวณที่ใช้งาน
        String ops[] = { "+", "-", "x", "/", ".", "%" };

        // สร้าง JPanel ใช้ GridLayout 2 แถว 3 คอลัมน์ ระยะห่าง 5px
        JPanel operatorPanel = new JPanel(new GridLayout(2, 3, 5, 5));

        // วนลูปเพิ่มปุ่ม operator แต่ละตัวลงใน operatorPanel
        for (String op : ops) {
            operatorPanel.add(new JButton(op));
        }

        // === ส่วนที่ 3: พื้นที่กรอกข้อมูล (3 แถว x 2 คอลัมน์) ===
        // สร้าง JPanel ใช้ GridLayout 3 แถว 2 คอลัมน์ ระยะห่าง 5px
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));

        // ช่องกรอกตัวเลขที่ 1
        JTextField n1 = new JTextField();

        // ช่องกรอกตัวเลขที่ 2
        JTextField n2 = new JTextField();

        // ช่องแสดงผลลัพธ์ (ผู้ใช้ไม่สามารถพิมพ์ข้อความได้โดยตรง)
        JTextField result = new JTextField();
        result.setEditable(false); // ล็อคไม่ให้ผู้ใช้แก้ไขช่อง result โดยตรง

        // เพิ่ม Label และ TextField สลับกันลงใน inputPanel ตามลำดับ
        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(n1);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(n2);
        inputPanel.add(new JLabel("Result:"));
        inputPanel.add(result);

        // === ส่วนที่ 4: แผงกลาง (รวม inputPanel + operatorPanel) ===
        // ใช้ BorderLayout โดย inputPanel อยู่ตรงกลาง และ operatorPanel อยู่ทางขวา
        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.add(inputPanel, BorderLayout.CENTER);
        centerPanel.add(operatorPanel, BorderLayout.EAST);

        // กำหนด padding รอบด้าน centerPanel:
        // บน=10, ซ้าย=10, ล่าง=40 (เผื่อพื้นที่ปุ่ม "="), ขวา=10
        centerPanel.setBorder(new EmptyBorder(10, 10, 40, 10));

        // === ส่วนที่ 5: ปุ่ม "=" ===
        // ปุ่มสำหรับกดคำนวณ (ยังไม่มี ActionListener ในโจทย์ Exam นี้)
        JButton equalButton = new JButton("=");

        // ใส่ปุ่ม "=" ลงใน JPanel เพื่อจัดการ padding รอบด้านปุ่ม
        JPanel equalPanel = new JPanel(new BorderLayout());
        equalPanel.add(equalButton, BorderLayout.CENTER);
        equalPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // padding รอบปุ่ม 10px

        // === ส่วนที่ 6: ประกอบ Layout เข้า JFrame ===
        // ใช้ BorderLayout เป็น Layout หลัก กำหนดระยะห่างแนวนอน/แนวตั้ง 10px
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(numberPanel, BorderLayout.NORTH); // ปุ่มตัวเลขอยู่ด้านบน
        frame.add(centerPanel, BorderLayout.CENTER); // ช่องกรอกข้อมูล + operator อยู่ตรงกลาง
        frame.add(equalPanel, BorderLayout.SOUTH); // ปุ่ม "=" อยู่ด้านล่าง

        // === ส่วนที่ 7: ตั้งค่าและแสดงหน้าต่าง ===
        frame.setSize(500, 450); // กำหนดขนาด กว้าง x สูง
        frame.setLocationRelativeTo(null); // จัดหน้าต่างให้อยู่กึ่งกลางจอ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // กด X แล้วปิดโปรแกรม
        frame.setVisible(true); // แสดงหน้าต่าง
    }

    /**
     * จุดเริ่มต้นของโปรแกรม - สร้าง instance ของ Exam11 เพื่อเปิด GUI
     *
     * @param args อาร์กิวเมนต์จาก command line (ไม่ได้ใช้งาน)
     */
    public static void main(String[] args) {
        new Exam11(); // สร้าง instance ทันที - JFrame จะถูกสร้างใน Constructor
    }
}
