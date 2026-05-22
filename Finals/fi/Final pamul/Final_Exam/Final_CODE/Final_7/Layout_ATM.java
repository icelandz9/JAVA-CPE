package Final_Exam.Final_CODE.Final_7;

import java.awt.*;
import javax.swing.*;

// ══════════════════════════════════════════════════════════════
//  Layout_ATM.java — หน้าจอ ATM (ระดับ Final_7)
//
//  โครงสร้างเหมือน cpe222_442_07 ทุกส่วน:
//    - ประกาศตัวแปร component ก่อน
//    - กำหนด Font
//    - สร้าง instance
//    - ตั้งค่า Style (setForeground, setFont)
//    - ประกอบ Panel ซ้อนกันหลายชั้น
//    - วางลง BorderLayout หลัก
//
//  Layout หลัก (BorderLayout):
//    NORTH  = toptxt (ช่องแสดงตัวเลขที่กด)
//    WEST   = p5     (ข้อความ + form รหัสบัตร)
//    EAST   = p4     (แป้นตัวเลข 4x3)
// ══════════════════════════════════════════════════════════════

public class Layout_ATM {
    public static void main(String[] args) {

        // ─── ส่วนที่ 1: ประกาศตัวแปร component ──────────────────
        JFrame f;
        JPanel p;
        JLabel  titleLbl, cardLbl, pinLbl;
        JTextField cardTxt, displayTxt;
        JPasswordField pinTxt;
        JButton confirmBtn, cancelBtn;
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bClr, bEnter;

        // ─── Font ─────────────────────────────────────────────────
        Font fn1 = new Font("Tahoma",      Font.BOLD, 14);
        Font fn2 = new Font("Courier New", Font.BOLD, 16);

        // ─── ส่วนที่ 2: สร้าง instance ───────────────────────────
        f = new JFrame("ATM : กรุณาใส่รหัสบัตร");
        p = new JPanel();
        p.setLayout(new BorderLayout());

        titleLbl   = new JLabel("*** กรุณากดรหัส PIN 6 หลัก ***");
        cardLbl    = new JLabel("หมายเลขบัตร");
        pinLbl     = new JLabel("PIN");
        cardTxt    = new JTextField(10);
        displayTxt = new JTextField(10);   // ช่องด้านบน (แสดงเลขที่กด)
        pinTxt     = new JPasswordField(10);
        confirmBtn = new JButton("Confirm");
        cancelBtn  = new JButton("Cancel");

        // ปุ่มตัวเลข (เหมือน Final_7)
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bClr   = new JButton("CLR");
        bEnter = new JButton("OK");

        // ─── ส่วนที่ 3: ตั้งค่า Style ────────────────────────────
        titleLbl.setForeground(Color.RED);
        titleLbl.setFont(fn1);
        cardLbl.setFont(fn2);
        pinLbl.setFont(fn2);
        cardTxt.setFont(fn1);
        pinTxt.setFont(fn1);
        confirmBtn.setFont(fn2);
        cancelBtn.setFont(fn2);

        // ─── ส่วนที่ 4: สร้าง Panel ──────────────────────────────
        JPanel p1 = new JPanel(new GridLayout(2, 1));  // form + buttons
        JPanel p2 = new JPanel(new GridLayout(2, 2));  // label + field
        JPanel p3 = new JPanel(new FlowLayout());      // ปุ่ม Confirm/Cancel
        JPanel p4 = new JPanel(new GridLayout(4, 3));  // แป้นตัวเลข (EAST)
        JPanel p5 = new JPanel(new BorderLayout());    // ฝั่งซ้าย
        JPanel p6 = new JPanel(new FlowLayout());      // ข้อความหัว

        // เพิ่มปุ่มลงแป้นตัวเลข
        p4.add(b1);   p4.add(b2);   p4.add(b3);
        p4.add(b4);   p4.add(b5);   p4.add(b6);
        p4.add(b7);   p4.add(b8);   p4.add(b9);
        p4.add(b0);   p4.add(bClr); p4.add(bEnter);

        // ประกอบ form
        p2.add(cardLbl);  p2.add(cardTxt);
        p2.add(pinLbl);   p2.add(pinTxt);
        p3.add(confirmBtn);
        p3.add(cancelBtn);
        p1.add(p2);
        p1.add(p3);

        // รวมฝั่งซ้าย
        p6.add(titleLbl);
        p5.add(p6, BorderLayout.NORTH);
        p5.add(p1, BorderLayout.SOUTH);

        // ─── ส่วนที่ 5: วางลง Panel หลัก ─────────────────────────
        p.add(displayTxt, BorderLayout.NORTH);  // ช่องแสดงเลขที่กด
        p.add(p5,         BorderLayout.WEST);   // form ซ้าย
        p.add(p4,         BorderLayout.EAST);   // แป้นตัวเลขขวา

        // ─── ส่วนที่ 6: แสดงหน้าต่าง ─────────────────────────────
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(455, 250);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
