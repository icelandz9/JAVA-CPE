package Quiz.Quiz_monkey.Quiz6;

import java.util.Scanner;

/**
 * Quiz 6: Array
 * โปรแกรมแสดงเฉพาะตัวเลข 5 หรือ 7 ในเมทริกซ์จัตุรัส
 * หากไม่ใช่ 5 หรือ 7 ให้แสดงเป็นเครื่องหมาย *
 */
public class Q06_ShowStarRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and column of the array: ");
        int n = scanner.nextInt();
        
        System.out.println("Initialize random matrix:");
        // 1. สร้างและแสดงเมทริกซ์แบบสุ่ม 1-9
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // สุ่มตัวเลข 1 ถึง 9
                matrix[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nResult matrix:");
        // 2. เรียกใช้ Method ตามที่โจทย์กำหนด
        showStarRows(matrix);
        
        scanner.close();
    }

    /**
     * Method เพื่อแสดงเฉพาะเลข 5 หรือ 7 นอกนั้นเป็น *
     */
    public static void showStarRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // ตรวจสอบว่าเป็น 5 หรือ 7 หรือไม่
                if (matrix[i][j] == 5 || matrix[i][j] == 7) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
