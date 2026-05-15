/*
 * ชื่อไฟล์: PrimitiveTypes.java
 * หัวข้อ: ชนิดข้อมูลพื้นฐาน (Primitive Data Types)
 * คำอธิบาย: แสดงการประกาศและใช้งานตัวแปรชนิดข้อมูลพื้นฐานทั้ง 8 ชนิดใน Java
 *           แบ่งเป็น 4 กลุ่ม: จำนวนเต็ม, ทศนิยม, ตัวอักษร, และค่าตรรกะ
 * ตัวอย่างการใช้งาน: การเก็บข้อมูลประเภทต่างๆ เช่น อายุ, ราคา, เกรด, สถานะ
 */

public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("=== ชนิดข้อมูลพื้นฐานในภาษา Java (Primitive Types) ===");

        // 1. กลุ่มจำนวนเต็ม (Integer types)
        // byte: 8-bit (-128 ถึง 127)
        byte b = 100;
        System.out.println("byte: " + b);

        // short: 16-bit (-32,768 ถึง 32,767)
        short s = 30000;
        System.out.println("short: " + s);

        // int: 32-bit (ประมาณ -2 พันล้าน ถึง 2 พันล้าน) -> เป็นค่า default ของจำนวนเต็ม
        int i = 1000000;
        System.out.println("int: " + i);

        // long: 64-bit (ใหญ่มาก) -> ต้องเติม L หรือ l ต่อท้าย
        long l = 9000000000L; 
        System.out.println("long: " + l);

        // 2. กลุ่มทศนิยม (Floating-point types)
        // float: 32-bit -> ต้องเติม F หรือ f ต่อท้าย
        float f = 3.14f;
        System.out.println("float: " + f);

        // double: 64-bit -> เป็นค่า default ของทศนิยม
        double d = 3.141592653589793;
        System.out.println("double: " + d);

        // 3. กลุ่มตัวอักษร (Character type)
        // char: 16-bit Unicode เก็บตัวอักษรตัวเดียว ใน single quote ' '
        char c1 = 'A';
        char c2 = '\u0041'; // รหัส Unicode ของ 'A'
        char c3 = 65;       // ค่า ASCII ของ 'A'
        System.out.println("char: " + c1 + ", " + c2 + ", " + c3);

        // 4. กลุ่มตรรกะ (Boolean type)
        // boolean: เก็บค่า true หรือ false เท่านั้น
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("boolean: " + bool1 + ", " + bool2);

        // การประกาศตัวแปรหลายตัวในบรรทัดเดียว
        int x = 10, y = 20, z = 30;
        System.out.println("x, y, z: " + x + ", " + y + ", " + z);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === ชนิดข้อมูลพื้นฐานในภาษา Java (Primitive Types) ===
 * byte: 100
 * short: 30000
 * int: 1000000
 * long: 9000000000
 * float: 3.14
 * double: 3.141592653589793
 * char: A, A, A
 * boolean: true, false
 * x, y, z: 10, 20, 30
 * 
 * หมายเหตุ:
 * - ควรเลือกใช้ชนิดข้อมูลให้เหมาะสมกับขนาดข้อมูลเพื่อประหยัดหน่วยความจำ
 * - int และ double เป็นชนิดข้อมูลที่นิยมใช้มากที่สุดสำหรับจำนวนและทศนิยม
 * - String ไม่ใช่ Primitive Type แต่เป็น Class (Reference Type)
 */
