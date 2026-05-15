/*
 * ชื่อไฟล์: StringBufferBuilder.java
 * หัวข้อ: StringBuilder และ StringBuffer
 * คำอธิบาย: คลาสที่ช่วยให้แก้ไขข้อความได้โดยไม่ต้องสร้าง Object ใหม่ (Mutable)
 *           - StringBuilder: เร็ว, ไม่ Thread-safe (นิยมใช้ที่สุด)
 *           - StringBuffer: ช้ากว่า, Thread-safe (ใช้ในงาน Multi-threading)
 */

public class StringBufferBuilder {
    public static void main(String[] args) {
        System.out.println("=== StringBuilder & StringBuffer ===");

        // 1. การใช้งาน StringBuilder (แนะนำสำหรับ General Use)
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("เดิม: " + sb);

        // Append (ต่อท้าย) - ไม่สร้าง Object ใหม่
        sb.append(" Programming");
        System.out.println("หลัง append: " + sb);

        // Insert (แทรก)
        sb.insert(4, " Language");
        System.out.println("หลัง insert: " + sb);

        // Delete (ลบ)
        sb.delete(4, 13); // ลบ " Language" ออก
        System.out.println("หลัง delete: " + sb);

        // Reverse (กลับหลัง)
        sb.reverse();
        System.out.println("หลัง reverse: " + sb);

        // 2. เปรียบเทียบประสิทธิภาพ (Performance Test)
        System.out.println("\n-- ทดสอบความเร็ว (Concatenation vs StringBuilder) --");
        int loopCount = 10000;

        // แบบ String + String (ช้ามาก)
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < loopCount; i++) {
            s += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String (+) เวลาที่ใช้: " + (endTime - startTime) + " ms");

        // แบบ StringBuilder (เร็วมาก)
        startTime = System.currentTimeMillis();
        StringBuilder sbTest = new StringBuilder();
        for (int i = 0; i < loopCount; i++) {
            sbTest.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder เวลาที่ใช้: " + (endTime - startTime) + " ms");

        // แปลงกลับเป็น String
        String result = sbTest.toString();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === StringBuilder & StringBuffer ===
 * เดิม: Java
 * หลัง append: Java Programming
 * หลัง insert: Java Language Programming
 * หลัง delete: Java Programming
 * หลัง reverse: gnimmargorP avaJ
 * 
 * -- ทดสอบความเร็ว (Concatenation vs StringBuilder) --
 * String (+) เวลาที่ใช้: 150 ms (ค่าสมมติ อาจมากกว่านี้เยอะถ้า loop เยอะ)
 * StringBuilder เวลาที่ใช้: 1 ms
 * 
 * หมายเหตุ:
 * - ถ้าต้องต่อ String ใน Loop จำนวนมาก -> ต้องใช้ StringBuilder เสมอ!
 */
