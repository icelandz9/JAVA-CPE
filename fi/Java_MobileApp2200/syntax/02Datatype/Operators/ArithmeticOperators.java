/*
 * ชื่อไฟล์: ArithmeticOperators.java
 * หัวข้อ: ตัวดำเนินการทางคณิตศาสตร์ (Arithmetic Operators)
 * คำอธิบาย: การใช้งาน +, -, *, /, % (Modulo)
 * ตัวอย่างการใช้งาน: การคำนวณพื้นฐาน, การหาเศษจากการหาร
 */

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("=== ตัวดำเนินการทางคณิตศาสตร์ ===");
        
        int x = 10;
        int y = 3;
        
        // 1. การบวก (+)
        System.out.println(x + " + " + y + " = " + (x + y));
        
        // 2. การลบ (-)
        System.out.println(x + " - " + y + " = " + (x - y));
        
        // 3. การคูณ (*)
        System.out.println(x + " * " + y + " = " + (x * y));
        
        // 4. การหาร (/) -> ถ้าเป็นจำนวนเต็ม ผลลัพธ์จะตัดเศษทิ้ง
        System.out.println(x + " / " + y + " = " + (x / y));
        
        // 5. การหารเอาเศษ (Modulo %) -> มีประโยชน์มากในการตรวจสอบเลขคู่/คี่ หรือวนรอบ
        System.out.println(x + " % " + y + " = " + (x % y)); 
        // 10 หาร 3 ได้ 3 เศษ 1
        
        // การใช้กับ String (Concatenation)
        String firstName = "Java";
        String lastName = "Programming";
        System.out.println(firstName + " " + lastName); // ต่อสตริง
        
        System.out.println("ผลลัพธ์คือ: " + x + y); // ระวัง! จะกลายเป็นการต่อสตริง "103"
        System.out.println("ผลลัพธ์คือ: " + (x + y)); // ต้องใส่วงเล็บถ้าต้องการบวขเลข "13"
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === ตัวดำเนินการทางคณิตศาสตร์ ===
 * 10 + 3 = 13
 * 10 - 3 = 7
 * 10 * 3 = 30
 * 10 / 3 = 3
 * 10 % 3 = 1
 * Java Programming
 * ผลลัพธ์คือ: 103
 * ผลลัพธ์คือ: 13
 * 
 * หมายเหตุ:
 * - ระวังเรื่องลำดับการคำนวณ (Operator Precedence) * / % ทำก่อน + -
 * - การหารตัวเลขจำนวนเต็มจะตัดเศษทิ้งเสมอ
 * - Modulo (%) ใช้ได้ทั้งจำนวนเต็มและทศนิยม
 */
