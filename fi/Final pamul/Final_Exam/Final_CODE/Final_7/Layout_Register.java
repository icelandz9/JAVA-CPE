package Final_Exam.Final_CODE.Final_7;

import java.awt.*;
import javax.swing.*;

// ══════════════════════════════════════════════════════════════
//  Layout_Register.java — ฟอร์มลงทะเบียนนักศึกษา (ระดับ Final_7)
//
//  Layout หลัก (BorderLayout):
//    NORTH  = toptxt       (ช่องค้นหา / แสดงข้อมูล)
//    CENTER = centerPanel  (ฟอร์มซ้าย + เมนูขวา)
//    (ไม่มี SOUTH)
//
//  centerPanel (GridLayout 1x2):
//    ซ้าย = formPanel  (label + field 4 คู่ + ปุ่ม)
//    ขวา  = menuPanel  (RadioButton เลือกคณะ)
//
//  เทคนิคใหม่ที่เพิ่มจาก Final_7:
//    - JRadioButton + ButtonGroup (มักออกสอบควบคู่กับ Layout)
//    - GridLayout ที่มี row มากกว่า 2 แถว
// ══════════════════════════════════════════════════════════════

public class Layout_Register {
    public static void main(String[] args) {

        // ─── ส่วนที่ 1: ประกาศตัวแปร ─────────────────────────────
        JFrame f;
        JPanel p;
        JLabel  titleLbl, idLbl, nameLbl, emailLbl, telLbl;
        JTextField idTxt, nameTxt, emailTxt, telTxt, searchTxt;
        JButton submitBtn, clearBtn;
        JRadioButton rb1, rb2, rb3, rb4;

        // Font
        Font fn1 = new Font("Tahoma",      Font.BOLD, 13);
        Font fn2 = new Font("Courier New", Font.BOLD, 14);

        // ─── ส่วนที่ 2: สร้าง instance ───────────────────────────
        f = new JFrame("CPE 222: Student Registration");
        p = new JPanel();
        p.setLayout(new BorderLayout());

        titleLbl  = new JLabel("*** กรอกข้อมูลนักศึกษาให้ครบถ้วน ***");
        idLbl     = new JLabel("Student ID");
        nameLbl   = new JLabel("Full Name");
        emailLbl  = new JLabel("Email");
        telLbl    = new JLabel("Tel");
        idTxt     = new JTextField(10);
        nameTxt   = new JTextField(10);
        emailTxt  = new JTextField(10);
        telTxt    = new JTextField(10);
        searchTxt = new JTextField(10);  // ช่องด้านบน (เหมือน toptxt ใน Final_7)
        submitBtn = new JButton("Submit");
        clearBtn  = new JButton("Clear");

        // RadioButton เลือกคณะ (แทน Numpad ของ Final_7)
        rb1 = new JRadioButton("Engineering");
        rb2 = new JRadioButton("Science");
        rb3 = new JRadioButton("Business");
        rb4 = new JRadioButton("Arts");

        // ─── ส่วนที่ 3: ตั้งค่า Style ────────────────────────────
        titleLbl.setForeground(Color.BLUE);
        titleLbl.setFont(fn1);
        idLbl.setFont(fn2);
        nameLbl.setFont(fn2);
        emailLbl.setFont(fn2);
        telLbl.setFont(fn2);
        submitBtn.setFont(fn2);
        clearBtn.setFont(fn2);

        // ─── ส่วนที่ 4: ButtonGroup (ต้องผูก RadioButton เข้ากลุ่ม) ─
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        group.add(rb4);

        // ─── ส่วนที่ 5: สร้าง Panel ──────────────────────────────
        JPanel p1 = new JPanel(new GridLayout(2, 1));   // form + buttons
        JPanel p2 = new JPanel(new GridLayout(4, 2));   // label + field 4 คู่
        JPanel p3 = new JPanel(new FlowLayout());       // ปุ่ม Submit/Clear
        JPanel p4 = new JPanel(new GridLayout(4, 1));   // RadioButton (EAST)
        JPanel p5 = new JPanel(new BorderLayout());     // ฝั่งซ้าย
        JPanel p6 = new JPanel(new FlowLayout());       // header

        // ─── เพิ่ม component ลง Panel ────────────────────────────
        // p2: form (4 แถว 2 คอลัมน์)
        p2.add(idLbl);    p2.add(idTxt);
        p2.add(nameLbl);  p2.add(nameTxt);
        p2.add(emailLbl); p2.add(emailTxt);
        p2.add(telLbl);   p2.add(telTxt);

        // p3: ปุ่ม
        p3.add(submitBtn);
        p3.add(clearBtn);

        // p4: RadioButton คณะ (ขวา — เทียบ Numpad ใน Final_7)
        p4.add(rb1);
        p4.add(rb2);
        p4.add(rb3);
        p4.add(rb4);

        // ประกอบฝั่งซ้าย
        p1.add(p2);
        p1.add(p3);
        p6.add(titleLbl);
        p5.add(p6, BorderLayout.NORTH);
        p5.add(p1, BorderLayout.SOUTH);

        // ─── ส่วนที่ 6: วางลง Panel หลัก ─────────────────────────
        p.add(searchTxt, BorderLayout.NORTH);  // ช่องค้นหา
        p.add(p5,        BorderLayout.WEST);   // form ซ้าย
        p.add(p4,        BorderLayout.EAST);   // RadioButton ขวา

        // ─── ส่วนที่ 7: แสดงหน้าต่าง ─────────────────────────────
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(470, 280);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
