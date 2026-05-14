import java.util.Scanner;
public class Ex1
{
  public static void main(String[] args)
  {
    Scanner sn = new Scanner(System.in);
    Num1 input = new Num1();
    System.out.print("Enter 3 number :");
    int a = sn.nextInt();
    int b = sn.nextInt();
    int c = sn.nextInt();
    boolean x = input.diff(a,b,c);
    System.out.println(x);
    sn.close();
  }
 }