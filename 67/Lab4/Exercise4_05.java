import java.util.Scanner;
public class Exercise4_05 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = sn.nextInt();
    reverse(number);
    sn.close();
  }
  
  public static int reverse(int number) {
    while (true) {
      int n = number%10;
      number /= 10;
      System.out.print(n);
      if (number == 0) {
        break;
      }
    }
    return 0;
  }
} 