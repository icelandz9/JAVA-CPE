package Quiz.Quiz_Graymatter.Exam10;

import java.util.Scanner;

public class Exam10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of array size: ");
    int size = sc.nextInt();
    int[][] matrix = new int[size][size];

    System.out.println("Your array:");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        matrix[i][j] = (int) (Math.random() * 9) + 1;
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println(" ");
    }
    System.out.println();
    showStarRows(matrix);
    sc.close();
  }

  public static void showStarRows(int[][] matrix) {
    System.out.print("Result Matrix is : \n");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if ((j % 3 == 0) && (matrix[i][j] != 5) && (matrix[i][j] != 7)) {
          System.out.print("* ");
        } else {
          System.out.print(matrix[i][j] + " ");
        }
      }
      System.out.print("\n");
    }
  }
}