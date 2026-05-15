/*
 * ชื่อไฟล์: WithParamWithReturn.java
 * หัวข้อ: เมธอดที่มีพารามิเตอร์และมีการคืนค่า
 * คำอธิบาย: รูปแบบเมธอดที่ครบเครื่องและยืดหยุ่นที่สุด
 *           ทำงานเหมือนกับฟังก์ชันทางคณิตศาสตร์ f(x) = y
 * ตัวอย่างการใช้งาน: sum(a, b), calculateTax(price), findMax(arr)
 */

public class WithParamWithReturn {

    // เมธอดหาผลรวมของเลข 2 จำนวน
    public static int sum(int a, int b) {
        return a + b;
    }

    // เมธอดคำนวณพื้นที่วงกลม
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // เมธอดตัดสินเกรดจากคะแนน
    public static String getGrade(int score) {
        if (score >= 80)
            return "A";
        if (score >= 70)
            return "B";
        if (score >= 60)
            return "C";
        if (score >= 50)
            return "D";
        return "F";
    }

    // เมธอดตรวจสอบว่าเป็นเลขคู่หรือไม่
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("=== เมธอดแบบรับค่าและคืนค่า (Most Powerful) ===");

        // 1. เรียกใช้แล้วเก็บผลลัพธ์ลงตัวแปร
        int result = sum(10, 20);
        System.out.println("ผลรวม 10 + 20 = " + result);

        // 2. เรียกใช้ในนิพจน์คำนวณ
        double area = circleArea(5.0);
        System.out.printf("พื้นที่วงกลม (r=5) = %.2f\n", area);

        // 3. เรียกใช้ในคำสั่งแสดงผล
        System.out.println("คะแนน 75 ได้เกรด: " + getGrade(75));

        // 4. เรียกใช้ในเงื่อนไข if
        int num = 7;
        if (isEven(num)) {
            System.out.println(num + " เป็นเลขคู่");
        } else {
            System.out.println(num + " เป็นเลขคี่");
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === เมธอดแบบรับค่าและคืนค่า (Most Powerful) ===
 * ผลรวม 10 + 20 = 30
 * พื้นที่วงกลม (r=5) = 78.54
 * คะแนน 75 ได้เกรด: B
 * 7 เป็นเลขคี่
 * 
 * หมายเหตุ:
 * - นี่คือรูปแบบเมธอดที่ใช้บ่อยที่สุดในการเขียนโปรแกรมแบบแยกส่วน (Modular
 * Programming)
 * - ช่วยลดการเขียนโค้ดซ้ำซ้อน (Code Reuse) และทดสอบง่าย (Unit Testing)
 */
