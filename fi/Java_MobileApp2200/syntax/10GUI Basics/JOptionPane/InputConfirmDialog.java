/*
 * ชื่อไฟล์: InputConfirmDialog.java
 * หัวข้อ: JOptionPane — Input Dialog & Confirm Dialog
 * คำอธิบาย: showInputDialog  = รับข้อมูลจากผู้ใช้ (คืน String)
 *           showConfirmDialog = ถามยืนยัน Yes/No/Cancel (คืน int)
 * ตัวอย่างการใช้งาน: รับชื่อ, รับอายุ, ถามก่อนออกจากโปรแกรม
 */

import javax.swing.JOptionPane;

public class InputConfirmDialog {
    public static void main(String[] args) {
        // === Input Dialog ===
        // 1. แบบพื้นฐาน
        String name = JOptionPane.showInputDialog("กรุณากรอกชื่อ:");
        // คืน String หรือ null (ถ้ากด Cancel)

        if (name != null && !name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "สวัสดี " + name + "!");
        }

        // 2. แบบกำหนด Title + ค่าเริ่มต้น
        String ageStr = JOptionPane.showInputDialog(null,
            "กรุณากรอกอายุ:",       // ข้อความ
            "ข้อมูลส่วนตัว",        // Title
            JOptionPane.QUESTION_MESSAGE);

        // แปลง String → int (ต้องระวัง null + NumberFormat)
        if (ageStr != null) {
            try {
                int age = Integer.parseInt(ageStr);
                JOptionPane.showMessageDialog(null, "อายุ: " + age + " ปี");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                    "กรุณากรอกตัวเลข!", "ข้อผิดพลาด",
                    JOptionPane.ERROR_MESSAGE);
            }
        }

        // === Confirm Dialog ===
        // 3. ถามยืนยัน Yes/No
        int result = JOptionPane.showConfirmDialog(null,
            "ต้องการออกจากโปรแกรมหรือไม่?",
            "ยืนยัน",
            JOptionPane.YES_NO_OPTION);     // แสดงปุ่ม Yes / No

        // ค่าที่คืน: YES_OPTION=0, NO_OPTION=1, CANCEL_OPTION=2
        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "ลาก่อน!");
        } else {
            JOptionPane.showMessageDialog(null, "ยังอยู่!");
        }

        // 4. Yes/No/Cancel
        int choice = JOptionPane.showConfirmDialog(null,
            "ต้องการบันทึกก่อนปิดหรือไม่?",
            "บันทึก",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE);

        switch (choice) {
            case JOptionPane.YES_OPTION:    System.out.println("บันทึกแล้วปิด"); break;
            case JOptionPane.NO_OPTION:     System.out.println("ปิดโดยไม่บันทึก"); break;
            case JOptionPane.CANCEL_OPTION: System.out.println("ยกเลิก"); break;
        }
    }
}

/*
 * หมายเหตุ:
 * - showInputDialog คืน String เสมอ → ต้อง parse เป็นชนิดอื่นเอง
 * - กด Cancel → คืน null (ต้องเช็คก่อนใช้งาน)
 * - showConfirmDialog คืน int → เปรียบเทียบกับ YES_OPTION, NO_OPTION
 * - ใช้ switch-case กับ Confirm Dialog ได้สะดวก
 */
