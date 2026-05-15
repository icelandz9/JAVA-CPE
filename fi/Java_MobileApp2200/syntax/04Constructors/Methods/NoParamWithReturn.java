import java.util.Scanner;

public class NoParamWithReturn {

    /*
     * ชื่อไฟล์: NoParamWithReturn.java
     * หัวข้อ: เมธอดที่ไม่มีพารามิเตอร์แต่มีการคืนค่า
     * คำอธิบาย: เมธอดที่จะส่งค่ากลับมายังจุดที่เรียกใช้ (Caller)
     * เหมาะสำหรับการดึงค่าคงที่, รับค่าจาก User, หรือสุ่มตัวเลข
     * ตัวอย่างการใช้งาน: getPi(), getRandomNumber(), getCurrentDate()
     */

    // คืนค่าเป็น double
    public static double getVatRate() {
        return 0.07;
    }

    // คืนค่าเป็น String
    public static String getAppVersion() {
        return "Ver 1.0.2";
    }

    // คืนค่าเป็น int (สุ่มลูกเต๋า)
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // เมธอดรับค่าจาก user แล้วส่งคืนกลับไป
    public static String getUserName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณากรอกชื่อ: ");
        String name = sc.nextLine();

        // ข้อควรระวัง: การปิด Scanner (sc.close()) ในเมธอดอาจปิด System.in ไปด้วย
        // ทำให้รับค่าต่อไม่ได้ใน main

        return name;
    }

    public static void main(String[] args) {
        System.out.println("=== เมธอดมีการคืนค่า (Return) ===");

        // วิธีที่ 1: นำค่าที่คืนมาไปใส่ตัวแปร
        double vat = getVatRate();
        System.out.println("อัตราภาษี: " + (vat * 100) + "%");

        // วิธีที่ 2: นำไปแสดงผลหรือคำนวณต่อได้เลย
        System.out.println("เวอร์ชั่นโปรแกรม: " + getAppVersion());

        // สุ่มลูกเต๋า 3 ครั้ง
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        System.out.println("ผลการทอยลูกเต๋า: " + dice1 + ", " + dice2 + ", " + dice3);
        System.out.println("ผลรวมแต้ม: " + (dice1 + dice2 + dice3));

        /*
         * Uncomment เมื่อต้องการทดสอบรับค่า
         * String user = getUserName();
         * System.out.println("ยินดีต้อนรับคุณ " + user);
         */
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === เมธอดมีการคืนค่า (Return) ===
 * อัตราภาษี: 7.000000000000001%
 * เวอร์ชั่นโปรแกรม: Ver 1.0.2
 * ผลการทอยลูกเต๋า: 4, 1, 6
 * ผลรวมแต้ม: 11
 * 
 * หมายเหตุ:
 * - ต้องระบุชนิดข้อมูลที่จะคืนค่า (Return Type) แทนคำว่า void (เช่น double,
 * int, String)
 * - ต้องมีคำสั่ง return ตามด้วยค่าที่ตรงกับ Return Type เสมอ
 */
