import java.util.Scanner;
public class Exercise1_01 {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Enter inches as an integer: ");
    int number = Scanner.nextInt();
    System.out.println("The value int centimaters is : " + (number / 0.3937)) ;

    Scanner.close();
  }
}