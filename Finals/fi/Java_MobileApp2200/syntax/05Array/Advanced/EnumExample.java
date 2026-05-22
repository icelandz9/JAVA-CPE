/*
 * ชื่อไฟล์: EnumExample.java
 * หัวข้อ: พื้นฐาน Enum (Enumeration)
 * คำอธิบาย: ชนิดข้อมูลพิเศษที่ใช้กำหนดค่าคงที่ที่เป็นกลุ่มก้อน (Set of Constants)
 *           ช่วยให้โค้ดอ่านง่ายและปลอดภัยกว่าการใช้ int หรือ String
 * ตัวอย่างการใช้งาน: วันในสัปดาห์, สถานะออเดอร์, ระดับความยากเกม
 */

// ประกาศ Enum (มักประกาศนอก class หรือแยกไฟล์)
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Level {
    LOW, MEDIUM, HIGH
}

public class EnumExample {
    public static void main(String[] args) {
        System.out.println("=== Enum (Enumeration) ===");

        // 1. การใช้งานพื้นฐาน
        Day today = Day.WEDNESDAY;
        System.out.println("วันนี้คือ: " + today);

        // 2. ใช้กับ Switch Case (นิยมมาก)
        System.out.print("กิจกรรมวันนี้: ");
        switch (today) {
            case MONDAY:
                System.out.println("ไปเรียน");
                break;
            case FRIDAY:
                System.out.println("ดูหนัง");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("พักผ่อน");
                break;
            default:
                System.out.println("ทำงานทำการ");
        }

        // 3. วนลูปดูค่าทั้งหมดใน Enum
        System.out.println("\n-- ระดับความยากทั้งหมด --");
        for (Level lvl : Level.values()) {
            System.out.println(lvl + " (Ordinal: " + lvl.ordinal() + ")");
        }

        // 4. เปรียบเทียบ
        Level currentLevel = Level.HIGH;
        if (currentLevel == Level.HIGH) {
            System.out.println("\nระวัง! ระดับความยากสูงสุด");
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Enum (Enumeration) ===
 * วันนี้คือ: WEDNESDAY
 * กิจกรรมวันนี้: ทำงานทำการ
 * 
 * -- ระดับความยากทั้งหมด --
 * LOW (Ordinal: 0)
 * MEDIUM (Ordinal: 1)
 * HIGH (Ordinal: 2)
 * 
 * ระวัง! ระดับความยากสูงสุด
 * 
 * หมายเหตุ:
 * - ควรใช้ Enum แทนการใช้ 0, 1, 2 หรือ String "Low", "High"
 * เพื่อลดความผิดพลาดจากการพิมพ์ผิด (Type Safety)
 */
