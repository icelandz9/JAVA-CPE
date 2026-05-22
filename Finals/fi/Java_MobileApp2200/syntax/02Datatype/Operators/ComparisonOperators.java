/*
 * ชื่อไฟล์: ComparisonOperators.java
 * หัวข้อ: ตัวดำเนินการเปรียบเทียบ (Comparison Operators)
 * คำอธิบาย: การใช้งาน ==, !=, >, <, >=, <=
 *           ผลลัพธ์ที่ได้จะเป็น boolean (true/false) เสมอ
 * ตัวอย่างการใช้งาน: เงื่อนไขใน if-else, ลูป, การตรวจสอบรหัสผ่าน
 */

public class ComparisonOperators {
    public static void main(String[] args) {
        System.out.println("=== ตัวดำเนินการเปรียบเทียบ ===");

        int a = 10;
        int b = 20;
        int c = 10;

        // 1. เท่ากับ (==)
        System.out.println(a + " == " + b + " : " + (a == b)); // false
        System.out.println(a + " == " + c + " : " + (a == c)); // true

        // 2. ไม่เท่ากับ (!=)
        System.out.println(a + " != " + b + " : " + (a != b)); // true

        // 3. มากกว่า (>)
        System.out.println(a + " > " + b + " : " + (a > b)); // false

        // 4. น้อยกว่า (<)
        System.out.println(a + " < " + b + " : " + (a < b)); // true

        // 5. มากกว่าหรือเท่ากับ (>=)
        System.out.println(a + " >= " + c + " : " + (a >= c)); // true

        // 6. น้อยกว่าหรือเท่ากับ (<=)
        System.out.println(b + " <= " + a + " : " + (b <= a)); // false

        // การเปรียบเทียบ String (ข้อควรระวัง!)
        // ห้ามใช้ == ในการเปรียบเทียบเนื้อหาของ String ให้ใช้ .equals() แทน
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("\n-- การเปรียบเทียบ String --");
        System.out.println("s1 == s2 : " + (s1 == s2)); // true (เพราะชี้ไปที่ memory เดียวกันใน String Pool)
        System.out.println("s1 == s3 : " + (s1 == s3)); // false (คนละ object)
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true (เนื้อหาเหมือนกัน) **วิธีที่ถูกต้อง**
    }
}

/*
 * ผลลัพธ์ที่ได้ (ตัวอย่าง):
 * === ตัวดำเนินการเปรียบเทียบ ===
 * 10 == 20 : false
 * 10 == 10 : true
 * 10 != 20 : true
 * 10 > 20 : false
 * 10 < 20 : true
 * 10 >= 10 : true
 * 20 <= 10 : false
 * 
 * -- การเปรียบเทียบ String --
 * s1 == s2 : true
 * s1 == s3 : false
 * s1.equals(s3) : true
 * 
 * หมายเหตุ:
 * - เครื่องหมาย = เดียว คือการกำหนดค่า (Assignment)
 * - เครื่องหมาย == สองอัน คือการเปรียบเทียบ (Comparison)
 * - จำไว้เสมอ: เปรียบเทียบ String ใช้ .equals()
 */
