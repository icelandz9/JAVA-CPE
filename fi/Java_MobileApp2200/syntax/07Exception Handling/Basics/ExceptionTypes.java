/*
 * ชื่อไฟล์: ExceptionTypes.java
 * หัวข้อ: ประเภทของ Exception (Checked vs Unchecked)
 * คำอธิบาย: แสดงความแตกต่างระหว่าง Checked Exception (ต้อง handle)
 *           และ Unchecked Exception (ไม่บังคับ handle)
 *           พร้อมแผนผัง Exception Hierarchy
 * ตัวอย่างการใช้งาน: เลือกวิธีจัดการ Exception ได้ถูกต้อง
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTypes {
    public static void main(String[] args) {
        System.out.println("=== ประเภทของ Exception ===");

        /*
         * แผนผัง Exception Hierarchy:
         *
         *              Throwable
         *              /       \
         *          Error       Exception
         *                      /       \
         *              IOException   RuntimeException
         *          (Checked)         (Unchecked)
         *              |                   |
         *      FileNotFoundException   NullPointerException
         *                              ArithmeticException
         *                              ArrayIndexOutOfBoundsException
         *                              NumberFormatException
         *                              ClassCastException
         */

        // 1. Unchecked Exception (RuntimeException)
        // ไม่บังคับให้เขียน try-catch (แต่เขียนก็ได้)
        // เกิดจากข้อผิดพลาดในโค้ด (Bug)
        System.out.println("\n-- Unchecked Exceptions --");
        try {
            // ArithmeticException
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            // ClassCastException
            Object obj = "Hello";
            Integer num = (Integer) obj; // ไม่สามารถแปลง String เป็น Integer
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        // 2. Checked Exception
        // คอมไพเลอร์ "บังคับ" ให้จัดการ (ด้วย try-catch หรือ throws)
        // มักเกิดจากสาเหตุภายนอก (เช่น ไฟล์ไม่มี, เครือข่ายขัดข้อง)
        System.out.println("\n-- Checked Exceptions --");
        try {
            // FileNotFoundException (Checked)
            FileReader fr = new FileReader("ไฟล์ที่ไม่มีอยู่.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: ไม่พบไฟล์ที่ระบุ");
        }

        // 3. Multiple catch blocks
        System.out.println("\n-- Multiple catch --");
        try {
            int[] arr = {1, 2, 3};
            // อาจเกิดหลาย Exception ได้
            System.out.println(arr[0] / 0);
        } catch (ArithmeticException e) {
            System.out.println("จับได้: คำนวณผิดพลาด");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("จับได้: Index เกินขอบเขต");
        } catch (Exception e) {
            // catch ทั่วไป (ต้องอยู่ล่างสุดเสมอ)
            System.out.println("จับได้: ข้อผิดพลาดอื่นๆ - " + e.getMessage());
        }

        // 4. Multi-catch (Java 7+) — จับหลาย Exception ในบล็อกเดียว
        System.out.println("\n-- Multi-catch (|) --");
        try {
            String s = null;
            s.length();
        } catch (NullPointerException | ArithmeticException e) {
            // ใช้ | คั่นระหว่าง Exception types
            System.out.println("จับได้ (multi-catch): " + e.getClass().getSimpleName());
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === ประเภทของ Exception ===
 * -- Unchecked Exceptions --
 * ArithmeticException: / by zero
 * ClassCastException: ...
 * -- Checked Exceptions --
 * FileNotFoundException: ไม่พบไฟล์ที่ระบุ
 * -- Multiple catch --
 * จับได้: คำนวณผิดพลาด
 * -- Multi-catch (|) --
 * จับได้ (multi-catch): NullPointerException
 *
 * หมายเหตุ:
 * - Checked Exception ถ้าไม่ handle → คอมไพล์ไม่ผ่าน
 * - Unchecked Exception ถ้าไม่ handle → คอมไพล์ผ่าน แต่อาจ crash ตอน runtime
 * - catch block ต้องเรียงจาก specific → general (ลูก → แม่)
 */
