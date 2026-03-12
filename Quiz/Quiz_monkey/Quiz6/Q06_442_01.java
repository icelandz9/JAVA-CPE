package Quiz.Quiz_monkey.Quiz6;

import java.util.Scanner;

public class Q06_442_01 {
    public static void main(String[] args) {
        System.out.printf("Enter the number of rows and column of the array ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int column = scan.nextInt();

        int[][] arr = new int[rows][column];
        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < column; n++) {
                int random = (int) (Math.round(Math.random() * 8 + 1));
                System.out.printf("%d ", random);
                arr[m][n] = random;
            }
            System.out.printf("\n");
        }
        sumEvenColumns(arr);
    }

    public static void sumEvenColumns(int[][] arr) {
        int sum = 0;

        for (int n = 0; n < arr.length; n += 2) {
            for (int m = 0; m < arr[n].length; m++) {
                sum = sum + arr[m][n];

            }
            System.out.println("Sum of the elements at coulumn " + n + " is " + sum);
            sum = 0;
        }
    }
}