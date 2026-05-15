/*
 * ชื่อไฟล์: TryWithResources.java
 * หัวข้อ: try-with-resources (Auto-Closeable)
 * คำอธิบาย: ปิด Resource อัตโนมัติโดยไม่ต้องเขียน finally
 *           Resource ต้อง implement AutoCloseable interface
 * ตัวอย่างการใช้งาน: อ่าน/เขียนไฟล์, เชื่อมต่อ Database
 */

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        System.out.println("=== try-with-resources ===");

        // แบบเก่า: ต้องปิด resource ใน finally
        System.out.println("-- แบบเก่า (finally) --");
        BufferedReader br1 = null;
        try {
            br1 = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br1.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br1 != null) br1.close(); // ต้องปิดเอง + ต้อง try-catch อีกชั้น!
            } catch (IOException e) {
                System.out.println("Error closing: " + e.getMessage());
            }
        }

        // แบบใหม่ (Java 7+): try-with-resources
        // Resource จะถูกปิดอัตโนมัติเมื่อออกจากบล็อก try
        System.out.println("\n-- แบบใหม่ (try-with-resources) --");
        try (BufferedReader br2 = new BufferedReader(new FileReader("test.txt"))) {
            // br2 จะถูก .close() อัตโนมัติเมื่อจบบล็อก
            String line = br2.readLine();
            System.out.println("อ่านได้: " + line);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // ไม่ต้องเขียน finally เลย!

        // หลาย Resources ในบล็อกเดียว (คั่นด้วย ;)
        System.out.println("\n-- หลาย Resources --");
        try (
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output.txt")
        ) {
            // ทั้ง fr และ fw จะถูกปิดอัตโนมัติ
            fw.write("Hello");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
 * หมายเหตุ:
 * - Resource ใน try() ต้อง implement AutoCloseable หรือ Closeable
 * - Resource ถูกปิดในลำดับ "ย้อนกลับ" (ตัวสุดท้ายปิดก่อน)
 * - สะอาดกว่า finally มาก → แนะนำให้ใช้แบบนี้เสมอ
 */
