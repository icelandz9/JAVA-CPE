/*
 * ชื่อไฟล์: StringSearch.java
 * หัวข้อ: การค้นหาข้อความ (Searching)
 * คำอธิบาย: .indexOf(), .lastIndexOf(), .contains(), .startsWith(), .endsWith()
 */

public class StringSearch {
    public static void main(String[] args) {
        System.out.println("=== การค้นหาข้อความ ===");

        String text = "The quick brown fox jumps over the lazy dog";

        // 1. ค้นหาตำแหน่ง (.indexOf())
        // คืนค่า index แรกที่เจอ, ถ้าไม่เจอคืน -1
        System.out.println("Index ของ 'quick': " + text.indexOf("quick"));
        System.out.println("Index ของ 'cat': " + text.indexOf("cat"));

        // ค้นหาตำแหน่งถัดไป (เริ่มหาจาก index 20)
        System.out.println("Index ของ 'the' (ตัวแรก): " + text.indexOf("the")); // 31 (ผิด! เพราะ case sensitive 'T' !=
                                                                                // 't')
        // แก้ไข: 'T' อยู่ที่ 0, 't' อยู่ที่ 31

        // 2. ค้นหาจากท้าย (.lastIndexOf())
        System.out.println("Last Index ของ 'o': " + text.lastIndexOf("o"));

        // 3. ตรวจสอบว่ามีไหม (.contains()) -> คืนค่า boolean
        if (text.contains("fox")) {
            System.out.println("เจอคำว่า fox");
        }

        // 4. ตรวจสอบคำขึ้นต้น/ลงท้าย (.startsWith(), .endsWith())
        System.out.println("ขึ้นต้นด้วย 'The': " + text.startsWith("The"));
        System.out.println("ลงท้ายด้วย 'dog': " + text.endsWith("dog"));

        // ตัวอย่างการตรวจสอบไฟล์นามสกุล
        String filename = "report.docx";
        if (filename.endsWith(".pdf")) {
            System.out.println("ไฟล์ PDF");
        } else if (filename.endsWith(".docx")) {
            System.out.println("ไฟล์ Word");
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การค้นหาข้อความ ===
 * Index ของ 'quick': 4
 * Index ของ 'cat': -1
 * Index ของ 'the' (ตัวแรก): 31
 * Last Index ของ 'o': 41
 * เจอคำว่า fox
 * ขึ้นต้นด้วย 'The': true
 * ลงท้ายด้วย 'dog': true
 * ไฟล์ Word
 * 
 * หมายเหตุ:
 * - indexOf() มีประโยชน์มากในการ Parsing ข้อมูล (หาจุดตัด)
 */
