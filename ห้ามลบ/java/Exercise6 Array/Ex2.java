import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Ex2
{
   public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); 
    Random rand = new Random();
    System.out.print("Enter array size :");
    int n = input.nextInt();
    int[] x = new int [n];
    int[] y = new int [4];
    int[] count = new int [4];
    for(int i=0;i<4;i++)
    {
      System.out.print("Your number"+(i+1));
      y[i]=input.nextInt();
    }
     for(int i=0;i<n;i++)
    {
      int num = rand.nextInt(9);
      x[i]=num;
  }
    System.out.println("Your array:");
    System.out.print("{");
    for(int i=0;i<n;i++)
    {
      System.out.print(x[i]+" ");
    }
    System.out.println("}");
    for(int i=0;i<4;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(y[i]==x[j])
        {
          count[i]++;
        }
      }
    }
    Arrays.sort(count);
    System.out.println("Maxfrequency "+count[3]);
   }
}