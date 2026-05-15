/*
 * ชื่อไฟล์: TryCatchFinally.java
 * หัวข้อ: การจัดการข้อผิดพลาดด้วย try-catch-finally
 * คำอธิบาย: แสดงโครงสร้างพื้นฐานของ Exception Handling ใน Java
 *           try   = บล็อกที่อาจเกิดข้อผิดพลาด
 *           catch = บล็อกที่รับมือเมื่อเกิดข้อผิดพลาด
 *           finally = บล็อกที่ทำงานเสมอไม่ว่าจะเกิด Exception หรือไม่
 * ตัวอย่างการใช้งาน: ป้องกันโปรแกรมหยุดทำงานกะทันหัน
 */

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("=== try-catch-finally ===");

        // ตัวอย่างที่ 1: ArithmeticException (หารด้วย 0)
        System.out.println("-- ตัวอย่างที่ 1: หารด้วย 0 --");
        try {
            int result = 10 / 0; // จะเกิด ArithmeticException
            System.out.println("ผลลัพธ์: " + result); // บรรทัดนี้จะไม่ทำงาน
        } catch (ArithmeticException e) {
            // จับ Exception ที่เกิดขึ้น
            System.out.println("เกิดข้อผิดพลาด: " + e.getMessage());
        } finally {
            // ทำงานเสมอ ไม่ว่าจะเกิด Exception หรือไม่
            System.out.println("finally: ส่วนนี้ทำงานเสมอ!");
        }

        // ตัวอย่างที่ 2: ArrayIndexOutOfBoundsException
        System.out.println("\n-- ตัวอย่างที่ 2: เข้าถึง Index เกินขอบเขต --");
        try {
            int[] arr = {10, 20, 30};
            System.out.println("arr[0] = " + arr[0]); // ทำงานปกติ
            System.out.println("arr[5] = " + arr[5]); // Error! Index เกิน
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("เกิดข้อผิดพลาด: Index เกินขอบเขตอาร์เรย์");
            System.out.println("รายละเอียด: " + e.getMessage());
        }

        // ตัวอย่างที่ 3: NumberFormatException
        System.out.println("\n-- ตัวอย่างที่ 3: แปลง String เป็นตัวเลข --");
        try {
            String text = "abc";
            int num = Integer.parseInt(text); // ไม่สามารถแปลง "abc" เป็น int
        } catch (NumberFormatException e) {
            System.out.println("แปลงไม่ได้: '" + e.getMessage() + "' ไม่ใช่ตัวเลข");
        }

        // ตัวอย่างที่ 4: NullPointerException
        System.out.println("\n-- ตัวอย่างที่ 4: null reference --");
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("ไม่สามารถเรียกเมธอดจาก null ได้");
        }

        System.out.println("\nโปรแกรมยังทำงานต่อได้ปกติ!");
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === try-catch-finally ===
 * -- ตัวอย่างที่ 1: หารด้วย 0 --
 * เกิดข้อผิดพลาด: / by zero
 * finally: ส่วนนี้ทำงานเสมอ!
 * -- ตัวอย่างที่ 2: เข้าถึง Index เกินขอบเขต --
 * arr[0] = 10
 * เกิดข้อผิดพลาด: Index เกินขอบเขตอาร์เรย์
 * -- ตัวอย่างที่ 3: แปลง String เป็นตัวเลข --
 * แปลงไม่ได้: 'For input string: "abc"' ไม่ใช่ตัวเลข
 * -- ตัวอย่างที่ 4: null reference --
 * ไม่สามารถเรียกเมธอดจาก null ได้
 * โปรแกรมยังทำงานต่อได้ปกติ!
 *
 * หมายเหตุ:
 * - ถ้าไม่มี try-catch โปรแกรมจะหยุดทำงานทันทีที่เกิด Exception
 * - finally ใช้บ่อยสำหรับปิด Resource (เช่น ปิดไฟล์, ปิดการเชื่อมต่อ)
 * - เมื่อเกิด Exception ใน try โค้ดที่เหลือใน try จะถูกข้ามไป
 */
