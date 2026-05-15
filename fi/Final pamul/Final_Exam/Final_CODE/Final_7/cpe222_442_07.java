package Final_Exam.Final_CODE.Final_7;

import java.awt.*;
import javax.swing.*;

public class cpe222_442_07 {
    /**
     * จุดเริ่มต้นของโปรแกรม — สร้างหน้าต่าง Login พร้อมแป้นตัวเลข
     *
     * @param args อาร์กิวเมนต์จาก command line
     */
    public static void main(String args[]) {
        // ─── ส่วนที่ 1: การประกาศตัวแปรคอมโพเนนต์ ───────────────────────────
        JFrame f;
        JPanel p;
        JLabel mlbl, ulbl, pwlbl;
        JTextField usertxt, toptxt;
        JPasswordField pwtxt;
        JButton signbtn, ccbtn, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bd, be;

        // กำหนดฟอนต์สำหรับใช้งาน
        Font fn1 = new Font("Tahoma", Font.BOLD, 14);
        Font fn2 = new Font("Courier New", Font.BOLD, 16);

        // ─── ส่วนที่ 2: การสร้างอินสแตนซ์ของคอมโพเนนต์ ────────────────────────
        f = new JFrame("CPE 222: Frame Layout");
        p = new JPanel();
        p.setLayout(new BorderLayout());

        mlbl = new JLabel("*** กรุณาลงชื่อเข้าใช้งานระบบ ***");
        ulbl = new JLabel("Username");
        pwlbl = new JLabel("Password");
        usertxt = new JTextField(10);
        toptxt = new JTextField(10);
        pwtxt = new JPasswordField(10);
        signbtn = new JButton("Log in");
        ccbtn = new JButton("Cancel");

        // ปุ่มตัวเลข
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
        bd = new JButton(".");
        be = new JButton("EXP");

        // ─── ส่วนที่ 3: การตั้งค่ารูปแบบ (Style) ──────────────────────────────
        mlbl.setForeground(Color.red);
        mlbl.setFont(fn1);
        ulbl.setFont(fn2);
        pwlbl.setFont(fn2);
        usertxt.setFont(fn1);
        pwtxt.setFont(fn1);
        signbtn.setFont(fn2);
        ccbtn.setFont(fn2);

        // ─── ส่วนที่ 4: การจัดกลุ่มพาเนลและเลย์เอาต์ (Layout) ────────────────────
        JPanel p1 = new JPanel(new GridLayout(2, 1)); // แผงควบคุม Login
        JPanel p2 = new JPanel(new GridLayout(2, 2)); // ช่องรับ Username/Password
        JPanel p3 = new JPanel(new FlowLayout()); // ปุ่ม Login/Cancel
        JPanel p4 = new JPanel(new GridLayout(4, 3)); // แป้นตัวเลข (Numpad)
        JPanel p5 = new JPanel(new BorderLayout()); // พาเนลฝั่งซ้าย
        JPanel p6 = new JPanel(new FlowLayout()); // พาเนลข้อความเตือน

        // เพิ่มปุ่มลงในแป้นตัวเลข
        p4.add(b1);
        p4.add(b2);
        p4.add(b3);
        p4.add(b4);
        p4.add(b5);
        p4.add(b6);
        p4.add(b7);
        p4.add(b8);
        p4.add(b9);
        p4.add(b0);
        p4.add(bd);
        p4.add(be);

        // ประกอบส่วน Login
        p2.add(ulbl);
        p2.add(usertxt);
        p2.add(pwlbl);
        p2.add(pwtxt);
        p3.add(signbtn);
        p3.add(ccbtn);
        p1.add(p2);
        p1.add(p3);

        // รวมพาเนลต่าง ๆ เข้าด้วยกัน
        p6.add(mlbl);
        p5.add(p6, BorderLayout.NORTH);
        p5.add(p1, BorderLayout.SOUTH);

        // จัดวางลงในพาเนลหลัก
        p.add(toptxt, BorderLayout.NORTH);
        p.add(p5, BorderLayout.WEST);
        p.add(p4, BorderLayout.EAST);

        // ─── ส่วนที่ 5: แสดงผลหน้าต่าง ────────────────────────────────────
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(455, 250);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}