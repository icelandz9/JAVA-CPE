import java.util.Scanner;
public class Cpe222_5{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a integer:");
    int number;
    number = in.nextInt();
    reverse(number);
  }
  public static void reverse(int number){
    while (number != 0){
      int remainder = number % 10;
      System.out.print(remainder);
      number = number / 10;
  }
    System.out.println();
}
}