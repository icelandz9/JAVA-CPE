import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Character_Stream {
    public static void main(String[] args) {
        File filename = new File("d:\\CharData.txt"); // กำหนดไฟล์และชื่อให้กับเก็บไว้ที่ไหน
        FileWriter f_write = null; // เตรียมตัวแปร"สำหรับเขียน"ไฟล์แบบ Character

        // ส่วนเขียนไฟล์
        try {
            String c = "*";
            f_write = new FileWriter(filename, true); // เปิดไฟล์เพื่อเขียน true → ต่อท้ายข้อมูลเดิม (Append Mode) false → ทับข้อมูลเดิม
            f_write.write(c); // เขียนตัวอักษร * ลงไฟล์
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (f_write != null)
                    f_write.close(); // finally อยู่คู่กับ try เขียนไฟล์ → ปิดไฟล์เสมอ
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        // ส่วนอ่านไฟล์
        FileReader f_read = null; // เตรียมตัวแปร"สำหรับอ่าน"ไฟล์แบบ Character
        try {
            f_read = new FileReader(filename); // เปิดไฟล์เพื่ออ่าน
            int c;
            while ((c = f_read.read()) != -1) // f_read.read() → อ่าน 1 ตัวอักษร แปลงเป็นตัวเลข Unicode | -1 คือ หมดไฟล์แล้วหยุด
                System.out.println(c);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (f_read != null)
                    f_read.close(); // finally อยู่คู่กับ try อ่านไฟล์ → ปิดไฟล์เสมอ
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}