import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Extend2_1
{
   public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); 
    Random rand = new Random();
    int[][] x = new int[5][5];
    System.out.print("Enter your number :");
    int user = input.nextInt();
    for(int i=0;i<5;i++)
    {
      for(int j=0;j<5;j++)
      {
        int num = rand.nextInt(5);
        x[i][j]=num+1;
      }
    }
    for(int i=0;i<5;i++)
    {
      for(int j=0;j<5;j++)
      {
        System.out.print(x[i][j]+" ");
      }
      System.out.print("\n");
    }
    int count=0;
       for(int i=0;i<5;i++)
     {
         for(int j=0;j<5;j++)
         {
           if(x[i][j]==user)
           {
             count++;
           }
         }
   }
   System.out.print("Your number appears "+count+" times in this metrix");
}
}