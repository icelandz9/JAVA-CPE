import java.util.Scanner;
public class Quiz3_2{
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
     a = Math.pow((-1),(i+1));  
     b = ((2*i)-1);
     c = (a/b);
     d = d+c;
   }
  for(i=m;i<=n;i++)
  {
     e = 2*i;
     f = f+e;
  }
  sum = d+f; 
  System.out.println("The result of this summation is :"+sum);
}
}