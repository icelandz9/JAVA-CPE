/*
 * ชื่อไฟล์: StringCase.java
 * หัวข้อ: การจัดการตัวพิมพ์เล็ก-ใหญ่ และการตัดช่องว่าง
 * คำอธิบาย: .toUpperCase(), .toLowerCase(), .trim()
 * ตัวอย่างการใช้งาน: จัดรูปแบบ Input ก่อนบันทึกลง Database
 */

import java.util.Scanner;

public class StringCase {
    public static void main(String[] args) {
        System.out.println("=== Upper/Lower Case และ Trim ===");

        String input = "  Java Programming  ";

        System.out.println("ข้อความเดิม: [" + input + "]");

        // 1. แปลงเป็นตัวพิมพ์ใหญ่ (.toUpperCase())
        System.out.println("Upper: [" + input.toUpperCase() + "]");

        // 2. แปลงเป็นตัวพิมพ์เล็ก (.toLowerCase())
        System.out.println("Lower: [" + input.toLowerCase() + "]");

        // 3. ตัดช่องว่างหน้า-หลัง (.trim())
        // สำคัญมากสำหรับการรับ Input จาก User
        String trimmed = input.trim();
        System.out.println("Trimmed: [" + trimmed + "]");

        // ใช้งานร่วมกัน (Chaining)
        String content = "   Hello World   ";
        System.out.println("\n-- Method Chaining --");
        // ตัดช่องว่าง -> แปลงเป็นตัวเล็ก -> ตรวจสอบว่าเท่ากับ "hello world" ไหม
        if (content.trim().toLowerCase().equals("hello world")) {
            System.out.println("ถูกต้อง! (Normalized String)");
        }

        // ตัวอย่างการ Capitalize (ตัวแรกใหญ่ ที่เหลือเล็ก)
        String name = "sOmCHai";
        String normalized = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Capitalized: " + normalized); // Somchai
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Upper/Lower Case และ Trim ===
 * ข้อความเดิม: [ Java Programming ]
 * Upper: [ JAVA PROGRAMMING ]
 * Lower: [ java programming ]
 * Trimmed: [Java Programming]
 * 
 * -- Method Chaining --
 * ถูกต้อง! (Normalized String)
 * Capitalized: Somchai
 * 
 * หมายเหตุ:
 * - trim() ตัดเฉพาะ Whitespace (Space, Tab, Newline) ที่อยู่ 'หัว' และ 'ท้าย'
 * เท่านั้น
 */
