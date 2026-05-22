import java.lang.String;
import java.util.Scanner;
public class quiz07_1
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your choice:");
    String x = input.nextLine();
    System.out.println("Enter your message :");
    String str = input.nextLine();
    String choice = x.toLowerCase();
    sumOddEvenDigits(str,choice);
      
  }
  public static void sumOddEvenDigits(String str,String choice)
  {
    char[] ch = new char[str.length()];
    int sum=0,count=0,num=0;
     switch(choice)
    {
      case "even" :
        for(int i = 0;i<str.length();i++)
    {
      ch[i] = str.charAt(i);
      if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9')
      {
        count++;
      }
    }
    for(int i = 0;i<str.length();i++)
    {
      ch[i] = str.charAt(i);
      if(ch[i]=='0'||ch[i]=='2'||ch[i]=='4'||ch[i]=='6'||ch[i]=='8')
      {
        sum += (ch[i]-'0');
      }
    } 
    System.out.println("Total degits are: "+count);
    System.out.println("The summation of odd digits in this message is:"+sum);
        break;
      case "odd" : 
        for(int i = 0;i<str.length();i++)
    {
      ch[i] = str.charAt(i);
      if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9')
      {
        count++;
      }
    }
    for(int i = 0;i<str.length();i++)
    {
      ch[i] = str.charAt(i);
      if(ch[i]=='1'||ch[i]=='3'||ch[i]=='5'||ch[i]=='7'||ch[i]=='9')
      {
        sum += (ch[i]-'0');
      }
    }
    System.out.println("Total degits are: "+count);
    System.out.println("The summation of odd digits in this message is:"+sum);
        break;
      default :
        System.out.println("Error");
        break;
    }
  }
}
    
   