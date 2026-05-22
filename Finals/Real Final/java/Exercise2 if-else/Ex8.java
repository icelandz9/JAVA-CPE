import java.util.Scanner;
  public class Ex8
{
  public static void main(String[] args)
  {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates : ");
    double x = sn.nextDouble();
    double y = sn.nextDouble();
    if(x <= (10.0/2.0) && y <= (5.0/2.0) && x >= -(10.0/2.0) && y >= -(5.0/2.0))
    {
      System.out.println("Point("+x+","+y+") is in the rectangle");
    }
    else
    {
      System.out.println("Point("+x+","+y+") is not in the rectangle");
    }
    sn.close();
  }
 }