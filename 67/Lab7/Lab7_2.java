import java.util.Scanner;

public class Lab7_2 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    String Message;
    do {
      Message = sn.nextLine();
      if (Message.length() < 2) {
        System.out.print("Error");
      }
    } while (Message.length() < 2);
    Message(Message);
    sn.close();
  }
  public static void Message(String Message) {
     String M = Message.substring(2);
     Message = Message.substring(0,2);
     System.out.print(M+Message);
  }  
}