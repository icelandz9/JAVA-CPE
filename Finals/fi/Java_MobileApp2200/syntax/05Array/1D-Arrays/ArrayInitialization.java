/*
 * ชื่อไฟล์: ArrayInitialization.java
 * หัวข้อ: การกำหนดค่าเริ่มต้นให้อาร์เรย์ (Array Initialization)
 * คำอธิบาย: วิธีการสร้างอาร์เรย์และกำหนดค่าให้ทันที (ไม่ต้องระบุขนาด ตัว Java จะนับเอง)
 * ตัวอย่างการใช้งาน: ค่าคงที่, ข้อมูลที่รู้จำนวนและค่าแน่นอน
 */

public class ArrayInitialization {
    public static void main(String[] args) {
        System.out.println("=== การกำหนดค่าเริ่มต้นให้อาร์เรย์ ===");

        // วิธีที่ 1: ประกาศและกำหนดค่าในบรรทัดเดียว (Short-hand)
        // นิยมใช้ที่สุด
        int[] primeNumbers = { 2, 3, 5, 7, 11, 13 };

        System.out.println("จำนวนเลขจำนวนเฉพาะ: " + primeNumbers.length);
        System.out.println("ตัวแรก: " + primeNumbers[0]);
        System.out.println("ตัวสุดท้าย: " + primeNumbers[primeNumbers.length - 1]);

        // วิธีที่ 2: ใช้ new type[] (จำเป็นต้องใช้เมื่อส่งค่าเข้าเมธอด หรือ return ค่า)
        String[] days = new String[] { "Sunday", "Monday", "Tuesday" };

        System.out.println("วันแรกของสัปดาห์: " + days[0]);

        // วิธีที่ 3: แยกบรรทัด (ไม่สามารถใช้แบบ Short-hand ได้)
        double[] grades;
        // grades = {3.5, 4.0}; // Error!
        grades = new double[] { 3.5, 4.0 }; // ถูกต้อง

        System.out.println("เกรด: " + grades[0] + ", " + grades[1]);

        // อาร์เรย์ว่าง (Empty Array)
        int[] empty = {};
        System.out.println("ขนาดอาร์เรย์ว่าง: " + empty.length);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การกำหนดค่าเริ่มต้นให้อาร์เรย์ ===
 * จำนวนเลขจำนวนเฉพาะ: 6
 * ตัวแรก: 2
 * ตัวสุดท้าย: 13
 * วันแรกของสัปดาห์: Sunday
 * เกรด: 3.5, 4.0
 * ขนาดอาร์เรย์ว่าง: 0
 * 
 * หมายเหตุ:
 * - แบบ {val1, val2} ใช้ได้เฉพาะตอนประกาศตัวแปรพร้อมกำหนดค่าเท่านั้น
 */
