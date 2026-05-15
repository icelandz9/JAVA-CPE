import java.util.Scanner;

public class Main1 {
    /**
     * จุดเริ่มต้นของโปรแกรม — สาธิตการรับค่าและคำนวณค่าเฉลี่ย
     *
     * @param args อาร์กิวเมนต์จาก command line
     */
    public static void main(String[] args) {
        // ─── ส่วนที่ 1: เตรียมการรับข้อมูลจากผู้ใช้ ───────────────────────────
        Scanner scanner = new Scanner(System.in);

        // ─── ส่วนที่ 2: รับค่าเลขจำนวนเต็ม 5 ตัว ─────────────────────────────
        System.out.println("Enter five integers:");
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        int i4 = scanner.nextInt();
        int i5 = scanner.nextInt();

        // คำนวณและแสดงผลค่าเฉลี่ยของเลขจำนวนเต็ม
        System.out.println("The average is: " + average(i1, i2, i3, i4, i5));

        // ─── ส่วนที่ 3: รับค่าเลขทศนิยม 5 ตัว ───────────────────────────────
        System.out.println("Enter five doubles:");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();
        double d4 = scanner.nextDouble();
        double d5 = scanner.nextDouble();

        // คำนวณและแสดงผลค่าเฉลี่ยของเลขทศนิยม
        System.out.println("The average is: " + average(d1, d2, d3, d4, d5));

        // ─── ส่วนที่ 4: การคืนทรัพยากร ─────────────────────────────────────
        scanner.close(); // ปิดการใช้งาน Scanner
    }

    /**
     * เมธอด Overloading สำหรับคำนวณค่าเฉลี่ยของเลขจำนวนเต็ม
     *
     * @param i1-i5 ตัวแปรเก็บค่าเลขจำนวนเต็ม 5 ตัว
     * @return ผลลัพธ์ค่าเฉลี่ย (int)
     */
    public static int average(int i1, int i2, int i3, int i4, int i5) {
        return (i1 + i2 + i3 + i4 + i5) / 5;
    }

    /**
     * เมธอด Overloading สำหรับคำนวณค่าเฉลี่ยของเลขทศนิยม
     *
     * @param i1-i5 ตัวแปรเก็บค่าเลขทศนิยม 5 ตัว
     * @return ผลลัพธ์ค่าเฉลี่ย (double)
     */
    public static double average(double i1, double i2, double i3, double i4, double i5) {
        return (i1 + i2 + i3 + i4 + i5) / 5.0;
    }
}
