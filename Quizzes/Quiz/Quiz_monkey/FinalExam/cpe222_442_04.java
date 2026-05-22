import java.util.Scanner;

public class cpe222_442_04 {
    public static void main(String[] args) {
        int i, j;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of rows and column of th array: ");
        int a = sn.nextInt();
        int[][] matrix = new int[a][a];
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                double ran = (Math.random() * 8) + 1;
                matrix[i][j] = (int) ran;
            }
        }
        showSharpCols(matrix);
    }

    public static void showSharpCols(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j % 2 == 0) {
                    if (matrix[i][j] != 4 && matrix[i][j] != 9) {
                        System.out.print("#" + " ");
                    } else
                        System.out.print(matrix[i][j] + " ");
                } else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}