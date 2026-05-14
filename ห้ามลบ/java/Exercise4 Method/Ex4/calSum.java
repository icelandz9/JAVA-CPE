public class calSum
{
  public static int a=0,a1=0,b=0,b1=0;
  public static int sumDigits(int n)
  {
    a = n%10;
    a1 = n/10;
    b = a1%10                                          ;
    b1 = a1/10;
    return a+b+b1;
  } 
}