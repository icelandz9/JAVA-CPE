import java.lang.String;
import java.util.Scanner;
public class quiz07_2
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter a string :");
    String str1 = input.nextLine();
    int sum = countCPESWU(str1);
    System.out.println("The number of CPESWU alphabets is "+sum);
  }
  public static int countCPESWU(String str)
  {
    char[] ch = new char[str.length()];
    String str2 = str.toUpperCase();
    int c=0,p=0,e=0,s=0,w=0,u=0;
    for(int i = 0;i<str.length();i++)
    {
      ch[i] = str2.charAt(i);
      switch(ch[i])
    {
      case 'C' : 
        c++;
        break;
        case 'P' : 
        p++;
        break;
        case 'E' : 
        e++;
        break;
        case 'S' : 
        s++;
        break;
        case 'W' : 
        w++;
        break;
        case 'U' : 
        u++;
        break;
        default :
        break;
    }
    }
    System.out.println("Total 'C' alphabets are : "+c);
    System.out.println("Total 'P' alphabets are : "+p);
    System.out.println("Total 'E' alphabets are : "+e);
    System.out.println("Total 'S' alphabets are : "+s);
    System.out.println("Total 'W' alphabets are : "+w);
    System.out.println("Total 'U' alphabets are : "+u);
    return c+p+e+s+w+u;
  }
}
