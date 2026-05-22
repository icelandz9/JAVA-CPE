/*
 * ชื่อไฟล์: WhileLoop.java
 * หัวข้อ: คำสั่งวนซ้ำ While Loop
 * คำอธิบาย: วนซ้ำตราบเท่าที่เงื่อนไขยังเป็นจริง (ตรวจสอบเงื่อนไขก่อนทำ)
 * ตัวอย่างการใช้งาน: นับเลข, วนรับค่าจนกว่าจะใส่ถูกต้อง
 */

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("=== คำสั่ง While Loop ===");

        // ตัวอย่างที่ 1: นับเลข 1 ถึง 5
        System.out.println("-- นับเลข 1-5 --");
        int count = 1; // เริ่มต้น (Initialization)

        while (count <= 5) { // ตรวจสอบเงื่อนไข (Condition)
            System.out.println("รอบที่: " + count);
            count++; // เปลี่ยนแปลงค่า (Update) ***สำคัญมาก ถ้าลืมจะเป็น Infinite Loop***
        }

        // ตัวอย่างที่ 2: วนรับค่าจากผู้ใช้จนกว่าจะถูกต้อง
        System.out.println("\n-- วนรับค่าจนกว่าจะพิมพ์ 0 --");
        Scanner scanner = new Scanner(System.in);
        int input = -1; // กำหนดค่าเริ่มต้นเพื่อให้เข้าเงื่อนไข while ครั้งแรกได้

        while (input != 0) {
            System.out.print("กรุณาใส่ตัวเลข (0 เพื่อจบ): ");
            input = scanner.nextInt();
            System.out.println("คุณใส่: " + input);
        }

        System.out.println("จบโปรแกรม");
        scanner.close();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === คำสั่ง While Loop ===
 * -- นับเลข 1-5 --
 * รอบที่: 1
 * ...
 * รอบที่: 5
 * 
 * -- วนรับค่าจนกว่าจะพิมพ์ 0 --
 * กรุณาใส่ตัวเลข (0 เพื่อจบ): 5
 * คุณใส่: 5
 * กรุณาใส่ตัวเลข (0 เพื่อจบ): 0
 * คุณใส่: 0
 * จบโปรแกรม
 * 
 * หมายเหตุ:
 * - While loop เหมาะกับกรณีที่ไม่รู็จน.รอบที่แน่นอน (ขึ้นอยู่กับเงื่อนไข)
 * - ระวัง Infinite Loop (ลูปไม่รู้จบ) ถ้าเงื่อนไขเป็นจริงตลอดกาล
 */
