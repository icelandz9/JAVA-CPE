/*
 * ชื่อไฟล์: ScannerFileRead.java
 * หัวข้อ: อ่านไฟล์ด้วย Scanner
 * คำอธิบาย: ใช้ Scanner อ่านไฟล์เหมือนอ่าน input จาก keyboard
 *           สะดวกเพราะมี nextInt(), nextDouble(), nextLine()
 * ตัวอย่างการใช้งาน: อ่านข้อมูลตัวเลขจากไฟล์, อ่าน CSV อย่างง่าย
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileRead {
    public static void main(String[] args) {
        System.out.println("=== อ่านไฟล์ด้วย Scanner ===");

        // 1. อ่านทีละบรรทัด
        System.out.println("-- อ่านทีละบรรทัด --");
        try {
            Scanner sc = new Scanner(new File("data.txt"));
            int lineNum = 1;
            while (sc.hasNextLine()) {        // มีบรรทัดถัดไปหรือไม่?
                String line = sc.nextLine();  // อ่านทั้งบรรทัด
                System.out.println(lineNum + ": " + line);
                lineNum++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ไม่พบไฟล์: " + e.getMessage());
        }

        // 2. อ่านทีละ token (คำ)
        System.out.println("\n-- อ่านทีละ token --");
        try {
            Scanner sc = new Scanner(new File("data.txt"));
            while (sc.hasNext()) {        // มี token ถัดไปหรือไม่?
                String word = sc.next();  // อ่านทีละคำ (แยกด้วยช่องว่าง)
                System.out.println("token: " + word);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ไม่พบไฟล์: " + e.getMessage());
        }

        // 3. อ่านตัวเลข
        System.out.println("\n-- อ่านตัวเลขจากไฟล์ --");
        try {
            // สมมติ numbers.txt มีเนื้อหา: 10 20 30 40 50
            Scanner sc = new Scanner(new File("numbers.txt"));
            int sum = 0;
            while (sc.hasNextInt()) {     // มีตัวเลข int ถัดไป?
                int num = sc.nextInt();
                sum += num;
                System.out.println("อ่านได้: " + num);
            }
            System.out.println("ผลรวม: " + sum);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ไม่พบไฟล์: " + e.getMessage());
        }
    }
}

/*
 * หมายเหตุ:
 * - Scanner(new File(...)) ต้อง handle FileNotFoundException
 * - hasNextLine()/hasNext()/hasNextInt() ตรวจก่อนอ่านเสมอ
 * - Scanner อ่านง่ายแต่ช้ากว่า BufferedReader สำหรับไฟล์ใหญ่
 * - อย่าลืม close() หรือใช้ try-with-resources
 */
