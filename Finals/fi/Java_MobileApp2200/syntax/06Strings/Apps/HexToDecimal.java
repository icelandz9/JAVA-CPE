/*
 * ชื่อไฟล์: HexToDecimal.java
 * หัวข้อ: แปลงเลขฐาน 16 เป็นฐาน 10 (Case Study)
 * คำอธิบาย: การประยุกต์ใช้ String, Loop, CharAt และ Math
 * ตัวอย่างการใช้งาน: แปลงค่าสี Hex (#FF0000) เป็น RGB
 */

import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        System.out.println("=== แปลงเลขฐาน 16 เป็นฐาน 10 ===");

        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณากรอกเลขฐาน 16 (เช่น 1A, FF, 2B): ");
        String hex = sc.next();

        int decimal = 0;

        // วนลูปจากตัวสุดท้ายมาหน้า
        // ตัวอย่าง: 1A
        // หลักที่ 0 (A) -> 10 * 16^0 = 10
        // หลักที่ 1 (1) -> 1 * 16^1 = 16
        // รวม = 26

        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int digit = 0;

            // แปลงตัวอักษรเป็นตัวเลข
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                digit = 10 + (ch - 'A');
            } else if (ch >= 'a' && ch <= 'f') {
                digit = 10 + (ch - 'a');
            } else {
                System.out.println("ผิดพลาด: " + ch + " ไม่ใช่เลขฐาน 16");
                return; // จบโปรแกรม
            }

            // สูตร: ผลลัพธ์ * 16 + digit
            decimal = decimal * 16 + digit;
        }

        System.out.println("เลขฐาน 16: " + hex);
        System.out.println("เลขฐาน 10: " + decimal);

        // วิธีลัด (Java Built-in)
        System.out.println("(เช็คคำตอบด้วย Integer.parseInt: " + Integer.parseInt(hex, 16) + ")");

        sc.close();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === แปลงเลขฐาน 16 เป็นฐาน 10 ===
 * กรุณากรอกเลขฐาน 16 (เช่น 1A, FF, 2B): 1A
 * เลขฐาน 16: 1A
 * เลขฐาน 10: 26
 * (เช็คคำตอบด้วย Integer.parseInt: 26)
 * 
 * หมายเหตุ:
 * - การเข้าใจ ASCII Code (เช่น 'A' คือ 65) ช่วยให้เขียน Logic นี้ได้ง่าย
 */
