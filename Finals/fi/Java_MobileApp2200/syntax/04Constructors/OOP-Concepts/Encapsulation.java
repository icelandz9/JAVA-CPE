/*
 * ชื่อไฟล์: Encapsulation.java
 * หัวข้อ: การห่อหุ้มข้อมูล (Encapsulation)
 * คำอธิบาย: หลักการสำคัญของ OOP ที่ซ่อนรายละเอียดภายใน (private fields)
 *           และเปิดให้ใช้งานผ่านเมธอด (public getter/setter) 
 *           เพื่อควบคุมความถูกต้องของข้อมูล (Validation)
 * ตัวอย่างการใช้งาน: การกำหนดอายุ (ห้ามติดลบ), การกำหนดรหัสผ่าน
 */

class Person {
    // 1. ซ่อนข้อมูล (Data Hiding)
    private String name;
    private int age;

    // 2. สร้าง Setter พร้อมตรวจสอบความถูกต้อง (Validation)
    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("ผิดพลาด: ชื่อห้ามเป็นค่าว่าง");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("ผิดพลาด: อายุต้องอยู่ระหว่าง 0-150 ปี");
        }
    }

    // 3. สร้าง Getter เพื่อให้อ่านค่าได้
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("=== Encapsulation (Getter/Setter) ===");

        Person p1 = new Person();

        // p1.age = -5; // ทำไม่ได้เพราะเป็น private

        System.out.println("-- ทดสอบกำหนดค่าผิดๆ --");
        p1.setAge(-5); // จะแสดงข้อความเตือน
        p1.setAge(200); // จะแสดงข้อความเตือน

        System.out.println("\n-- ทดสอบกำหนดค่าที่ถูกต้อง --");
        p1.setName("Alice");
        p1.setAge(25);

        System.out.println("ชื่อ: " + p1.getName());
        System.out.println("อายุ: " + p1.getAge());
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Encapsulation (Getter/Setter) ===
 * -- ทดสอบกำหนดค่าผิดๆ --
 * ผิดพลาด: อายุต้องอยู่ระหว่าง 0-150 ปี
 * ผิดพลาด: อายุต้องอยู่ระหว่าง 0-150 ปี
 * 
 * -- ทดสอบกำหนดค่าที่ถูกต้อง --
 * ชื่อ: Alice
 * อายุ: 25
 * 
 * หมายเหตุ:
 * - ใน IDE ส่วนใหญ่สามารถ Generate Getter/Setter ได้อัตโนมัติ (คลิกขวา ->
 * Source -> Generate Getters and Setters)
 * - นี่คือมาตรฐานการเขียน Java Bean / POJO (Plain Old Java Object)
 */
