package Quiz.Quiz_Graymatter.Exam8;

import java.util.Scanner;

/**
 * คลาส Exam8 ใช้สำหรับรับค่าจากผู้ใช้และคำนวณปริมาตรของรูปทรงเรขาคณิต 3 แบบ
 * ได้แก่ ทรงกลม (Sphere), ทรงกระบอก (Cylinder) และปริซึมสามเหลี่ยม (Triangle Prism)
 * โดยใช้คอนเซ็ปต์ Method Overloading ในการคำนวณปริมาตร
 */
public class Exam8 {
    public static void main(String[] args) {
        // สร้างออบเจ็กต์ Scanner สำหรับรับค่า input จากทางคีย์บอร์ด
        Scanner scanner = new Scanner(System.in);

        // --- ส่วนที่ 1: การคำนวณปริมาตรทรงกลม ---
        System.out.print("Enter radius of sphere: ");
        double sphereRadius = scanner.nextDouble(); // รับค่ารัศมีทรงกลม
        // เรียกใช้เมธอด calculateVolume ที่รับพารามิเตอร์ 1 ตัว
        System.out.printf("Sphere Volume: %.2f\n", calculateVolume(sphereRadius));

        // --- ส่วนที่ 2: การคำนวณปริมาตรทรงกระบอก ---
        System.out.print("Enter radius of cylinder: ");
        double cylinderRadius = scanner.nextDouble(); // รับค่ารัศมีทรงกระบอก
        System.out.print("Enter height of cylinder: ");
        double cylinderHeight = scanner.nextDouble(); // รับค่าความสูงทรงกระบอก
        // เรียกใช้เมธอด calculateVolume ที่รับพารามิเตอร์ 2 ตัว
        System.out.printf("Cylinder Volume: %.2f\n", calculateVolume(cylinderRadius, cylinderHeight));

        // --- ส่วนที่ 3: การคำนวณปริมาตรปริซึมสามเหลี่ยม ---
        System.out.print("Enter base of triangle prism: ");
        double base = scanner.nextDouble(); // รับค่าความยาวฐานของหน้าตัดสามเหลี่ยม
        System.out.print("Enter height of triangle prism: ");
        double triangleHeight = scanner.nextDouble(); // รับค่าความสูงของหน้าตัดสามเหลี่ยม
        System.out.print("Enter length of triangle prism: ");
        double length = scanner.nextDouble(); // รับค่าความยาว (หรือความลึก) ของปริซึม
        // เรียกใช้เมธอด calculateVolume ที่รับพารามิเตอร์ 3 ตัว
        System.out.printf("Triangle Prism Volume: %.2f\n", calculateVolume(base, triangleHeight, length));

        // ปิด Scanner เมื่อใช้งานเสร็จสิ้นเพื่อคืนทรัพยากร
        scanner.close();
    }

    /**
     * เมธอดสำหรับคำนวณปริมาตรของทรงกลม (Sphere)
     * สูตร: (4/3) * PI * r^3
     * 
     * @param radius รัศมีของทรงกลม
     * @return ปริมาตรของทรงกลม
     */
    public static double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * เมธอดสำหรับคำนวณปริมาตรของทรงกระบอก (Cylinder)
     * สูตร: PI * r^2 * h
     * 
     * @param radius รัศมีฐานของทรงกระบอก
     * @param height ความสูงของทรงกระบอก
     * @return ปริมาตรของทรงกระบอก
     */
    public static double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * เมธอดสำหรับคำนวณปริมาตรของปริซึมสามเหลี่ยม (Triangle Prism)
     * สูตร: พื้นที่ฐานสามเหลี่ยม * ความยาว = (1/2 * base * height) * length
     * 
     * @param base ความยาวฐานของหน้าตัดสามเหลี่ยม
     * @param height ความสูงของหน้าตัดสามเหลี่ยม
     * @param length ความยาว (ความลึก) ของปริซึม
     * @return ปริมาตรของปริซึมสามเหลี่ยม
     */
    public static double calculateVolume(double base, double height, double length) {
        return (base * height * length) / 2;
    }
}
