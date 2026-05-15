/*
 * ชื่อไฟล์: InheritanceVsInterface.java
 * หัวข้อ: เปรียบเทียบ Inheritance vs Interface
 * คำอธิบาย: สรุปความแตกต่างและแนวทางเลือกใช้
 * ตัวอย่างการใช้งาน: ออกแบบระบบ OOP
 */

// --- ตัวอย่างรวม: ระบบยานพาหนะ ---

// Abstract class = "เป็นอะไร" (IS-A relationship)
abstract class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    abstract void accelerate();

    public void showStatus() {
        System.out.println(brand + " | ความเร็ว: " + speed + " km/h");
    }
}

// Interface = "ทำอะไรได้" (CAN-DO / HAS-A capability)
interface Electric {
    void charge();
    int getBatteryLevel();
}

interface GPS {
    void navigate(String destination);
}

// class extends 1 abstract class + implements หลาย interface
class TeslaCar extends Vehicle implements Electric, GPS {
    private int battery = 100;

    public TeslaCar() { super("Tesla"); }

    @Override
    void accelerate() {
        speed += 30;
        battery -= 10;
        System.out.println("Tesla เร่งความเร็ว! (ใช้แบตเตอรี่)");
    }

    @Override
    public void charge() {
        battery = 100;
        System.out.println("ชาร์จเต็มแล้ว!");
    }

    @Override
    public int getBatteryLevel() { return battery; }

    @Override
    public void navigate(String dest) {
        System.out.println("กำลังนำทางไป: " + dest);
    }
}

public class InheritanceVsInterface {
    public static void main(String[] args) {
        System.out.println("=== Inheritance vs Interface ===");

        TeslaCar tesla = new TeslaCar();
        tesla.accelerate();
        tesla.showStatus();
        tesla.navigate("กรุงเทพ");
        System.out.println("แบตเตอรี่: " + tesla.getBatteryLevel() + "%");
        tesla.charge();

        /*
         * สรุปเปรียบเทียบ:
         * ┌───────────────────┬─────────────────────┬──────────────────┐
         * │                   │  Abstract Class      │  Interface       │
         * ├───────────────────┼─────────────────────┼──────────────────┤
         * │ extends/implements│  extends (1 ตัว)     │ implements (หลาย)│
         * │ Constructor       │  มีได้               │ ไม่มี            │
         * │ Field             │  มีได้ทุกชนิด        │ public static    │
         * │                   │                     │ final เท่านั้น    │
         * │ Method body       │  มีได้ + abstract    │ abstract +       │
         * │                   │                     │ default (Java 8) │
         * │ ใช้เมื่อ           │ class มีความสัมพันธ์ │ กำหนดความสามารถ  │
         * │                   │ แบบ IS-A             │ แบบ CAN-DO       │
         * └───────────────────┴─────────────────────┴──────────────────┘
         */
    }
}

/*
 * หมายเหตุ:
 * - ใช้ abstract class เมื่อ: class ลูกมีความสัมพันธ์ "เป็น" ชนิดเดียวกัน
 * - ใช้ interface เมื่อ: กำหนด "ความสามารถ" ที่ class ไม่เกี่ยวข้องกันก็ทำได้
 * - ตัวอย่าง: Dog extends Animal (IS-A) + implements Trainable (CAN-DO)
 */
