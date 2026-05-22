import java.util.Scanner;
public class Cpe222_4{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n, digits;
    n = in.nextInt();
    digits = sumDigits(n);
    System.out.println("The sum of digits for "+n+" is "+digits);
  }
 public static int sumDigits(int n){
      int ans = (int)Math.abs(n); 
      int sum = 0;
      while(ans != 0){
        int remainder = ans % 10;
        sum = sum+remainder;
        ans = ans/10;
  }
      return sum;
  }
}