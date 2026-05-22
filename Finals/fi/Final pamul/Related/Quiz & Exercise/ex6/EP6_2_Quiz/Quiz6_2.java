import java.util.Scanner;
public class Quiz6_2{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    String a = "Faculty of Engineering Srinakharinwirot";
    System.out.print("Enter a string : ");
    System.out.println(a);
    System.out.print("Enter a character : ");
    char b = scan.next().charAt(0);
    System.out.println("Number of "+b+" = " +countStr(a,b));
  }
  
 public static int countStr(String str,char ch)
  {int num =0 ;
    for(int i=0 ; i<str.length() ; i++)
    {
      if(str.charAt(i)==ch)
        num++;
    }
    return num ;
  }
}