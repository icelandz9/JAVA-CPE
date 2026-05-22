package Final_Exam.Final_CODE.Final_7;

import java.awt.*;
import javax.swing.*;

// ══════════════════════════════════════════════════════════════
//  Layout_LoanForm.java — ฟอร์มคำนวณเงินกู้ (ระดับ Final_7)
//
//  โจทย์จำลอง: อาจารย์ให้ Loan.java มาแล้วให้วาง Layout GUI
//  (แบบที่ไม่ต้องมี event — layout อย่างเดียว เหมือน Final_7)
//
//  Layout หลัก (BorderLayout):
//    NORTH  = displayTxt  (ช่องแสดงผลด้านบน)
//    WEST   = p5          (title + form)
//    EAST   = p4          (แป้นตัวเลข GridLayout 4x3)
//
//  form (p2 = GridLayout 3x2):
//    - Interest Rate | TextField
//    - Years         | TextField
//    - Loan Amount   | TextField
//
//  ปุ่ม: Calculate, Clear (เหมือน Sign in, Cancel ใน Final_7)
// ══════════════════════════════════════════════════════════════

public class Layout_LoanForm {
    public static void main(String[] args) {

        // ─── ส่วนที่ 1: ประกาศตัวแปร (เหมือน Final_7 บรรทัดต่อบรรทัด) ─
        JFrame f;
        JPanel p;
        JLabel  titleLbl, rateLbl, yearsLbl, amountLbl;
        JTextField rateTxt, yearsTxt, amountTxt, displayTxt;
        JButton calcBtn, clearBtn;
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bDot, bDel;

        // Font (เหมือน Final_7)
        Font fn1 = new Font("Tahoma",      Font.BOLD, 14);
        Font fn2 = new Font("Courier New", Font.BOLD, 16);

        // ─── ส่วนที่ 2: สร้าง instance ───────────────────────────
        f          = new JFrame("CPE 222: Loan Calculator Layout");
        p          = new JPanel();
        p.setLayout(new BorderLayout());

        titleLbl   = new JLabel("*** กรอกข้อมูลเงินกู้ ***");
        rateLbl    = new JLabel("Interest Rate (%)");
        yearsLbl   = new JLabel("Years");
        amountLbl  = new JLabel("Loan Amount");
        rateTxt    = new JTextField(10);
        yearsTxt   = new JTextField(10);
        amountTxt  = new JTextField(10);
        displayTxt = new JTextField(10);   // ช่องด้านบน
        calcBtn    = new JButton("Calculate");
        clearBtn   = new JButton("Clear");

        // ปุ่มตัวเลข (เหมือน b1-b0, bd, be ใน Final_7)
        b1   = new JButton("1");
        b2   = new JButton("2");
        b3   = new JButton("3");
        b4   = new JButton("4");
        b5   = new JButton("5");
        b6   = new JButton("6");
        b7   = new JButton("7");
        b8   = new JButton("8");
        b9   = new JButton("9");
        b0   = new JButton("0");
        bDot = new JButton(".");
        bDel = new JButton("DEL");

        // ─── ส่วนที่ 3: ตั้งค่า Style ────────────────────────────
        titleLbl.setForeground(Color.RED);
        titleLbl.setFont(fn1);
        rateLbl.setFont(fn2);
        yearsLbl.setFont(fn2);
        amountLbl.setFont(fn2);
        rateTxt.setFont(fn1);
        yearsTxt.setFont(fn1);
        amountTxt.setFont(fn1);
        calcBtn.setFont(fn2);
        clearBtn.setFont(fn2);

        // ─── ส่วนที่ 4: สร้าง Panel (เหมือน Final_7 ชื่อ p1-p6) ──
        JPanel p1 = new JPanel(new GridLayout(2, 1));  // form + buttons
        JPanel p2 = new JPanel(new GridLayout(3, 2));  // label + field 3 คู่
        JPanel p3 = new JPanel(new FlowLayout());      // ปุ่ม Calculate/Clear
        JPanel p4 = new JPanel(new GridLayout(4, 3));  // แป้นตัวเลข (EAST)
        JPanel p5 = new JPanel(new BorderLayout());    // ฝั่งซ้าย
        JPanel p6 = new JPanel(new FlowLayout());      // header

        // เพิ่มปุ่มลงแป้นตัวเลข (เหมือน Final_7)
        p4.add(b1);   p4.add(b2);   p4.add(b3);
        p4.add(b4);   p4.add(b5);   p4.add(b6);
        p4.add(b7);   p4.add(b8);   p4.add(b9);
        p4.add(b0);   p4.add(bDot); p4.add(bDel);

        // ประกอบ form (เหมือน Final_7 แต่ 3 คู่แทน 2 คู่)
        p2.add(rateLbl);   p2.add(rateTxt);
        p2.add(yearsLbl);  p2.add(yearsTxt);
        p2.add(amountLbl); p2.add(amountTxt);
        p3.add(calcBtn);
        p3.add(clearBtn);
        p1.add(p2);
        p1.add(p3);

        // รวมฝั่งซ้าย (เหมือน Final_7 ทุกบรรทัด)
        p6.add(titleLbl);
        p5.add(p6, BorderLayout.NORTH);
        p5.add(p1, BorderLayout.SOUTH);

        // ─── ส่วนที่ 5: วางลง Panel หลัก (เหมือน Final_7 ทุกบรรทัด) ─
        p.add(displayTxt, BorderLayout.NORTH);
        p.add(p5,         BorderLayout.WEST);
        p.add(p4,         BorderLayout.EAST);

        // ─── ส่วนที่ 6: แสดงหน้าต่าง ─────────────────────────────
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 270);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
