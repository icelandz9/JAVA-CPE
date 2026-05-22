package Quiz.Quiz_Graymatter.Exam6;

import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        // ตรวจสอบว่า n หารด้วย 7 หรือ 5 ลงตัวหรือไม่
        if (n % 7 != 0 && n % 5 != 0) {
            System.out.println("n ต้องหารด้วย 7 หรือ 5 ลงตัวเท่านั้น");
            return;
        }

        double T = 0;

        for (int i = 1; i <= n; i++) {
            // คำนวณค่า T ตามสูตร Summation
            T += 2 * i;
            T += Math.pow(-1, i + 1) / ((2 * i) - 1);

            // แสดงค่า T ทุกๆ รอบที่ i หารด้วย 35 ลงตัว
            if (i % 35 == 0) {
                System.out.println("T at i=" + i + " is " + T);
            }
        }

        // แสดงผลลัพธ์สุดท้าย
        System.out.println("Final T = " + T);
    }
}