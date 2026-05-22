
/*
 * ชื่อไฟล์: MenuSystem.java
 * หัวข้อ: ระบบเมนูแบบครบวงจร (Menu System Project)
 * คำอธิบาย: ตัวอย่างโปรแกรมที่รวมเอา If, Switch, Loop, Break, Continue มาใช้ร่วมกัน
 *           จำลองระบบจัดการคลังสินค้าขนาดเล็ก
 * ตัวอย่างการใช้งาน: โปรเจคทบทวนความรู้บทที่ 3
 */
import java.util.Scanner;

public class MenuSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stock = 0; // จำนวนสินค้าในคลัง
        int choice;
        boolean isRunning = true;

        System.out.println("========== ระบบจัดการคลังสินค้า ==========");

        while (isRunning) {
            // แสดงสถานะปัจจุบัน
            System.out.println("\nสินค้าคงเหลือ: " + stock + " ชิ้น");
            System.out.println("1. เพิ่มสินค้า (Add)");
            System.out.println("2. นำสินค้าออก (Remove)");
            System.out.println("3. ตรวจสอบสถานะ (Check)");
            System.out.println("4. ล้างสต็อก (Clear)");
            System.out.println("0. ออกจากโปรแกรม (Exit)");
            System.out.print("เลือกทำรายการ: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("จำนวนที่ต้องการเพิ่ม: ");
                    int amountAdd = scanner.nextInt();
                    if (amountAdd > 0) {
                        stock += amountAdd;
                        System.out.println("-> เพิ่มสินค้าเรียบร้อย");
                    } else {
                        System.out.println("-> ผิดพลาด! จำนวนต้องมากกว่า 0");
                    }
                    break;

                case 2:
                    System.out.print("จำนวนที่ต้องการนำออก: ");
                    int amountRemove = scanner.nextInt();
                    if (amountRemove > 0 && amountRemove <= stock) {
                        stock -= amountRemove;
                        System.out.println("-> นำสินค้าออกเรียบร้อย");
                    } else if (amountRemove > stock) {
                        System.out.println("-> ผิดพลาด! สินค้าไม่พอ");
                    } else {
                        System.out.println("-> ผิดพลาด! จำนวนไม่ถูกต้อง");
                    }
                    break;

                case 3:
                    if (stock == 0) {
                        System.out.println("-> สถานะ: คลังสินค้าว่างเปล่า (Empty)");
                    } else if (stock < 10) {
                        System.out.println("-> สถานะ: สินค้าใกล้หมด (Low Stock)");
                    } else {
                        System.out.println("-> สถานะ: สินค้าเพียงพอ (Normal)");
                    }
                    break;

                case 4:
                    System.out.print("ยืนยันการล้างข้อมูล? (กด 1 เพื่อยืนยัน): ");
                    int confirm = scanner.nextInt();
                    if (confirm == 1) {
                        stock = 0;
                        System.out.println("-> ล้างสต็อกเรียบร้อย");
                    } else {
                        System.out.println("-> ยกเลิกการทำรายการ");
                    }
                    break;

                case 0:
                    System.out.println("ขอบคุณที่ใช้งาน");
                    isRunning = false; // จบลูป
                    break;

                default:
                    System.out.println("คำสั่งไม่ถูกต้อง กรุณาลองใหม่");
            }
        }

        scanner.close();
    }
}

/*
 * ผลลัพธ์ตัวอย่าง:
 * ========== ระบบจัดการคลังสินค้า ==========
 * สินค้าคงเหลือ: 0 ชิ้น
 * ...
 * เลือกทำรายการ: 1
 * จำนวนที่ต้องการเพิ่ม: 50
 * -> เพิ่มสินค้าเรียบร้อย
 * 
 * สินค้าคงเหลือ: 50 ชิ้น
 * ...
 * 
 * หมายเหตุ:
 * - ตัวอย่างนี้แสดงโครงสร้าง Logic พื้นฐานของโปรแกรมจัดการข้อมูล
 * - การใช้ boolean flag (isRunning) ควบคุม while loop เป็นวิธีที่นิยมและปลอดภัย
 */
