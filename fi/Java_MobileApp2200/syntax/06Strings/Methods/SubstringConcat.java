/*
 * ชื่อไฟล์: SubstringConcat.java
 * หัวข้อ: การตัดคำและต่อคำ (.substring(), .concat())
 * คำอธิบาย: การดึงบางส่วนของข้อความ และการนำข้อความมาต่อกัน
 */

public class SubstringConcat {
    public static void main(String[] args) {
        System.out.println("=== .substring() และ .concat() ===");

        String text = "Hello World Java";

        // 1. ตัดคำ (.substring(beginIndex))
        // ตัดตั้งแต่ index ที่กำหนด จนจบข้อความ
        String sub1 = text.substring(6);
        System.out.println("substring(6): " + sub1); // "World Java"

        // 2. ตัดคำ (.substring(begin, end))
        // ตัดตั้งแต่ begin ถึง end-1 (ไม่รวม end)
        String sub2 = text.substring(0, 5);
        System.out.println("substring(0, 5): " + sub2); // "Hello" (ตัวที่ 0-4)

        String sub3 = text.substring(6, 11);
        System.out.println("substring(6, 11): " + sub3); // "World"

        // 3. ต่อคำ (.concat() หรือ +)
        System.out.println("\n-- การต่อคำ --");
        String s1 = "Hello";
        String s2 = "World";

        String res1 = s1.concat(" ").concat(s2); // ใช้ method
        System.out.println("ใช้ .concat(): " + res1);

        String res2 = s1 + " " + s2 + "!"; // ใช้ operator + (นิยมกว่า)
        System.out.println("ใช้ + operator: " + res2);

        // ตัวอย่างการแยกชื่อ-นามสกุล (สมมติว่ารู้ตำแหน่งเว้นวรรค)
        String fullName = "Somchai Jaidee";
        int spaceIndex = fullName.indexOf(' '); // หาตำแหน่งเว้นวรรค

        String name = fullName.substring(0, spaceIndex);
        String surname = fullName.substring(spaceIndex + 1);

        System.out.println("\nชื่อ: " + name);
        System.out.println("นามสกุล: " + surname);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === .substring() และ .concat() ===
 * substring(6): World Java
 * substring(0, 5): Hello
 * substring(6, 11): World
 * 
 * -- การต่อคำ --
 * ใช้ .concat(): Hello World
 * ใช้ + operator: Hello World!
 * 
 * ชื่อ: Somchai
 * นามสกุล: Jaidee
 * 
 * หมายเหตุ:
 * - .substring() ใช้บ่อยมากในการจัดการข้อความที่รู้ pattern แน่นอน
 */
