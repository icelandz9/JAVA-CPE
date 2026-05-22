/*
 * ชื่อไฟล์: ForEachLoop.java
 * หัวข้อ: เจาะลึก For-Each Loop (Enhanced For Loop)
 * คำอธิบาย: การวนลูปที่ออกแบบมาเพื่อทำงานกับ Array และ Collection โดยเฉพาะ
 *           syntax: for (DataType var : collection) { ... }
 * ตัวอย่างการใช้งาน: แสดงผลข้อมูลทั้งหมดโดยไม่ต้องยุ่งกับ index
 */

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        System.out.println("=== Enhanced For Loop (For-Each) ===");

        // 1. ใช้กับ Array ธรรมดา
        System.out.println("-- กับ Array --");
        int[] scores = { 80, 95, 70, 60 };

        for (int score : scores) {
            System.out.print(score + " ");
            if (score >= 80)
                System.out.print("(A) ");
            else
                System.out.print("(Other) ");
        }
        System.out.println();

        // 2. ใช้กับ ArrayList
        System.out.println("\n-- กับ ArrayList --");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for (String fruit : fruits) {
            System.out.println("I like " + fruit);
        }

        // 3. ข้อจำกัดของ For-Each
        System.out.println("\n-- ข้อจำกัด --");
        System.out.println("1. ไม่รู้ Index ปัจจุบัน (ถ้าอยากรู้ต้องสร้างตัวแปรนับเอง)");
        System.out.println("2. แก้ไขค่าใน Array โดยตรงไม่ได้ (เพราะตัวแปร Loop เป็นแค่ Copy)");

        /*
         * ตัวอย่างที่ทำไม่ได้ (หรือทำแล้วไม่มีผล)
         * for (int s : scores) {
         * s = 0; // เปลี่ยนค่า s เป็น 0 แต่ scores ในอาร์เรย์ยังเหมือนเดิม
         * }
         */
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Enhanced For Loop (For-Each) ===
 * -- กับ Array --
 * 80 (A) 95 (A) 70 (Other) 60 (Other)
 * 
 * -- กับ ArrayList --
 * I like Apple
 * I like Banana
 * I like Orange
 * 
 * -- ข้อจำกัด --
 * ...
 */
