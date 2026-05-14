import java.util.Scanner;
public class Quiz6_4{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter your message : ");
    String text = sn.nextLine();
    int sum = sumDigits(text);
    System.out.println("The summation of digits in this message is : "+sum);
    sn.close();
  }
  
  public static int sumDigits(String str){
    int num=0, all=0;
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)>'0' && str.charAt(i)<='9')
      {
        num = str.charAt(i)-'0';
        all = all+num;
      }
    }
    return all;
  }
}