import java.util.Scanner;

public class Quiz_6_1{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number of rows and column of the array :");
    int Number = sn.nextInt();
    
    int[][] arrays;
    arrays = new int[Number][Number];
    System.out.println("Lnitialize random matrix : ");
    int i=0,j=0;  
    for (i=0;i<Number;i++) {
      for (j=0;j<Number;j++) {
        int RanDom = (int)((Math.random()*9)+1);
        arrays[i][j] = RanDom;
        System.out.print(arrays[i][j]+"\t");
      }
      System.out.println();
    }
    
    showSharpCols(arrays);
    sn.close();
  }
  
  public static void showSharpCols(int[][] matrix) {
    int i=0,j=0; 
    System.out.println("Result matrix :");
    for (i=0;i<matrix.length;i++) {
      for (j=0;j<matrix.length;j++) {
        if (j % 2 == 0) { 
          if (matrix[i][j] == 4 || matrix[i][j] == 9) {
            System.out.print(matrix[i][j]+"\t");
          } else {
            System.out.print("#\t");
          }
        } else {
          System.out.print(matrix[i][j]+"\t");
          
        }
        
      }
      System.out.println();
    }

    }
  }
