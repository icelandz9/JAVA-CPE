import java.util.Scanner;
public class Quiz3_3{
  public static void main(String[] args){
    int i,n,m;
    double a=0,b=0,c=0,d=0,f=0,e=0,sum;
  Scanner num = new Scanner(System.in);
  System.out.print("Please enter value of m");
  m = num.nextInt();
  System.out.print("Please enter value of n");
  n = num.nextInt();
  for(i=m;i<=n;i++)
   { 
    a =(2*i)-1;
    b = a+2;
    c = a/b;
    d += c;
   }
  for(i=m;i<=n;i++)
  {
     e = i*i;
     f += e;
  }
  sum = d+f; 
  System.out.println("The result of this summation is :"+sum);
}
}