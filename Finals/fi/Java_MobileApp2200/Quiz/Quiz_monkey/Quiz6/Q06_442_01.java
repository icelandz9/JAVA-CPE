package Quiz.Quiz_monkey.Quiz6;

import java.util.Scanner;

public class Q06_442_01 {
    public static void main(String[] args) {
        // 1. รับค่าจำนวนแถวและคอลัมน์จากผู้ใช้
        System.out.printf("Enter the number of rows and column of the array ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int column = scan.nextInt();

        // 2. สร้างเมทริกซ์และสุ่มตัวเลข 1-9
        int[][] arr = new int[rows][column];
        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < column; n++) {
                int random = (int) (Math.round(Math.random() * 8 + 1));
                System.out.printf("%d ", random);
                arr[m][n] = random;
            }
            System.out.printf("\n");
        }
        
        // 3. เรียกเมธอดหาผลรวมของคอลัมน์ที่เป็นเลขคู่ (Even Columns)
        sumEvenColumns(arr);
    }

    /**
     * Method สำหรับหาผลรวมของสมาชิกใน "คอลัมน์คู่" (Index 0, 2, 4...)
     */
    public static void sumEvenColumns(int[][] arr) {
        int sum = 0;

        // วนลูปเฉพาะคอลัมน์ที่ n = 0, 2, 4...
        for (int n = 0; n < arr.length; n += 2) {
            // วนลูปตามจำนวนแถว (m) เพื่อบวกค่าในคอลัมน์นั้นๆ
            for (int m = 0; m < arr[n].length; m++) {
                sum = sum + arr[m][n];
            }
            System.out.println("Sum of the elements at coulumn " + n + " is " + sum);
            sum = 0; // รีเซ็ตผลรวมสำหรับคอลัมน์ถัดไป
        }
    }
}