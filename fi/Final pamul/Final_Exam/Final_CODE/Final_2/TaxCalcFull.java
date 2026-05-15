package Final_Exam.Final_CODE.Final_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ══════════════════════════════════════════════════════════════
//  TaxCalcFull.java — GUI คำนวณภาษี (ไฟล์เดียว ก้อปวางได้เลย)
//
//  โครงสร้างจงใจทำให้เหมือน cpe222_442_02 ทุกส่วน:
//
//    cpe222_442_02         →   TaxCalcFull
//    ─────────────────────────────────────────────────────
//    a1 (จำนวนเงินบาท)     →   tfIncome (รายได้ต่อปี)
//    a2 (จำนวนหลังแปลง)   →   tfResult (ผลลัพธ์)
//    wa (ปุ่ม USD)          →   btnTax   (ปุ่มคำนวณภาษี)
//    ft (ปุ่ม CNY)          →   btnNet   (ปุ่มรายได้สุทธิ)
//    num1 / 32.40           →   tax.getTaxToPay()
// ══════════════════════════════════════════════════════════════

public class TaxCalcFull extends JFrame {

    // ─── ส่วนที่ 1: ประกาศตัวแปร GUI (field ของ class) ──────────
    JTextField tfIncome    = new JTextField(15); // รายได้ต่อปี
    JTextField tfDeduction = new JTextField(15); // ค่าลดหย่อน
    JTextField tfResult    = new JTextField(15); // แสดงผล

    JButton btnTax = new JButton("Tax");  // คำนวณภาษี
    JButton btnNet = new JButton("Net");  // คำนวณรายได้สุทธิ

    public TaxCalcFull() {

        // ─── ส่วนที่ 2: จัดวาง Layout ────────────────────────────
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2, 3, 3)); // 1 แถว 2 คอลัมน์

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2)); // label + field 3 คู่

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1)); // ปุ่ม 2 ปุ่ม

        p1.add(new JLabel("รายได้ต่อปี (บาท)"));
        p1.add(tfIncome);
        p1.add(new JLabel("ค่าลดหย่อน (บาท)"));
        p1.add(tfDeduction);
        p1.add(new JLabel("ผลลัพธ์"));
        p1.add(tfResult);

        p2.add(btnTax);
        p2.add(btnNet);

        p.add(p1);
        p.add(p2);
        add(p);

        // ─── ส่วนที่ 3: ActionListener ปุ่ม Tax ──────────────────
        btnTax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double income    = Double.parseDouble(tfIncome.getText());
                double deduction = Double.parseDouble(tfDeduction.getText());
                // สร้าง Tax object แล้วเรียกเมธอดคำนวณ
                IncomeTax tax = new IncomeTax(income, deduction);
                tfResult.setText(String.format("%.2f", tax.getTaxToPay()) + " บาท");
            }
        });

        // ─── ส่วนที่ 4: ActionListener ปุ่ม Net ──────────────────
        btnNet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double income    = Double.parseDouble(tfIncome.getText());
                double deduction = Double.parseDouble(tfDeduction.getText());
                IncomeTax tax = new IncomeTax(income, deduction);
                tfResult.setText(String.format("%.2f", tax.getNetIncome()) + " บาท");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new TaxCalcFull();
        frame.setTitle("Tax Calculator");
        frame.setSize(400, 130);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// ══════════════════════════════════════════════════════════════
//  คลาส IncomeTax — data class (โครงสร้างเดียวกับ Loan.java)
//
//    Loan.java             →   IncomeTax
//    ─────────────────────────────────────────────────────
//    annualInterestRate    →   TAX_RATE (17%)
//    loanAmount            →   income (รายได้)
//    numberOfYears         →   deduction (ค่าลดหย่อน)
//    getMonthlyPayment()   →   getTaxToPay()
//    getTotalPayment()     →   getNetIncome()
// ══════════════════════════════════════════════════════════════
class IncomeTax {
    private double income;    // รายได้ต่อปี
    private double deduction; // ค่าลดหย่อน
    private static final double TAX_RATE = 0.17; // อัตราภาษี 17%

    // Default constructor (เหมือน Loan() ที่ใช้ this())
    public IncomeTax() {
        this(300000.0, 60000.0);
    }

    // Constructor หลัก (เหมือน Loan(rate, years, amount))
    public IncomeTax(double income, double deduction) {
        this.income    = income;
        this.deduction = deduction;
    }

    // Getter / Setter (เหมือน Loan)
    public double getIncome()       { return income; }
    public void   setIncome(double income)       { this.income = income; }
    public double getDeduction()    { return deduction; }
    public void   setDeduction(double deduction) { this.deduction = deduction; }

    // คำนวณรายได้สุทธิ (เหมือน getMonthlyPayment)
    public double getNetIncome() {
        double net = income - deduction;
        return (net > 0) ? net : 0; // ไม่ติดลบ
    }

    // คำนวณภาษีที่ต้องจ่าย (เหมือน getTotalPayment)
    public double getTaxToPay() {
        return getNetIncome() * TAX_RATE;
    }
}
