import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double random = (Math.random() * 8) + 1;
                matrix[i][j] = (int) random;
            }
        }

        showSharpCols(matrix);
    }

    public static void showSharpCols(int[][] matrix) {

        // แสดง matrix เดิม
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // แสดง matrix ที่แทนค่า #
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (j % 2 == 0) {
                    if (matrix[i][j] != 4 && matrix[i][j] != 7) {
                        System.out.print("# ");
                    } else {
                        System.out.print(matrix[i][j] + " ");
                    }
                } else {
                    System.out.print(matrix[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}