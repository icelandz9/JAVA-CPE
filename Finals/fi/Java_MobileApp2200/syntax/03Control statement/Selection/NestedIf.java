/*
 * ชื่อไฟล์: NestedIf.java
 * หัวข้อ: คำสั่ง if ซ้อน if (Nested If) และ else-if
 * คำอธิบาย: การตรวจสอบเงื่อนไขหลายชั้น ใช้ในกรณีที่มีมากกว่า 2 ทางเลือก
 *           หรือต้องตรวจสอบเงื่อนไขเพิ่มเติมเมื่อเงื่อนไขหลักเป็นจริง
 * ตัวอย่างการใช้งาน: ตัดเกรด (A, B, C, D, F), คำนวณค่าบริการตามประเภทสมาชิก
 */

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        System.out.println("=== คำสั่ง if ซ้อน if และ else-if ===");

        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณากรอกคะแนนสอบ (0-100): ");
        int score = scanner.nextInt();

        // ตรวจสอบความถูกต้องของข้อมูลก่อน (Nested If)
        if (score >= 0 && score <= 100) {

            // ใช้ if-else-if สำหรับหลายทางเลือก (Multi-way Selection)
            if (score >= 80) {
                System.out.println("เกรด A");
            } else if (score >= 70) {
                System.out.println("เกรด B");
            } else if (score >= 60) {
                System.out.println("เกรด C");
            } else if (score >= 50) {
                System.out.println("เกรด D");
            } else {
                System.out.println("เกรด F");
            }

        } else {
            System.out.println("ข้อมูลผิดพลาด! กรุณากรอกคะแนน 0-100");
        }

        // ตัวอย่าง if ซ้อน if แบบตรวจสอบเงื่อนไขย่อย
        System.out.print("\nกรุณากรอกอายุ: ");
        int age = scanner.nextInt();

        System.out.print("มีใบขับขี่หรือไม่ (true/false): ");
        boolean hasLicense = scanner.nextBoolean();

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("คุณสามารถขับรถได้ถูกต้องตามกฎหมาย");
            } else {
                System.out.println("คุณบรรลุนิติภาวะแล้ว แต่ยังขาดใบขับขี่");
            }
        } else {
            System.out.println("คุณยังไม่บรรลุนิติภาวะ ห้ามขับรถ");
        }

        scanner.close();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === คำสั่ง if ซ้อน if และ else-if ===
 * กรุณากรอกคะแนนสอบ (0-100): 75
 * เกรด B
 * 
 * กรุณากรอกอายุ: 20
 * มีใบขับขี่หรือไม่ (true/false): false
 * คุณบรรลุนิติภาวะแล้ว แต่ยังขาดใบขับขี่
 * 
 * หมายเหตุ:
 * - else-if จะตรวจสอบทีละเงื่อนไข ถ้าเจอจริงแล้วจะข้ามเงื่อนไขที่เหลือทั้งหมด
 * - Nested If ควร indent (ย่อหน้า) ให้ชัดเจนเพื่อให้อ่านง่าย
 */
