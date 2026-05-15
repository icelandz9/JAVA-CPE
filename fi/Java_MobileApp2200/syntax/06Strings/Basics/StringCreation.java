/*
 * ชื่อไฟล์: StringCreation.java
 * หัวข้อ: การสร้างสตริง (String Creation)
 * คำอธิบาย: สตริงใน Java เป็น Object แต่มีการใช้งานพิเศษ 2 แบบ
 *           1. String Literal (ใช้ "...") -> เก็บใน String Pool (ประหยัดหน่วยความจำ)
 *           2. Keyword 'new' -> สร้าง Object ใหม่เสมอ (ไม่เก็บใน Pool)
 */

public class StringCreation {
    public static void main(String[] args) {
        System.out.println("=== การสร้าง String ===");

        // แบบที่ 1: String Literal (แนะนำ)
        // Java จะเช็คใน String Pool ก่อน ถ้ามีคำนี้แล้ว จะชี้ไปที่เดิม
        String s1 = "Hello";
        String s2 = "Hello";

        // แบบที่ 2: ใช้ new String()
        // บังคับสร้าง Object ใหม่ใน Heap Memory เสมอ (เปลืองกว่า)
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println("s1: " + s1);
        System.out.println("s3: " + s3);

        // เปรียบเทียบตำแหน่งในหน่วยความจำ (Reference Comparison)
        System.out.println("\n-- เปรียบเทียบตำแหน่ง Memory (==) --");
        System.out.println("s1 == s2: " + (s1 == s2)); // true (ชี้ที่เดียวกันใน Pool)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (คนละที่ Pool vs Heap)
        System.out.println("s3 == s4: " + (s3 == s4)); // false (คนละที่ Heap1 vs Heap2)

        // เปรียบเทียบเนื้อหา (Value Comparison)
        System.out.println("\n-- เปรียบเทียบเนื้อหา (.equals) --");
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (คำว่า Hello เหมือนกัน)
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การสร้าง String ===
 * s1: Hello
 * s3: Hello
 * 
 * -- เปรียบเทียบตำแหน่ง Memory (==) --
 * s1 == s2: true
 * s1 == s3: false
 * s3 == s4: false
 * 
 * -- เปรียบเทียบเนื้อหา (.equals) --
 * s1.equals(s3): true
 * 
 * หมายเหตุ:
 * - ในการเขียนโปรแกรมทั่วไป ควรใช้แบบ Literal (String s = "...") เสมอ
 */
