/*
 * ชื่อไฟล์: CharacterClass.java
 * หัวข้อ: คลาส Character
 * คำอธิบาย: Wrapper Class ของ char ที่มีเมธอดตรวจสอบประเภทตัวอักษร (.isLetter, .isDigit, etc.)
 * ตัวอย่างการใช้งาน: ตรวจสอบความปลอดภัยรหัสผ่าน (ต้องมีตัวเลข, ตัวใหญ่, ตัวเล็ก)
 */

public class CharacterClass {
    public static void main(String[] args) {
        System.out.println("=== Character Class Methods ===");

        char c1 = 'A';
        char c2 = '9';
        char c3 = ' ';
        char c4 = '$';

        System.out.println("ตรวจสอบตัวอักษร 'A':");
        System.out.println("- isLetter: " + Character.isLetter(c1));
        System.out.println("- isDigit: " + Character.isDigit(c1));
        System.out.println("- isUpperCase: " + Character.isUpperCase(c1));

        System.out.println("\nตรวจสอบตัวอักษร '9':");
        System.out.println("- isDigit: " + Character.isDigit(c2));

        System.out.println("\nตรวจสอบช่องว่าง ' ':");
        System.out.println("- isWhitespace: " + Character.isWhitespace(c3));

        // ตัวอย่างการใช้งาน: นับจำนวนตัวเลขในข้อความ
        System.out.println("\n-- ตัวอย่าง: นับจำนวนตัวเลขในข้อความ --");
        String text = "Room 101, Building 5";
        int digitCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("ข้อความ: " + text);
        System.out.println("มีตัวเลขทั้งหมด: " + digitCount + " ตัว");
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Character Class Methods ===
 * ตรวจสอบตัวอักษร 'A':
 * - isLetter: true
 * - isDigit: false
 * - isUpperCase: true
 * 
 * ...
 * 
 * -- ตัวอย่าง: นับจำนวนตัวเลขในข้อความ --
 * ข้อความ: Room 101, Building 5
 * มีตัวเลขทั้งหมด: 4 ตัว
 * 
 * หมายเหตุ:
 * - ใช้ Character.toString(char) เพื่อแปลง char เป็น String ได้
 */
