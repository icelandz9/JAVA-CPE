import javax.swing.*;
import java.awt.*;

public class Gui {
    public static void main(String[] args) {
        // สร้าง JFrame หลัก
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new GridLayout(6, 2, 10, 10));

        // สร้าง Components
        JButton jbtOK = new JButton("OK");
        JLabel jlblName = new JLabel("Enter your name: ");
        JTextField jtfName = new JTextField("Type Name Here");
        JCheckBox jchkBold = new JCheckBox("Bold");
        JRadioButton jrbRed = new JRadioButton("Red");
        JComboBox<String> jcboColor = new JComboBox<>(new String[]{"Red", "Green", "Blue"});

        // เพิ่ม Components เข้า Frame
        frame.add(jlblName);
        frame.add(jtfName);
        frame.add(new JLabel("Bold option:"));
        frame.add(jchkBold);
        frame.add(new JLabel("Color radio:"));
        frame.add(jrbRed);
        frame.add(new JLabel("Color combo:"));
        frame.add(jcboColor);
        frame.add(new JLabel(""));
        frame.add(jbtOK);

        // แสดงหน้าต่าง
        frame.setLocationRelativeTo(null); // จัดให้อยู่กลางจอ
        frame.setVisible(true);
    }
}