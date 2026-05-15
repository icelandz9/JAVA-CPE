/*
 * ชื่อไฟล์: PrintWriterExample.java
 * หัวข้อ: เขียนไฟล์ด้วย PrintWriter
 * คำอธิบาย: PrintWriter เขียนไฟล์ได้สะดวกเหมือน System.out
 *           มี print(), println(), printf() ครบ
 * ตัวอย่างการใช้งาน: สร้างรายงาน, บันทึก log, export ข้อมูล
 */

import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) {
        System.out.println("=== PrintWriter ===");

        // 1. เขียนไฟล์พื้นฐาน
        try (PrintWriter pw = new PrintWriter("report.txt")) {
            pw.println("=== รายงานผลสอบ ===");
            pw.println("ชื่อ: สมชาย");
            pw.println("คะแนน: 85");
            pw.printf("เกรด: %s%n", "A");    // printf ก็ใช้ได้!
            pw.print("สถานะ: ผ่าน");          // print ไม่ขึ้นบรรทัดใหม่
            System.out.println("เขียน report.txt สำเร็จ");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. เขียนต่อท้ายไฟล์ (Append)
        try (PrintWriter pw = new PrintWriter(new FileWriter("report.txt", true))) {
            pw.println(); // ขึ้นบรรทัดใหม่
            pw.println("--- เพิ่มเติม ---");
            pw.println("หมายเหตุ: สอบผ่านทุกวิชา");
            System.out.println("Append สำเร็จ");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 3. เขียนข้อมูลแบบ formatted (ตาราง)
        try (PrintWriter pw = new PrintWriter("scores.txt")) {
            pw.printf("%-10s %-8s %-6s%n", "ชื่อ", "คะแนน", "เกรด");
            pw.printf("%-10s %-8d %-6s%n", "สมชาย", 85, "A");
            pw.printf("%-10s %-8d %-6s%n", "สมศรี", 72, "B");
            pw.printf("%-10s %-8d %-6s%n", "สมหมาย", 60, "C");
            System.out.println("เขียน scores.txt สำเร็จ");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
 * หมายเหตุ:
 * - PrintWriter ใช้ง่ายที่สุดสำหรับเขียนไฟล์ข้อความ
 * - ต่างจาก FileWriter ตรงที่มี println/printf ให้ใช้
 * - PrintWriter(String) สร้างไฟล์ใหม่ (ลบเนื้อหาเดิม)
 * - PrintWriter(new FileWriter(..., true)) เขียนต่อท้าย
 */
