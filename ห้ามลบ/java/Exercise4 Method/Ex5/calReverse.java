public class calReverse
{
  static int a,a1,b,b1,c,c1;
  public static int reverse(int number)
  {
    a=number%10;
    a1=number/10;
    b=a1%10;
    b1=a1/10;
    c=b1%10;
    c1=b1/10;
    return (a*1000)+(b*100)+(c*10)+c1;
  }
}