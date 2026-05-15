/*
 * ชื่อไฟล์: SwitchWithLoop.java
 * หัวข้อ: การใช้ Switch Case ร่วมกับ Loop
 * คำอธิบาย: ตัวอย่างการนำ Switch Case มาใช้ภายใน Loop เพื่อสร้างเมนูที่ทำซ้ำได้
 *           มีการตรวจสอบ Input และใช้ do-while loop
 * ตัวอย่างการใช้งาน: เครื่องคิดเลข, ตู้ ATM
 */

import java.util.Scanner;

public class SwitchWithLoop {
    public static void main(String[] args) {
        System.out.println("=== Switch Case ร่วมกับ Loop (Calculator) ===");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // แสดงเมนู
            System.out.println("\n---------------------");
            System.out.println("เมนูเครื่องคิดเลข:");
            System.out.println("1. บวกเลข (+)");
            System.out.println("2. ลบเลข (-)");
            System.out.println("3. คูณเลข (*)");
            System.out.println("0. ออกจากโปรแกรม");
            System.out.print("เลือกเมนู: ");

            choice = scanner.nextInt();

            // ใช้ Switch เพื่อเลือกการทำงาน
            switch (choice) {
                case 1:
                    System.out.println("-- โหมดบวกเลข --");
                    // ลูปย่อยใน case ในการทำงาน (ถ้าต้องการ)
                    System.out.print("ใส่เลขตัวที่ 1: ");
                    int a1 = scanner.nextInt();
                    System.out.print("ใส่เลขตัวที่ 2: ");
                    int b1 = scanner.nextInt();
                    System.out.println("ผลลัพธ์: " + (a1 + b1));
                    break;

                case 2:
                    System.out.println("-- โหมดลบเลข --");
                    System.out.print("ใส่เลขตัวที่ 1: ");
                    int a2 = scanner.nextInt();
                    System.out.print("ใส่เลขตัวที่ 2: ");
                    int b2 = scanner.nextInt();
                    System.out.println("ผลลัพธ์: " + (a2 - b2));
                    break;

                case 3:
                    System.out.println("-- โหมดคูณเลข --");
                    System.out.print("ใส่เลขตัวที่ 1: ");
                    int a3 = scanner.nextInt();
                    System.out.print("ใส่เลขตัวที่ 2: ");
                    int b3 = scanner.nextInt();
                    System.out.println("ผลลัพธ์: " + (a3 * b3));
                    break;

                case 0:
                    System.out.println("ขอบคุณที่ใช้บริการ... ลาก่อน");
                    break;

                default:
                    System.out.println("เมนูไม่ถูกต้อง กรุณาเลือกใหม่");
            }

        } while (choice != 0); // วนซ้ำตราบใดที่ยังไม่ได้เลือก 0

        scanner.close();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Switch Case ร่วมกับ Loop (Calculator) ===
 * เมนูเครื่องคิดเลข:
 * 1. บวกเลข (+)
 * ...
 * เลือกเมนู: 1
 * -- โหมดบวกเลข --
 * ใส่เลขตัวที่ 1: 10
 * ใส่เลขตัวที่ 2: 20
 * ผลลัพธ์: 30
 * ...
 * 
 * หมายเหตุ:
 * - นี่คือรูปแบบ (Pattern) ที่พบบ่อยที่สุดในการสร้าง Console Application
 */
