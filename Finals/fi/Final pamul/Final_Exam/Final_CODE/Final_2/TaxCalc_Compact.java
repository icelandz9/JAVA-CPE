package Final_Exam.Final_CODE.Final_2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * รูปแบบที่ 1: Compact Version
 * เน้นความง่าย รวมส่วนคำนวณไว้เป็น Inner Class (เลียนแบบ loan.java)
 * และใช้ Layout แบบ Grid ที่เรียบง่าย
 */
public class TaxCalc_Compact extends JFrame {
    // คอมโพเนนต์หน้าจอ
    private JTextField tfIncome = new JTextField(10);
    private JTextField tfExempt = new JTextField(10);
    private JTextField tfTaxResult = new JTextField(10);
    private JButton btnCalculate = new JButton("Calculate Tax");

    public TaxCalc_Compact() {
        // จัดเลย์เอาต์แบบตาราง 3 แถว 2 คอลัมน์
        JPanel p = new JPanel(new GridLayout(4, 2, 10, 10));
        p.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        p.add(new JLabel("Annual Income:"));
        p.add(tfIncome);
        p.add(new JLabel("Tax Deduction:"));
        p.add(tfExempt);
        p.add(new JLabel("Total Tax:"));
        p.add(tfTaxResult);
        tfTaxResult.setEditable(false);

        add(p, BorderLayout.CENTER);
        add(btnCalculate, BorderLayout.SOUTH);

        // การทำงานของปุ่ม
        btnCalculate.addActionListener(e -> {
            double income = Double.parseDouble(tfIncome.getText());
            double exempt = Double.parseDouble(tfExempt.getText());
            
            // เรียกใช้ Inner Class สำหรับคำนวณ (เหมือนโครงสร้าง loan.java)
            TaxLogic logic = new TaxLogic(income, exempt);
            tfTaxResult.setText(String.format("%.2f", logic.getResult()));
        });
    }

    // --- Inner Class เลียนแบบโครงสร้าง loan.java ---
    class TaxLogic {
        private double income;
        private double exempt;
        
        public TaxLogic(double income, double exempt) {
            this.income = income;
            this.exempt = exempt;
        }

        public double getResult() {
            double net = income - exempt;
            if (net <= 150000) return 0; // ยกเว้นภาษี
            return net * 0.10; // สมมติอัตราภาษี 10%
        }
    }

    public static void main(String[] args) {
        TaxCalc_Compact frame = new TaxCalc_Compact();
        frame.setTitle("Compact Tax Calculator");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
