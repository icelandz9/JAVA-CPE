import java.util.Scanner;
import java.util.Arrays;
public class Extend2_2
{
   public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); 
    MaxMinAvg cal = new MaxMinAvg();
    double[] x = new double[10];
    int count=0;
    System.out.print("Enter number :");
    for(int i=0;i<10;i++)
    {
      x[i]=input.nextDouble();
    }
    double avg= cal.getavg(x);
    System.out.println("The average is "+avg);
    for(int i=0;i<10;i++)
    {
      if(x[i]<avg)
      {
        count++;
      }
    }
    System.out.println("The number of value less than average is "+count);
   }
}