import java.util.Scanner;
public class Ex5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer :");
    int x = input.nextInt();
    int newx = calReverse.reverse(x);
    System.out.println(newx);
    input.close();
  }
}