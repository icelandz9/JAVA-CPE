package Quiz.Quiz_monkey.Quiz3;

import java.util.Scanner;

/**
 * Quiz 3 - Item 2: Estimate T
 * เขียนโปรแกรมเพื่อคำนวณหาค่าประมาณของ T ตามสมการ
 * T = sum_{i=1 to n} ( 2i + sum_{j=1 to n} ( (-1)^(1+j) / (2j - 1) ) )
 * โดยที่ n ต้องหาร 7 หรือ 5 ลงตัว
 */
public class Q03_EstimateT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        
        // 1. รับค่า n และตรวจสอบเงื่อนไขว่าต้องหาร 7 หรือ 5 ลงตัว
        while (true) {
            System.out.print("Enter n (must be divisible by 5 or 7): ");
            n = scanner.nextInt();
            
            if (n % 5 == 0 || n % 7 == 0) {
                break; // ผ่านเงื่อนไข
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        
        // 2. คำนวณส่วนที่เป็นผลรวมด้านใน: sum_{j=1 to n} ( (-1)^(1+j) / (2j - 1) )
        // ค่านี้คงที่สำหรับทุกๆ i จึงสามารถคำนวณล่วงหน้าได้
        double innerSum = 0.0;
        for (int j = 1; j <= n; j++) {
            double numerator = Math.pow(-1, 1 + j);
            double denominator = (2 * j) - 1;
            innerSum += (numerator / denominator);
        }
        
        // 3. คำนวณผลรวมด้านนอก: T = sum_{i=1 to n} ( 2i + innerSum )
        double T = 0.0;
        for (int i = 1; i <= n; i++) {
            T += (2 * i) + innerSum;
        }
        
        // 4. แสดงผลลัพธ์
        System.out.printf("The estimated value of T for n=%d is: %.4f\n", n, T);
        scanner.close();
    }
}
