import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        // คำสั่งพื้นฐานที่สุด: การแสดงผลข้อความออกทางหน้าจอ
        System.out.println("Hello, World!");
        System.out.print("This prints without a new line. "); // print ไว้ใช้ print ค่า String แบบไม่ขึ้นบรรทัดใหม่
                                                              // ถ้าใช้ print ธรรมดาจะนำอันล่างมาต่อท้ายอัตโนมัติ
        System.out.println("This follows immediately."); // println ไว้ใช้ print ค่า String แบบขึ้นบรรทัดใหม่
                                                         // จะไม่นำอันล่างมาต่อท้าย แต่จะขึ้นบรรทัดใหม่
        System.out.printf("The value of pi is %.2f\n", 3.14159); // printf ไว้ใช้ print ค่า float
                                                                 // หาก print float แล้วไม่ใส่ printf จะ Error

        // การใช้ Escape Sequence พื้นฐาน
        // \n = ขึ้นบรรทัดใหม่
        // \t = เว้นวรรค (Tab)
        System.out.println("Line 1\nLine 2\tTabbed");

        // ==========================================
        // ตัวอย่างการใช้งาน Helper Method "print"
        // โดยนำ Logic จาก Exercise 2 มาประยุกต์ใช้
        // ==========================================

        Scanner scan_cal = new Scanner(System.in);
        // ใช้ print() แทน System.out.println() ได้เลย
        print("\n=== Exercise 2 Example (Using short print) ===");
        print("Enter the first 9 digit of and ISBN as integer : ");

        // รับค่าตามปกติ
        int d1 = scan_cal.nextInt();
        int d2 = scan_cal.nextInt();
        int d3 = scan_cal.nextInt();
        int d4 = scan_cal.nextInt();
        int d5 = scan_cal.nextInt();
        int d6 = scan_cal.nextInt();
        int d7 = scan_cal.nextInt();
        int d8 = scan_cal.nextInt();
        int d9 = scan_cal.nextInt();

        // คำนวณตาม Logic เดิม
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        // ใช้ print() แสดงผลลัพธ์ ทำให้โค้ดดูสั้นและสะอาดตาขึ้น
        if (d10 == 10) {
            print("The ISBN-10 number is : " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        } else {
            print("The ISBN-10 number is : " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }

        scan_cal.close();
    }

    // สร้าง Method "print" เพื่อย่อคำสั่ง System.out.println
    public static void print(Object data) {
        System.out.println(data);
    }
}
