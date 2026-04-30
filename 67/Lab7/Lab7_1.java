import java.util.Scanner;

public class Lab7_1 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    String Message = sn.nextLine();
    checkMessage(Message);
    sn.close();
  }
  public static void checkMessage(String Message) {
    if (Message.charAt(1) == 'e') {
      System.out.print("True");
    } else {
      System.out.print("False");
    }
  }  
}