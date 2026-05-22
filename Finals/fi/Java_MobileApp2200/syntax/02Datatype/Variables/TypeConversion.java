/*
 * ชื่อไฟล์: TypeConversion.java
 * หัวข้อ: การแปลงชนิดข้อมูล (Type Conversion / Casting)
 * คำอธิบาย: แสดงการแปลงข้อมูลระหว่างชนิดต่างๆ ทั้งแบบอัตโนมัติ (Implicit) 
 *           และแบบบังคับ (Explicit / Casting)
 * ตัวอย่างการใช้งาน: การหาค่าเฉลี่ย (int -> double), การปัดเศษทศนิยมทิ้ง (double -> int)
 */

public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("=== การแปลงชนิดข้อมูล (Type Casting) ===");

        // 1. Widening Casting (Auto) - เปลี่ยนจากขนาดเล็กไปใหญ่
        // byte -> short -> char -> int -> long -> float -> double
        System.out.println("\n-- Widening Casting (เล็ก -> ใหญ่) --");
        int myInt = 9;
        double myDouble = myInt; // แปลง int เป็น double อัตโนมัติ

        System.out.println("ค่า int: " + myInt);
        System.out.println("ค่า double (หลังแปลง): " + myDouble);

        // 2. Narrowing Casting (Manual) - เปลี่ยนจากขนาดใหญ่ไปเล็ก
        // double -> float -> long -> int -> char -> short -> byte
        // ต้องระบุ (type) ด้านหน้า และอาจสูญเสียข้อมูล
        System.out.println("\n-- Narrowing Casting (ใหญ่ -> เล็ก) --");
        double grade = 3.99;
        int gradeInt = (int) grade; // ตัดเศษทศนิยมทิ้ง ไม่มีการปัดเศษ

        System.out.println("ค่า double: " + grade);
        System.out.println("ค่า int (หลังแปลง): " + gradeInt);

        // ตัวอย่างการใช้งานจริง: การหาค่าเฉลี่ย
        System.out.println("\n-- ตัวอย่างการหารตัวเลข --");
        int sum = 20;
        int count = 3;
        
        // ถ้าหาร int/int จะได้ผลลัพธ์เป็น int (ตัดเศษ)
        System.out.println("20 / 3 (แบบ int): " + (sum / count)); 
        
        // ต้องแปลงตัวตั้งหรือตัวหารเป็น double ก่อนเพื่อให้ได้ผลลัพธ์ทศนิยม
        System.out.println("20 / 3 (แบบ double): " + ((double) sum / count));

        // การแปลงระหว่าง char และ int (ASCII/Unicode)
        System.out.println("\n-- การแปลง char <-> int --");
        char letter = 'A';
        int ascii = (int) letter;
        System.out.println("'A' มีค่า ASCII: " + ascii);

        int nextAscii = ascii + 1;
        char nextLetter = (char) nextAscii;
        System.out.println("ASCII " + nextAscii + " คือตัวอักษร: " + nextLetter);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การแปลงชนิดข้อมูล (Type Casting) ===
 * 
 * -- Widening Casting (เล็ก -> ใหญ่) --
 * ค่า int: 9
 * ค่า double (หลังแปลง): 9.0
 * 
 * -- Narrowing Casting (ใหญ่ -> เล็ก) --
 * ค่า double: 3.99
 * ค่า int (หลังแปลง): 3
 * 
 * -- ตัวอย่างการหารตัวเลข --
 * 20 / 3 (แบบ int): 6
 * 20 / 3 (แบบ double): 6.666666666666667
 * 
 * -- การแปลง char <-> int --
 * 'A' มีค่า ASCII: 65
 * ASCII 66 คือตัวอักษร: B
 * 
 * หมายเหตุ:
 * - Narrowing Casting อาจทำให้ข้อมูลสูญหาย (Data Loss) เช่น ทศนิยมหายไป หรือค่าเกินขอบเขต
 * - ระวังการหารจำนวนเต็ม ถ้าต้องการผลลัพธ์ทศนิยม ต้องแปลงตัวใดตัวหนึ่งเป็น double ก่อน
 */
