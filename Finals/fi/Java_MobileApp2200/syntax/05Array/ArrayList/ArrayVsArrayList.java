/*
 * ชื่อไฟล์: ArrayVsArrayList.java
 * หัวข้อ: เปรียบเทียบ Array และ ArrayList
 * คำอธิบาย: การเขียนโค้ดแก้ปัญหาเดียวกันด้วย 2 วิธี เพื่อเห็นข้อแตกต่าง
 *           โจทย์: เก็บชื่อเพื่อน 3 คน
 * ตัวอย่างการใช้งาน: เลือกใช้ Structure ให้เหมาะสมกับงาน
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        System.out.println("=== Array vs ArrayList ===");

        // -------------------------
        // 1. Normal Array (Fixed Size)
        // -------------------------
        System.out.println("-- 1. Normal Array --");
        String[] arrFriends = new String[3]; // ต้องระบุขนาด
        arrFriends[0] = "Alice";
        arrFriends[1] = "Bob";
        arrFriends[2] = "Charlie";
        // arrFriends[3] = "David"; // Error! เพิ่มไม่ได้แล้ว

        System.out.println("ขนาด Array: " + arrFriends.length);
        System.out.println("เพื่อนคนที่ 2: " + arrFriends[1]);
        System.out.println("ข้อมูลทั้งหมด: " + Arrays.toString(arrFriends));

        // -------------------------
        // 2. ArrayList (Dynamic Size)
        // -------------------------
        System.out.println("\n-- 2. ArrayList --");
        ArrayList<String> listFriends = new ArrayList<>(); // ไม่ต้องระบุขนาด
        listFriends.add("Alice");
        listFriends.add("Bob");
        listFriends.add("Charlie");
        listFriends.add("David"); // เพิ่มได้เรื่อยๆ

        System.out.println("ขนาด List: " + listFriends.size());
        System.out.println("เพื่อนคนที่ 2: " + listFriends.get(1));
        System.out.println("ข้อมูลทั้งหมด: " + listFriends);

        // ข้อสรุป
        System.out.println("\n-------------------------");
        System.out.println("ข้อสรุป:");
        System.out.println("1. ใช้ Array เมื่อรู้จำนวนข้อมูลที่แน่นอน และต้องการความเร็วสูงสุด");
        System.out.println("2. ใช้ ArrayList เมื่อจำนวนข้อมูลไม่แน่นอน และต้องการความสะดวก (เพิ่ม/ลบ ง่าย)");
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Array vs ArrayList ===
 * -- 1. Normal Array --
 * ขนาด Array: 3
 * เพื่อนคนที่ 2: Bob
 * ข้อมูลทั้งหมด: [Alice, Bob, Charlie]
 * 
 * -- 2. ArrayList --
 * ขนาด List: 4
 * เพื่อนคนที่ 2: Bob
 * ข้อมูลทั้งหมด: [Alice, Bob, Charlie, David]
 * 
 * ...
 */
