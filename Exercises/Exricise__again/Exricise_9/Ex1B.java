import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1B extends JFrame {

    public Ex1B() {
        setLayout(new BorderLayout()); // แบ่ง layout เป็น North/South/Center

        setTitle("Handle Event");
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // === Panel บน: Name + TextField ===
        JPanel topPanel = new JPanel(new BorderLayout()); // จัด component ชิดซ้าย
        JLabel nameLabel = new JLabel("Name");
        final JTextField nameField = new JTextField();
        topPanel.add(nameLabel, BorderLayout.WEST); // BorderLayout.WEST คือ Label อยู่ซ้าย
        topPanel.add(nameField, BorderLayout.CENTER); // TextField อยู่กลาง ยืดเต็มความกว้าง

        // === Panel ล่าง: 3 ปุ่ม ===
        JPanel bottomPanel = new JPanel(new GridLayout(1, 3)); // 1 แถว 3 คอลัมน์
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JButton exitButton = new JButton("Exit");
        bottomPanel.add(okButton);
        bottomPanel.add(cancelButton);
        bottomPanel.add(exitButton);

        // === เพิ่มลง JFrame ===
        add(topPanel, BorderLayout.NORTH); // วาง Panel บนไว้ด้านบน
        add(bottomPanel, BorderLayout.SOUTH); // วาง Panel บนไว้ด้านล่าง

        okButton.addActionListener( // บอกไปที่ okButton ว่าจะเกิด event
                new ActionListener() { // สร้าง object กำหนด event
                    public void actionPerformed(ActionEvent e) { // สร้าง public มาไว้สำหรับทำงาน object
                        System.out.println("\nOK button click"); // สิ่งที่ จะเกิดเมื่อ ทำงานแล้ว
                        System.out.print(nameField.getText()); // เมื่อใส่ข้อความแล้วจะเกิดขึ้น
                    }
                });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText(" ");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);

    }

    public static void main(String[] args) {
        new Ex1B();
    }
}