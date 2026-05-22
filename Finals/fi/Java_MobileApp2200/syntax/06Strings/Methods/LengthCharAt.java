/*
 * ชื่อไฟล์: LengthCharAt.java
 * หัวข้อ: เมธอดพื้นฐานของ String (.length(), .charAt())
 * คำอธิบาย: การหาความยาวของสตริง และการดึงตัวอักษร ณ ตำแหน่งที่ต้องการ
 *           (.length() เป็น method ต้องมีวงเล็บ ต่างจาก array.length ที่เป็น property)
 * ตัวอย่างการใช้งาน: วนลูปแสดงตัวอักษรทีละตัว, ตรวจสอบความยาวรหัสผ่าน
 */

public class LengthCharAt {
    public static void main(String[] args) {
        System.out.println("=== .length() และ .charAt() ===");

        String text = "Java Programming";

        // 1. หาความยาว (.length())
        int len = text.length();
        System.out.println("ข้อความ: " + text);
        System.out.println("ความยาว: " + len + " ตัวอักษร");

        // 2. ดึงตัวอักษร (.charAt(index))
        char firstChar = text.charAt(0);
        char lastChar = text.charAt(len - 1); // ตัวสุดท้ายอยู่ที่ length - 1

        System.out.println("ตัวแรก: " + firstChar);
        System.out.println("ตัวสุดท้าย: " + lastChar);

        // 3. วนลูปแสดงตัวอักษรทุกตัว (Traversal)
        System.out.println("\n-- วนลูปแสดงทีละตัว --");
        for (int i = 0; i < text.length(); i++) {
            System.out.println("Indez " + i + ": " + text.charAt(i));
        }

        // 4. พลิกกลับข้อความ (Reverse String)
        System.out.println("\n-- Reverse String --");
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i); // ต่อสตริง (ไม่ค่อยดีต่อ performance แต่เข้าใจง่าย)
        }
        System.out.println("ข้อความกลับหลัง: " + reverse);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === .length() และ .charAt() ===
 * ข้อความ: Java Programming
 * ความยาว: 16 ตัวอักษร
 * ตัวแรก: J
 * ตัวสุดท้าย: g
 * 
 * -- วนลูปแสดงทีละตัว --
 * Index 0: J
 * ...
 * 
 * -- Reverse String --
 * ข้อความกลับหลัง: gnimmargorP avaJ
 * 
 * หมายเหตุ:
 * - ระวัง StringIndexOutOfBoundsException ถ้าเรียก charAt() ด้วย index
 * ที่ไม่มีอยู่
 */
