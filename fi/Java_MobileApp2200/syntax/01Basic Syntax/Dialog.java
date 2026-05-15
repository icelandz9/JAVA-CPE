import javax.swing.JOptionPane;

public class Dialog {
    public static void main(String[] args) {
        // JOptionPane คือคลาสสำหรับสร้างหน้าต่าง Dialog แบบ Pop-up (GUI) ง่ายๆ
        // โดยไม่ต้องเขียนโค้ดสร้างหน้าต่าง JFrame เองทั้งหน้า

        // 1. Show Message Dialog: หน้าต่างแจ้งเตือนธรรมดา (มีแค่ปุ่ม OK)
        // ข้อความใน "" ต้องเป็นภาษาอังกฤษเพื่อป้องกันปัญหาการแสดงผล
        JOptionPane.showMessageDialog(null, "Welcome to the Program!", "Greeting", JOptionPane.INFORMATION_MESSAGE);

        // 2. Show Input Dialog: หน้าต่างรับค่าจากผู้ใช้ (คืนค่าเป็น String)
        String name = JOptionPane.showInputDialog(null, "What is your name?", "Input Name",
                JOptionPane.QUESTION_MESSAGE);

        // ตรวจสอบว่าผู้ใช้กด Cancel หรือไม่ (ถ้า Cancel จะได้ null)
        if (name != null && !name.isEmpty()) {

            // 3. Show Confirm Dialog: หน้าต่างถาม ยืนยัน (Yes/No/Cancel)
            int choice = JOptionPane.showConfirmDialog(null, "Is your name " + name + "?", "Confirm",
                    JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                // กรณีตอบ Yes
                JOptionPane.showMessageDialog(null, "Hello " + name + "!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // กรณีตอบ No
                JOptionPane.showMessageDialog(null, "Oh! Did you misspell your name?", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // กรณีผู้ใช้กด Cancel หรือปิดหน้าต่าง
            System.out.println("User canceled the input.");
        }
    }
}
