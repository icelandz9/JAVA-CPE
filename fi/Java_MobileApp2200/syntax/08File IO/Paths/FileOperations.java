/*
 * ชื่อไฟล์: FileOperations.java
 * หัวข้อ: จัดการไฟล์และโฟลเดอร์ด้วย File class
 * คำอธิบาย: ตรวจสอบ, สร้าง, ลบ, แสดงรายการไฟล์/โฟลเดอร์
 * ตัวอย่างการใช้งาน: เช็คว่าไฟล์มีอยู่ไหม, สร้างโฟลเดอร์, หาขนาดไฟล์
 */

import java.io.File;

public class FileOperations {
    public static void main(String[] args) {
        System.out.println("=== File Operations ===");

        // 1. สร้าง File object (ยังไม่ได้สร้างไฟล์จริง)
        File file = new File("test_file.txt");
        File dir = new File("test_folder");

        // 2. ตรวจสอบไฟล์
        System.out.println("-- ตรวจสอบไฟล์ --");
        System.out.println("มีอยู่ไหม: " + file.exists());
        System.out.println("เป็นไฟล์: " + file.isFile());
        System.out.println("เป็นโฟลเดอร์: " + file.isDirectory());
        System.out.println("อ่านได้: " + file.canRead());
        System.out.println("เขียนได้: " + file.canWrite());

        // 3. ข้อมูลไฟล์
        System.out.println("\n-- ข้อมูลไฟล์ --");
        System.out.println("ชื่อ: " + file.getName());
        System.out.println("path: " + file.getPath());
        System.out.println("absolute path: " + file.getAbsolutePath());
        if (file.exists()) {
            System.out.println("ขนาด: " + file.length() + " bytes");
        }

        // 4. สร้างโฟลเดอร์
        System.out.println("\n-- สร้างโฟลเดอร์ --");
        if (!dir.exists()) {
            boolean created = dir.mkdir();  // สร้างโฟลเดอร์เดียว
            // dir.mkdirs(); // สร้างทั้ง path (ถ้า parent ไม่มี)
            System.out.println("สร้าง " + dir.getName() + ": " + created);
        }

        // 5. แสดงรายการไฟล์ในโฟลเดอร์
        System.out.println("\n-- รายการไฟล์ในโฟลเดอร์ปัจจุบัน --");
        File currentDir = new File(".");
        String[] files = currentDir.list();
        if (files != null) {
            for (String f : files) {
                System.out.println("  " + f);
            }
        }

        // 6. ลบไฟล์/โฟลเดอร์
        // boolean deleted = file.delete();
        // dir.delete(); // ลบได้เฉพาะโฟลเดอร์ว่าง
    }
}

/*
 * หมายเหตุ:
 * - new File(...) ไม่ได้สร้างไฟล์จริง แค่สร้าง object อ้างอิง
 * - mkdir() สร้างโฟลเดอร์เดียว | mkdirs() สร้างทั้ง path
 * - delete() ลบโฟลเดอร์ได้เฉพาะที่ว่างเปล่า
 * - ใช้ getAbsolutePath() เพื่อดู path เต็ม
 */
