import java.util.Scanner;

public class Q06_297_02 
{
    public static void main(String[] args) 
    {
        System.out.printf("Enter the number of rows and column of the array ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int column = scan.nextInt();
        //rows = m ------ column = n

        int[][] matrix = new int[rows][column];
        for(int m = 0 ; m < rows ; m++)
        {
            for(int n = 0 ; n < column ; n++)
            {
                int random = (int)(Math.round(Math.random()*8+1));
                System.out.printf("%d ",random);
                matrix[m][n] = random;
            }
            System.out.printf("\n");
        }
        sumEvenColumns(matrix);
    }

    public static void sumEvenColumns(int[][] matrix)
    {
        int sum = 0 ;
        for(int n = 0 ; n < matrix[0].length; n+=2)
        {
            for(int m = 0 ; m < matrix.lenght ; m++)
            {
                sum = sum + matrix[m][n];
            }
            System.out.println("Sum of the elements at coulumn "+n+" is "+sum);
        }
    }
}