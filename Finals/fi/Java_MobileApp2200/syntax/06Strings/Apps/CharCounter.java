/*
 * ชื่อไฟล์: CharCounter.java
 * หัวข้อ: นับจำนวนตัวอักษร (Char Counter)
 * คำอธิบาย: โปรแกรมนับว่ามีตัวอักษรแต่ละตัวกี่ตัวในข้อความ
 * ตัวอย่างการใช้งาน: วิเคราะห์ความถี่ตัวอักษร
 */

import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        System.out.println("=== โปรแกรมนับจำนวนตัวอักษร ===");

        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณากรอกข้อความ: ");
        String input = sc.nextLine().toLowerCase(); // แปลงเป็นตัวเล็กเพื่อให้ง่าย

        // สร้าง Array เก็บจำนวนนับ (a-z) มี 26 ตัว
        int[] counts = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                // 'a' มีค่า ascii 97
                // ถ้าเจอ 'a' -> index 0 (97-97)
                // ถ้าเจอ 'b' -> index 1 (98-97)
                counts[ch - 'a']++;
            }
        }

        // แสดงผล
        System.out.println("ความถี่ตัวอักษร:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                char ch = (char) ('a' + i); // แปลงกลับเป็นตัวอักษร
                System.out.println(ch + ": " + counts[i]);
            }
        }

        sc.close();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === โปรแกรมนับจำนวนตัวอักษร ===
 * กรุณากรอกข้อความ: Hello World
 * ความถี่ตัวอักษร:
 * d: 1
 * e: 1
 * h: 1
 * l: 3
 * o: 2
 * r: 1
 * w: 1
 * 
 * หมายเหตุ:
 * - นี่คือพื้นฐานของอัลกอริทึม Counting Sort หรือ Hashing เบื้องต้น
 */
