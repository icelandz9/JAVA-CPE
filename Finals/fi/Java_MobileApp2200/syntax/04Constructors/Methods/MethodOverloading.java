/*
 * ชื่อไฟล์: MethodOverloading.java
 * หัวข้อ: การโอเวอร์โหลดเมธอด (Method Overloading)
 * คำอธิบาย: การสร้างเมธอดชื่อเดียวกัน แต่พารามิเตอร์ต่างกัน (จำนวน หรือ ชนิดข้อมูล)
 *           ช่วยให้อ่านโค้ดง่ายขึ้นและยืดหยุ่นในการใช้งาน
 * ตัวอย่างการใช้งาน: System.out.println() ที่รับได้ทั้ง int, String, double, ...
 */

public class MethodOverloading {

    // 1. บวกเลขจำนวนเต็ม 2 ตัว
    public static int sum(int a, int b) {
        System.out.print("[int, int]: ");
        return a + b;
    }

    // 2. บวกเลขจำนวนเต็ม 3 ตัว (จำนวนพารามิเตอร์ต่างกัน)
    public static int sum(int a, int b, int c) {
        System.out.print("[int, int, int]: ");
        return a + b + c;
    }

    // 3. บวกเลขทศนิยม (ชนิดข้อมูลต่างกัน)
    public static double sum(double a, double b) {
        System.out.print("[double, double]: ");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("=== Method Overloading ===");

        // Java จะเลือกเมธอดที่จับคู่กับ Argument ได้ถูกต้องที่สุดให้เอง
        System.out.println(sum(10, 20)); // เรียกแบบที่ 1
        System.out.println(sum(10, 20, 30)); // เรียกแบบที่ 2
        System.out.println(sum(10.5, 20.5)); // เรียกแบบที่ 3

        // กรณีที่ไม่ชัดเจน (Ambiguous)
        // System.out.println(sum(10, 20.5)); // อาจต้อง cast หรือสร้าง method เพิ่ม

        System.out.println(sum(10, (int) 20.5)); // Cast เพื่อบังคับเรียกแบบที่ 1
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Method Overloading ===
 * [int, int]: 30
 * [int, int, int]: 60
 * [double, double]: 31.0
 * [int, int]: 30
 * 
 * หมายเหตุ:
 * - Return Type ที่ต่างกัน 'ไม่ถือว่า' เป็นการ Overload (Java ดูที่ Parameter
 * List เท่านั้น)
 * - ตัวอย่างชัดเจนที่สุดคือ System.out.println() ที่เราใช้กัน
 */
