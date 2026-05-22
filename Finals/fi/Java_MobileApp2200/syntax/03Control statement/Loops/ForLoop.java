/*
 * ชื่อไฟล์: ForLoop.java
 * หัวข้อ: คำสั่งวนซ้ำ For Loop
 * คำอธิบาย: วนซ้ำโดยกำหนดจำนวนรอบที่แน่นอน
 *           รูปแบบ: for (initialization; condition; update)
 * ตัวอย่างการใช้งาน: วนลูปอาร์เรย์, นับจำนวน, คำนวณสูตรคูณ
 */

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("=== คำสั่ง For Loop ===");

        // ตัวอย่างที่ 1: นับเลข 1 ถึง 5
        System.out.println("-- นับเลข 1-5 --");
        for (int i = 1; i <= 5; i++) {
            System.out.println("รอบที่: " + i);
        }

        // ตัวอย่างที่ 2: นับถอยหลัง 10 ถึง 1
        System.out.println("\n-- นับถอยหลัง --");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // ขึ้นบรรทัดใหม่

        // ตัวอย่างที่ 3: เพิ่มค่าทีละ 2 (เลขคู่)
        System.out.println("\n-- เลขคู่ 2-10 --");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ตัวอย่างที่ 4: การใช้ Comma Operator (หลายตัวแปรในลูปเดียว)
        System.out.println("\n-- หลายตัวแปร --");
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }

        // ตัวอย่างที่ 5: สูตรคูณแม่ 2
        System.out.println("\n-- สูตรคูณแม่ 2 --");
        int number = 2;
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === คำสั่ง For Loop ===
 * -- นับเลข 1-5 --
 * รอบที่: 1
 * ...
 * -- นับถอยหลัง --
 * 10 9 8 7 6 5 4 3 2 1
 * ...
 * -- สูตรคูณแม่ 2 --
 * 2 x 1 = 2
 * ...
 * 2 x 12 = 24
 * 
 * หมายเหตุ:
 * - ตัวแปร i ที่ประกาศใน for loop จะใช้ได้แค่ในบล็อก for เท่านั้น (Local Scope)
 * - for loop เหมาะที่สุดเมื่อเรารู้จำนวนรอบที่แน่นอน
 */
