package lectures.comment;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI_md {
    /*
     * Top-Level (เช่น JFrame ซึ่งเป็นหน้าต่างหลักที่ต้องมีเสมอเพื่อแสดงผล)
     * Non-top Level (เช่น JPanel ที่ลอยตัวเดี่ยวๆ ไม่ได้ ต้องนำไปแปะบน Container
     * อื่นใช้สำหรับจัดกลุ่มคอมโพเนนต์)
     * 
     * Simple Component: คอมโพเนนต์ใช้งานทั่วไป เช่น JButton (ปุ่มกด), JLabel
     * (ป้ายข้อความ), JCheckBox, JComboBox และ JRadioButton
     * 
     * Text Component: คอมโพเนนต์สำหรับข้อความ อาจารย์เน้นย้ำว่า JTextField
     * เป็นส่วนที่สำคัญมาก เพราะเป็นช่องทางรับข้อมูลจากผู้ใช้เพื่อนำไปคำนวณหรือสร้าง
     * Event ต่อไป
     * และมี JPasswordField ที่ใช้รับรหัสผ่าน
     * โดยจะแสดงผลเป็นเครื่องหมายดอกจันเพื่อความปลอดภัย
     */
    // Create a button with text OK
    JButton jbtOK = new JButton("OK");

    // Create a label with text "Enter your name: "
    JLabel jlblName = new JLabel("Enter your name: ");

    // Create a text field with text "Type Name Here"
    JTextField jtfName = new JTextField("Type Name Here");

    // Create a check box with text bold
    JCheckBox jchkBold = new JCheckBox("Bold");

    // Create a radio button with text red
    JRadioButton jrbRed = new JRadioButton("Red");

    // Create a combo box with choices red, green, and blue
    JComboBox jcboColor = new JComboBox(new String[] { "Red", "Green", "Blue" });

    public static void main(String[] args) {

    }
}
