/*
 * ชื่อไฟล์: ShutdownHook.java
 * หัวข้อ: Runtime Shutdown Hook (คำสั่งสั่งลาก่อนปิดโปรแกรม)
 * คำอธิบาย: ฝังโค้ดที่จะทำงาน "ก่อน" ที่โปรแกรมจะดับลงจริงๆ
 *           ไม่ว่าจะปิดแบบปกติ หรือถูก Force Close (เช่นกด Ctrl+C)
 * ตัวอย่างการใช้งาน: บันทึกข้อมูลฉุกเฉินก่อนเด้งหลุด, ปิดการเชื่อมต่อฐานข้อมูล
 */

public class ShutdownHook {
    public static void main(String[] args) {
        System.out.println("=== Shutdown Hook Demo ===");

        // เพิ่มคำสั่งสั่งลาลงใน Runtime
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n\n!!! EMERGENCY SAVE !!!");
            System.out.println("โปรแกรมกำลังจะปิดตัวลง...");
            System.out.println("กำลังบันทึกข้อมูลสำคัญ... เรียบร้อย!");
        }));

        System.out.println("โปรแกรมกำลังทำงาน... (ลองกด Ctrl+C เพื่อฆ่าโปรแกรมดูสิ)");

        try {
            // แกล้งทำงานนานๆ
            for (int i = 0; i < 5; i++) {
                System.out.println("Working " + (i + 1));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("จบการทำงานปกติ");
    }
}

/*
 * ผลลัพธ์ (ถ้าทำงานจบปกติ):
 * จบการทำงานปกติ
 * !!! EMERGENCY SAVE !!! ...
 * 
 * ผลลัพธ์ (ถ้ากด Ctrl+C กลางคัน):
 * !!! EMERGENCY SAVE !!! ...
 *
 * หมายเหตุ:
 * - โค้ดใน Shutdown Hook ต้องรันให้เร็วที่สุด เพราะ OS อาจบังคับปิดถ้าใช้เวลานานเกินไป
 * - ถ้าโปรแกรมถูกฆ่าแบบรุนแรงมาก (เช่น kill -9 ใน Linux) Shutdown Hook อาจไม่ทันได้ทำงาน
 */
