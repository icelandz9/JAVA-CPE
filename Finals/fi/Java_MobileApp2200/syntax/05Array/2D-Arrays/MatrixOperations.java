/*
 * ชื่อไฟล์: MatrixOperations.java
 * หัวข้อ: การดำเนินการกับเมทริกซ์ (Matrix Operations)
 * คำอธิบาย: ตัวอย่างการบวกและการคูณเมทริกซ์ 2 มิติ
 * ตัวอย่างการใช้งาน: C[i][j] = A[i][j] + B[i][j]
 */

public class MatrixOperations {
    public static void main(String[] args) {
        System.out.println("=== การบวกเมทริกซ์ ===");

        int[][] matrixA = {
                { 1, 2 },
                { 3, 4 }
        };

        int[][] matrixB = {
                { 5, 6 },
                { 7, 8 }
        };

        // เตรียม Matrix สำหรับเก็บผลลัพธ์ (ขนาดต้องเท่ากัน)
        int[][] sumMatrix = new int[2][2];

        // วนลูปบวกทีละตำแหน่ง
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // แสดงผลลัพธ์
        System.out.println("ผลรวม Matrix A + B:");
        printMatrix(sumMatrix);

        System.out.println("\n=== Transpose Matrix A (สลับแถวเป็นคอลัมน์) ===");
        int[][] transpose = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[j][i] = matrixA[i][j]; // สลับ index i,j
            }
        }
        printMatrix(transpose);
    }

    // เมธอดสำหรับ print matrix เพื่อความสะดวก
    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === การบวกเมทริกซ์ ===
 * ผลรวม Matrix A + B:
 * 6 8
 * 10 12
 * 
 * === Transpose Matrix A (สลับแถวเป็นคอลัมน์) ===
 * 1 3
 * 2 4
 * 
 * หมายเหตุ:
 * - การทำ Image Processing ก็ใช้อาร์เรย์ 2 มิติ (Pixel) เป็นพื้นฐาน
 */
