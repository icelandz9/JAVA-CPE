/*
 * ชื่อไฟล์: MacroRobot.java
 * หัวข้อ: Robot Class (การเขียน Macro ควบคุมเมาส์/คีย์บอร์ด)
 * คำอธิบาย: อนุญาตให้โปรแกรม Java ควบคุมเมาส์และคีย์บอร์ดของเครื่องคอมพิวเตอร์ได้จริงๆ
 *           นิยมใช้ทำโปรแกรมช่วยเล่นเกม (Macro) หรือ Test Automation
 * ตัวอย่างการใช้งาน: สั่งพิมพ์ข้อความอัตโนมัติ, ขยับเมาส์ไปคลิกปุ่ม
 */

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class MacroRobot {
    public static void main(String[] args) {
        // Robot Class: คำสั่ง "สายมืด" หรือสาย Automation
        
        try {
            Robot robot = new Robot();

            // รอ 3 วินาที เพื่อให้ผู้ใช้เตรียมตัว (สลับหน้าจอไปที่อื่น)
            System.out.println("อีก 3 วินาที ผมจะพิมพ์ข้อความเอง...");
            robot.delay(3000);

            // 1. สั่งพิมพ์คีย์บอร์ด (Key Press)
            // ลองพิมพ์คำว่า "HI"
            // กดปุ่ม H
            robot.keyPress(KeyEvent.VK_H);
            robot.keyRelease(KeyEvent.VK_H);

            // กดปุ่ม I
            robot.keyPress(KeyEvent.VK_I);
            robot.keyRelease(KeyEvent.VK_I);

            // 2. สั่งขยับเมาส์ (Mouse Move)
            // ย้ายเมาส์ไปที่พิกัด 500, 500 บนหน้าจอ
            System.out.println("Moving mouse...");
            robot.mouseMove(500, 500);

            // 3. สั่งคลิกเมาส์
            // robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            // robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * หมายเหตุ:
 * - ต้องใส่ไว้ใน try-catch เสมอเพราะอาจเกิด AWTException
 * - keyPress ต้องตามด้วย keyRelease เสมอ ไม่งั้นปุ่มจะค้าง!
 */
