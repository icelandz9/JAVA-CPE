/*
 * ชื่อไฟล์: StaticMethods.java
 * หัวข้อ: Keyword 'static' คืออะไร?
 * คำอธิบาย: ความแตกต่างระหว่าง Static Method และ Instance Method
 *           Static: เรียกใช้ผ่านชื่อ Class ได้เลย (Shared)
 *           Non-Static (Instance): ต้องสร้าง Object ก่อนเรียกใช้ (Specific)
 * ตัวอย่างการใช้งาน: Math.pow(), String.valueOf(), vs scanner.nextInt()
 */

public class StaticMethods {

    // Static Variable (ตัวแปรของคลาส, แชร์ร่วมกันทุก Object)
    static int globalCount = 0;

    // Instance Variable (ตัวแปรของอ็อบเจกต์, แยกกันในแต่ละ Object)
    int objectCount = 0;

    // Static Method: เรียกได้เลย ไม่ต้อง new Object
    public static void staticShow() {
        System.out.println("I am a Static Method.");
        // objectCount++; // Error: Static method เรียกใช้ Instance variable ไม่ได้!!
        globalCount++; // ถูกต้อง: เรียกใช้ Static variable ได้
    }

    // Non-Static Method: ต้อง new Object ก่อนเรียก
    public void instanceShow() {
        System.out.println("I am an Instance Method.");
        objectCount++; // ถูกต้อง
        globalCount++; // ถูกต้อง: Instance method เรียกใช้ Static variable ได้
    }

    public static void main(String[] args) {
        System.out.println("=== ความแตกต่างของ Static และ Non-Static ===");

        // 1. การเรียกใช้ Static Method
        // เรียกผ่านชื่อ Class ได้เลย (หรือเรียกชื่อเมธอดตรงๆ ถ้าอยู่ในคลาสเดียวกัน)
        StaticMethods.staticShow();
        staticShow();

        // StaticMethods.instanceShow(); // Error! เรียกตรงๆ ไม่ได้

        System.out.println("--------------------");

        // 2. การเรียกใช้ Non-Static Method
        // ต้องสร้าง Object (Instance) ขึ้นมาก่อน
        StaticMethods obj1 = new StaticMethods();
        obj1.instanceShow(); // เรียกผ่าน Object

        StaticMethods obj2 = new StaticMethods();
        obj2.instanceShow();

        System.out.println("--------------------");
        System.out.println("Global Count (Static): " + globalCount); // เพิ่มขึ้นเรื่อยๆ (2 จาก instance + 2 จาก static)
        System.out.println("Obj1 Count: " + obj1.objectCount); // แยกกันนับ
        System.out.println("Obj2 Count: " + obj2.objectCount); // แยกกันนับ
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === ความแตกต่างของ Static และ Non-Static ===
 * I am a Static Method.
 * I am a Static Method.
 * --------------------
 * I am an Instance Method.
 * I am an Instance Method.
 * --------------------
 * Global Count (Static): 4
 * Obj1 Count: 1
 * Obj2 Count: 1
 * 
 * หมายเหตุ:
 * - main method เป็น static เสมอ เพราะ JVM ต้องเรียกใช้ได้เลยโดยไม่ต้องสร้าง
 * object
 * - Utility classes (เช่น Math) มักจะมีแต่ static methods
 */
