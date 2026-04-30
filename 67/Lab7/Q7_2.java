import java.util.Scanner;

public class Q7_2 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    String Message = sn.nextLine();
    String ch = sn.nextLine();
    int count = countStr(Message,ch.charAt(0));
    System.out.print(count);
    sn.close();
  }
  public static int countStr(String str,char ch) {
    int count=0;
    for (int i=0;i<str.length();i++) {
      if (str.charAt(i) == ch) {
        count += 1;
      } 
    }
    return count;
  }  
}