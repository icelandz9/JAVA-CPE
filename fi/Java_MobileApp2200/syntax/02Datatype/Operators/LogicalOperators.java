/*
 * ชื่อไฟล์: LogicalOperators.java
 * หัวข้อ: ตัวดำเนินการทางตรรกศาสตร์ (Logical Operators)
 * คำอธิบาย: การใช้งาน && (AND), || (OR), ! (NOT)
 *           ใช้เชื่อมประโยคเงื่อนไขหลายๆ อันเข้าด้วยกัน
 * ตัวอย่างการใช้งาน: ตรวจสอบ username และ password, ตรวจสอบช่วงอายุ (18-60 ปี)
 */

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("=== ตัวดำเนินการทางตรรกศาสตร์ ===");

        boolean condition1 = true;
        boolean condition2 = false;

        // 1. AND (&&) - เป็นจริงเมื่อทั้งคู่เป็นจริง
        System.out.println("true && false = " + (condition1 && condition2));
        System.out.println("true && true = " + (true && true));

        // 2. OR (||) - เป็นจริงเมื่ออย่างน้อยหนึ่งตัวเป็นจริง
        System.out.println("true || false = " + (condition1 || condition2));
        System.out.println("false || false = " + (false || false));

        // 3. NOT (!) - กลับค่าความจริง
        System.out.println("!true = " + (!condition1));
        System.out.println("!false = " + (!condition2));

        // ตัวอย่างการใช้งานจริง: ระบบ Login
        System.out.println("\n-- ตัวอย่างระบบ Login --");
        String username = "admin";
        String password = "123";

        String inputUser = "admin";
        String inputPass = "123";

        // ตรวจสอบว่าชื่อถูกต้อง และ รหัสผ่านถูกต้อง
        if (inputUser.equals(username) && inputPass.equals(password)) {
            System.out.println("Login สำเร็จ!");
        } else {
            System.out.println("ชื่อผู้ใช้หรือรหัสผ่านไม่ถูกต้อง");
        }

        // ตัวอย่างการตรวจสอบตัวเลขอยู่ในช่วง (Range Check)
        System.out.println("\n-- ตัวอย่างตรวจสอบช่วงข้อมูล --");
        int score = 85;
        // คะแนนต้องอยู่ระหว่าง 0 ถึง 100
        if (score >= 0 && score <= 100) {
            System.out.println("คะแนน " + score + " อยู่ในช่วงที่ถูกต้อง");
        } else {
            System.out.println("คะแนนไม่ถูกต้อง");
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === ตัวดำเนินการทางตรรกศาสตร์ ===
 * true && false = false
 * true && true = true
 * true || false = true
 * false || false = false
 * !true = false
 * !false = true
 * 
 * -- ตัวอย่างระบบ Login --
 * Login สำเร็จ!
 * 
 * -- ตัวอย่างตรวจสอบช่วงข้อมูล --
 * คะแนน 85 อยู่ในช่วงที่ถูกต้อง
 * 
 * หมายเหตุ:
 * - Short-circuit Evaluation:
 * - ถ้า A && B และ A เป็นเท็จ ระบบจะไม่ตรวจสอบ B (เพราะผลเป็นเท็จแน่นอน)
 * - ถ้า A || B และ A เป็นจริง ระบบจะไม่ตรวจสอบ B (เพราะผลเป็นจริงแน่นอน)
 */
