import java.util.Scanner;
public class Ex4p4{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    int n, dig;
    System.out.print("Enter a number :");
    n = sn.nextInt();
    dig = sumDigits(n);
    System.out.println("The sum of digits for "+n+" is "+dig);
    sn.close();
  }
  
  public static int sumDigits(int n){
    int a=1, sum=0, digi=0, i;
      for(i=1;i<=10;i++)
      {
        digi = (n/a)%10;
        sum = sum+digi;
        a = a*10;
      }
    return sum;
  }
}