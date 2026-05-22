import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex8_1 {
    public static void main(String[] args) {
        File filename = new File("d:\\ByteData.txt"); //สร้างไฟล์เก็นไว้ Drive D
        FileInputStream f_in = null; // เตรียมตัวแปรสำหรับรับข้อมูลจากไฟล์ (ยังไม่เปิดไฟล์)
        try {
            f_in = new FileInputStream(filename); // เปิดไฟล์จริงๆ พร้อมอ่านข้อมูล 
            int c;
            while ((c = f_in.read()) != -1)
                System.out.println(c);
            // f_in.read() → อ่าน byte แล้วเก็บในตัวแปร c
            // != -1 → ถ้าได้ค่า -1 แปลว่าอ่านจบไฟล์แล้ว หยุด
            /// System.out.println(c) → แสดงค่าตัวเลข ASCII
        } catch (IOException e) { //ถ้าเกิดปัญหา เช่น ไม่พบไฟล์ → แสดง error แทนที่จะพัง
            System.out.println(e); 
        }
    }
}