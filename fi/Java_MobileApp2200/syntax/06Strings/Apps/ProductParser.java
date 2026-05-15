/*
 * ชื่อไฟล์: ProductParser.java
 * หัวข้อ: แยกส่วนประกอบรหัสสินค้า (String Parsing)
 * คำอธิบาย: การใช้ split และ substring เพื่อดึงข้อมูลจากรหัสที่มีรูปแบบเฉพาะ
 *           เช่น PROD-001-RED-L
 */

public class ProductParser {
    public static void main(String[] args) {
        System.out.println("=== Product Code Parser ===");

        String productCode = "PROD-001-RED-L";
        System.out.println("รหัสสินค้า: " + productCode);

        // วิธีที่ 1: ใช้ Split (ง่ายสุดถ้ามีตัวคั่นชัดเจน)
        System.out.println("\n-- วิธีที่ 1: Split --");
        String[] parts = productCode.split("-");

        if (parts.length == 4) {
            System.out.println("ประเภท: " + parts[0]);
            System.out.println("ID: " + parts[1]);
            System.out.println("สี: " + parts[2]);
            System.out.println("ขนาด: " + parts[3]);
        } else {
            System.out.println("รหัสสินค้าไม่ถูกต้อง");
        }

        // วิธีที่ 2: ใช้ indexOf และ substring (กรณีซับซ้อนกว่านี้)
        System.out.println("\n-- วิธีที่ 2: Substring --");
        int firstDash = productCode.indexOf('-');
        int secondDash = productCode.indexOf('-', firstDash + 1);

        String type = productCode.substring(0, firstDash);
        String id = productCode.substring(firstDash + 1, secondDash);

        System.out.println("ดึงเฉพาะ Type และ ID: " + type + ", " + id);

        // การตรวจสอบความถูกต้อง
        if (parts[0].equals("PROD")) {
            System.out.println("\n[ตรวจสอบ] เป็นสินค้าทั่วไป");
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Product Code Parser ===
 * รหัสสินค้า: PROD-001-RED-L
 * 
 * -- วิธีที่ 1: Split --
 * ประเภท: PROD
 * ID: 001
 * สี: RED
 * ขนาด: L
 * 
 * -- วิธีที่ 2: Substring --
 * ดึงเฉพาะ Type และ ID: PROD, 001
 * 
 * [ตรวจสอบ] เป็นสินค้าทั่วไป
 */
