import java.util.Scanner;
public class cpe222_168_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows and column of the array: ");
        int num = scan.nextInt();
        System.out.println("Initialize random matrix:");
        int[][] arr = new int[num][num];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) Math.round((Math.random() * 8) + 1);
            }
        }
        showSharpCols(arr);
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
                } else System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}