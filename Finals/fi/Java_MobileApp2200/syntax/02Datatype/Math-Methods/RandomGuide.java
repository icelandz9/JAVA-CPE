/*
 * ชื่อไฟล์: RandomGuide.java
 * หัวข้อ: การสุ่มตัวเลขด้วย Class Random
 * คำอธิบาย: แสดงวิธีใช้งาน java.util.Random ในการสุ่มตัวเลข
 *           ครอบคลุม: int, double, boolean และการกำหนด Seed
 * ตัวอย่างการใช้งาน: สุ่มคำถาม Quiz, สุ่มราคาสินค้า, จำลองการทอยลูกเต๋า
 */

import java.util.Random; // นำเข้า class Random จาก library java.util เพื่อใช้งาน

public class RandomGuide {
    public static void main(String[] args) {
        // ==========================================
        // ความรู้เบื้องต้นเกี่ยวกับ Class Random
        // ==========================================
        // Random คือคลาสที่ใช้สำหรับสร้างตัวเลขสุ่ม (Pseudo-random numbers)
        // จำเป็นต้อง import java.util.Random; ก่อนใช้งาน

        // 1. การสร้าง Object (Instance) ของ Random
        // ----------------------------------------
        Random rand = new Random();
        // สร้าง object ชื่อ 'rand' เพื่อใช้เรียกเมธอดต่างๆ ในการสุ่ม

        System.out.println("=== ตัวอย่างการใช้งาน Random ===");

        // 2. การสุ่มเลขจำนวนเต็ม (Integer)
        // ----------------------------------------

        // แบบที่ A: สุ่มเลข int ใดๆ (ค่าตั้งแต่ -2,147,483,648 ถึง 2,147,483,647)
        int randomInt = rand.nextInt();
        System.out.println("สุ่ม int (ไม่จำกัดขอบเขต): " + randomInt);

        // แบบที่ B: สุ่มเลข int แบบกำหนดขอบเขต (0 ถึง n-1)
        // มักใช้บ่อยที่สุด เช่น สุ่ม 0-99
        int bound = 100;
        int randomIntBounded = rand.nextInt(bound);
        System.out.println("สุ่ม int (0 ถึง 99): " + randomIntBounded);

        // เทคนิค: การสุ่มแบบกำหนดช่วงเริ่มต้น (min ถึง max)
        // สูตร: rand.nextInt((max - min) + 1) + min;
        // ตัวอย่าง: สุ่มเลข 10 ถึง 20
        int min = 10;
        int max = 20;
        int randomRange = rand.nextInt((max - min) + 1) + min;
        // อธิบาย: nextInt(11) จะได้ 0-10, แล้วบวกเพิ่ม 10 จะได้ 10-20
        System.out.println("สุ่มช่วง 10 ถึง 20: " + randomRange);

        // 3. การสุ่มเลขทศนิยม (Double)
        // ----------------------------------------
        // สุ่มค่าระหว่าง 0.0 (รวม) ถึง 1.0 (ไม่รวม)
        double randomDouble = rand.nextDouble();
        System.out.println("สุ่ม double (0.0 - 1.0): " + randomDouble);

        // เทคนิค: สุ่มราคาของสินค้า 0.00 ถึง 100.00
        double price = rand.nextDouble() * 100.0;
        System.out.printf("สุ่มราคา (0-100): %.2f%n", price);

        // 4. การสุ่มค่าความจริง (Boolean)
        // ----------------------------------------
        // มีโอกาสได้ true หรือ false อย่างละครึ่ง (50/50)
        boolean randomBool = rand.nextBoolean();
        System.out.println("สุ่ม boolean (หัว/ก้อย): " + randomBool);

        // 5. เรื่องของ Seed (เมล็ดพันธุ์การสุ่ม)
        // ----------------------------------------
        // ถ้าเรากำหนด seed เป็นค่าคงที่ ผลลัพธ์การสุ่มจะเหมือนเดิมทุกครั้งที่รันโปรแกรม
        // มีประโยชน์ตอน debug โปรแกรมที่ต้องการผลที่ทำซ้ำได้
        Random fixedRandom = new Random(12345L); // กำหนด seed เป็น 12345
        System.out.println("\n=== ทดสอบ Fixed Seed (จะได้ค่าเดิมเสมอเมื่อรันใหม่) ===");
        System.out.println("สุ่มครั้งที่ 1: " + fixedRandom.nextInt(100));
        System.out.println("สุ่มครั้งที่ 2: " + fixedRandom.nextInt(100));
        System.out.println("สุ่มครั้งที่ 3: " + fixedRandom.nextInt(100));
    }
}

/*
 * ผลลัพธ์ที่ได้: (ค่าจะเปลี่ยนทุกครั้งที่รัน ยกเว้น Fixed Seed)
 * === ตัวอย่างการใช้งาน Random ===
 * สุ่ม int (ไม่จำกัดขอบเขต): -123456789
 * สุ่ม int (0 ถึง 99): 42
 * สุ่มช่วง 10 ถึง 20: 15
 * สุ่ม double (0.0 - 1.0): 0.7231...
 * สุ่มราคา (0-100): 56.78
 * สุ่ม boolean (หัว/ก้อย): true
 * === ทดสอบ Fixed Seed ===
 * สุ่มครั้งที่ 1: 51 (ค่าเดิมเสมอ)
 * สุ่มครั้งที่ 2: 80
 * สุ่มครั้งที่ 3: 53
 *
 * หมายเหตุ:
 * - Math.random() ก็สุ่มได้ แต่คืนค่า double (0.0-1.0) เท่านั้น
 * - Random class ยืดหยุ่นกว่าเพราะเลือกชนิดข้อมูลได้หลากหลาย
 */
