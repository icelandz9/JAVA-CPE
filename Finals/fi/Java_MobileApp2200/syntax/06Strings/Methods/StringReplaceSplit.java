/*
 * ชื่อไฟล์: StringReplaceSplit.java
 * หัวข้อ: การแทนที่และการแยกคำ (Replace & Split)
 * คำอธิบาย: 1. .replace() เปลี่ยนคำนึงเป็นอีกคำนึง
 *           2. .split() แยกข้อความด้วยตัวคั่น (Delimiter) ออกมาเป็น Array
 */

public class StringReplaceSplit {
    public static void main(String[] args) {
        System.out.println("=== การแทนที่และแยกคำ ===");

        String text = "Java is fun. Java is powerful.";

        // 1. การแทนที่ (.replace())
        String newText = text.replace("Java", "Python");

        System.out.println("เดิม: " + text);
        System.out.println("ใหม่: " + newText);

        // ลบช่องว่างทั้งหมด (แทนที่ space ด้วย empty string)
        String noSpace = text.replace(" ", "");
        System.out.println("ลบช่องว่าง: " + noSpace);

        // 2. การแยกคำ (.split()) -> พื้นฐานของ CSV Parsing
        System.out.println("\n-- การแยกคำ (Split) --");
        String data = "Apple,Banana,Orange,Grape";

        String[] fruits = data.split(","); // แยกด้วยเครื่องหมายจุลภาค

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit " + (i + 1) + ": " + fruits[i]);
        }

        // ตัวอย่างแยกประโยคด้วยเว้นวรรค
        String sentence = "I love coding";
        String[] words = sentence.split(" ");
        System.out.println("จำนวนคำ: " + words.length);
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การแทนที่และแยกคำ ===
 * เดิม: Java is fun. Java is powerful.
 * ใหม่: Python is fun. Python is powerful.
 * ลบช่องว่าง: Javaisfun.Javaispowerful.
 * 
 * -- การแยกคำ (Split) --
 * Fruit 1: Apple
 * Fruit 2: Banana
 * Fruit 3: Orange
 * Fruit 4: Grape
 * จำนวนคำ: 3
 * 
 * หมายเหตุ:
 * - split() รับค่าเป็น Regex (Regular Expression) บางตัวอักษรพิเศษต้อง escape
 * ก่อน เช่น . หรือ | หรือ *
 * เช่น split("\\.")
 */
