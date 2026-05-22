import javax.swing.*; //ใช้สร้าง UI components เช่น JFrame, JButton, JLabel, JTextField
import java.awt.*; //ใช้จัดการ layout, สี, font เช่น Color, Font, FlowLayout, BorderLayout
import java.awt.event.*; //ใช้จัดการ user interaction เช่น ActionListener, MouseListener, KeyListener

public class Ex1A extends JFrame { // ✅ ต้อง extends JFrame
    public Ex1A() { // ✅ ชื่อตรงกับ class
        // FlowLayout จัด Layout เองจากซ้ายไปขวา
        setLayout(new FlowLayout()); // default: จัดกึ่งกลาง
        // // หรือกำหนดเพิ่มเติมได้
        // setLayout(new FlowLayout(FlowLayout.LEFT)); // ชิดซ้าย
        // setLayout(new FlowLayout(FlowLayout.RIGHT)); // ชิดขวา
        // setLayout(new FlowLayout(FlowLayout.CENTER)); // กึ่งกลาง (default)

        // // กำหนด gap ระหว่าง component
        // setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20)); // hgap=10, vgap=20

        setTitle("Handle Event"); // กำหนด ชื่อtitle
        setSize(500, 100); // กำหนดขนาด GUI
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // สั่งให้ ปิดโปรแกรมทั้งหมด เมื่อกด X

        JLabel nameLabel = new JLabel("Name"); // JLable สร้างกล่องมาเก็บข้อความ
        final JTextField nameField = new JTextField(20);
        // final คือการชี้ไปที่ชื่อไฟล์นี้เท่านั้น JTextField คือกล่องข้อความขนาด 1
        // บันทัด
        // new JTextField(20)สร้างช่องกว้างประมาณ 20 ตัวอักษร
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JButton exitButton = new JButton("Exit");

        // FlowLayout จะเรียง component ตามลำดับที่ add()
        add(nameLabel); // เริ่มก่อนจากซ้ายสุด
        add(nameField);
        add(okButton);
        add(cancelButton);
        add(exitButton); // สุดท้าย

        okButton.addActionListener( // บอกไปที่ okButton ว่าจะเกิด event
                new ActionListener() { // สร้าง object กำหนด event
                    public void actionPerformed(ActionEvent e) { // สร้าง public มาไว้สำหรับทำงาน object
                        System.out.println("OK button click"); // สิ่งที่ จะเกิดเมื่อ ทำงานแล้ว
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

        setVisible(true); // แสดงหน้าต่าง

    }

    public static void main(String[] args) {
        new Ex1A(); // สร้าง object เพื่อรันโปรแกรม
    }
}
