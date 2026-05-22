/*
 * ชื่อไฟล์: SuperKeyword.java
 * หัวข้อ: การใช้งาน Keyword 'super' (เบื้องต้นสำหรับการสืบทอด)
 * คำอธิบาย: 'super' ใช้สำหรับอ้างถึง Class แม่ (Superclass / Parent Class)
 *           ใช้เรียก Constructor ของแม่ หรือเรียก Method/Attribute ของแม่ที่ถูก Override
 * ตัวอย่างการใช้งาน: super(), super.display()
 */

// คลาสแม่ (Parent)
class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle Constructor ทำงาน: " + brand);
    }

    public void honk() {
        System.out.println("Puny Puny! (เสียงแตรทั่วไป)");
    }
}

// คลาสลูก (Child) สืบทอดมาจาก Vehicle
class Car extends Vehicle {
    int maxSpeed;

    public Car(String brand, int maxSpeed) {
        // เรียก Constructor ของแม่ (ต้องเป็นบรรทัดแรก)
        super(brand);
        this.maxSpeed = maxSpeed;
        System.out.println("Car Constructor ทำงาน");
    }

    @Override
    public void honk() {
        // เรียกใช้ method ของแม่ก่อน (ถ้าต้องการ)
        super.honk();
        System.out.println("Beep Beep! (เสียงแตรแบบรถยนต์)");
    }

    public void showInfo() {
        // อ้างถึงตัวแปร brand ของแม่
        System.out.println("ยี่ห้อ: " + super.brand);
        System.out.println("ความเร็วสูงสุด: " + this.maxSpeed);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        System.out.println("=== การใช้ super keyword ===");

        Car myCar = new Car("Toyota", 180);

        System.out.println("--------------------");
        myCar.showInfo();

        System.out.println("--------------------");
        myCar.honk();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การใช้ super keyword ===
 * Vehicle Constructor ทำงาน: Toyota
 * Car Constructor ทำงาน
 * --------------------
 * ยี่ห้อ: Toyota
 * ความเร็วสูงสุด: 180
 * --------------------
 * Puny Puny! (เสียงแตรทั่วไป)
 * Beep Beep! (เสียงแตรแบบรถยนต์)
 * 
 * หมายเหตุ:
 * - ถ้าเราไม่ใส่ super() ใน Constructor ลูก, Java จะแอบใส่ super()
 * (แบบไม่มีพารามิเตอร์) ให้เอง
 * - เป็นหัวใจสำคัญของ Inheritance (การสืบทอดคุณสมบัติ) ใน OOP
 */
