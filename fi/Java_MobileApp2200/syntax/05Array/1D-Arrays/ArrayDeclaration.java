/*
 * ชื่อไฟล์: ArrayDeclaration.java
 * หัวข้อ: การประกาศและสร้างอาร์เรย์ (Array Declaration & Creation)
 * คำอธิบาย: วิธีการประกาศตัวแปรอาร์เรย์และการจองพื้นที่หน่วยความจำ (Allocation)
 *           อาร์เรย์คือกลุ่มของข้อมูลชนิดเดียวกันที่เรียงต่อกัน
 * ตัวอย่างการใช้งาน: เก็บรายการคะแนนสอบ, เก็บรายชื่อนักเรียน
 */

public class ArrayDeclaration {
    public static void main(String[] args) {
        System.out.println("=== การประกาศและสร้างอาร์เรย์ ===");

        // 1. ประกาศตัวแปรอาร์เรย์ (ยังใช้งานไม่ได้ ต้องสร้าง Object ก่อน)
        int[] scores; // แบบที่นิยม (Type[])
        String names[]; // แบบ C-Style (Type variable[])

        // 2. สร้างอาร์เรย์ (Alloction) ระบุขนาด
        scores = new int[5]; // สร้างอาร์เรย์เก็บ int ได้ 5 ตัว (index 0-4)
        names = new String[3]; // สร้างอาร์เรย์เก็บ String ได้ 3 ตัว

        // 3. การใช้งาน (Access/Assign)
        // กำหนดค่า
        scores[0] = 10;
        scores[1] = 20;
        // scores[5] = 50; // Error! IndexOutOfBounds (เพราะมีแค่ index 0-4)

        names[0] = "Somchai";
        names[1] = "Somsri";
        // ค่า Default ของอาร์เรย์
        // int -> 0, double -> 0.0, boolean -> false, Object/String -> null

        System.out.println("scores[0] = " + scores[0]);
        System.out.println("scores[2] (Default) = " + scores[2]);

        System.out.println("names[0] = " + names[0]);
        System.out.println("names[2] (Default) = " + names[2]);

        // การหาขนาดของอาร์เรย์ (.length)
        System.out.println("ขนาดของ arrays scores: " + scores.length);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การประกาศและสร้างอาร์เรย์ ===
 * scores[0] = 10
 * scores[2] (Default) = 0
 * names[0] = Somchai
 * names[2] (Default) = null
 * ขนาดของ arrays scores: 5
 * 
 * หมายเหตุ:
 * - อาร์เรย์ใน Java เป็น Object และมีขนาดคงที่ (Fixed Size)
 * เปลี่ยนแปลงทีหลังไม่ได้
 * - Index เริ่มต้นที่ 0 เสมอ
 */
