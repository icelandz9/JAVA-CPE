import java.util.Scanner;

public class Q7_4 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    String Message = sn.nextLine();
    int Sum = sumNumbers(Message);
    System.out.print(Sum);
    sn.close();
  }
  public static int sumNumbers(String str) {
    int Sum=0;
    for (int i=0;i<str.length();i++) {
      if (str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || 
          str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' ||
          str.charAt(i) == '9' || str.charAt(i) == '0' ) {
        Sum += str.charAt(i)-48; 
      } 
    }
    return Sum;
  }  
}