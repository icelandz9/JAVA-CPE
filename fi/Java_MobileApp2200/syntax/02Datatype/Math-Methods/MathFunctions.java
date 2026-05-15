/*
 * ชื่อไฟล์: MathFunctions.java
 * หัวข้อ: เมธอดทางคณิตศาสตร์ (Math Class)
 * คำอธิบาย: การใช้งาน Math Class พื้นฐาน เช่น หาค่าสัมบูรณ์, ยกกำลัง, รากที่สอง, ปัดเศษ, ค่า min/max, ค่าสุ่ม
 * ตัวอย่างการใช้งาน: คำนวณพิกัด, หาพื้นที่, สุ่มตัวเลขเสี่ยงโชค
 */

public class MathFunctions {
    public static void main(String[] args) {
        System.out.println("=== การใช้งาน Math Class ===");

        // 1. ค่าคงที่ (Constants)
        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E);

        // 2. หาค่าสัมบูรณ์ (Absolute Value)
        int x = -10;
        System.out.println("Math.abs(-10) = " + Math.abs(x));

        // 3. ยกกำลัง (Power)
        System.out.println("2 ยกกำลัง 3 = " + Math.pow(2, 3)); // ได้ผลลัพธ์เป็น double

        // 4. รากที่สอง (Square Root)
        System.out.println("รากที่สองของ 25 = " + Math.sqrt(25));

        // 5. หาค่าสูงสุด/ต่ำสุด (Max/Min)
        System.out.println("ค่ามากสุดระหว่าง 10 กับ 20 = " + Math.max(10, 20));
        System.out.println("ค่าน้อยสุดระหว่าง 10 กับ 20 = " + Math.min(10, 20));

        // 6. การปัดเศษ (Rounding)
        double d = 3.5;
        System.out.println("Math.round(3.5) = " + Math.round(d)); // ปัดตามหลักคณิตศาสตร์
        System.out.println("Math.ceil(3.1) = " + Math.ceil(3.1)); // ปัดขึ้นเสมอ (Ceiling)
        System.out.println("Math.floor(3.9) = " + Math.floor(3.9)); // ปัดลงเสมอ (Floor)

        // 7. การสุ่มตัวเลข (Random) -> คืนค่า double ระหว่าง 0.0 (รวม) ถึง 1.0 (ไม่รวม)
        double random = Math.random();
        System.out.println("Random (0.0 - 0.999...): " + random);

        // ตัวอย่างการสุ่มลูกเต๋า (1-6)
        // (int)(Math.random() * (max - min + 1) + min)
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("ทอยลูกเต๋าได้แต้ม: " + dice);

        // ตัวอย่างการคำนวณด้านตรงข้ามมุมฉาก (Hypotenuse)
        double sideA = 3.0;
        double sideB = 4.0;
        double hypotenuse = Math.hypot(sideA, sideB); // หรือ Math.sqrt(a*a + b*b)
        System.out.println("ด้านตรงข้ามมุมฉากของ 3 และ 4 คือ: " + hypotenuse);
    }
}

/*
 * ผลลัพธ์ที่ได้ (ตัวอย่าง):
 * === การใช้งาน Math Class ===
 * PI = 3.141592653589793
 * Math.abs(-10) = 10
 * 2 ยกกำลัง 3 = 8.0
 * รากที่สองของ 25 = 5.0
 * Math.round(3.5) = 4
 * Math.ceil(3.1) = 4.0
 * Math.floor(3.9) = 3.0
 * ทอยลูกเต๋าได้แต้ม: 3
 * 
 * หมายเหตุ:
 * - Math เป็น Static Class สามารถเรียกใช้งานได้เลยโดยไม่ต้องสร้าง Object (new
 * Math())
 * - ผลลัพธ์ของ Math.pow และ Math.sqrt จะเป็น double เสมอ
 */
