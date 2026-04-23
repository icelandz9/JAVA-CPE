import java.util.Scanner;

public class CreatingExceptions {
    public static void main(String[] args) {
        // OutOfRangeException ชื่อ class จากอีกไฟล์
        // x ชื่อตัวแปรที่เราตั้ง
        // new OutOfRangeException()สร้าง object จาก class นั้น
        OutOfRangeException x = new OutOfRangeException();
        final int MIN = 0, MAX = 30; // ใช้งาน method จาก object
        int value = 0;

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Score: ");
            value = scan.nextInt();
            x.checkvalue(value, MIN, MAX); // เช็คว่าค่าอยู่ในขอบเขตมั้ย

        } catch (OutOfRangeException e) {
            System.out.println(e + "\nหมายถึง \"ข้อผิดพลาดที่เกิดจากค่าข้อมูลคะแนนเกินขอบเขต\"");
            // System.exit(0); // หยุดโปรแกรม

        } catch (Exception e) {
            System.out.println(e + "\nหมายถึง \"ข้อผิดพลาดที่เกิดจากการป้อนข้อมูลเข้าผิดประเภท\"");
            // System.exit(0); // หยุดโปรแกรม

        } finally {
            System.out.println("คะแนนคือ " + value * 100.0f / MAX + "%");
        }
    }
}