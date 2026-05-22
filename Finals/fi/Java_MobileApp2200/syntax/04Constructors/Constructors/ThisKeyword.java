/*
 * ชื่อไฟล์: ThisKeyword.java
 * หัวข้อ: การใช้งาน Keyword 'this'
 * คำอธิบาย: 'this' หมายถึง "Object ตัวนี้" (Current Object Reference)
 *           ใช้เพื่อ: 1. แยกแยะ Instance Variable กับ Parameter
 *                   2. เรียกใช้ Constructor ตัวอื่นในคลาสเดียวกัน (Constructor Chaining)
 *                   3. ส่งตัวเองเป็นพารามิเตอร์
 * ตัวอย่างการใช้งาน: this.name = name, this()
 */

class Employee {
    String name;
    int id;
    double salary;

    // Constructor 1: รับครบทุกอย่าง
    public Employee(String name, int id, double salary) {
        // ใช้ this เพื่อระบุว่าเป็นตัวแปรของ Object (สีฟ้า) ไม่ใช่พารามิเตอร์
        // (สีขาว/น้ำตาล)
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Constructor 2: รับแค่ชื่อกับ id (เงินเดือน default)
    public Employee(String name, int id) {
        // เรียกใช้ Constructor 1 ด้วย this()
        // ต้องเป็นบรรทัดแรกของ Constructor เท่านั้น!
        this(name, id, 15000.0);
        System.out.println("-> เรียก Constructor แบบ 2 พารามิเตอร์");
    }

    public void printDetails() {
        System.out.println("ID: " + this.id + " Name: " + this.name + " Salary: " + this.salary);
    }

    public void raiseSalary(double amount) {
        // ส่ง object ตัวนี้ไปให้ method อื่นช่วยคำนวณ (สมมติ)
        TaxCalculator.calculateTax(this);
        this.salary += amount;
    }
}

class TaxCalculator {
    public static void calculateTax(Employee e) {
        System.out.println("คำนวณภาษีสำหรับคุณ " + e.name + "...");
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        System.out.println("=== การใช้ this keyword ===");

        Employee e1 = new Employee("Alice", 101, 50000);
        e1.printDetails();

        System.out.println("--------------------");

        // จะมีการเรียก Constructor Chaining
        Employee e2 = new Employee("Bob", 102);
        e2.printDetails();

        System.out.println("--------------------");
        e2.raiseSalary(2000);
        e2.printDetails();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การใช้ this keyword ===
 * ID: 101 Name: Alice Salary: 50000.0
 * --------------------
 * -> เรียก Constructor แบบ 2 พารามิเตอร์
 * ID: 102 Name: Bob Salary: 15000.0
 * --------------------
 * คำนวณภาษีสำหรับคุณ Bob...
 * ID: 102 Name: Bob Salary: 17000.0
 * 
 * หมายเหตุ:
 * - this() มีประโยชน์มากในการลด code ซ้ำซ้อนใน Constructor หลายๆ แบบ
 */
