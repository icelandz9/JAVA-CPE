/*
 * ชื่อไฟล์: UnaryOperators.java
 * หัวข้อ: ตัวดำเนินการยูนารี (Unary Operators)
 * คำอธิบาย: ตัวดำเนินการที่ใช้กับตัวแปรเดียว ได้แก่ ++ (Increment), -- (Decrement)
 *           และการวางตำแหน่งหน้า/หลังตัวแปร (Prefix/Postfix)
 * ตัวอย่างการใช้งาน: การนับจำนวนในลูป, การเพิ่มค่าทีละ 1
 */

public class UnaryOperators {
    public static void main(String[] args) {
        System.out.println("=== ตัวดำเนินการยูนารี (++, --) ===");

        int x = 10;

        // 1. Postfix Increment (x++) - ใช้ค่าก่อน แล้วค่อยเพิ่ม
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++)); // แสดง 10 แล้วค่า x กลายเป็น 11
        System.out.println("After x++, x = " + x); // แสดง 11

        System.out.println("-----------------");

        // 2. Prefix Increment (++x) - เพิ่มค่าก่อน แล้วค่อยใช้
        x = 10; // reset
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x)); // ค่า x กลายเป็น 11 แล้วแสดง 11
        System.out.println("After ++x, x = " + x); // แสดง 11

        System.out.println("-----------------");

        // 3. Postfix Decrement (x--) - ใช้ค่าก่อน แล้วค่อยลด
        x = 10; // reset
        System.out.println("x = " + x);
        System.out.println("x-- = " + (x--)); // แสดง 10 แล้วค่า x กลายเป็น 9
        System.out.println("After x--, x = " + x); // แสดง 9

        System.out.println("-----------------");

        // 4. Prefix Decrement (--x) - ลดค่าก่อน แล้วค่อยใช้
        x = 10; // reset
        System.out.println("x = " + x);
        System.out.println("--x = " + (--x)); // ค่า x กลายเป็น 9 แล้วแสดง 9
        System.out.println("After --x, x = " + x); // แสดง 9

        // เครื่องหมายลบ (-) สำหรับกลับค่า
        int y = 5;
        System.out.println("y = " + y);
        System.out.println("-y = " + (-y)); // -5
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === ตัวดำเนินการยูนารี (++, --) ===
 * x = 10
 * x++ = 10
 * After x++, x = 11
 * -----------------
 * x = 10
 * ++x = 11
 * After ++x, x = 11
 * ... (ตามโค้ด)
 * 
 * หมายเหตุ:
 * - ถ้าวาง ++ ไว้บรรทัดเดียวโดดๆ (เช่น i++;) จะวางหน้าหรือหลังก็ให้ผลเหมือนกัน
 * (ค่าเพิ่ม 1)
 * - แต่ถ้านำไปใช้ร่วมกับคำสั่งอื่น (เช่น ใน println หรือ assignment)
 * ตำแหน่งหน้า/หลังจะสำคัญมาก
 */
