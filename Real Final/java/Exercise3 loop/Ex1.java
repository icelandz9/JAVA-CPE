import java.util.Scanner;
  public class Ex1
{
  public static void main(String[] args)
  {
    Scanner sn = new Scanner(System.in);
    int num,p=0,n=0;
    double sum=0.0,average=0.0,i=0.0;
    System.out.print("Enter the integer, the input ends if it is 0 : ");
    do
    {
      num = sn.nextInt();
      if(num >0)
      {
        p++;
      }
      if (num<0)
      {
        n++;
      }
      sum += num;
      i++;
      average = sum/i;
    }while(num != 0);
    System.out.println("The number of positive is : "+p);
    System.out.println("The number of negative is : "+n);
    System.out.println("The total is : "+sum);
    System.out.println("The average is : "+average);
    sn.close();
  }
}