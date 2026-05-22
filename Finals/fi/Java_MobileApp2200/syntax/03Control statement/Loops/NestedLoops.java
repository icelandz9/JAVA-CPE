/*
 * ชื่อไฟล์: NestedLoops.java
 * หัวข้อ: ลูปซ้อนลูป (Nested Loops)
 * คำอธิบาย: การใช้งานลูปซ้อนกัน (Outer Loop และ Inner Loop)
 * ตัวอย่างการใช้งาน: สร้างตาราง, วาดรูปดาว, จัดการอาร์เรย์ 2 มิติ
 */

public class NestedLoops {
    public static void main(String[] args) {
        System.out.println("=== ลูปซ้อนลูป (Nested Loops) ===");

        // ตัวอย่างที่ 1: วาดรูปสี่เหลี่ยมขนาด 3x5
        System.out.println("-- สร้างตาราง 3x5 --");
        // ลูปนอก (Outer Loop) ควบคุมจำนวนแถว (3 แถว)
        for (int i = 1; i <= 3; i++) {
            // ลูปใน (Inner Loop) ควบคุมจำนวนคอลัมน์ (5 คอลัมน์)
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(); // ขึ้นบรรทัดใหม่เมื่อจบแถว
        }

        // ตัวอย่างที่ 2: วาดรูปสามเหลี่ยม
        System.out.println("\n-- สร้างสามเหลี่ยม --");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) { // จำนวนดาวเท่ากับหมายเลขแถว
                System.out.print("* ");
            }
            System.out.println();
        }

        // ตัวอย่างที่ 3: ตารางสูตรคูณแม่ 2 ถึง 4
        System.out.println("\n-- ตารางสูตรคูณ --");
        for (int k = 2; k <= 4; k++) {
            System.out.println("แม่ " + k + ":");
            for (int m = 1; m <= 5; m++) { // เอาแค่คูณ 5 พอสังเขป
                System.out.println(k + " x " + m + " = " + (k * m));
            }
            System.out.println("----------------");
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === ลูปซ้อนลูป (Nested Loops) ===
 * -- สร้างตาราง 3x5 --
 * * * * * *
 * * * * * *
 * * * * * *
 * 
 * -- สร้างสามเหลี่ยม --
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * 
 * -- ตารางสูตรคูณ --
 * แม่ 2:
 * 2 x 1 = 2
 * ...
 * 
 * หมายเหตุ:
 * - ระวังเรื่องความซับซ้อน (O(n^2)) หากข้อมูลมีจำนวนมาก
 * การซ้อนลูปจะทำให้โปรแกรมช้าลงมาก
 * - ควรตั้งชื่อตัวแปรให้ชัดเจน เช่น i, j, k หรือ row, col
 */
