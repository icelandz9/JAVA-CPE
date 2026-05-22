import java.util.Scanner;
import java.util.Arrays;
public class Ex3
{
   public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); 
    double[] x = new double[10];
    System.out.print("Enter number :");
    for(int i=0;i<10;i++)
    {
      x[i]=input.nextDouble();
    }
    System.out.print("The index of min is :"+indexOfSmallestElement(x));
   }
   public static int indexOfSmallestElement(double[] array)
{
     int index=0;
     double[] y = new double[10];
     for(int i=0;i<10;i++)
     {
       y[i]=array[i];
     }
     Arrays.sort(y);
     for(int i=0;i<10;i++)
     {
       if(array[i]==y[0])
       {
         index=i;
       }
     }
     return index;
}
}
