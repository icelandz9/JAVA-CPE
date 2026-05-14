import java.util.Scanner;
public class Evennumber{
  public static void main(String[] args){
    Scanner div = new Scanner(System.in);
    int num,div3,div11;
    System.out.println("Enter an integer :");
    num = div.nextInt();
    div3 = num%3;
    div11 = num%11;
    if((div3==0)&&(div11==0))
    {
      System.out.println(num+" is divisible by both 3 and 11");
    }
    else if((div3!=0)&&(div11!=0))
    {
      System.out.println(num+" is not divisible by either 3 or 11");
    }
    else if((div3==0)||(div11==0))
    {
      System.out.println(num+" is divisible by both 3 or 11, but not both");
    }
  }
}
