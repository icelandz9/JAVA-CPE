import java.util.Scanner;
  public class Ex7
{
  public static void main(String[] args)
  {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates : ");
    double x = sn.nextDouble();
    double y = sn.nextDouble();
    double t = Math.pow(x,2.0)+Math.pow(y,2.0);
    double distance = Math.sqrt(t);
    if(distance < 11)
    {
      System.out.println("Point("+x+","+y+") is in the circle");
    }
    else
    {
      System.out.println("Point("+x+","+y+") is not in the circle");
    }
    sn.close();
  }
 }