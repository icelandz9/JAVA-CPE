import java.io.*;
import java.util.Scanner;

public class ByteTest {
    public static void main(String[] args) {
        String fname = "d:\\ByteData.txt";
        FileOutputStream f_out = null;

        //ส่วนที่ 1 
        try {
            f_out = new FileOutputStream(fname); // เปิดไฟล์เพื่อ เขียนข้อมูล
            int c;
            System.out.println("Read from KB");
            System.out.println("===========================");
            do {
                System.out.print("Enter Data : ");
                c = new Scanner(System.in).nextInt();
                if (c != 0)
                    f_out.write(c);
            } while (c != 0);
        } catch (IOException e) { //IOException อ่าน/เขียนไฟล์มีปัญหา
            System.out.println(e);
        } finally {
            try {
                if (f_out != null)
                    f_out.close(); // ปิดไฟล์และแจ้งว่าบันทึกสำเร็จ
                System.out.println("Data are saved to File : \n" + fname);
                System.out.println("===========================");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        // ส่วนที่ 2
        FileInputStream f_in = null;
        try {
            f_in = new FileInputStream(fname); // เปิดไฟล์เพื่อ อ่านข้อมูล
            System.out.println("Read Data from File : \n" + fname);
            System.out.println("===========================");
            int c;
            while ((c = f_in.read()) != -1) // -1 หมดไฟล์แล้วหยุด
                System.out.printf("%-3d", c); // %-3d แสดงตัวเลขชิดซ้าย กว้าง 3 ช่อง
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (f_in != null)
                    f_in.close();
                System.out.println("===========================");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}