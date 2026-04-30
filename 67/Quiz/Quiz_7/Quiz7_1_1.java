import java.util.Scanner;

public class Quiz7_1_1 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter your choice");
    String choice = sn.nextLine();
    System.out.print("Enter your message");
    String Message = sn.nextLine();
    int Sum = sumOddDigits(Message,choice);
    System.out.println("The summation of odd digits in this message: "+Sum);
    sn.close();
  }
  public static int sumOddDigits(String str,String choice) {
    choice = choice.toLowerCase();
    int Sum=0,Number=0;
    if (choice.equals("odd")) {
      for (int i=0;i<str.length();i++) {
        if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
          if (str.charAt(i)%2 == 1) {
            Number += 1;
            Sum += str.charAt(i)-48; 
          } 
        }
      }
    } else if (choice.equals("even"))
      for (int i=0;i<str.length();i++) {
        if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
          if (str.charAt(i)%2 == 0) {
            Number += 1;
            Sum += str.charAt(i)-48; 
          } 
        }
      }
    System.out.println("Total digits are: "+Number);
    return Sum;
  }  
}