public class Ex4
{
   public static void main(String[] args)
  {
     int[] x = {1,2,3,4,5,6};
     double[] y = {6.0,4.4,1.9,2.9,3.4,3.5} ;
     System.out.println("The average value as integer is "+average(x));
     System.out.println("The average value as double is "+average(y));
   }
   public static int average(int[] array)
   {
     int avg,sum=0;
     for(int i=0;i<array.length;i++)
     {
       sum+=array[i];
     }
     avg=sum/array.length;
     return avg;
   }
    public static double average(double[] array)
   {
     double avg,sum=0;
     for(int i=0;i<array.length;i++)
     {
       sum+=array[i];
     }
     avg=sum/array.length;
     return avg;
   }
}