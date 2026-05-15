import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise9_01a {

    public Exercise9_01a() {

        // ─── ส่วนที่ 1: สร้างและตั้งค่า JFrame หลัก ────────────────────────────────
        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout()); // กำหนด Layout แบบ FlowLayout
        frame.setTitle("Handle Event"); // กำหนดชื่อหน้าต่าง
        frame.setSize(500, 100); // กำหนดขนาดหน้าต่าง กว้าง x สูง
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // กด X แล้วปิดโปรแกรม

        // ─── ส่วนที่ 2: สร้าง Component ต่าง ๆ ─────────────────────────────────────
        JLabel nameLabel = new JLabel("Name"); // สร้าง Label แสดงคำว่า "Name"
        final JTextField nameField = new JTextField(20); // สร้าง TextField ขนาด 20 ช่อง
        JButton okButton = new JButton("OK"); // สร้างปุ่ม OK
        JButton cancelButton = new JButton("Cancel"); // สร้างปุ่ม Cancel
        JButton exitButton = new JButton("Exit"); // สร้างปุ่ม Exit

        // ─── ส่วนที่ 3: เพิ่ม Component ลงใน JFrame ────────────────────────────────
        frame.add(nameLabel); // เพิ่ม Label ลงใน Frame
        frame.add(nameField); // เพิ่ม TextField ลงใน Frame
        frame.add(okButton); // เพิ่มปุ่ม OK ลงใน Frame
        frame.add(cancelButton); // เพิ่มปุ่ม Cancel ลงใน Frame
        frame.add(exitButton); // เพิ่มปุ่ม Exit ลงใน Frame

        // ─── ส่วนที่ 4: ActionListener ───────────────────────────────────────────
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK button clicked"); // แสดงข้อความเมื่อกดปุ่ม OK
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText(""); // ล้างข้อความใน TextField เมื่อกดปุ่ม Cancel
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // ปิดโปรแกรมเมื่อกดปุ่ม Exit
            }
        });

        // ─── ส่วนที่ 5: แสดงหน้าต่าง ────────────────────────────────────────────────
        frame.setVisible(true); // แสดงหน้าต่าง
    }

    // ─── จุดเริ่มต้นของโปรแกรม ──────────────────────────────────────────────────
    public static void main(String[] args) {
        new Exercise9_01a(); // สร้าง instance เพื่อแสดง GUI
    }
}