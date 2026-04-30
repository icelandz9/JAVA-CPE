import java.util.Scanner;
public class Exercise1_02 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter an integer between 000 and 999 : ");
    int integer = sn.nextInt();
    int X1 = integer % 10;
    int X2 = (integer / 10)% 10;
    int X3 = integer / 100;
    int Sum = X1*X2*X3;
    System.out.print("The product of digits is "+Sum);
    sn.close();
  }
} 