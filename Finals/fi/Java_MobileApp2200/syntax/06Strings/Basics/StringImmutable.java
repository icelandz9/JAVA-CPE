/*
 * ชื่อไฟล์: StringImmutable.java
 * หัวข้อ: ความไม่เปลี่ยนแปลงของสตริง (Immutability)
 * คำอธิบาย: String ใน Java เมื่อสร้างแล้ว "ไม่สามารถแก้ไขเนื้อหาเดิมได้"
 *           การพยายามแก้ไข (เช่น ต่อสตริง) จะเป็นการสร้าง String Object *ใหม่* ขึ้นมาเสมอ
 */

public class StringImmutable {
    public static void main(String[] args) {
        System.out.println("=== String Immutability ===");

        String s = "Java";
        System.out.println("เดิม: " + s);
        System.out.println("HashCode เดิม: " + s.hashCode());

        // พยายามแก้ไข: ต่อคำว่า " Programming"
        s.concat(" Programming");

        // ผลลัพธ์: s ยังคงเป็น "Java" เหมือนเดิม!
        // เพราะ .concat() คืนค่า String ใหม่ออกมา แต่เราไม่ได้เอาตัวแปรมารับ
        System.out.println("หลัง concat (ไม่รับค่า): " + s);

        // วิธีที่ถูกต้อง: ต้องเอาตัวแปรมารับค่าใหม่
        s = s.concat(" Programming");
        System.out.println("หลัง concat (รับค่าแล้ว): " + s);
        System.out.println("HashCode ใหม่: " + s.hashCode()); // คนละ id กับข้างบน

        // อีกตัวอย่างกับตัวแปรเดิม
        String a = "Hello";
        String b = a; // b ชี้ไปที่เดียวกับ a

        a = "World"; // a เปลี่ยนไปชี้ที่ใหม่ ("World")

        System.out.println("\n-- Reference Check --");
        System.out.println("a: " + a); // World
        System.out.println("b: " + b); // Hello (ยังอยู่ที่เดิม ไม่เปลี่ยนตาม a)
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === String Immutability ===
 * เดิม: Java
 * HashCode เดิม: 2301506
 * หลัง concat (ไม่รับค่า): Java
 * หลัง concat (รับค่าแล้ว): Java Programming
 * HashCode ใหม่: -1367357475
 * 
 * -- Reference Check --
 * a: World
 * b: Hello
 * 
 * หมายเหตุ:
 * - เพราะ Immutability ทำให้ String ปลอดภัย (Thread-safe) และใช้เป็น Key ใน
 * HashMap ได้ดี
 * - ข้อเสีย: หากมีการแก้ไขบ่อยๆ จะเกิด Garbage (ขยะ) เยอะมาก -> ควรใช้
 * StringBuilder แทน
 */
