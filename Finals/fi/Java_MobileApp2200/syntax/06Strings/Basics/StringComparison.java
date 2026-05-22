/*
 * ชื่อไฟล์: StringComparison.java
 * หัวข้อ: การเปรียบเทียบสตริง (String Comparison)
 * คำอธิบาย: ห้ามใช้ == ในการเปรียบเทียบเนื้อหา String เด็ดขาด!
 *           ต้องใช้ .equals() หรือ .equalsIgnoreCase() เท่านั้น
 */

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        System.out.println("=== การเปรียบเทียบ String ===");

        String pass1 = "password123";
        String pass2 = "PASSWORD123";

        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณากรอกรหัสผ่าน (password123): ");
        String input = sc.nextLine();

        // 1. เปรียบเทียบแบบคำนึงถึงตัวพิมพ์เล็ก-ใหญ่ (Case Sensitive)
        System.out.println("\n-- ใช้ equals() --");
        if (input.equals(pass1)) {
            System.out.println("รหัสผ่านถูกต้อง (ตรงเป๊ะ)");
        } else {
            System.out.println("รหัสผ่านผิด (Case Sensitive)");
        }

        // 2. เปรียบเทียบแบบไม่สนตัวพิมพ์ (Case Insensitive)
        System.out.println("\n-- ใช้ equalsIgnoreCase() --");
        if (input.equalsIgnoreCase(pass1)) {
            System.out.println("รหัสผ่านถูกต้อง (ไม่สนตัวพิมพ์)");
        } else {
            System.out.println("รหัสผ่านผิดแน่นอน");
        }

        // 3. เปรียบเทียบเพื่อการเรียงลำดับ (compareTo)
        // คืนค่า 0 (เท่ากัน), <0 (มาก่อน), >0 (มาทีหลัง)
        System.out.println("\n-- ใช้ compareTo() สำหรับเรียงลำดับ --");
        String s1 = "Apple";
        String s2 = "Banana";

        int result = s1.compareTo(s2);

        if (result < 0) {
            System.out.println(s1 + " มาก่อน " + s2);
        } else if (result > 0) {
            System.out.println(s1 + " มาทีหลัง " + s2);
        } else {
            System.out.println("เหมือนกันเป๊ะ");
        }

        sc.close();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การเปรียบเทียบ String ===
 * กรุณากรอกรหัสผ่าน (password123): Password123
 * 
 * -- ใช้ equals() --
 * รหัสผ่านผิด (Case Sensitive)
 * 
 * -- ใช้ equalsIgnoreCase() --
 * รหัสผ่านถูกต้อง (ไม่สนตัวพิมพ์)
 * 
 * -- ใช้ compareTo() สำหรับเรียงลำดับ --
 * Apple มาก่อน Banana
 * 
 * หมายเหตุ:
 * - โปรดจำให้ขึ้นใจ: String เทียบกันให้ใช้ .equals() เสมอ!
 */
