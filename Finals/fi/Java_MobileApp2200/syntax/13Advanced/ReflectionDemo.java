/*
 * ชื่อไฟล์: ReflectionDemo.java
 * หัวข้อ: Reflection API (เจาะ/เข้าถึงตัวแปร private)
 * คำอธิบาย: Reflection คือความสามารถของ Java ในการตรวจสอบและแก้ไข Class ตัวเองขณะทำงาน
 *           ใช้เข้าถึงหรือแก้ไขตัวแปร/เมธอดที่เป็น private ได้
 * ตัวอย่างการใช้งาน: Framework ขนาดใหญ่ (เช่น Spring), การเขียน Unit Test
 */

import java.lang.reflect.Field;

// จำลองสถานการณ์: มีคลาส "ห้องนิรภัย" (SecretVault) ที่เก็บรหัสลับไว้
// โดยตั้งค่าเป็น 'private' (ส่วนตัว) ซึ่งปกติแล้วคนภายนอกจะไม่มีทางเข้าถึงได้เลย
class SecretVault {
    @SuppressWarnings("unused")
    private String password = "MySecretPassword123";
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        // 1. สร้างวัตถุห้องนิรภัยขึ้นมาตามปกติ
        SecretVault vault = new SecretVault();

        // ลองพยายามปริ้นตรงๆ: System.out.println(vault.password);
        // -> จะทำไม่ได้! (Error) เพราะติดสถานะ private

        System.out.println("--- เริ่มกระบวนการแฮกด้วย Reflection ---");

        // 2. ขอ "แผนผัง" (Blueprint) ของคลาสนั้นมาดู
        Class<?> cls = vault.getClass();

        // 3. สั่งค้นหาตัวแปรที่ชื่อ "password"
        Field hiddenField = cls.getDeclaredField("password");

        // 4. *** ขั้นตอนสำคัญ: ใช้กุญแจผีปลดล็อก ***
        // สั่งให้ Java ยกเลิกการตรวจสอบสิทธิ์ private ชั่วคราว
        hiddenField.setAccessible(true);

        // 5. อ่านค่าที่ซ่อนอยู่ (Read)
        String originalValue = (String) hiddenField.get(vault);
        System.out.println("1. แอบเจาะดูรหัสลับได้สำเร็จ: " + originalValue);

        // 6. แอบเปลี่ยนข้อมูลข้างใน (Write/Modify)
        hiddenField.set(vault, "HackedByJava");

        System.out.println("2. แอบเปลี่ยนรหัสลับเป็น: " + hiddenField.get(vault));
        System.out.println("--- จบภารกิจ ---");
    }
}

/*
 * หมายเหตุ:
 * - getDeclaredField = หาตัวแปรที่ประกาศไว้ทั้งหมดรวม private
 * - setAccessible(true) คือหัวใจสำคัญในการเข้าถึง
 * - ข้อควรระวัง: การใช้ Reflection ทำให้โปรแกรมทำงานช้าลง และทำลายหลัก Encapsulation
 */
