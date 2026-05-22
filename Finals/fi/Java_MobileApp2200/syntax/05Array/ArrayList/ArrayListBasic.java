/*
 * ชื่อไฟล์: ArrayListBasic.java
 * หัวข้อ: พื้นฐาน ArrayList (Dynamic Array)
 * คำอธิบาย: คลาสที่ช่วยจัดการอาร์เรย์แบบยืดหยุ่น (เพิ่ม/ลบ ข้อมูลได้ตลอดเวลา)
 *           อยู่ใน java.util.ArrayList
 * ตัวอย่างการใช้งาน: รายการสินค้าในตะกร้า, รายชื่อเพื่อน (ที่เพิ่ม/ลบได้)
 */

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        System.out.println("=== พื้นฐาน ArrayList ===");

        // 1. สร้าง ArrayList (ระบุ Generics <Type> เพื่อความปลอดภัย)
        // หมายเหตุ: ใช้ int ไม่ได้ ต้องใช้ Wrapper Class 'Integer'
        ArrayList<String> cars = new ArrayList<String>();

        // 2. เพิ่มข้อมูล (Add)
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");

        // เพิ่มข้อมูลแบบระบุ index (แทรก)
        cars.add(1, "Mazda"); // แทรก Mazda ไปที่ index 1

        System.out.println("ข้อมูลทั้งหมด: " + cars);
        System.out.println("จำนวนรถ: " + cars.size()); // ใช้ .size() แทน .length

        // 3. เข้าถึงข้อมูล (Get)
        System.out.println("รถคันแรก: " + cars.get(0));
        System.out.println("รถคันสุดท้าย: " + cars.get(cars.size() - 1));

        // 4. แก้ไขข้อมูล (Set)
        cars.set(0, "Tesla"); // เปลี่ยน Toyota เป็น Tesla
        System.out.println("หลังแก้ไข index 0: " + cars);

        // 5. ลบข้อมูล (Remove)
        cars.remove(2); // ลบ index 2 (Honda หายไป)
        cars.remove("BMW"); // ลบโดยระบุค่า (Object)
        System.out.println("หลังลบข้อมูล: " + cars);

        // 6. ล้างข้อมูลทั้งหมด (Clear)
        cars.clear();
        System.out.println("หลัง Clear: " + cars);
        System.out.println("ว่างหรือไม่? " + cars.isEmpty());
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === พื้นฐาน ArrayList ===
 * ข้อมูลทั้งหมด: [Toyota, Mazda, Honda, BMW]
 * จำนวนรถ: 4
 * รถคันแรก: Toyota
 * รถคันสุดท้าย: BMW
 * หลังแก้ไข index 0: [Tesla, Mazda, Honda, BMW]
 * หลังลบข้อมูล: [Tesla, Mazda]
 * หลัง Clear: []
 * ว่างหรือไม่? true
 * 
 * หมายเหตุ:
 * - ArrayList สะดวกกว่า Array ธรรมดาตรงที่ไม่ต้องกำหนดขนาดล่วงหน้า
 * - แต่ประสิทธิภาพจะช้ากว่า Array นิดหน่อย เพราะต้องจัดการ Memory บ่อย
 */
