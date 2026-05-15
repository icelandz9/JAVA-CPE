/*
 * ชื่อไฟล์: IfVsSwitch.java
 * หัวข้อ: เปรียบเทียบ If-Else กับ Switch Case
 * คำอธิบาย: แสดงตัวอย่างโจทย์เดียวกัน เขียนด้วย 2 วิธีเพื่อเปรียบเทียบข้อดีข้อเสีย
 * ตัวอย่างการใช้งาน: เลือกใช้วิธีที่เหมาะสมกับสถานการณ์
 */

public class IfVsSwitch {
    public static void main(String[] args) {
        System.out.println("=== เปรียบเทียบ If-Else vs Switch Case ===\n");

        char grade = 'B';
        System.out.println("เกรดของคุณคือ: " + grade);

        // แบบที่ 1: ใช้ if-else-if
        System.out.println("\n-- วิธีที่ 1: If-Else --");
        if (grade == 'A') {
            System.out.println("ยอดเยี่ยม! (Excellent)");
        } else if (grade == 'B') {
            System.out.println("ดีมาก (Very Good)");
        } else if (grade == 'C') {
            System.out.println("ดี (Good)");
        } else if (grade == 'D') {
            System.out.println("ผ่าน (Pass)");
        } else if (grade == 'F') {
            System.out.println("ตก (Fail)");
        } else {
            System.out.println("เกรดไม่ถูกต้อง");
        }

        // แบบที่ 2: ใช้ switch case
        System.out.println("\n-- วิธีที่ 2: Switch Case --");
        switch (grade) {
            case 'A':
                System.out.println("ยอดเยี่ยม! (Excellent)");
                break;
            case 'B':
                System.out.println("ดีมาก (Very Good)");
                break;
            case 'C':
                System.out.println("ดี (Good)");
                break;
            case 'D':
                System.out.println("ผ่าน (Pass)");
                break;
            case 'F':
                System.out.println("ตก (Fail)");
                break;
            default:
                System.out.println("เกรดไม่ถูกต้อง");
        }

        System.out.println("\n-----------------------------");
        System.out.println("ข้อแนะนำในการเลือกใช้:");
        System.out.println("1. ใช้ Switch เมื่อ:");
        System.out.println("   - ตรวจสอบค่าที่เท่ากันเป๊ะๆ (Equality check)");
        System.out.println("   - มีตัวเลือกจำนวนมาก (อ่านง่ายกว่า if else ยาวๆ)");

        System.out.println("\n2. ใช้ If-Else เมื่อ:");
        System.out.println("   - ตรวจสอบเป็นช่วงข้อมูล (Range check เช่น score >= 50)");
        System.out.println("   - เงื่อนไขซับซ้อน (Complex logic เช่น A && B || C)");
        System.out.println("   - ตรวจสอบชนิดข้อมูลที่ Switch ไม่รองรับ (เช่น double, boolean)");
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === เปรียบเทียบ If-Else vs Switch Case ===
 * เกรดของคุณคือ: B
 * 
 * -- วิธีที่ 1: If-Else --
 * ดีมาก (Very Good)
 * 
 * -- วิธีที่ 2: Switch Case --
 * ดีมาก (Very Good)
 * ...
 */
