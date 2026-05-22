/*
 * ชื่อไฟล์: DecimalFormatExample.java
 * หัวข้อ: การจัดรูปแบบตัวเลข (Number Formatting)
 * คำอธิบาย: การใช้ DecimalFormat เพื่อแสดงผลตัวเลขทศนิยมให้สวยงาม
 *           กำหนดจำนวนทศนิยม, ใส่เครื่องหมายลูกน้ำคั่นหลักพัน
 * ตัวอย่างการใช้งาน: แสดงราคาสินค้า, แสดงผลการคำนวณเงิน
 */

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        System.out.println("=== การจัดรูปแบบตัวเลขด้วย DecimalFormat ===");

        double number = 12345.6789;
        System.out.println("เลขต้นฉบับ: " + number);

        // 1. ทศนิยม 2 ตำแหน่ง (ปัดเศษ)
        DecimalFormat df1 = new DecimalFormat("0.00");
        System.out.println("0.00 -> " + df1.format(number)); // 12345.68

        // 2. ใส่ลูกน้ำคั่นหลักพัน และทศนิยม 2 ตำแหน่ง
        DecimalFormat df2 = new DecimalFormat("#,###.00");
        System.out.println("#,###.00 -> " + df2.format(number)); // 12,345.68

        // 3. เปรียบเทียบ 0 กับ #
        // 0: บังคับแสดงตัวเลข ถ้าไม่มีให้แสดง 0
        // #: แสดงตัวเลข ถ้าไม่มีจะไม่แสดง (ยกเว้นตำแหน่งที่จำเป็น)
        double n2 = 12.5;
        DecimalFormat df3 = new DecimalFormat("000.000"); // บังคับ 3 หลักหน้า 3 หลักหลัง
        System.out.println("000.000 (กับ 12.5) -> " + df3.format(n2)); // 012.500

        DecimalFormat df4 = new DecimalFormat("###.###");
        System.out.println("###.### (กับ 12.5) -> " + df4.format(n2)); // 12.5

        // ตัวอย่างการใช้งานจริง: โปรแกรมคิดภาษี
        System.out.println("\n-- ตัวอย่าง: ใบเสร็จรับเงิน --");
        double price = 25000.0;
        double vatRate = 0.07;
        double vatAmount = price * vatRate;
        double total = price + vatAmount;

        DecimalFormat moneyFormat = new DecimalFormat("฿#,###.00");

        System.out.println("ราคาสินค้า:\t" + moneyFormat.format(price));
        System.out.println("ภาษี (7%):\t" + moneyFormat.format(vatAmount));
        System.out.println("ยอดสุทธิ:\t" + moneyFormat.format(total));

        // อีกวิธี: ใช้ String.format (คล้าย printf)
        System.out.println("\n-- ใช้ String.format --");
        String formatted = String.format("ยอดเงิน: %,.2f บาท", total);
        System.out.println(formatted);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การจัดรูปแบบตัวเลขด้วย DecimalFormat ===
 * เลขต้นฉบับ: 12345.6789
 * 0.00 -> 12345.68
 * #,###.00 -> 12,345.68
 * 000.000 (กับ 12.5) -> 012.500
 * ###.### (กับ 12.5) -> 12.5
 * 
 * -- ตัวอย่าง: ใบเสร็จรับเงิน --
 * ราคาสินค้า: ฿25,000.00
 * ภาษี (7%): ฿1,750.00
 * ยอดสุทธิ: ฿26,750.00
 * 
 * หมายเหตุ:
 * - 0 ใช้สำหรับตำแหน่งที่ต้องการ fixed จำนวนหลัก (padding)
 * - # ใช้สำหรับตำแหน่งทั่วไป
 * - , ใช้สำหรับ Grouping Separator (คั่นหลักพัน)
 */
