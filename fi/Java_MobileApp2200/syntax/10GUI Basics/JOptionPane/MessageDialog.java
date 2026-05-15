/*
 * ชื่อไฟล์: MessageDialog.java
 * หัวข้อ: JOptionPane — Message Dialog (กล่องข้อความ)
 * คำอธิบาย: แสดงกล่องข้อความ (Dialog Box) ด้วย showMessageDialog
 *           มี 4 รูปแบบ: ธรรมดา, Information, Warning, Error
 * ตัวอย่างการใช้งาน: แจ้งเตือนผู้ใช้, แสดงผลลัพธ์
 */

import javax.swing.JOptionPane;

public class MessageDialog {
    public static void main(String[] args) {
        // 1. Message Dialog แบบพื้นฐาน (ไม่มี icon)
        JOptionPane.showMessageDialog(null, "สวัสดี Java GUI!");
        // null = ไม่มี parent frame
        // "..." = ข้อความที่แสดง

        // 2. Message Dialog แบบกำหนด Title และ Icon
        // INFORMATION_MESSAGE — ไอคอน i (ข้อมูลทั่วไป)
        JOptionPane.showMessageDialog(null,
            "การดำเนินการเสร็จสิ้น",
            "สำเร็จ",                           // Title
            JOptionPane.INFORMATION_MESSAGE);    // Icon type

        // WARNING_MESSAGE — ไอคอน ! (คำเตือน)
        JOptionPane.showMessageDialog(null,
            "กรุณาบันทึกงานก่อนปิดโปรแกรม",
            "คำเตือน",
            JOptionPane.WARNING_MESSAGE);

        // ERROR_MESSAGE — ไอคอน X (ข้อผิดพลาด)
        JOptionPane.showMessageDialog(null,
            "ไม่สามารถเชื่อมต่อฐานข้อมูลได้",
            "ข้อผิดพลาด",
            JOptionPane.ERROR_MESSAGE);

        // PLAIN_MESSAGE — ไม่มี icon
        JOptionPane.showMessageDialog(null,
            "ข้อความธรรมดาไม่มีไอคอน",
            "แจ้งเตือน",
            JOptionPane.PLAIN_MESSAGE);
    }
}

/*
 * ผลลัพธ์: แสดง Dialog Box 5 กล่อง ทีละกล่องตามลำดับ
 *
 * หมายเหตุ:
 * - ต้อง import javax.swing.JOptionPane;
 * - null ตัวแรกคือ parent component (null = จอกลาง)
 * - Icon types: INFORMATION_MESSAGE, WARNING_MESSAGE,
 *   ERROR_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
 * - โปรแกรมจะ "หยุดรอ" จนกว่าผู้ใช้จะกด OK
 */
