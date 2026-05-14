import javax.swing.*; //ใช้สร้าง UI components เช่น JFrame, JButton, JLabel, JTextField
import java.awt.*; //ใช้จัดการ layout, สี, font เช่น Color, Font, FlowLayout, BorderLayout
import java.awt.event.*; //ใช้จัดการ user interaction เช่น ActionListener, MouseListener, KeyListener

public class Click extends JFrame { // ✅ ต้อง extends JFrame
    public Click() { // ✅ ชื่อตรงกับ class
        JButton btn = new JButton("Cluck me");
        btn.setBackground(Color.BLUE);
        btn.addActionListener(e -> {
            System.out.println("คลิกแล้ว!");
        });
        add(btn);

        setSize(300, 200); // กำหนดขนาดหน้าต่าง
        setVisible(true); // แสดงหน้าต่าง
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ปิดโปรแกรมเมื่อกด X
    }

    public static void main(String[] args) {
        new Click(); // สร้าง object เพื่อรันโปรแกรม
    }
}
