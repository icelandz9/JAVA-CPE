/*
 * ชื่อไฟล์: TernaryOperator.java
 * หัวข้อ: ตัวดำเนินการ Ternary (? :)
 * คำอธิบาย: การตรวจสอบเงื่อนไขแบบย่อ (Short-hand IF)
 *           รูปแบบ: (condition) ? value_if_true : value_if_false;
 * ตัวอย่างการใช้งาน: กำหนดค่าตัวแปรตามเงื่อนไขง่ายๆ
 */

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("=== ตัวดำเนินการ Ternary (? :) ===");

        // ตัวอย่างที่ 1: หาค่ามากที่สุดระหว่าง 2 จำนวน
        int a = 10;
        int b = 20;

        // ถ้า a > b ให้ max = a, ถ้าไม่จริง ให้ max = b
        int max = (a > b) ? a : b;
        System.out.println("ค่าสูงสุดระหว่าง " + a + " กับ " + b + " คือ: " + max);

        // เปรียบเทียบกับ if-else ปกติ
        /*
         * if (a > b) {
         * max = a;
         * } else {
         * max = b;
         * }
         */

        // ตัวอย่างที่ 2: ตรวจสอบเลขคู่/เลขคี่ แล้วเก็บผลลัพธ์เป็น String
        int num = 7;
        String result = (num % 2 == 0) ? "เลขคู่" : "เลขคี่";

        System.out.println(num + " เป็น " + result);

        // ตัวอย่างที่ 3: ตรวจสอบคะแนนสอบ
        int score = 45;
        // ถ้าคะแนน >= 50 ผ่าน, ถ้าต่ำกว่าคือ ตก
        String status = (score >= 50) ? "ผ่าน" : "ตก";
        System.out.println("คะแนน " + score + " ผลการสอบ: " + status);

        // ข้อควรระวัง: ไม่ควรซ้อน Ternary หลายชั้น (Nested Ternary) เพราะจะอ่านยาก
        // ตัวอย่างที่อ่านยาก (ไม่แนะนำ):
        // String grade = (score >= 80) ? "A" : (score >= 70) ? "B" : "C";
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === ตัวดำเนินการ Ternary (? :) ===
 * ค่าสูงสุดระหว่าง 10 กับ 20 คือ: 20
 * 7 เป็น เลขคี่
 * คะแนน 45 ผลการสอบ: ตก
 * 
 * หมายเหตุ:
 * - เหมาะกับการกำหนดค่าให้ตัวแปรแบบบรรทัดเดียวจบ
 * - ไม่ควรใช้กับ Logic ที่ซับซ้อน หรือมีการทำงานหลายคำสั่งในเงื่อนไข
 */
