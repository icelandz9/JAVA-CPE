// ══════════════════════════════════════════════════════════════
//  PracticeV2_Layout.java  —  Final_7 ดัดแปลง
//
//  ต้นแบบ: Final_7 (cpe222_442_07.java) + Quiz9_1/9_2/9_3 (Layout) + EP9_1
//
//  แนวคิดหลักที่ต้องทำได้ในสอบ (Basic GUI Layout):
//    1. JFrame, JPanel, JLabel, JTextField, JButton, JPasswordField
//    2. Layout: BorderLayout, GridLayout, FlowLayout ผสมกัน
//    3. Font: new Font("...", Font.BOLD, size) + setFont()
//    4. setForeground(Color.xxx) กำหนดสี
//    5. การประกอบ panel ซ้อนกันหลายชั้น
//
//  สิ่งที่เปลี่ยน (ดักทาง):
//    - จาก "Login Form + Numpad" → "Student Registration Form + Course Selection"
//    - ยังคงใช้ pattern: BorderLayout หลัก + p5(WEST) + p4(EAST) เหมือน Final_7
//    - ด้าน WEST = form กรอกข้อมูล, ด้าน EAST = checkbox/radio เลือกวิชา
// ══════════════════════════════════════════════════════════════

import java.awt.*;
import javax.swing.*;

public class PracticeV2_Layout {
    public static void main(String[] args) {

        // ─── ส่วนที่ 1: ประกาศ Component ─────────────────────────
        //  เทียบ Final_7: JFrame f; JPanel p; JLabel mlbl...
        JFrame f;
        JPanel p;
        JLabel  titleLbl, idLbl, nameLbl, emailLbl;
        JTextField idTxt, nameTxt, emailTxt, toptxt;
        JButton submitBtn, clearBtn;
        JCheckBox cb1, cb2, cb3, cb4, cb5, cb6;

        // ─── Font ────────────────────────────────────────────────
        //  เทียบ Final_7: Font fn1, fn2
        Font fn1 = new Font("Tahoma",      Font.BOLD,  14);
        Font fn2 = new Font("Courier New", Font.BOLD,  13);
        Font fn3 = new Font("Arial",       Font.PLAIN, 12);

        // ─── ส่วนที่ 2: สร้าง instances ──────────────────────────
        //  เทียบ Final_7: f = new JFrame(...); p = new JPanel(); ...
        f = new JFrame("CPE 222: Student Registration");
        p = new JPanel();
        p.setLayout(new BorderLayout());

        titleLbl  = new JLabel("*** Student Registration Form ***");
        idLbl     = new JLabel("Student ID");
        nameLbl   = new JLabel("Full Name");
        emailLbl  = new JLabel("Email");
        idTxt     = new JTextField(10);
        nameTxt   = new JTextField(10);
        emailTxt  = new JTextField(10);
        toptxt    = new JTextField(10); // ช่องด้านบน (เหมือน Final_7)
        submitBtn = new JButton("Submit");
        clearBtn  = new JButton("Clear");

        // CheckBox วิชาที่เลือก (แทน Numpad ของ Final_7)
        cb1 = new JCheckBox("CPE101 - Programming");
        cb2 = new JCheckBox("CPE102 - Data Structure");
        cb3 = new JCheckBox("CPE201 - Database");
        cb4 = new JCheckBox("CPE202 - Networks");
        cb5 = new JCheckBox("CPE222 - OOP Java");
        cb6 = new JCheckBox("CPE301 - Algorithm");

        // ─── ส่วนที่ 3: ตั้งค่า Style ────────────────────────────
        //  เทียบ Final_7: mlbl.setForeground(Color.red); mlbl.setFont(fn1);
        titleLbl.setForeground(Color.RED);
        titleLbl.setFont(fn1);
        idLbl.setFont(fn2);
        nameLbl.setFont(fn2);
        emailLbl.setFont(fn2);
        idTxt.setFont(fn1);
        nameTxt.setFont(fn1);
        emailTxt.setFont(fn1);
        submitBtn.setFont(fn2);
        clearBtn.setFont(fn2);
        cb1.setFont(fn3); cb2.setFont(fn3); cb3.setFont(fn3);
        cb4.setFont(fn3); cb5.setFont(fn3); cb6.setFont(fn3);

        // ─── ส่วนที่ 4: สร้าง Panel และ Layout ──────────────────
        //  เทียบ Final_7: JPanel p1, p2, p3, p4, p5, p6
        JPanel p1 = new JPanel(new GridLayout(2, 1));  // form + buttons
        JPanel p2 = new JPanel(new GridLayout(3, 2));  // label + textfield
        JPanel p3 = new JPanel(new FlowLayout());      // submit + clear
        JPanel p4 = new JPanel(new GridLayout(6, 1));  // checkbox วิชา (แทน Numpad)
        JPanel p5 = new JPanel(new BorderLayout());    // ฝั่งซ้าย
        JPanel p6 = new JPanel(new FlowLayout());      // header

        // ─── ใส่ Checkbox ลงใน p4 (ด้าน EAST) ───────────────────
        //  เทียบ Final_7: p4.add(b1)...p4.add(b0) ← เป็น numpad
        p4.add(cb1); p4.add(cb2); p4.add(cb3);
        p4.add(cb4); p4.add(cb5); p4.add(cb6);

        // ─── ประกอบส่วน Form ─────────────────────────────────────
        //  เทียบ Final_7: p2.add(ulbl); p2.add(usertxt); p2.add(pwlbl); p2.add(pwtxt)
        p2.add(idLbl);    p2.add(idTxt);
        p2.add(nameLbl);  p2.add(nameTxt);
        p2.add(emailLbl); p2.add(emailTxt);
        p3.add(submitBtn);
        p3.add(clearBtn);
        p1.add(p2); // form inputs
        p1.add(p3); // buttons

        // ─── รวมพาเนลฝั่งซ้าย (p5) ───────────────────────────────
        //  เทียบ Final_7: p5.add(p6, NORTH); p5.add(p1, SOUTH)
        p6.add(titleLbl);
        p5.add(p6, BorderLayout.NORTH);
        p5.add(p1, BorderLayout.SOUTH);

        // ─── ใส่ลงใน Main Panel ───────────────────────────────────
        //  เทียบ Final_7: p.add(toptxt,NORTH); p.add(p5,WEST); p.add(p4,EAST)
        p.add(toptxt, BorderLayout.NORTH);  // ช่องด้านบน
        p.add(p5,     BorderLayout.WEST);   // form ด้านซ้าย
        p.add(p4,     BorderLayout.EAST);   // checkbox ด้านขวา

        // ─── ส่วนที่ 5: แสดงผลหน้าต่าง ───────────────────────────
        //  เทียบ Final_7: f.add(p); f.setDefaultCloseOperation...
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 260);           // ใกล้เคียงกับ Final_7 (455, 250)
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
