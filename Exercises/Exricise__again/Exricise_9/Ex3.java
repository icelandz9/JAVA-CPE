import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class Ex3 extends JFrame {
    public Ex3() {
        setTitle("Exercise08_v2_02");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2)); // 2 แถว 2 คอลัมน์ 
        // ถ้าจะมีระยะห่างระหว่างรูปให้ใส่เลขด้านหลังเช่น 5, 5 คือ ระยะห่าง 5px ระหว่างเซลล์

        // เพิ่ม JLabel ที่แสดงรูปภาพลงใน JPanel พร้อมกรอบ
        panel.add(createLableWithImage("uk_flag.png"));
        panel.add(createLableWithImage("france_flag.png"));
        panel.add(createLableWithImage("germany_flag.png"));
        panel.add(createLableWithImage("denmark_flag.png"));

         // เพิ่ม JPanel ลงใน JFrame
        add(panel);

        setVisible(true);
    }

    // เมธอดช่วยในการสร้าง JLabel ที่มีรูปภาพและกรอบ
    private JLabel createLableWithImage(String imaString) { // String imaString รับชื่อไฟล์รูปเข้ามา เช่น "uk_flag.png"
        ImageIcon icon = new ImageIcon(imaString); // โหลดรูปจากไฟล์
        JLabel label = new JLabel(icon); // สร้าง JLabel แล้วเอารูปใส่เข้าไป
        label.setBorder(new LineBorder(Color.BLUE, 2)); // ใส่กรอบให้ JLabel
        return label;
    }

    public static void main(String[] args) {
        new Ex3();
    }
}
