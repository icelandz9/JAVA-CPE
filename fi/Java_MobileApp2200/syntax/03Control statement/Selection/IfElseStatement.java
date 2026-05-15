/*
 * ชื่อไฟล์: IfElseStatement.java
 * หัวข้อ: คำสั่งตรวจสอบเงื่อนไข if-else (Two-way Selection)
 * คำอธิบาย: การตรวจสอบเงื่อนไขที่มี 2 ทางเลือก (จริงทำอย่างหนึ่ง เท็จทำอีกอย่างหนึ่ง)
 * ตัวอย่างการใช้งาน: ตรวจสอบเลขคู่/คี่, ผ่าน/ตก, ล็อกอินสำเร็จ/ไม่สำเร็จ
 */

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        System.out.println("=== คำสั่ง if-else (สองทางเลือก) ===");

        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณากรอกคะแนน (0-100): ");
        int score = scanner.nextInt();

        // เงื่อนไข: ถ้าคะแนน >= 50 คือผ่าน, ถ้าไม่ใช่คือตก
        if (score >= 50) {
            System.out.println("ผลการสอบ: สอบผ่าน");
            System.out.println("ยินดีด้วย!");
        } else {
            System.out.println("ผลการสอบ: สอบตก");
            System.out.println("พยายามใหม่นะ");
        }

        // ตัวอย่างตรวจสอบเลขคู่/เลขคี่
        System.out.print("กรุณากรอกตัวเลขจำนวนเต็ม: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " เป็นเลขคู่ (Even)");
        } else {
            System.out.println(number + " เป็นเลขคี่ (Odd)");
        }

        scanner.close();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === คำสั่ง if-else (สองทางเลือก) ===
 * กรุณากรอกคะแนน (0-100): 45
 * ผลการสอบ: สอบตก
 * พยายามใหม่นะ
 * กรุณากรอกตัวเลขจำนวนเต็ม: 7
 * 7 เป็นเลขคี่ (Odd)
 * 
 * หมายเหตุ:
 * - จะมีเพียงบล็อกเดียวที่ได้ทำงาน (ไม่ if ก็ else)
 */
