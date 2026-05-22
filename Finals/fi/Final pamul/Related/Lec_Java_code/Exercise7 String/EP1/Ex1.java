import java.lang.String;
import java.util.Scanner;
public class Ex1
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your message :");
    String str1 = input.nextLine();
    check(str1);
  }
  public static void check(String str)
  {
    if(str.length()<4)
    {
      if(str.charAt(0)=='e')
      {
        System.out.println("Your message is True");
      }
      else
      {
        System.out.println("Your message is False");
      }
    }
    else
    {
    if(str.charAt(1)=='e'|| str.charAt(3)=='e')
    {
      System.out.println("Your message is True");
    }
    else
    {
      System.out.println("Your message is False");
    }
    }
  }
}