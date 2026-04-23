import java.io.*;
import java.lang.Integer;

public class FinallyTest {
    public static int num;

    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in); // แปลง byte จาก keyboard เป็นตัวอักษร
        BufferedReader in = new BufferedReader(ir); // เก็บข้อมูลชั่วคราว ทำให้อ่านได้เร็วขึ้น
        try {   
            System.out.print("Please input number : ");
            num = Integer.parseInt(in.readLine());
        } catch (IOException e1) { // อ่าน/เขียนไฟล์มีปัญหา
            System.out.print("Keyboard input Error");
        } catch (NumberFormatException e2) { // รับได้แค่ตัวเลข
            System.out.println("Input error, please input number only");
        } finally {
            System.out.println("Important : You must input number only");
        }
        System.out.println("Your number is " + num);
    }
}