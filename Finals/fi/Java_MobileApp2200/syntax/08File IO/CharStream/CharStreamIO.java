/*
 * ชื่อไฟล์: CharStreamIO.java
 * หัวข้อ: การอ่าน/เขียนไฟล์ด้วย Character Stream
 * คำอธิบาย: FileReader/FileWriter อ่าน-เขียนทีละตัวอักษร (รองรับ Unicode)
 *           BufferedReader/BufferedWriter เพิ่มประสิทธิภาพด้วย buffer
 * ตัวอย่างการใช้งาน: อ่าน/เขียนไฟล์ข้อความ (.txt, .csv)
 */

import java.io.*;

public class CharStreamIO {
    public static void main(String[] args) {
        System.out.println("=== Character Stream I/O ===");

        // 1. เขียนด้วย FileWriter
        System.out.println("-- FileWriter --");
        try (FileWriter fw = new FileWriter("char_test.txt")) {
            fw.write("สวัสดี Java!\n");
            fw.write("บรรทัดที่ 2\n");
            fw.write("Line 3");
            System.out.println("เขียนไฟล์สำเร็จ");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. อ่านด้วย FileReader (ทีละตัวอักษร)
        System.out.println("\n-- FileReader --");
        try (FileReader fr = new FileReader("char_test.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 3. BufferedWriter + BufferedReader (แนะนำ — เร็วกว่า)
        System.out.println("\n\n-- Buffered Writer/Reader --");
        // เขียน
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered_test.txt"))) {
            bw.write("บรรทัดที่ 1");
            bw.newLine(); // ขึ้นบรรทัดใหม่ (platform-independent)
            bw.write("บรรทัดที่ 2");
            bw.newLine();
            bw.write("บรรทัดที่ 3");
            System.out.println("Buffered เขียนสำเร็จ");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // อ่านทีละบรรทัด (readLine)
        try (BufferedReader br = new BufferedReader(new FileReader("buffered_test.txt"))) {
            String line;
            int lineNum = 1;
            while ((line = br.readLine()) != null) { // null = EOF
                System.out.println(lineNum + ": " + line);
                lineNum++;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
 * ผลลัพธ์: เขียน/อ่านข้อความภาษาไทย+อังกฤษได้ปกติ
 * หมายเหตุ:
 * - Character Stream รองรับ Unicode (ภาษาไทย, อีโมจิ)
 * - BufferedReader.readLine() อ่านทีละบรรทัด → ใช้บ่อยที่สุด
 * - BufferedWriter.newLine() ขึ้นบรรทัดใหม่แบบข้าม platform
 * - Buffered เร็วกว่า เพราะลดจำนวนครั้งที่เข้าถึง disk
 */
