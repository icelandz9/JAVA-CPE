/*
 * ชื่อไฟล์: DefaultConstructor.java
 * หัวข้อ: คอนสตรัคเตอร์แบบ Default (No-Argument Constructor)
 * คำอธิบาย: คอนสตรัคเตอร์ที่ไม่มีพารามิเตอร์ ซึ่งจะถูกเรียกใช้อัตโนมัติเมื่อสร้าง Object
 *           หากเราไม่เขียนคอนสตรัคเตอร์เลย Java จะแอบสร้างให้เอง (แต่ถ้าเขียนเอง จะไม่สร้างให้)
 * ตัวอย่างการใช้งาน: กำหนดค่าเริ่มต้นให้กับ Attributes ของ Object
 */

class Student {
    String name;
    int age;

    // Default Constructor (ไม่มีพารามิเตอร์)
    public Student() {
        System.out.println("Object ถูกสร้างขึ้นแล้ว!");
        // กำหนดค่าเริ่มต้น
        name = "Unknown";
        age = 18;
    }

    public void showInfo() {
        System.out.println("ชื่อ: " + name);
        System.out.println("อายุ: " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        System.out.println("=== Default Constructor ===");

        // สร้าง Object (จะเรียกใช้ Constructor ทันที)
        Student s1 = new Student();

        // แสดงข้อมูล
        s1.showInfo();

        System.out.println("--------------------");

        // สร้างอีก Object
        Student s2 = new Student();
        s2.name = "สมชาย"; // แก้ไขค่าทีหลังได้
        s2.showInfo();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Default Constructor ===
 * Object ถูกสร้างขึ้นแล้ว!
 * ชื่อ: Unknown
 * อายุ: 18
 * --------------------
 * Object ถูกสร้างขึ้นแล้ว!
 * ชื่อ: สมชาย
 * อายุ: 18
 * 
 * หมายเหตุ:
 * - Constructor ต้องมีชื่อเหมือน Class เป๊ะๆ และไม่มี Return Type (แม้แต่ void
 * ก็ห้ามมี)
 */
