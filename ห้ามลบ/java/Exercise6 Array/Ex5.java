import java.util.Scanner;
public class Ex5
{
   public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); 
    int swap=0;
    int[] x = new int [5];
    for(int i=0;i<5;i++)
    {
      System.out.print("Read a number :");
      x[i]=input.nextInt();
    }
    if(x[0]<x[4])
    {
      swap=x[0];
      x[0]=x[4];
      x[4]=swap;
    }
    for(int i=0;i<4;i++)
    {
      if(x[i]<x[i+1])
      {
        swap=x[i+1];
        x[i+1]=x[i];
        x[i]=swap;
      }
    }
 for(int i=0;i<5;i++)
    {
      System.out.print(x[i]+" ");
    }
   }
}
    