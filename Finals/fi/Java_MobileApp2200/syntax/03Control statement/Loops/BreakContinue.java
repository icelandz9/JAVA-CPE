/*
 * ชื่อไฟล์: BreakContinue.java
 * หัวข้อ: คำสั่ง break และ continue
 * คำอธิบาย: การควบคุมการทำงานของลูป
 *           break: หยุดการทำงานของลูปทันที
 *           continue: ข้ามรอบปัจจุบันไปยังรอบถัดไป
 * ตัวอย่างการใช้งาน: ค้นหาข้อมูลแล้วหยุด, ข้ามข้อมูลที่ไม่ต้องการ
 */

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("=== คำสั่ง Break และ Continue ===");

        // 1. ตัวอย่าง break: ค้นหาเลข 5
        System.out.println("\n-- Break: หยุดเมื่อเจอ 5 --");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("เจอเลข 5 แล้ว! จบการทำงาน");
                break; // ออกจากลูปทันที
            }
            System.out.println("กำลังค้นหา... " + i);
        }

        // 2. ตัวอย่าง continue: ข้ามเลขคู่ (แสดงเฉพาะเลขคี่)
        System.out.println("\n-- Continue: ข้ามเลขคู่ --");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue; // ข้ามคำสั่งที่เหลือในรอบนี้ ไปเริ่มรอบถัดไป
            }
            System.out.println(i + " เป็นเลขคี่");
        }

        // 3. ใช้กับ While Loop
        System.out.println("\n-- Continue ใน While Loop --");
        int count = 0;
        while (count < 5) {
            count++;
            if (count == 3) {
                continue; // ข้ามเลข 3
            }
            System.out.println("While Count: " + count);
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === คำสั่ง Break และ Continue ===
 * 
 * -- Break: หยุดเมื่อเจอ 5 --
 * กำลังค้นหา... 1
 * ...
 * กำลังค้นหา... 4
 * เจอเลข 5 แล้ว! จบการทำงาน
 * 
 * -- Continue: ข้ามเลขคู่ --
 * 1 เป็นเลขคี่
 * 3 เป็นเลขคี่
 * 5 เป็นเลขคี่
 * 
 * -- Continue ใน While Loop --
 * While Count: 1
 * While Count: 2
 * While Count: 4 (เลข 3 หายไป)
 * While Count: 5
 * 
 * หมายเหตุ:
 * - ระวังการใช้ continue ใน while loop อาจทำให้เกิด Infinite loop ถ้าวางตำแหน่ง
 * update counter ผิด
 * - break ใช้ได้ทั้งใน loop และ switch
 */
