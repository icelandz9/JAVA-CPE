/*
 * ชื่อไฟล์: BasicInheritance.java
 * หัวข้อ: การสืบทอดเบื้องต้น (Inheritance) + super + Override
 * คำอธิบาย: class ลูกสืบทอด field/method จาก class แม่ด้วย extends
 *           super() เรียก constructor แม่ | @Override เขียนเมธอดทับ
 * ตัวอย่างการใช้งาน: สร้างระบบพนักงาน Employee → Manager
 */

// Class แม่ (Parent / Superclass)
class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee constructor ถูกเรียก");
    }

    public void showInfo() {
        System.out.println("ชื่อ: " + name + ", เงินเดือน: " + salary);
    }

    public double getBonus() {
        return salary * 0.1; // โบนัส 10%
    }
}

// Class ลูก (Child / Subclass)
class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String dept) {
        super(name, salary); // เรียก constructor ของ Employee (ต้องเป็นบรรทัดแรก!)
        this.department = dept;
        System.out.println("Manager constructor ถูกเรียก");
    }

    // @Override — เขียนเมธอดทับ (เปลี่ยนพฤติกรรม)
    @Override
    public void showInfo() {
        super.showInfo(); // เรียก showInfo() ของแม่ก่อน
        System.out.println("แผนก: " + department);
    }

    @Override
    public double getBonus() {
        return salary * 0.2; // Manager ได้โบนัส 20%
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        System.out.println("=== Inheritance ===");

        System.out.println("-- สร้าง Employee --");
        Employee emp = new Employee("สมชาย", 25000);
        emp.showInfo();
        System.out.println("โบนัส: " + emp.getBonus());

        System.out.println("\n-- สร้าง Manager --");
        Manager mgr = new Manager("สมศรี", 50000, "IT");
        mgr.showInfo();
        System.out.println("โบนัส: " + mgr.getBonus());
    }
}

/*
 * ผลลัพธ์:
 * Employee constructor ถูกเรียก
 * ชื่อ: สมชาย, เงินเดือน: 25000.0 | โบนัส: 2500.0
 * Employee constructor ถูกเรียก → Manager constructor ถูกเรียก
 * ชื่อ: สมศรี, เงินเดือน: 50000.0 | แผนก: IT | โบนัส: 10000.0
 *
 * หมายเหตุ:
 * - Java สืบทอดได้ class เดียว (Single Inheritance)
 * - super() ต้องเป็นบรรทัดแรกใน constructor ลูก
 * - @Override ไม่บังคับ แต่ช่วยให้ compiler ตรวจจับข้อผิดพลาด
 * - private field/method ไม่ถูกสืบทอด
 */
