import java.util.Scanner;
public class Quiz3_5 {
  public static void main (String[] args){
    int i,m,n;
    double a=0,b=0,c=0,d=0,e=0,sum;
    Scanner input = new Scanner(System.in);
    System.out.print(" Please enter value of m : ");
    m = input.nextInt();
    System.out.print(" Please enter value of n : ");
    n = input.nextInt();
    for(i=m;i<=n;i++)
    {
      a = (i/(i+1));
      b = b+a;
    }
    for(i=m;i<=n;i++)
    {
      c = ((2*i)-1);
      d = d+c;
    }
    sum = b+d;
    System.out.println(" The result of this summation is : "+sum);
  }
}