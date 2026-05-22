import java.io.*;

public class IOExceptType {
    public static void main(String[] args) {
        FileInputStream f_in = null;
        File fname = new File("d:\\ByteData.txt"); // สร้างไฟล์แล้วตั้งชื่อเก็บไว้ที่ dirve d

        try {
            f_in = new FileInputStream(fname); // FileInputStream อ่านไฟล์
            System.out.println("Read Data from File : " + fname);

            int c;
            while ((c = f_in.read()) != -1) {
                System.out.println(c);
            }

        } catch (IOException e) { // IOException คือตรวจหาชื่อไฟล์ที่หาไม่เจอ ไฟล์ ByteData.txt ไม่เจอจะขึ้น
                                  // ข้อผิดพลาด ถ้าเจอจะไม่ขึ้นอะไร
            System.out.println(e + "\nหมายถึง \"ข้อผิดพลาด" + "ที่เกิดจากไม่พบไฟล์ข้อมูลที่ต้องการ\"");

        } finally {
            try {
                if (f_in != null) {
                    f_in.close(); // ปิดไฟล์หลังใช้งานเสมอ
                }
            } catch (IOException e) {
                System.out.println("ปิดไฟล์ไม่สำเร็จ: " + e);
            }
        }
    }
}