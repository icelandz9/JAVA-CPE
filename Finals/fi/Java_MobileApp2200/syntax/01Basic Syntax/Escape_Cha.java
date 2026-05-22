/*
 * ชื่อไฟล์: EscapeCharacters.java
 * หัวข้อ: อักขระควบคุม (Escape Characters)
 * คำอธิบาย: การใช้งานอักขระพิเศษเพื่อจัดรูปแบบข้อความ เช่น
 *           การเว้นวรรค (Tab), การขึ้นบรรทัดใหม่ (Newline), และการแสดงเครื่องหมายพิเศษ
 * ตัวอย่างการใช้งาน: การจัดระเบียบตาราง, การแสดงผลข้อความที่มี " หรือ '
 */

public class Escape_Cha {
    public static void main(String[] args) {
        System.out.println("=== การใช้งาน Escape Characters ===");

        // 1. \t (Tab) - ใช้สำหรับเว้นวรรคเป็นช่องไฟ (คล้ายกดปุ่ม Tab)
        // เหมาะสำหรับการจัดข้อความให้ตรงกันเป็นคอลัมน์
        System.out.println("1. การใช้ \\t (Tab):");
        System.out.println("Name\tAge\tCountry");
        System.out.println("John\t25\tUSA");
        System.out.println("Somchai\t30\tThailand");
        System.out.println("Ken\t28\tJapan");
        System.out.println("--------------------------------");

        // 2. \n (Newline) - ใช้สำหรับขึ้นบรรทัดใหม่
        System.out.println("2. การใช้ \\n (Newline):");
        System.out.println("บรรทัดที่ 1\nบรรทัดที่ 2\nบรรทัดที่ 3");
        System.out.println("--------------------------------");

        // 3. \" และ \' (Double Quote / Single Quote)
        // ใช้เมื่อต้องการแสดงเครื่องหมาย " หรือ ' ในข้อความ (String)
        System.out.println("3. การแสดงเครื่องหมายคำพูด:");
        System.out.println("เขากล่าวว่า \"สวัสดีครับ\" ด้วยรอยยิ้ม");
        System.out.println("I\'m learning Java programming.");
        System.out.println("--------------------------------");

        // 4. \\ (Backslash) - ใช้เมื่อต้องการแสดงเครื่องหมาย \ เอง
        System.out.println("4. การแสดงเครื่องหมาย Backslash (\\):");
        System.out.println("Path ของไฟล์คือ: C:\\Windows\\System32");
        System.out.println("--------------------------------");

        // 5. \b (Backspace) - ลบตัวอักษรหน้า cursor 1 ตัว (ไม่ค่อยได้ใช้บ่อยนัก)
        System.out.println("5. การใช้ \\b (Backspace):");
        System.out.println("Hello World\b!"); // World จะถูกลบตัว d ออกแล้วแทนที่ด้วย ! (ขึ้นอยู่กับ Console)
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การใช้งาน Escape Characters ===
 * 1. การใช้ \t (Tab):
 * Name Age Country
 * John 25 USA
 * Somchai 30 Thailand
 * Ken 28 Japan
 * --------------------------------
 * 2. การใช้ \n (Newline):
 * บรรทัดที่ 1
 * บรรทัดที่ 2
 * บรรทัดที่ 3
 * --------------------------------
 * 3. การแสดงเครื่องหมายคำพูด:
 * เขากล่าวว่า "สวัสดีครับ" ด้วยรอยยิ้ม
 * I'm learning Java programming.
 * --------------------------------
 * 4. การแสดงเครื่องหมาย Backslash (\):
 * Path ของไฟล์คือ: C:\Windows\System32
 * --------------------------------
 * 5. การใช้ \b (Backspace):
 * Hello Worl!
 */
