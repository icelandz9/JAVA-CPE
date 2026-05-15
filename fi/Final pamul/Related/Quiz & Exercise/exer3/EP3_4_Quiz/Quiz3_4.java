import java.util.Scanner;
public class Quiz3_4{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    float i=0, n=0, m=0;
    float a=0, b=0, sum=0;
    System.out.print("Please enter value of m : ");
    m = sn.nextFloat();
    System.out.print("Please enter value of n : ");
    n = sn.nextFloat();
    for(i=m;i<=n;i++)
    {
      a = a+(1/i);
      b = b+((2*i)+2);
    }
    sum = a+b;
    System.out.print("The result of this sunnations is : "+sum);
    sn.close();
  }
}