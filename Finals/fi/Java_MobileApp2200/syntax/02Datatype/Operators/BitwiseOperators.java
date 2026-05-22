/*
 * ชื่อไฟล์: BitwiseOperators.java
 * หัวข้อ: ตัวดำเนินการระดับบิต (Bitwise Operators)
 * คำอธิบาย: การดำเนินการกับข้อมูลในระดับเลขฐานสอง (Binary)
 *           & (AND), | (OR), ^ (XOR), ~ (Complement), << (Shift Left), >> (Shift Right)
 * ตัวอย่างการใช้งาน: การเข้ารหัสข้อมูล, การจัดการ Flag/Permissio, การคูณ/หารด้วย 2 อย่างรวดเร็ว
 */

public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("=== ตัวดำเนินการระดับบิต (Bitwise) ===");

        // 5 = 0000 0101
        // 3 = 0000 0011
        int a = 5;
        int b = 3;

        System.out.println("a = " + a + " (Binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (Binary: " + Integer.toBinaryString(b) + ")");
        System.out.println("--------------------");

        // 1. Bitwise AND (&) - เป็น 1 เมื่อทั้งคู่เป็น 1
        // 0101 & 0011 = 0001 (1)
        System.out.println("a & b = " + (a & b));

        // 2. Bitwise OR (|) - เป็น 1 เมื่ออย่างน้อยหนึ่งตัวเป็น 1
        // 0101 | 0011 = 0111 (7)
        System.out.println("a | b = " + (a | b));

        // 3. Bitwise XOR (^) - เป็น 1 เมื่อต่างกัน
        // 0101 ^ 0011 = 0110 (6)
        System.out.println("a ^ b = " + (a ^ b));

        // 4. Bitwise Complement (~) - กลับ 0 เป็น 1, 1 เป็น 0
        // ~0000 0101 = 1111 1010 (-6 ในระบบ 2's Complement)
        System.out.println("~a = " + (~a));

        System.out.println("--------------------");

        // 5. Shift Left (<<) - เลื่อนบิตไปทางซ้าย (เท่ากับการคูณด้วย 2^n)
        // 5 << 1 = 1010 (10)
        System.out.println("a << 1 = " + (a << 1));

        // 6. Shift Right (>>) - เลื่อนบิตไปทางขวา (เท่ากับการหารด้วย 2^n)
        // 5 >> 1 = 0010 (2)
        System.out.println("a >> 1 = " + (a >> 1));
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === ตัวดำเนินการระดับบิต (Bitwise) ===
 * a = 5 (Binary: 101)
 * b = 3 (Binary: 11)
 * --------------------
 * a & b = 1
 * a | b = 7
 * a ^ b = 6
 * ~a = -6
 * --------------------
 * a << 1 = 10
 * a >> 1 = 2
 * 
 * หมายเหตุ:
 * - อาจไม่ได้ใช้บ่อยในการเขียนโปรแกรมทั่วไป แต่มีประโยชน์มากในงานระบบ (System
 * Programming)
 * - Shift Left 1 ครั้ง คือการคูณ 2
 * - Shift Right 1 ครั้ง คือการหาร 2 (ปัดเศษทิ้ง)
 */
