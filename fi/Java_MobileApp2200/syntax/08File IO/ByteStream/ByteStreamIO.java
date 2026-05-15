/*
 * ชื่อไฟล์: ByteStreamIO.java
 * หัวข้อ: การอ่าน/เขียนไฟล์ด้วย Byte Stream
 * คำอธิบาย: FileInputStream อ่านไฟล์ทีละ byte
 *           FileOutputStream เขียนไฟล์ทีละ byte
 *           เหมาะสำหรับไฟล์ไบนารี (รูปภาพ, เสียง)
 * ตัวอย่างการใช้งาน: คัดลอกไฟล์, อ่านข้อมูลดิบ
 */

import java.io.*;

public class ByteStreamIO {
    public static void main(String[] args) {
        System.out.println("=== Byte Stream I/O ===");

        // 1. เขียนไฟล์ด้วย FileOutputStream
        System.out.println("-- เขียนไฟล์ --");
        try (FileOutputStream fos = new FileOutputStream("byte_test.txt")) {
            String data = "Hello Java Byte Stream!";
            fos.write(data.getBytes()); // แปลง String → byte[] แล้วเขียน
            System.out.println("เขียนไฟล์สำเร็จ");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. อ่านไฟล์ด้วย FileInputStream
        System.out.println("\n-- อ่านไฟล์ทีละ byte --");
        try (FileInputStream fis = new FileInputStream("byte_test.txt")) {
            int byteData;
            // read() คืน -1 เมื่อถึงจุดสิ้นสุดไฟล์ (EOF)
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // แปลง byte → char
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 3. อ่านทีละ buffer (เร็วกว่า)
        System.out.println("\n-- อ่านไฟล์ทีละ buffer --");
        try (FileInputStream fis = new FileInputStream("byte_test.txt")) {
            byte[] buffer = new byte[1024]; // อ่านครั้งละ 1024 bytes
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 4. เขียนต่อท้ายไฟล์ (Append mode)
        System.out.println("\n-- เขียนต่อท้าย (append) --");
        try (FileOutputStream fos = new FileOutputStream("byte_test.txt", true)) {
            // true = append mode (ไม่ลบข้อมูลเดิม)
            fos.write("\nAppended line!".getBytes());
            System.out.println("เขียนต่อท้ายสำเร็จ");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
 * ผลลัพธ์: เขียนไฟล์สำเร็จ → Hello Java Byte Stream!
 * หมายเหตุ:
 * - Byte Stream เหมาะกับไฟล์ไบนารี (รูป, เสียง, วิดีโอ)
 * - สำหรับไฟล์ข้อความ ควรใช้ Character Stream แทน (มี encoding)
 * - อ่านทีละ buffer เร็วกว่าทีละ byte มาก
 */
