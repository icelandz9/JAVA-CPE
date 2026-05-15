package Final_Exam.Final_CODE.Final_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ══════════════════════════════════════════════════════════════
//  TaxCalcApp.java — GUI คำนวณภาษีเงินได้
//
//  โครงสร้างเหมือน cpe222_442_02.java ทุกอย่าง:
//    - extends JFrame
//    - JTextField เป็น field ของคลาส
//    - GridLayout จัด layout
//    - ActionListener แบบ Anonymous Inner Class
//
//  ใช้คู่กับ Tax.java (data class — เหมือน Loan.java ของอาจารย์)
// ══════════════════════════════════════════════════════════════

public class TaxCalcApp extends JFrame {

    // ─── ส่วนที่ 1: ประกาศ JTextField เป็น field ─────────────────
    // (เหมือน a1, a2 ใน cpe222_442_02)
    JTextField tfIncome    = new JTextField(15); // รายได้ต่อปี
    JTextField tfDeduction = new JTextField(15); // ค่าลดหย่อน
    JTextField tfResult    = new JTextField(15); // แสดงผลลัพธ์

    // ─── ปุ่มสองปุ่ม (เหมือน wa=USD, ft=CNY ใน Final_2) ──────────
    JButton btnTax    = new JButton("Tax");     // คำนวณภาษีที่ต้องจ่าย
    JButton btnNet    = new JButton("Net");     // คำนวณรายได้สุทธิ

    public TaxCalcApp() {

        // ─── ส่วนที่ 2: Layout ────────────────────────────────────
        // p หลัก: GridLayout 1 แถว 2 คอลัมน์ (เหมือน Final_2)
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2, 3, 3));

        // p1: ฝั่งซ้าย — label + textfield (GridLayout 3 แถว ← เพิ่มขึ้น 1 เพราะมี input 3 ช่อง)
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2)); // 3 แถว 2 คอลัมน์: label | field

        // p2: ฝั่งขวา — ปุ่ม (GridLayout 2 แถว เหมือน Final_2)
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1));

        // ─── เพิ่ม component ลง p1 ───────────────────────────────
        p1.add(new JLabel("รายได้ต่อปี (บาท)"));
        p1.add(tfIncome);
        p1.add(new JLabel("ค่าลดหย่อน (บาท)"));
        p1.add(tfDeduction);
        p1.add(new JLabel("ผลลัพธ์"));
        p1.add(tfResult);

        // ─── เพิ่มปุ่มลง p2 ──────────────────────────────────────
        p2.add(btnTax);
        p2.add(btnNet);

        // ─── รวม panel เข้าด้วยกัน (เหมือน Final_2) ─────────────
        p.add(p1);
        p.add(p2);
        add(p);

        // ─── ส่วนที่ 3: ActionListener ปุ่ม Tax ──────────────────
        // (เหมือน wa.addActionListener ใน Final_2)
        btnTax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // อ่านค่าจาก TextField (pattern เดิมทุกอย่าง)
                double income    = Double.parseDouble(tfIncome.getText());
                double deduction = Double.parseDouble(tfDeduction.getText());

                // สร้าง object Tax แล้วเรียกเมธอดคำนวณ
                // (เหมือน loan.java → สร้าง Loan object แล้วเรียก getMonthlyPayment)
                Tax tax = new Tax(income, 0.17, deduction); // อัตราภาษี 17%
                double result = tax.getTaxToPay();

                tfResult.setText(String.format("%.2f", result) + " บาท");
            }
        });

        // ─── ส่วนที่ 4: ActionListener ปุ่ม Net ──────────────────
        // (เหมือน ft.addActionListener ใน Final_2)
        btnNet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double income    = Double.parseDouble(tfIncome.getText());
                double deduction = Double.parseDouble(tfDeduction.getText());

                Tax tax = new Tax(income, 0.17, deduction);
                double result = tax.getNetIncome(); // รายได้สุทธิ

                tfResult.setText(String.format("%.2f", result) + " บาท");
            }
        });
    }

    // ─── ส่วนที่ 5: main — เหมือน Final_2 ทุกอย่าง ──────────────
    public static void main(String[] args) {
        JFrame frame = new TaxCalcApp();
        frame.setTitle("Tax Calculator");
        frame.setSize(400, 130);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
