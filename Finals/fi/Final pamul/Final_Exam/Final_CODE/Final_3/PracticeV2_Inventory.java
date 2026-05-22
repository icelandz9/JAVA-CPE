// ══════════════════════════════════════════════════════════════
//  PracticeV2_Inventory.java  —  Final_3 ดัดแปลง
//
//  ต้นแบบ: Final_3 (InventoryApp.java) + EP10_4 (calculator events)
//
//  แนวคิดหลักที่ต้องทำได้ในสอบ:
//    1. ArrayList<T> เก็บออบเจ็กต์หลายชิ้น
//    2. try-catch NumberFormatException
//    3. JTextArea แสดงผลหลายบรรทัด พร้อม JScrollPane
//    4. Lambda ActionListener (e -> { ... })
//    5. วนลูปด้วย for-each และสะสมค่า total
//
//  สิ่งที่เปลี่ยน (ดักทาง):
//    - จาก "Product + Price" → "Student + Score (คะแนนนักเรียน)"
//    - ปุ่ม "Add Student" แทน "Add Product"
//    - แสดงผลเฉลี่ยคะแนนแทนมูลค่ารวม
// ══════════════════════════════════════════════════════════════

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class PracticeV2_Inventory extends JFrame {

    // ─── ส่วนที่ 1: ประกาศ Component ─────────────────────────────
    //  เทียบ Final_3: tfName, tfPrice, taDisplay, btnAdd
    private JTextField tfName  = new JTextField(10);  // ชื่อนักเรียน
    private JTextField tfScore = new JTextField(10);  // คะแนน (0-100)
    private JTextArea  taDisplay = new JTextArea(10, 30); // แสดงรายชื่อ
    private JButton    btnAdd    = new JButton("Add Student");

    // ─── ส่วนที่ 2: ArrayList เก็บออบเจ็กต์ ────────────────────
    //  เทียบ Final_3: ArrayList<Product> productList
    private ArrayList<Student> studentList = new ArrayList<>();

    public PracticeV2_Inventory() {

        // ─── Layout: GridLayout 3x2 (label + field) ──────────────
        //  เทียบ Final_3: JPanel pInput = new JPanel(new GridLayout(3,2))
        JPanel pInput = new JPanel(new GridLayout(3, 2));
        pInput.add(new JLabel("Student Name:"));
        pInput.add(tfName);
        pInput.add(new JLabel("Score (0-100):"));
        pInput.add(tfScore);
        pInput.add(new JLabel("Action:"));
        pInput.add(btnAdd);

        add(pInput, BorderLayout.NORTH);
        add(new JScrollPane(taDisplay), BorderLayout.CENTER); // เหมือน Final_3

        // ─── ส่วนที่ 3: Lambda ActionListener ────────────────────
        //  เทียบ Final_3: btnAdd.addActionListener(e -> { try { ... } catch(...) { ... } })
        btnAdd.addActionListener(e -> {
            try {
                String name = tfName.getText().trim();
                double score = Double.parseDouble(tfScore.getText()); // อาจ throw NumberFormatException

                // ─── Validation เพิ่มเติม (ดักทาง if-else) ───────
                if (score < 0 || score > 100) {
                    JOptionPane.showMessageDialog(this, "Score ต้องอยู่ระหว่าง 0-100!");
                    return;
                }

                // สร้างออบเจ็กต์ใหม่และเพิ่มเข้า List — เหมือน Final_3
                studentList.add(new Student(name, score));

                updateDisplay();       // อัปเดตหน้าจอ — เหมือน Final_3
                tfName.setText("");
                tfScore.setText("");
                tfName.requestFocus();

            } catch (NumberFormatException ex) {
                // ดักจับ NumberFormatException — จุดสำคัญของ Final_3
                JOptionPane.showMessageDialog(this, "กรุณากรอกตัวเลขในช่องคะแนน!");
            }
        });
    }

    // ─── ส่วนที่ 4: วนลูปแสดงผลและสะสมค่า ─────────────────────
    //  เทียบ Final_3: private void updateDisplay() { for(Product p : productList) ... }
    private void updateDisplay() {
        taDisplay.setText("--- Student Score List ---\n");
        double total = 0;
        for (Student s : studentList) {        // for-each loop
            taDisplay.append(s.toString() + "\n");
            total += s.getScore();             // สะสมค่า
        }
        taDisplay.append("--------------------------\n");
        // คำนวณค่าเฉลี่ยแทน total value ของ Final_3
        double avg = studentList.isEmpty() ? 0 : total / studentList.size();
        taDisplay.append(String.format("Average Score: %.2f  (Total: %d students)", avg, studentList.size()));
    }

    public static void main(String[] args) {
        PracticeV2_Inventory f = new PracticeV2_Inventory();
        f.setTitle("Student Score Manager"); // เทียบ "Inventory Manager"
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

// ─── Data Class: Student ────────────────────────────────────
//  เทียบ Final_3: class Product { String name; double price; }
class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name  = name;
        this.score = score;
    }

    public double getScore() { return score; }

    @Override
    public String toString() {
        // เทียบ Final_3: String.format("- %-15s : %,10.2f THB", name, price)
        String grade;
        if      (score >= 80) grade = "A";
        else if (score >= 70) grade = "B";
        else if (score >= 60) grade = "C";
        else if (score >= 50) grade = "D";
        else                  grade = "F";
        return String.format("- %-15s : %6.1f  [%s]", name, score, grade);
    }
}
