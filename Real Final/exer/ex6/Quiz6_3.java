import java.util.Scanner;
public class Quiz6_3{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String text = sn.nextLine();
    int[] num = new int[5];
    num = countStrAr(text);
    System.out.println("Number of A : "+num[0]);
    System.out.println("Number of E : "+num[1]);
    System.out.println("Number of I : "+num[2]);
    System.out.println("Number of O : "+num[3]);
    System.out.println("Number of U : "+num[4]);
    sn.close();
  }
  
  public static int[] countStrAr(String str){
    int[] countStrAr = new int[5];
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)=='A' || str.charAt(i)=='a')
      {
        countStrAr[0]++;
      }
      else if(str.charAt(i)=='E' || str.charAt(i)=='e')
      {
        countStrAr[1]++;
      }
      else if(str.charAt(i)=='I' || str.charAt(i)=='i')
      {
        countStrAr[2]++;
      }
      else if(str.charAt(i)=='O' || str.charAt(i)=='o')
      {
        countStrAr[3]++;
      }
      else if(str.charAt(i)=='U' || str.charAt(i)=='u')
      {
        countStrAr[4]++;
      }
    }
    return countStrAr;
  }
}