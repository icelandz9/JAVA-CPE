/*
 * ชื่อไฟล์: ArrayMethods.java
 * หัวข้อ: คลาส Arrays และเมธอดช่วยเหลือ (java.util.Arrays)
 * คำอธิบาย: การใช้เครื่องมือจัดการอาร์เรย์ เช่น การเรียงลำดับ (Sort), การค้นหา (Search),
 *           การเปรียบเทียบ (Equals), การเติมค่า (Fill), และการแปลงเป็น String
 * ตัวอย่างการใช้งาน: เรียงคะแนนสอบ, ตรวจสอบว่าอาร์เรย์เหมือนกันหรือไม่
 */

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        System.out.println("=== การใช้ java.util.Arrays ===");

        int[] numbers = { 5, 2, 9, 1, 3 };

        // 1. Arrays.toString() - แปลงอาร์เรย์เป็น String เพื่อแสดงผล
        System.out.println("อาร์เรย์เดิม: " + Arrays.toString(numbers));

        // 2. Arrays.sort() - เรียงลำดับจากน้อยไปมาก
        Arrays.sort(numbers);
        System.out.println("หลังเรียงลำดับ: " + Arrays.toString(numbers));

        // 3. Arrays.binarySearch() - ค้นหาข้อมูล (ต้อง sort ก่อนเสมอ!)
        // คืนค่า index ที่พบ, ถ้าไม่พบจะคืนค่าติดลบ
        int index = Arrays.binarySearch(numbers, 9);
        System.out.println("ค้นหาเลข 9 พบที่ index: " + index);

        int indexNotFound = Arrays.binarySearch(numbers, 99);
        System.out.println("ค้นหาเลข 99 พบที่ index: " + indexNotFound);

        // 4. Arrays.fill() - เติมค่าเดียวกันทั้งอาร์เรย์
        int[] scores = new int[5];
        Arrays.fill(scores, 100);
        System.out.println("Filled Array: " + Arrays.toString(scores));

        // 5. Arrays.equals() - เปรียบเทียบสองอาร์เรย์ว่าเหมือนกันหรือไม่ (เนื้อหา)
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = { 1, 2, 4 };

        System.out.println("arr1 equals arr2: " + Arrays.equals(arr1, arr2)); // true
        System.out.println("arr1 equals arr3: " + Arrays.equals(arr1, arr3)); // false
        System.out.println("arr1 == arr2: " + (arr1 == arr2)); // false (เพราะคนละ object)

        // 6. Arrays.copyOf() - คัดลอกอาร์เรย์ (และขยายขนาดได้)
        int[] copy = Arrays.copyOf(arr1, 5); // copy arr1 มาใส่ขนาด 5
        System.out.println("Copy: " + Arrays.toString(copy));
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การใช้ java.util.Arrays ===
 * อาร์เรย์เดิม: [5, 2, 9, 1, 3]
 * หลังเรียงลำดับ: [1, 2, 3, 5, 9]
 * ค้นหาเลข 9 พบที่ index: 4
 * ค้นหาเลข 99 พบที่ index: -6
 * Filled Array: [100, 100, 100, 100, 100]
 * arr1 equals arr2: true
 * arr1 equals arr3: false
 * arr1 == arr2: false
 * Copy: [1, 2, 3, 0, 0]
 * 
 * หมายเหตุ:
 * - Arrays.toString() มีประโยชน์มากในการ Debug ดูค่าในอาร์เรย์
 * - binarySearch เร็วกว่าการวนลูปหาเอง (O(log n) vs O(n))
 * แต่ข้อมูลต้องเรียงลำดับก่อน
 */
