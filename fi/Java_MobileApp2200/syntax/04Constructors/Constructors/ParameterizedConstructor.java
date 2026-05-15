/*
 * ชื่อไฟล์: ParameterizedConstructor.java
 * หัวข้อ: คอนสตรัคเตอร์แบบมีพารามิเตอร์ (Parameterized Constructor)
 * คำอธิบาย: การส่งค่าเข้าไปกำหนดให้กับ Object ตั้งแต่ตอนสร้าง (Initialization)
 *           ช่วยลดขั้นตอนการกำหนดค่าทีละตัว (setter)
 * ตัวอย่างการใช้งาน: new Book("Java", 350.0), new Car("Toyota", "Red")
 */

class Book {
    String title;
    double price;

    // Constructor ที่รับค่าพารามิเตอร์
    public Book(String title, double price) {
        System.out.println("สร้างหนังสือ: " + title);
        // กำหนดค่าที่รับมาให้กับตัวแปรของ Object
        this.title = title; // this.title คือตัวแปรของคลาส, title คือพารามิเตอร์
        this.price = price;
    }

    public void showDetails() {
        System.out.println("ชื่อหนังสือ: " + title);
        System.out.println("ราคา: " + price + " บาท");
        System.out.println("--------------------");
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        System.out.println("=== Parameterized Constructor ===");

        // ส่งค่าเข้าไปเลยตอนสร้าง Object
        Book b1 = new Book("Basic Java", 250.0);
        b1.showDetails();

        Book b2 = new Book("Advanced Python", 320.50);
        b2.showDetails();

        // Book b3 = new Book(); // Error! เพราะเราเขียน Constructor แบบรับค่าไปแล้ว
        // Java จะไม่สร้าง Default ให้
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Parameterized Constructor ===
 * สร้างหนังสือ: Basic Java
 * ชื่อหนังสือ: Basic Java
 * ราคา: 250.0 บาท
 * --------------------
 * สร้างหนังสือ: Advanced Python
 * ชื่อหนังสือ: Advanced Python
 * ราคา: 320.5 บาท
 * --------------------
 * 
 * หมายเหตุ:
 * - Keyword 'this' ใช้เพื่ออ้างถึงตัวแปรของ Object ปัจจุบัน (Instance Variable)
 * เพื่อแยกแยะความแตกต่างกับพารามิเตอร์ที่มีชื่อเหมือนกัน
 */
