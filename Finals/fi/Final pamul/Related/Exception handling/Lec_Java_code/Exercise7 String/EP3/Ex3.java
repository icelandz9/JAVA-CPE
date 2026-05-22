import java.lang.String;
import java.util.Scanner;
public class Ex3
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your message :");
    String str1 = input.nextLine();
    upperlast3(str1);
  }
  public static void upperlast3(String str)
  {
    if(str.length()<4)
    {
      System.out.println("Your message is :"+str.toUpperCase());
    }
    else
    {
      try
      {
      String str1=str.substring(str.length()-3);
      String str2 = str1.toUpperCase();
      System.out.println(str2);
      String str3 = str.substring(0,str.length()-3);
      System.out.println(str3);
      String str4 = str3+str2;
      System.out.println("Your message is :"+str4);}
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
  }
}