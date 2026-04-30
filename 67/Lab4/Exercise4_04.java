import java.util.Scanner;
public class Exercise4_04 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = sn.nextInt();
    int Sum = sumDigits(number);
    System.out.print("The sum of digits for "+number+" is "+Sum);
    sn.close();
  }
  
  public static int sumDigits(int n) {
    int Sum=0;
    while (true) {
      int sum = n%10;
      n /= 10;
      Sum += sum;
      if (n == 0) {
        break;
      }
    }
    return Sum;
  }
} 