import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Exam12 - เครื่องคิดเลข GUI ที่มี Logic การคำนวณครบถ้วน
 *
 * <p>ต่างจาก Exam11 ตรงที่:
 * <ul>
 *   <li>ปุ่มแต่ละปุ่มมี {@link ActionListener} ผูกอยู่ เพื่อให้คำนวณได้จริง</li>
 *   <li>รองรับการหารและจัดการกรณีหารด้วยศูนย์</li>
 * </ul>
 *
 * <p>Layout ภายใน JFrame:
 * <ul>
 *   <li>panelInput   — Label + TextField สำหรับ Number1, Number2, และ Result แบบ GridLayout 3x2</li>
 *   <li>panelButtons — ปุ่ม Add, Subtract, Multiply, Divide แบบ GridLayout 4x1</li>
 *   <li>panelAll     — รวม panelInput และ panelButtons ข้างกัน แบบ GridLayout 1x2</li>
 * </ul>
 *
 * @author Graymatter
 */
public class Exam12 {

    // ─── Fields: ช่องรับค่าตัวเลขและแสดงผล ────────────────────────────────────────

    /** ช่องรับตัวเลขที่ 1 ความกว้าง 5 ตัวอักษร */
    private JTextField tfNumber1 = new JTextField(5);

    /** ช่องรับตัวเลขที่ 2 ความกว้าง 5 ตัวอักษร */
    private JTextField tfNumber2 = new JTextField(5);

    /** ช่องแสดงผลลัพธ์การคำนวณ ความกว้าง 10 ตัวอักษร (ไม่อนุญาตให้แก้ไขด้วยมือ) */
    private JTextField tfResult  = new JTextField(10);

    // ─── Fields: ปุ่มสำหรับเลือกการดำเนินการ ──────────────────────────────────────

    /** ปุ่มบวก */
    private JButton btnAdd      = new JButton("Add");

    /** ปุ่มลบ */
    private JButton btnSubtract = new JButton("Subtract");

    /** ปุ่มคูณ */
    private JButton btnMultiply = new JButton("Multiply");

    /** ปุ่มหาร */
    private JButton btnDivide   = new JButton("Divide");

    /**
     * Constructor — สร้าง JFrame, จัดวาง Component ทั้งหมด และผูก ActionListener
     */
    public Exam12() {

        // สร้าง JFrame พร้อมตั้งชื่อหน้าต่างโดยตรง (ไม่ extends JFrame)
        JFrame frame = new JFrame("Calculator");

        // ─── ส่วนที่ 1: แผงรับค่าตัวเลขและผลลัพธ์ (3 แถว x 2 คอลัมน์) ─────────────────
        JPanel panelInput = new JPanel(new GridLayout(3, 2));

        panelInput.add(new JLabel("Number 1"));
        panelInput.add(tfNumber1);                  // ช่องรับตัวเลขที่ 1

        panelInput.add(new JLabel("Number 2"));
        panelInput.add(tfNumber2);                  // ช่องรับตัวเลขที่ 2

        panelInput.add(new JLabel("Result"));
        tfResult.setEditable(false);                // ไม่อนุญาตให้ผู้ใช้พิมพ์ในช่องผลลัพธ์โดยตรง
        panelInput.add(tfResult);                   // ช่องแสดงผลลัพธ์

        // ─── ส่วนที่ 2: แผงปุ่ม Operator (4 แถว x 1 คอลัมน์) ────────────────────────
        JPanel panelButtons = new JPanel(new GridLayout(4, 1));
        panelButtons.add(btnAdd);
        panelButtons.add(btnSubtract);
        panelButtons.add(btnMultiply);
        panelButtons.add(btnDivide);

        // ─── ส่วนที่ 3: แผงหลัก — วาง panelInput และ panelButtons ข้างๆ กัน ──────────
        // GridLayout 1 แถว 2 คอลัมน์ (ซ้าย = input, ขวา = ปุ่ม)
        JPanel panelAll = new JPanel(new GridLayout(1, 2));
        panelAll.add(panelInput);
        panelAll.add(panelButtons);
        frame.add(panelAll);    // เพิ่ม panelAll เข้าหน้าต่างหลัก

        // ─── ส่วนที่ 4: ผูก ActionListener ให้แต่ละปุ่ม ────────────────────────────────

        // ปุ่ม Add — คำนวณ num1 + num2
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1   = Double.parseDouble(tfNumber1.getText()); // อ่านค่าจากช่อง 1
                double num2   = Double.parseDouble(tfNumber2.getText()); // อ่านค่าจากช่อง 2
                double result = num1 + num2;                             // บวกกัน
                tfResult.setText(String.valueOf(result));                // แสดงผล
            }
        });

        // ปุ่ม Subtract — คำนวณ num1 - num2
        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1   = Double.parseDouble(tfNumber1.getText()); // อ่านค่าจากช่อง 1
                double num2   = Double.parseDouble(tfNumber2.getText()); // อ่านค่าจากช่อง 2
                double result = num1 - num2;                             // ลบกัน
                tfResult.setText(String.valueOf(result));                // แสดงผล
            }
        });

        // ปุ่ม Multiply — คำนวณ num1 * num2
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1   = Double.parseDouble(tfNumber1.getText()); // อ่านค่าจากช่อง 1
                double num2   = Double.parseDouble(tfNumber2.getText()); // อ่านค่าจากช่อง 2
                double result = num1 * num2;                             // คูณกัน
                tfResult.setText(String.valueOf(result));                // แสดงผล
            }
        });

        // ปุ่ม Divide — คำนวณ num1 / num2 พร้อมป้องกันหารด้วย 0
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(tfNumber1.getText()); // อ่านค่าจากช่อง 1
                double num2 = Double.parseDouble(tfNumber2.getText()); // อ่านค่าจากช่อง 2

                if (num2 != 0) {
                    // กรณีปกติ: หารได้
                    double result = num1 / num2;
                    tfResult.setText(String.valueOf(result));
                } else {
                    // กรณี num2 = 0: ไม่สามารถหารได้ แสดงข้อความ Error
                    tfResult.setText("Error: Divide by 0");
                }
            }
        });

        // ─── ส่วนที่ 5: ตั้งค่าและแสดงหน้าต่าง ────────────────────────────────────────
        frame.setSize(500, 150);                                    // ขนาดหน้าต่าง กว้าง x สูง
        frame.setLocationRelativeTo(null);                          // ให้หน้าต่างอยู่ตรงกลางจอ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // กด X แล้วปิดโปรแกรม
        frame.setVisible(true);                                     // แสดงหน้าต่าง
    }

    /**
     * จุดเริ่มต้นของโปรแกรม — สร้าง instance ของ Exam12 เพื่อแสดง GUI
     *
     * @param args อาร์กิวเมนต์จาก command line (ไม่ได้ใช้งาน)
     */
    public static void main(String[] args) {
        new Exam12();  // สร้าง instance เดียว — JFrame ถูกสร้างและแสดงใน Constructor
    }
}