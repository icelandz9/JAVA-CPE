import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try { // คือ code ที่ต้องการตรวจสอบให้อยู่ใน try

            System.out.print("Inpur Number Only: ");
            int num = sc.nextInt();

            int a[] = new int[5];
            a[2] = 20;

            // catch คือ ตัวเช็ค error
        } catch (ArrayIndexOutOfBoundsException e1) { // เช็ค index ใน arraay ว่าเกินมั้ย
            System.out.println("Array Error index");
        } catch (InputMismatchException e2) { // เช็คถ้ากรอกตัวอักษรจะขึ้น error
            System.err.println("Input not find Number");
        } catch (Exception e3) { // Exception คือ เช็ค error ทุกตัว
            System.out.println("Other Error");
        }finally{ //ไม่ว่า Catch จะทำงานมั้ยแต่ finally ทำงานเสมอ
            System.out.println("Finally");
        }
    }
}

// Exception ที่ใช้บ่อย

// 1.รับข้อมูลจาก User
// InputMismatchException กรอกตัวอักษรแทนตัวเลข
// NumberFormatExceptionแปลง String เป็นตัวเลขไม่ได้


// 2.เกี่ยวกับตัวเลข
// ArithmeticException หารด้วยศูนย์

// 3. เกี่ยวกับ Array
// ArrayIndexOutOfBoundsException เข้า index เกินขนาด array
// NegativeArraySizeException สร้าง array ขนาดติดลบ

// 4. เกี่ยวกับ Object
// NullPointerException ใช้งานตัวแปรที่เป็น null
// ClassCastExceptionแปลง Object ผิดประเภท

// 5. เกี่ยวกับไฟล์
// IOException อ่าน/เขียนไฟล์มีปัญหา
// FileNotFoundException ไม่พบไฟล์

// 6. ตัวกลาง
// Exceptionรับ error ได้ ทุกประเภท ใส่ไว้ท้ายสุดเสมอ