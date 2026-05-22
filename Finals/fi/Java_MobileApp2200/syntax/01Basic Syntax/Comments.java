/*
 * ชื่อไฟล์: Comments.java
 * หัวข้อ: การใช้งาน Comment ในภาษา Java
 * คำอธิบาย: แสดงวิธีการเขียน Comment ทั้ง 3 รูปแบบ
 *           1. Single-line comment (//)
 *           2. Multi-line comment (/ * ... * /)
 *           3. Documentation comment (/ ** ... * /)
 * ตัวอย่างการใช้งาน: อธิบายโค้ดเพื่อให้ผู้อื่น (หรือตัวเองในอนาคต) เข้าใจ
 */

public class Comments {
    /**
     * เมธอด main เป็นจุดเริ่มต้นของโปรแกรม
     * @param args อาร์กิวเมนต์ที่รับมาจาก command line
     */
    public static void main(String[] args) {
        // นี่คือ Single-line comment (คอมเมนต์บรรทัดเดียว)
        // ใช้สำหรับอธิบายโค้ดสั้นๆ หรือปิดการทำงานของโค้ดบางบรรทัด
        System.out.println("ส่วนนี้จะทำงาน"); // คอมเมนต์ท้ายบรรทัดก็ทำได้
        
        // System.out.println("บรรทัดนี้จะไม่ทำงานเพราะถูกคอมเมนต์ไว้");

        /*
         * นี่คือ Multi-line comment (คอมเมนต์หลายบรรทัด)
         * ใช้สำหรับอธิบายยาวๆ
         * หรือปิดโค้ดทีละหลายๆ บรรทัด
         */
        System.out.println("แสดงผลการใช้ Comment แบบต่างๆ");

        /* 
        int x = 10;
        int y = 20;
        System.out.println(x + y);
        ส่วนนี้จะไม่ถูก compile
        */
        
        printGreeting("Java");
    }

    /**
     * เมธอดสำหรับแสดงคำทักทาย (Documentation Comment)
     * ใช้สำหรับสร้าง Javadoc โดยอัตโนมัติ
     * 
     * @param name ชื่อที่ต้องการทักทาย
     */
    public static void printGreeting(String name) {
        System.out.println("สวัสดี " + name);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * ส่วนนี้จะทำงาน
 * แสดงผลการใช้ Comment แบบต่างๆ
 * สวัสดี Java
 * 
 * หมายเหตุ:
 * - คอมเมนต์ไม่มีผลต่อการทำงานของโปรแกรม (Compiler จะข้ามไป)
 * - Javadoc (Documentation comment) สำคัญมากสำหรับการสร้างไลบรารี
 * - การเขียนคอมเมนต์ที่ดีช่วยลดระยะเวลาในการทำความเข้าใจโค้ด
 */
