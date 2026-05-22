/*
 * ชื่อไฟล์: LogicBasic.java
 * หัวข้อ: ตัวดำเนินการตรรกะเบื้องต้น (Basic Logical Operators)
 * คำอธิบาย: แสดงการใช้งานตัวดำเนินการเปรียบเทียบ (==) และตรรกะ (&& , ||)
 *           พร้อมตาราง Truth Table ประกอบ
 * ตัวอย่างการใช้งาน: ใช้ในเงื่อนไข if, while เพื่อตรวจสอบเงื่อนไขหลายข้อ
 */

public class LogicBasic {
    public static void main(String[] args) {
        // ==========================================
        // การใช้งาน Logical Operators (ตัวดำเนินการตรรกะ)
        // ==========================================

        int a = 10;
        int b = 20;
        int c = 10;

        // 1. เครื่องหมาย == (Equal to)
        // ใช้สำหรับเปรียบเทียบว่าค่าสองค่า "เท่ากัน" หรือไม่
        // ถ้าเท่ากัน จะคืนค่า true, ถ้าไม่เท่ากัน จะคืนค่า false
        System.out.println("=== ทดสอบเครื่องหมาย == (เท่ากับ) ===");
        System.out.println("a == c : " + (a == c)); // true เพราะ 10 เท่ากับ 10
        System.out.println("a == b : " + (a == b)); // false เพราะ 10 ไม่เท่ากับ 20

        // 2. เครื่องหมาย && (Logical AND) - "และ"
        // ผลลัพธ์จะเป็น true ก็ต่อเมื่อ "ทั้งสองฝั่ง" ต้องเป็น true
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false
        System.out.println("\n=== ทดสอบเครื่องหมาย && (และ) ===");
        boolean testAnd = (a == 10) && (b == 20);
        System.out.println("(a == 10) && (b == 20) : " + testAnd); // true เพราะทั้งคู่เป็นจริง

        boolean testAndError = (a == 10) && (b == 50);
        System.out.println("(a == 10) && (b == 50) : " + testAndError); // false เพราะ b ไม่เท่ากับ 50

        // 3. เครื่องหมาย || (Logical OR) - "หรือ"
        // ผลลัพธ์จะเป็น true ขอแค่ "ฝั่งใดฝั่งหนึ่ง" เป็น true ก็เพียงพอแล้ว
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false
        System.out.println("\n=== ทดสอบเครื่องหมาย || (หรือ) ===");
        boolean testOr = (a == 10 || b == 999);
        System.out.println("(a == 10 || b == 999) : " + testOr); // true เพราะ a == 10 (จริง) ถึงแม้ b จะไม่ใช่ 999

        boolean testOrFalse = (a == 999 || b == 999);
        System.out.println("(a == 999 || b == 999) : " + testOrFalse); // false เพราะทั้งคู่เท็จหมด
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === ทดสอบเครื่องหมาย == (เท่ากับ) ===
 * a == c : true
 * a == b : false
 * === ทดสอบเครื่องหมาย && (และ) ===
 * (a == 10) && (b == 20) : true
 * (a == 10) && (b == 50) : false
 * === ทดสอบเครื่องหมาย || (หรือ) ===
 * (a == 10 || b == 999) : true
 * (a == 999 || b == 999) : false
 *
 * หมายเหตุ:
 * - && และ || เป็น Short-Circuit Operator (ถ้ารู้ผลแล้วจะไม่ตรวจฝั่งที่เหลือ)
 * - ควรใช้ && || แทน & | เมื่อเปรียบเทียบ boolean เพื่อประสิทธิภาพ
 */
