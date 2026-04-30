import java.util.Scanner;

public class Lab7_3 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    String Message = sn.nextLine();
    Message(Message);
    sn.close();
  }
  public static void Message(String Message) {
    if (Message.length() <= 3) {
      Message = Message.toUpperCase();
    } else {
     int X = Message.length();
     String m = Message.substring(X-3,X);
     String M = m.toUpperCase();
     Message = Message.replace(m,M);
    }
    System.out.print(Message);
  }  
}