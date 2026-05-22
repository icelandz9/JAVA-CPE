/*
 * ชื่อไฟล์: WithParamNoReturn.java
 * หัวข้อ: เมธอดที่มีพารามิเตอร์แต่ไม่มีการคืนค่า
 * คำอธิบาย: การส่งค่า (Argument) เข้าไปให้เมธอดทำงาน
 *           เหมาะสำหรับการประมวลผลข้อมูลหรือแสดงผลข้อมูลที่ส่งเข้าไป
 * ตัวอย่างการใช้งาน: printGreeting(name), calculateArea(width, height) และแสดงผลเลย
 */

public class WithParamNoReturn {

    // รับ 1 พารามิเตอร์
    public static void greeting(String name) {
        System.out.println("สวัสดีคุณ " + name);
    }

    // รับ 2 พารามิเตอร์ (คนละชนิดได้)
    public static void printProductInfo(String productName, double price) {
        System.out.println("สินค้า: " + productName);
        System.out.println("ราคา: " + price + " บาท");
        System.out.println("------------------");
    }

    // รับ Array เป็นพารามิเตอร์
    public static void printArray(int[] arr) {
        System.out.print("ข้อมูลในอาร์เรย์: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== เมธอดรับค่า พารามิเตอร์ ===");

        // ส่งค่าตรงๆ (Literal)
        greeting("สมชาย");

        // ส่งตัวแปร
        String user = "สมหญิง";
        greeting(user);

        System.out.println();

        // ส่งหลายพารามิเตอร์ (ต้องเรียงลำดับและชนิดให้ตรงกัน)
        printProductInfo("Notebook", 25900.50);
        printProductInfo("Mouse", 450);

        // ส่งอาร์เรย์
        int[] scores = { 10, 20, 30, 40, 50 };
        printArray(scores);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === เมธอดรับค่า พารามิเตอร์ ===
 * สวัสดีคุณ สมชาย
 * สวัสดีคุณ สมหญิง
 * 
 * สินค้า: Notebook
 * ราคา: 25900.5 บาท
 * ------------------
 * สินค้า: Mouse
 * ราคา: 450.0 บาท
 * ------------------
 * ข้อมูลในอาร์เรย์: 10 20 30 40 50
 * 
 * หมายเหตุ:
 * - ตัวแปรที่รับค่าในเมธอดเรียกว่า Parameter (เช่น name, price)
 * - ค่าที่ส่งเข้าไปตอนเรียกใช้เรียกว่า Argument (เช่น "สมชาย", 25900.50)
 */
