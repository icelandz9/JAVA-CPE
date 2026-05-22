/*
 * ชื่อไฟล์: InputOutput.java
 * หัวข้อ: การรับค่าและการแสดงผลข้อมูล (Input/Output)
 * คำอธิบาย: การใช้ Scanner เพื่อรับค่าจาก Keyboard และการใช้ System.out เพื่อแสดงผล
 * ตัวอย่างการใช้งาน: โปรแกรมคำนวณเบื้องต้น, แบบฟอร์มกรอกข้อมูล
 */

import java.util.Scanner; // นำเข้า class Scanner

public class InputOutput {
    public static void main(String[] args) {
        // สร้าง object Scanner เพื่อรับค่าจาก System.in (Keyboard)
        Scanner scanner = new Scanner(System.in);
        
                
        
        // 1. รับค่า String
        System.out.print("กรุณากรอกชื่อ: ");
        String name = scanner.nextLine(); // อ่านทั้งบรรทัด
        
        // 2. รับค่าจำนวนเต็ม (int)
        System.out.print("กรุณากรอกอายุ: ");
        int age = scanner.nextInt();
        
        // 3. รับค่าทศนิยม (double)
        System.out.print("กรุณากรอกเกรดเฉลี่ย: ");
        double gpax = scanner.nextDouble();
        
        // เคลียร์ buffer ของ scanner (ถ้าจะรับ String ต่อจาก number)
        // scanner.nextLine(); 
        
        System.out.println("\n-----------------------------");
        System.out.println("ข้อมูลที่ได้รับ:");
        
        // การแสดงผลแบบผสมข้อความกับตัวแปร
        System.out.println("ชื่อ: " + name);
        System.out.println("อายุ: " + age + " ปี");
        System.out.println("เกรดเฉลี่ย: " + gpax);
        
        // การใช้ printf (Formatted Output)
        // %s = String, %d = integer, %.2f = floating point 2 ตำแหน่ง
        System.out.printf("สรุป: คุณ %s อายุ %d ปี ได้เกรด %.2f\n", name, age, gpax);
        
        // ปิด scanner เมื่อเลิกใช้งาน
        scanner.close();
    }
}

/*
 * ผลลัพธ์ที่ได้ (ตัวอย่างการรัน):
 * === โปรแกรมลงทะเบียนเบื้องต้น ===
 * กรุณากรอกชื่อ: สมชาย ใจดี
 * กรุณากรอกอายุ: 20
 * กรุณากรอกเกรดเฉลี่ย: 3.50
 * 
 * -----------------------------
 * ข้อมูลที่ได้รับ:
 * ชื่อ: สมชาย ใจดี
 * อายุ: 20 ปี
 * เรดเฉลี่ย: 3.5
 * สรุป: คุณ สมชาย ใจดี อายุ 20 ปี ได้เกรด 3.50
 * 
 * หมายเหตุ:
 * - next() อ่านคำเดียว (เว้นวรรคคือจบ), nextLine() อ่านทั้งบรรทัด
 * - ระวังเรื่อง Newline Character ค้างใน Buffer เมื่อใช้ nextInt() แล้วตามด้วย nextLine()
 * - ควร close() scanner เสมอเมื่อไม่ใช้งาน เพื่อคืนทรัพยากร
 */
