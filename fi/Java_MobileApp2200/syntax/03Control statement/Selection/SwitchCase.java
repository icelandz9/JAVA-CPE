/*
 * ชื่อไฟล์: SwitchCase.java
 * หัวข้อ: คำสั่งเลือกทำ Switch Case
 * คำอธิบาย: การตรวจสอบค่าของตัวแปรเพื่อเลือกทำงานใน case ที่ตรงกัน
 *           เหมาะสำหรับตัวเลือกที่แน่นอน (เมนู, วันในสัปดาห์)
 * ตัวอย่างการใช้งาน: เมนู ATM, แปลงตัวเลขเป็นวัน, ตรวจสอบรหัสสินค้า
 */

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("=== คำสั่ง Switch Case ===");

        Scanner scanner = new Scanner(System.in);
        System.out.println("เมนูเครื่องดื่ม:");
        System.out.println("1. กาแฟ");
        System.out.println("2. ชาเขียว");
        System.out.println("3. โกโก้");
        System.out.print("เลือกเมนู (1-3): ");

        int menu = scanner.nextInt();

        // switch ตรวจสอบค่าของตัวแปร menu
        switch (menu) {
            case 1:
                System.out.println("คุณเลือก: กาแฟ");
                System.out.println("ราคา 50 บาท");
                break; // สำคัญมาก! ถ้าไม่ใส่จะไหลไปทำ case ถัดไป (Fall through)
            case 2:
                System.out.println("คุณเลือก: ชาเขียว");
                System.out.println("ราคา 45 บาท");
                break;
            case 3:
                System.out.println("คุณเลือก: โกโก้");
                System.out.println("ราคา 40 บาท");
                break;
            default: // ทำงานเมื่อไม่ตรงกับ case ใดเลย (เหมือน else)
                System.out.println("เมนูไม่ถูกต้อง");
                break;
        }

        // ตัวอย่าง Fall through (ตั้งใจไม่ใส่ break)
        // ใช้เมื่อหลาย case ทำงานเหมือนกัน
        System.out.print("\nกรุณากรอกเดือน (1-12): ");
        int month = scanner.nextInt();
        String season;

        switch (month) {
            case 11:
            case 12:
            case 1:
                season = "ฤดูหนาว";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                season = "ฤดูร้อน";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                season = "ฤดูฝน";
                break;
            default:
                season = "ข้อมูลเดือนไม่ถูกต้อง";
        }
        System.out.println("เดือน " + month + " อยู่ในช่วง: " + season);

        scanner.close();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === คำสั่ง Switch Case ===
 * เมนูเครื่องดื่ม:
 * ...
 * เลือกเมนู (1-3): 2
 * คุณเลือก: ชาเขียว
 * ราคา 45 บาท
 * 
 * -- ตัวอย่าง Fall through --
 * กรุณากรอกเดือน (1-12): 1
 * เดือน 1 อยู่ในช่วง: ฤดูหนาว
 * 
 * หมายเหตุ:
 * - ตัวแปรใน switch ต้องเป็น byte, short, char, int, String, หรือ Enum เท่านั้น
 * (float/double ไม่ได้)
 * - อย่าลืม break; ในแต่ละ case ยกเว้นตั้งใจให้ไหลไป case ล่าง
 */
