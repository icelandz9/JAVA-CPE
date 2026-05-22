/*
 * ชื่อไฟล์: ArrayListMethods.java
 * หัวข้อ: เมธอดที่มีประโยชน์ของ ArrayList
 * คำอธิบาย: การค้นหา (contains, indexOf), การแปลงเป็น Array (toArray), 
 *           และการเรียงลำดับ (Sort)
 * ตัวอย่างการใช้งาน: ตรวจสอบว่ามีสินค้าไหม, เรียงชื่อ A-Z
 */

import java.util.ArrayList;
import java.util.Collections; // คลาสช่วยเหลือสำหรับ Collection

public class ArrayListMethods {
    public static void main(String[] args) {
        System.out.println("=== เมธอดของ ArrayList ===");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("ข้อมูลตั้งต้น: " + numbers);

        // 1. ตรวจสอบข้อมูล (Contains)
        boolean hasThirty = numbers.contains(30);
        System.out.println("มีเลข 30 หรือไม่: " + hasThirty);

        // 2. หาตำแหน่ง (IndexOf)
        int index = numbers.indexOf(20);
        System.out.println("เลข 20 อยู่ที่ index: " + index);

        // 3. เรียงลำดับ (Sorting) โดยใช้ Collections.sort()
        System.out.println("-- การเรียงลำดับ --");
        Collections.sort(numbers); // น้อยไปมาก
        System.out.println("น้อย -> มาก: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder()); // มากไปน้อย
        System.out.println("มาก -> น้อย: " + numbers);

        // 4. วนลูป (Traversal)
        System.out.print("แสดงผลด้วย For-Each: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Cloning (สร้างสำเนา)
        ArrayList<Integer> copy = (ArrayList<Integer>) numbers.clone();
        System.out.println("Clone: " + copy);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === เมธอดของ ArrayList ===
 * ข้อมูลตั้งต้น: [50, 10, 30, 20, 40]
 * มีเลข 30 หรือไม่: true
 * เลข 20 อยู่ที่ index: 3
 * -- การเรียงลำดับ --
 * น้อย -> มาก: [10, 20, 30, 40, 50]
 * มาก -> น้อย: [50, 40, 30, 20, 10]
 * แสดงผลด้วย For-Each: 50 40 30 20 10
 * Clone: [50, 40, 30, 20, 10]
 * 
 * หมายเหตุ:
 * - ArrayList เก็บ Object เท่านั้น (ถ้าเก็บ int ต้องใช้ Integer, double ต้องใช้
 * Double)
 * - Collections.sort() มีประโยชน์มากในการจัดการข้อมูลใน List
 */
