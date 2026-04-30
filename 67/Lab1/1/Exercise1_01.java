import java.util.Scanner;
public class Exercise1_01 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter inches as an integer : ");
    double integer = sn.nextDouble();
    integer /= 0.3937;
    System.out.print("The value in centimeters is : "+integer);
    sn.close();
  }
} 