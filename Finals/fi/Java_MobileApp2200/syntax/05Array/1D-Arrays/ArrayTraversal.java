/*
 * ชื่อไฟล์: ArrayTraversal.java
 * หัวข้อ: การวนลูปเข้าถึงข้อมูลในอาร์เรย์ (Array Traversal)
 * คำอธิบาย: การใช้ For Loop และ Enhanced For Loop (For-Each) เพื่อจัดการข้อมูลทุกตัวในอาร์เรย์
 * ตัวอย่างการใช้งาน: หาผลรวม, หาค่าเฉลี่ย, แสดงผลข้อมูลทั้งหมด
 */

public class ArrayTraversal {
    public static void main(String[] args) {
        System.out.println("=== การวนลูปเข้าถึงข้อมูลในอาร์เรย์ ===");

        double[] prices = { 100.50, 20.0, 300.75, 50.25 };

        // 1. ใช้ For Loop แบบปกติ (Standard For Loop)
        // ข้อดี: รู้ Index, แก้ไขค่าในอาร์เรย์ได้
        System.out.println("-- ใช้ For Loop ปกติ --");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("สินค้าชิ้นที่ " + (i + 1) + ": " + prices[i] + " บาท");

            // ตัวอย่างแก้ไขค่า: เพิ่มราคา 10%
            prices[i] = prices[i] * 1.1;
        }

        System.out.println("\n(ราคาสินค้าหลังจากปรับขึ้น 10%)");

        // 2. ใช้ Enhanced For Loop (For-Each)
        // ข้อดี: เขียนสั้น, อ่านง่าย, ป้องกัน IndexOutOfBounds
        // ข้อเสีย: ไม่รู้ Index, แก้ไขค่าในตัวแปรอาร์เรย์โดยตรงไม่ได้ (ได้แค่ copy
        // ค่ามาใช้)
        System.out.println("-- ใช้ For-Each Loop --");
        double sum = 0;
        for (double price : prices) {
            System.out.printf("ราคา: %.2f\n", price);
            sum += price;
        }

        System.out.printf("ราคารวมทั้งหมด: %.2f บาท\n", sum);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การวนลูปเข้าถึงข้อมูลในอาร์เรย์ ===
 * -- ใช้ For Loop ปกติ --
 * สินค้าชิ้นที่ 1: 100.5 บาท
 * สินค้าชิ้นที่ 2: 20.0 บาท
 * ...
 * 
 * (ราคาสินค้าหลังจากปรับขึ้น 10%)
 * -- ใช้ For-Each Loop --
 * ราคา: 110.55
 * ราคา: 22.00
 * ...
 * ราคารวมทั้งหมด: 518.65 บาท
 * 
 * หมายเหตุ:
 * - ใช้ For-Each เสมอเมื่อต้องการแค่อ่านข้อมูล (Read-only)
 * - ใช้ For ปกติ เมื่อต้องการ Index หรือต้องการแก้ไขข้อมูล
 */
