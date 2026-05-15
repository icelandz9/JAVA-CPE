package Final_Exam.Final_CODE.Final_7;

import java.awt.*;
import javax.swing.*;

// ══════════════════════════════════════════════════════════════
//  Layout_Calculator.java — เครื่องคิดเลข (ระดับ Final_7)
//
//  ดัดแปลงจาก Exam11 (Graymatter) + Q09_442_01
//  โครงสร้างต่างจาก Final_7 ตรงที่:
//    - ไม่มี BorderLayout.WEST/EAST แบบ Final_7
//    - ใช้ BorderLayout: NORTH=numpad, CENTER=input+ops, SOUTH=equal
//    - ใช้ for loop สร้างปุ่มจาก String array (เทคนิคสำคัญ)
//
//  Layout หลัก (BorderLayout บน JFrame):
//    NORTH  = numberPanel  (ปุ่ม 0-9, *, # แบบ GridLayout 4x3)
//    CENTER = centerPanel  (inputPanel CENTER + operatorPanel EAST)
//    SOUTH  = equalPanel   (ปุ่ม "=")
// ══════════════════════════════════════════════════════════════

public class Layout_Calculator {
    public static void main(String[] args) {

        // ─── ส่วนที่ 1: สร้าง JFrame ─────────────────────────────
        JFrame frame = new JFrame("Calculator");

        // ─── ส่วนที่ 2: แป้นตัวเลข (GridLayout 4x3) ─────────────
        // เทคนิค: ใช้ String array + for loop สร้างปุ่มทีเดียว
        String[] nums = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#" };
        JPanel numberPanel = new JPanel(new GridLayout(4, 3, 5, 5));
        for (String s : nums) {
            numberPanel.add(new JButton(s));
        }

        // ─── ส่วนที่ 3: ปุ่ม Operator (GridLayout 2x3) ───────────
        String[] ops = { "+", "-", "x", "/", ".", "%" };
        JPanel operatorPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        for (String op : ops) {
            operatorPanel.add(new JButton(op));
        }

        // ─── ส่วนที่ 4: ช่องรับค่า (GridLayout 3x2) ─────────────
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        JTextField n1     = new JTextField();
        JTextField n2     = new JTextField();
        JTextField result = new JTextField();
        result.setEditable(false); // แสดงผลอย่างเดียว

        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(n1);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(n2);
        inputPanel.add(new JLabel("Result:"));
        inputPanel.add(result);

        // ─── ส่วนที่ 5: centerPanel รวม input + operator ─────────
        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.add(inputPanel,   BorderLayout.CENTER);
        centerPanel.add(operatorPanel, BorderLayout.EAST);

        // ─── ส่วนที่ 6: equalPanel ────────────────────────────────
        JButton equalButton = new JButton("=");
        JPanel  equalPanel  = new JPanel(new BorderLayout());
        equalPanel.add(equalButton, BorderLayout.CENTER);

        // ─── ส่วนที่ 7: ประกอบ JFrame ────────────────────────────
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(numberPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(equalPanel,  BorderLayout.SOUTH);

        // ─── ส่วนที่ 8: แสดงหน้าต่าง ─────────────────────────────
        frame.setSize(500, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
