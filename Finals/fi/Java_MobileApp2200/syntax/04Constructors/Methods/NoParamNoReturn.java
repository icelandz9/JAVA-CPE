/*
 * ชื่อไฟล์: NoParamNoReturn.java
 * หัวข้อ: เมธอดที่ไม่มีพารามิเตอร์และไม่มีการคืนค่า (void)
 * คำอธิบาย: รูปแบบพื้นฐานที่สุดของเมธอด เหมาะสำหรับการทำงานที่จบในตัว
 *           เช่น การแสดงเมนู, การแสดงข้อความต้อนรับ
 * ตัวอย่างการใช้งาน: printHeader(), showMenu(), clearScreen()
 */

public class NoParamNoReturn {

    // เมธอดสำหรับแสดงเส้นคั่น
    public static void printLine() {
        System.out.println("----------------------------------------");
    }

    // เมธอดสำหรับแสดงหัวข้อโปรแกรม
    public static void showHeader() {
        printLine();
        System.out.println("      ยินดีต้อนรับสู่โปรแกรมฝึกเขียน Java      ");
        printLine();
    }

    // เมธอดสำหรับแสดงเมนู
    public static void showMenu() {
        System.out.println("1. เริ่มต้นใช้งาน");
        System.out.println("2. ตั้งค่า");
        System.out.println("3. ออกจากโปรแกรม");
    }

    public static void main(String[] args) {
        // เรียกใช้งานเมธอด
        showHeader();

        System.out.println("\nกรุณาเลือกรายการ:");
        showMenu();

        System.out.println("\n(จบการทำงานของโปรแกรม)");
        printLine();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * ----------------------------------------
 * ยินดีต้อนรับสู่โปรแกรมฝึกเขียน Java
 * ----------------------------------------
 * 
 * กรุณาเลือกรายการ:
 * 1. เริ่มต้นใช้งาน
 * 2. ตั้งค่า
 * 3. ออกจากโปรแกรม
 * 
 * (จบการทำงานของโปรแกรม)
 * ----------------------------------------
 * 
 * หมายเหตุ:
 * - keyword 'void' หมายถึงเมธอดนี้จะไม่มีการส่งค่ากลับ (Return Value)
 * - keyword 'static' จำเป็นในที่นี้เพราะเราเรียกใช้จาก main (ซึ่งเป็น static)
 * โดยตรง
 */
