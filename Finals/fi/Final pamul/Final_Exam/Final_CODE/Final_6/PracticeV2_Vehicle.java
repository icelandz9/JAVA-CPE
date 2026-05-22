// ══════════════════════════════════════════════════════════════
//  PracticeV2_Vehicle.java  —  Final_6 ดัดแปลง
//
//  ต้นแบบ: Final_6 (MotorVehicle/Car/Motorcycle/OffRoad) + Ex7/q (SuperHero)
//
//  แนวคิดหลักที่ต้องทำได้ในสอบ (Inheritance + Polymorphism):
//    1. Parent class → Child class (super() ใน constructor)
//    2. @Override toString() ให้ println แสดงผลสวยงาม
//    3. Multilevel Inheritance: A → B → C
//    4. protected fields ที่ child เข้าถึงได้
//    5. Getter methods ที่เรียกจาก toString ของ child
//
//  สิ่งที่เปลี่ยน (ดักทาง):
//    - จาก "ยานพาหนะ" → "พนักงานบริษัท (Employee hierarchy)"
//    - Employee (parent) → Manager (child) → Director (grandchild)
//    - Employee (parent) → Engineer (child)
//    - pattern การเขียนเหมือนกันทุกอย่าง
// ══════════════════════════════════════════════════════════════

// ─── Parent Class: Employee ──────────────────────────────────
//  เทียบ Final_6: class MotorVehicle
class Employee {
    // ─── protected fields (child เข้าถึงได้ผ่าน getter) ──────
    //  เทียบ: model, make, year, seat ใน MotorVehicle
    protected String name;       // ชื่อพนักงาน
    protected String department; // แผนก
    protected int    salary;     // เงินเดือน (บาท)

    // ─── Constructor + this keyword ──────────────────────────
    //  เทียบ: public MotorVehicle(String model, String make, int year, int seat)
    public Employee(String name, String department, int salary) {
        this.name       = name;        // this เพราะชื่อ parameter ซ้ำกับ field
        this.department = department;
        this.salary     = salary;
    }

    // ─── Getter methods ───────────────────────────────────────
    //  เทียบ: getModel(), getMake(), getYear(), getSeat()
    public String getName()       { return this.name; }
    public String getDepartment() { return this.department; }
    public int    getSalary()     { return this.salary; }
}

// ─── Child Class 1: Engineer ─────────────────────────────────
//  เทียบ Final_6: class Motorcycle extends MotorVehicle
class Engineer extends Employee {
    private String techStack; // ภาษาโปรแกรมที่ใช้ (เทียบ engineType)

    public Engineer(String name, String department, int salary, String techStack) {
        super(name, department, salary); // เรียก constructor ของ parent
        this.techStack = techStack;
    }

    public String getTechStack() { return techStack; }

    @Override
    public String toString() {
        // เทียบ Motorcycle: getMake() + ", " + getModel() + ", seating: " + ...
        return "[Engineer] " + getName() + " (" + getDepartment() + ")"
               + " | Salary: " + getSalary() + " | Stack: " + getTechStack();
    }
}

// ─── Child Class 2: Manager ──────────────────────────────────
//  เทียบ Final_6: class Car extends MotorVehicle
class Manager extends Employee {
    private int teamSize; // ขนาดทีม (เทียบ door จำนวนประตู)

    public Manager(String name, String department, int salary, int teamSize) {
        super(name, department, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }

    @Override
    public String toString() {
        // เทียบ Car: getMake() + ", " + getModel() + ", " + getYear() + ...
        return "[Manager] " + getName() + " (" + getDepartment() + ")"
               + " | Salary: " + getSalary() + " | Team: " + getTeamSize() + " people";
    }
}

// ─── Grandchild Class: Director (Multilevel Inheritance) ─────
//  เทียบ Final_6: class OffRoad extends Car
class Director extends Manager {
    private int budget; // งบประมาณที่ดูแล (บาท)

    public Director(String name, String department, int salary, int teamSize, int budget) {
        super(name, department, salary, teamSize); // เรียก Manager's constructor
        this.budget = budget;
    }

    @Override
    public String toString() {
        // เทียบ OffRoad: "[OffRoad] " + getMake() + ...
        return "[Director] " + getName() + " (" + getDepartment() + ")"
               + " | Salary: " + getSalary()
               + " | Team: " + getTeamSize() + " | Budget: " + budget + " THB";
    }
}

// ─── Main Class ───────────────────────────────────────────────
public class PracticeV2_Vehicle {
    public static void main(String[] args) {

        // ─── สร้าง instances — เหมือน Final_6 ────────────────────
        //  Final_6: Motorcycle wave = new Motorcycle("Wave110i","honda",2020,2,"Single...")
        Engineer  john  = new Engineer ("John",   "IT",        45000, "Java, Python");
        Manager   sarah = new Manager  ("Sarah",  "Marketing", 75000, 8);
        Director  ceo   = new Director ("Alice",  "Executive", 120000, 50, 5000000);

        // ─── println ใช้ toString อัตโนมัติ — เหมือน Final_6 ──────
        //  Final_6: System.out.println(raptor); System.out.println(almerra);
        System.out.println(ceo);
        System.out.println(sarah);
        System.out.println(john);
    }
}
