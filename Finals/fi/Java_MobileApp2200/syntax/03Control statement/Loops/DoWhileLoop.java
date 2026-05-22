/*
 * ชื่อไฟล์: DoWhileLoop.java
 * หัวข้อ: คำสั่งวนซ้ำ Do-While Loop
 * คำอธิบาย: ทำงานในลูปก่อน 1 รอบ แล้วค่อยตรวจสอบเงื่อนไข
 *           (รับประกันว่าจะทำงานอย่างน้อย 1 ครั้งเสมอ)
 * ตัวอย่างการใช้งาน: เมนูระบบ, การตรวจสอบ Input (Validation)
 */

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("=== คำสั่ง Do-While Loop ===");

        Scanner scanner = new Scanner(System.in);
        int score;

        // ตัวอย่าง: บังคับให้ผู้ใช้กรอกคะแนนในช่วง 0-100 เท่านั้น
        // ถ้ากรอกผิด ให้กรอกใหม่วนไปเรื่อยๆ
        do {
            System.out.print("กรุณากรอกคะแนน (0-100): ");
            score = scanner.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("ผิดพลาด! คะแนนต้องอยู่ระหว่าง 0-100");
            }

        } while (score < 0 || score > 100); // ทำซ้ำถ้าคะแนนผิด (น้อยกว่า 0 หรือ มากกว่า 100)

        System.out.println("บันทึกคะแนนเรียบร้อย: " + score);

        // เปรียบเทียบ while vs do-while
        System.out.println("\n-- เปรียบเทียบ --");
        int x = 10;

        // while ตรวจสอบก่อน -> เงื่อนไขเท็จ -> ไม่ทำเลย
        System.out.println("While loop:");
        while (x < 5) {
            System.out.println("ข้อความนี้จะไม่แสดง");
        }

        // do-while ทำก่อน -> แสดง 1 ครั้ง -> ตรวจสอบเงื่อนไขเท็จ -> จบ
        System.out.println("Do-While loop:");
        do {
            System.out.println("ข้อความนี้จะแสดง 1 ครั้งเสมอ");
        } while (x < 5);

        scanner.close();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === คำสั่ง Do-While Loop ===
 * กรุณากรอกคะแนน (0-100): 150
 * ผิดพลาด! คะแนนต้องอยู่ระหว่าง 0-100
 * กรุณากรอกคะแนน (0-100): 80
 * บันทึกคะแนนเรียบร้อย: 80
 * 
 * -- เปรียบเทียบ --
 * While loop:
 * Do-While loop:
 * ข้อความนี้จะแสดง 1 ครั้งเสมอ
 * 
 * หมายเหตุ:
 * - Do-While เหมาะมากกับ User Interface หรือ Input Validation
 * - อย่าลืม ; หลัง while ใน do-while loop
 */
