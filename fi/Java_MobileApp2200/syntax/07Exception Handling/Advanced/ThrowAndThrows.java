/*
 * ชื่อไฟล์: ThrowAndThrows.java
 * หัวข้อ: คำสั่ง throw กับ throws (เปรียบเทียบ)
 * คำอธิบาย: throw  = โยน Exception ด้วยตัวเอง (ภายในเมธอด)
 *           throws = ประกาศว่าเมธอดนี้อาจโยน Exception (ให้คนเรียกจัดการ)
 * ตัวอย่างการใช้งาน: Validation ข้อมูล, ส่งต่อ Exception ให้ caller จัดการ
 */

import java.io.IOException;

public class ThrowAndThrows {
    public static void main(String[] args) {
        System.out.println("=== throw vs throws ===");

        // ตัวอย่างที่ 1: ใช้ throw เพื่อโยน Exception เอง
        System.out.println("\n-- throw: ตรวจสอบอายุ --");
        try {
            checkAge(15); // อายุไม่ถึง → จะโยน Exception
        } catch (IllegalArgumentException e) {
            System.out.println("จับ Exception ได้: " + e.getMessage());
        }

        try {
            checkAge(20); // อายุถึง → ทำงานปกติ
        } catch (IllegalArgumentException e) {
            System.out.println("จับ Exception ได้: " + e.getMessage());
        }

        // ตัวอย่างที่ 2: ใช้ throws เพื่อส่งต่อ Exception
        System.out.println("\n-- throws: อ่านไฟล์ --");
        try {
            readFile("data.txt"); // เมธอดนี้ throws IOException
        } catch (IOException e) {
            System.out.println("จัดการใน main: " + e.getMessage());
        }

        // ตัวอย่างที่ 3: throw + throws ใช้ร่วมกัน
        System.out.println("\n-- throw + throws ร่วมกัน --");
        try {
            withdraw(5000, 3000); // ถอนเงินเกินยอด
        } catch (Exception e) {
            System.out.println("ธุรกรรมล้มเหลว: " + e.getMessage());
        }
    }

    // --- throw: โยน Exception เองภายในเมธอด ---
    // ใช้เมื่อต้องการตรวจสอบเงื่อนไขและบังคับให้เกิด Exception
    static void checkAge(int age) {
        if (age < 18) {
            // throw new <ExceptionType>("ข้อความ");
            throw new IllegalArgumentException("อายุต้องมากกว่าหรือเท่ากับ 18 (ได้รับ: " + age + ")");
        }
        System.out.println("อายุ " + age + " ปี — ผ่านเกณฑ์!");
    }

    // --- throws: ประกาศว่าเมธอดอาจโยน Exception ---
    // ใช้เมื่อไม่ต้องการจัดการ Exception ในเมธอดนี้ แต่ส่งต่อให้คนเรียก
    static void readFile(String filename) throws IOException {
        // สมมติว่าอ่านไฟล์แล้วเกิดปัญหา
        throw new IOException("ไม่สามารถอ่านไฟล์ '" + filename + "' ได้");
    }

    // --- throw + throws ร่วมกัน ---
    static void withdraw(double amount, double balance) throws Exception {
        if (amount > balance) {
            throw new Exception("ยอดเงินไม่เพียงพอ (ต้องการ: " + amount + ", มี: " + balance + ")");
        }
        System.out.println("ถอนเงินสำเร็จ: " + amount + " บาท");
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === throw vs throws ===
 * -- throw: ตรวจสอบอายุ --
 * จับ Exception ได้: อายุต้องมากกว่าหรือเท่ากับ 18 (ได้รับ: 15)
 * อายุ 20 ปี — ผ่านเกณฑ์!
 * -- throws: อ่านไฟล์ --
 * จัดการใน main: ไม่สามารถอ่านไฟล์ 'data.txt' ได้
 * -- throw + throws ร่วมกัน --
 * ธุรกรรมล้มเหลว: ยอดเงินไม่เพียงพอ (ต้องการ: 5000.0, มี: 3000.0)
 *
 * หมายเหตุ:
 * - throw ใช้ "ภายใน" เมธอด เพื่อโยน Exception ทันที
 * - throws ใช้ "หลังชื่อเมธอด" เพื่อบอกว่าเมธอดอาจโยน Exception
 * - throws บังคับให้คนเรียกเมธอดต้อง try-catch หรือ throws ต่อ
 */
