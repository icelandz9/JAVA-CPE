import java.util.Scanner;
  public class Ex2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first 9 degit of an ISBN as integer : ");
    String a = sc.nextLine();
    int x = Integer.parseInt(a);
    //int a0 = x;
    int[] degit = new int[10];
    int a10 = 0;
      for (int i=9;i>0;i--)
      {
        degit[i]=x%10;
        x/=10;
      }
    //transform to degit
      for (int i=9;i>0;i--)
      {
       a10 += (degit[i]*i);
      }
      int d10= a10%11;
      // find d10 
    if(d10%10 == 0)
    {
      System.out.println("ISBN-10 number is : "+a+"x");
    }
    else
    {
      System.out.print("ISBN-10 number is : "+a);
      System.out.println(+d10);
    }
    sc.close();
  }
  }
      
    