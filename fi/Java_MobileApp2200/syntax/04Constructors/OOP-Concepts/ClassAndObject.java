/*
 * ชื่อไฟล์: ClassAndObject.java
 * หัวข้อ: คลาสและอ็อบเจกต์ (Class & Object)
 * คำอธิบาย: พื้นฐานของ OOP ที่มองทุกอย่างเป็นวัตถุ
 *           Class = แม่พิมพ์/แปลน (Blueprint)
 *           Object = วัตถุที่สร้างจากแม่พิมพ์ (Instance)
 * ตัวอย่างการใช้งาน: MobilePhone (Class) -> iPhone 15, Samsung S24 (Object)
 */

// 1. สร้าง Class (แม่พิมพ์)
class MobilePhone {
    // Attributes (คุณสมบัติ/ตัวแปร)
    String brand;
    String model;
    double price;

    // Behaviors (พฤติกรรม/เมธอด)
    public void call(String number) {
        System.out.println(brand + " " + model + " กำลังโทรหา " + number);
    }

    public void sendSMS(String message) {
        System.out.println("ส่งข้อความ: " + message);
    }

    public void showSpecs() {
        System.out.println("ยี่ห้อ: " + brand);
        System.out.println("รุ่น: " + model);
        System.out.println("ราคา: " + price + " บาท");
        System.out.println("--------------------");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        System.out.println("=== Class and Object ===");

        // 2. สร้าง Object (วัตถุ) จาก Class
        MobilePhone phone1 = new MobilePhone();

        // 3. กำหนดค่าให้กับ Attributes
        phone1.brand = "Apple";
        phone1.model = "iPhone 15";
        phone1.price = 32900.0;

        // 4. เรียกใช้ Method
        phone1.showSpecs();
        phone1.call("081-234-5678");

        System.out.println("\n");

        // สร้างอีก Object หนึ่ง (อิสระต่อกัน)
        MobilePhone phone2 = new MobilePhone();
        phone2.brand = "Samsung";
        phone2.model = "Galaxy S24";
        phone2.price = 30900.0;

        phone2.showSpecs();
        phone2.sendSMS("Hello Android!");
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Class and Object ===
 * ยี่ห้อ: Apple
 * รุ่น: iPhone 15
 * ราคา: 32900.0 บาท
 * --------------------
 * Apple iPhone 15 กำลังโทรหา 081-234-5678
 * 
 * 
 * ยี่ห้อ: Samsung
 * รุ่น: Galaxy S24
 * ราคา: 30900.0 บาท
 * --------------------
 * ส่งข้อความ: Hello Android!
 * 
 * หมายเหตุ:
 * - ใน 1 ไฟล์ .java มี public class ได้เพียง 1 class เท่านั้น
 * (และต้องชื่อตรงกับไฟล์)
 * - class อื่นๆ (เช่น MobilePhone) สามารถเขียนรวมในไฟล์เดียวกันได้ แต่ห้ามใส่
 * public
 */
