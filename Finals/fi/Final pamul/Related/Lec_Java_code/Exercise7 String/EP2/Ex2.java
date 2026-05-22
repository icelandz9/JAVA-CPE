import java.lang.String;
import java.util.Scanner;
public class Ex2
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your message :");
    String str = input.nextLine();
    swap(str);
  }
  public static void swap(String str1)
  {
    String str2 = str1.substring(0,2);
    StringBuilder str3 = new StringBuilder(str1);
    str3.delete(0,2);
    String str4 = str3+str2;
    System.out.println("Your message is :"+str4);
  }
}